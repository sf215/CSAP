package BasicGui;

import java.io.*;
import javax.swing.JOptionPane;

public class FileHandling {

	private String path;
	private File file ;
	FileHandling(String path)
	{
		this.path =path; 
	}
	
	boolean open()
	{
		if(path==null)
		{
			CommonAction.showRedWarning("Invalid path");
			return false;
		}
		file = new File(path);
		if(!file.exists())
		{
			CommonAction.showRedWarning("Path does not exist");
			return false;
		}
		if(!file.isDirectory())
		{
			CommonAction.showRedWarning("Only directory are allowed");
			return false;
		}
		String name  = JOptionPane.showInputDialog("Please enter file name");
		if(name==null||name.equals(""))
		{
			CommonAction.showRedWarning("Name is not provided");
			return false;
		}
		name = name.trim();
		if(name.endsWith(".c"))
		{}
		else
			name=name+".c";
		path = path+"\\"+name;
		file = new File(path);
		if(!file.exists())
		{
			try
			{
				file.createNewFile();
				CommonAction.showGreenWarning("New file successfully created");
				CommonReference.setFile(file);
				return true;
			}
			catch(Exception e)
			{
				CommonAction.showRedWarning("Operation failed");
				return false;
			}
		}
		else
		{
			CommonReference.setFile(file);
			CommonAction.showGreenWarning("File already exists, opened that file");
		}
		CommonReference.setFile(file);
		return true;
	}
	
	boolean update()
	{
		if(path==null)
		{
			CommonAction.showRedWarning("Select proper path");
			return false;
		}
		file = new File(path);
		if(!file.exists())
		{
			CommonAction.showRedWarning("Invalid path");
			return false;
		}
		if(!file.isFile())
		{
			CommonAction.showRedWarning("Only files are allowed");
			return false;
		}
		if(!file.getName().endsWith(".c"))
		{
			CommonAction.showRedWarning("Only c source files are allowed");
			return false;
		}
		CommonReference.setFile(file);
		CommonAction.showGreenWarning("File opened successfully");
		return true;
		
	}
}
