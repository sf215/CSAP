package BasicGui;

import java.io.*;

public class CodeStart {
	
	private File file;
	private FileOutputStream fout;
	private BufferedReader br;
	
	void newFile() throws FileNotFoundException,IOException
	{		
		String  s = "#include<stdio.h>"+
					"#include<conio.h>"+
					"void main(){}";
		// Do formatting for s only
		s =Formatting.format(s);
		CommonReference.setCurrentVersionCode(s);
		CommonReference.setFullVersionCode(s);
		CommonAction.overrideFullCode(s);
		CommonAction.overrideCurrentCode(s);
		file = CommonReference.getFile();
		fout = new FileOutputStream(file);
		for(int i=0;i<s.length();i++)
		{
			fout.write((s.charAt(i)));
		}
		MapClasses.refernceForNewFile();
		Status.setFunction("main");
		Status.setDoWhileCondition("");
		CommonAction.showStatus();
		CommonAction.showHierarchy();
		new Panel2Begin();
	}
	
	
	void existingFile() throws FileNotFoundException,IOException
	{
	
		file = CommonReference.getFile();
		br = new BufferedReader(new FileReader(file));
		String s1="";
		String s="";
		while((s1=br.readLine())!=null)
		{
			s+=s1;
		}
		// Do formating s
		s= Formatting.format(s);
		CommonReference.setCurrentVersionCode(s);
		CommonReference.setFullVersionCode(s);
		CommonAction.overrideCurrentCode(s);
		CommonAction.overrideFullCode(s);
		Status.setFunction("main");
		Status.setDoWhileCondition("");
		
		MapClasses.refernceForLoadedFile(s);
		
		CommonAction.showStatus();
		CommonAction.showHierarchy();
		new Panel2Begin();
		
	}

}
