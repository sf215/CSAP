
package BasicGui;

import java.io.*;
import java.awt.*;
import javax.swing.*;



public class FileChooserDemo extends JPanel{
    
	private static final long serialVersionUID = 1L;
	private JFileChooser fc;

    
   public FileChooserDemo() {
        super(new BorderLayout());
        fc = new JFileChooser();
        fc.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);        
    }

   
    String call() {
    		int returnVal = fc.showOpenDialog(FileChooserDemo.this);
            if (returnVal == JFileChooser.APPROVE_OPTION) 
            {
                File file = fc.getSelectedFile();
                if(file==null)
                {	
                	CommonAction.showRedWarning("Path is not selected properly");
                	return null;
                }
                return file.getPath();
            } 
            else 
            {
                return null;
            }
      }    
}
