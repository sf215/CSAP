package BasicGui;
import java.io.*;

public class RunFile {
	
	private static File f ;
	static boolean checkPathExist()
	{
		try{
			 new ProcessBuilder("gcc");
		}catch(Exception e)
		{
			return false;
		}
		return true;
	}
	
	static boolean compileCFile(String fileName)
    {
        String compileFileCommand = "gcc " + fileName;
        boolean result = true;
        String resultString = "";
       
        try
        {

            Process processCompile = Runtime.getRuntime().exec(compileFileCommand);

            BufferedReader brCompileError = new BufferedReader(new InputStreamReader(processCompile.getErrorStream()));
            String errorCompile = brCompileError.readLine();
            if (errorCompile != null)
            {
            	result = false;
            	resultString += errorCompile +"\n";
            }

            

            BufferedReader brCompileRun = new BufferedReader(new InputStreamReader(processCompile.getErrorStream()));
            String outputCompile = brCompileRun.readLine();
            if (outputCompile != null)
            	resultString += outputCompile +"\n";
            
            if(!(resultString.equals("")))
            CommonAction.showRedWarning(resultString);
        }   
        catch (Exception e)
        {
            CommonAction.showRedWarning("Gcc may not be installed or path may not set , try to reinstall the project ");
            return false;
        }
        return result;
    }

    static void runCFile(String fileName)
    {
    	 String runFileCommand = fileName.substring(1,fileName.length()-2)+"exe";
   
        try
        {
        	java.awt.Desktop.getDesktop().open(new java.io.File(runFileCommand));
    
        } catch (Exception e)
        {
           CommonAction.showRedWarning("Exe file not found or permission may not provided");
            return;
        }
    }

	
	public static boolean CompileCprog(String filename)
	{
		 if(checkPathExist())
		 {
			 if(compileCFile(filename))
			 {
				File dir = new File(f.getParent());
				 try 
				 {  
					 String exeName = filename.substring(filename.lastIndexOf('\\')+1,filename.lastIndexOf("."));
				/*	 String exeName = filename.substring(0, filename.length() - 2);
					 exeName = exeName.substring(1,exeName.length());
					 exeName = exeName.substring(0,exeName.length()-1);
					 */
					
					 Runtime.getRuntime().exec("cmd /C gcc " + filename + " -o " + exeName, null, dir);
					 try
					 {
						 Thread.sleep(5000);
					 }
					 catch(Exception e)
					 {
						 e.printStackTrace();
					 }
					 return true;
				 }
				 catch(Exception e)
				 {
					CommonAction.showRedWarning("Error in executing task");
					return false;
				 }	
				 
			 }
			 return false;
		 }  
		 else
		 {
			 CommonAction.showRedWarning("Gcc not exist or path may not set");
			 return false;
		 }
	}
	static void compile()
	 {
		f = CommonReference.getFile();
		String fullPath = f.getAbsolutePath();
		String fileName = "\""+fullPath+"\"";
		CompileCprog(fileName);	 
	 }
	 
	 static void run()
	 {
		 f = CommonReference.getFile();
		 String fullPath = f.getAbsolutePath();
		 String fileName = "\""+fullPath+"\"";
		 boolean result = CompileCprog(fileName);
		 if(result)
		 runCFile(fileName);
	 }
	 
	 
	 
	
		
		

}
