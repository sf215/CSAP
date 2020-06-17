package BasicGui;
import java.util.*;
public class MapClasses {
	
	
	private static HashMap<String,String> function = new HashMap<String,String>();
	private static HashMap<String,String> preprocessor = new HashMap<String,String>(); // key me preprocessor ka name kr dena value me include kr dena
	private static HashMap<String,String> array = new HashMap<String,String>();
	
	private static HashMap<String,String> variableDatatype = new HashMap<String,String>();
	private static HashMap<String,String> arrayDataType = new HashMap<String,String>();
	
	static void refershAllParameter()
	{
		function = new HashMap<String, String>();
		preprocessor = new HashMap<String, String>();
		array = new HashMap<String, String>();
		variableDatatype = new HashMap<String, String>();
		arrayDataType = new HashMap<String, String>();
	}
	
	static void refernceForLoadedFile(String s)
	{
	
		function = new HashMap<String,String>();
		preprocessor = new HashMap<String,String>();
		array = new HashMap<String,String>();
		variableDatatype = new HashMap<String,String>();
		arrayDataType = new HashMap<String,String>();
	     countPreprocessor(s);
	     countFunction(s);	 	 
		 countArray(s);
		 countVariableDatatype(s); 
		 countArrayDatatype(s);
	}
	
	static void countPreprocessor(String s) {
		
		String s1=s;
		int index=s1.lastIndexOf("h>");
		s1=s1.substring(0, index+2);
		String[] st=s1.split("#");
		int count=0;
		 for (String a : st) {		 
    		 if(count <=20 && count>0) {
    			 a=a.trim();
    			 a="#"+a;
	            putPreprocessor(a,"include");
	            
    		 }
			 count++;
			 
		 }		 		
	}
		
	
	
	
	static void countFunction(String s) {
		 String st=s;
	//	 System.out.println(st);
		 String[] datatypes=AllArrays.getDatatypesWithVoid();
		 for(int i =0; i < datatypes.length; i++)
		    {
			 if(st.contains("printf")) {
			    	st=st.replaceAll("printf", "");
			    }
		        while(st.contains(datatypes[i]))
		        {
		        	
		        	
		      //  	int count=0;
		        	
		            int index1=st.indexOf(datatypes[i]);
		            String st2=st.substring(index1);
		           st2=st2.replaceFirst(datatypes[i], "");
		           st2=st2.trim();        
		           int bracketindex=st2.indexOf("{");
		           String st3=st2.substring(0,bracketindex+1);
		           
		           if(st3.contains("(")) {
		    //    	   count=1;
		        	  int index2=st3.indexOf("(");
		        	  st3=st3.substring(0,index2);
		        	  if(!st3.contains(";")) {
                     if(st3.contains("=")) {
		        		  
		        	  }
                     else {
		        	 //  function name= st3
		        	 //return type=datatypes[i]
		        	   putFunction(st3,datatypes[i]);
		        	 //  System.out.println(st3);
                     }
		        	  }
		           }
		           
		           st=st.replaceFirst(datatypes[i], "");
		          
		        }
		    }
		 
	}
	
	static void countArray(String s) {

		String s2=s;
		String st=s;
		 HashMap<String,String> function2=getFunction();	
		 
		 
		 
		 String[] datatypes=AllArrays.getDatatypesWithOutVoid();
		 int n=function2.size();
			Set<String> ss= function2.keySet();
			String[] func = new String[n];
			 int k=0;
			   for(String si: ss) {
				   func[k++]=si;
				   Arrays.toString(func);
			   }
			   
			   for(int j=0;j<func.length;j++) {
				   int index=CommonAction.funcEnd(s2, func[j]);
				   
				   if(s2.contains(func[j])) {
						String begin=func[j]+"(){";
						int start=s2.indexOf(begin);
						st=s2.substring(start,index+1);
						s2=s2.replace(st, "");
	
		 
		if(st.contains(";")) { 
			  if(st.contains("void")) {
           	   st=st.replace("void", "");
              }
		 for(int i =0; i < datatypes.length; i++)
		    {
		        while(st.contains(datatypes[i]))
		        {
		        	int count=0;
		            int index1=st.indexOf(datatypes[i]);
		            String se=st.substring(index1);
		           se=se.replaceFirst(datatypes[i], "");
		           se=se.trim();
		           int spaceindex=se.indexOf(" ");
		           String sup=se.substring(0,spaceindex+1);
		           if(sup.contains("(")) {
		        	   count=1;
		           }
		           	           
		           //if it is not function
		           if(count==0) {
		             
		        	   int index2=se.indexOf(";");
				       se=se.substring(0,index2);
				       se=se.replaceFirst(datatypes[i], "");
		               se=se.replace(" ", "");
	   	               se=se.trim(); 
	   	               if(se.contains("[")) {
		              int index3=se.indexOf("[");  
		              int index4=se.indexOf("]");        
				      String var=se.substring(0,index3);
		              String size=se.substring(index3+1,index4);
		              
		              var=var+"@"+func[j];
		              putArray(var,size);
		              
		            
		              
		              st=st.replace(se, ""); 
	   	               }      
		           }
		           st=st.replaceFirst(datatypes[i], "");
		        }
		    }
		}  
      }
	}

  }
	
	
	static void  countVariableDatatype(String s) {
		String s2=s;
		String st=s;
		 HashMap<String,String> function2=getFunction();		 
		 String[] datatypes=AllArrays.getDatatypesWithOutVoid();
		
		 int n=function2.size();
			Set<String> ss= function2.keySet();
			String[] func = new String[n];
			 int k=0;
			   for(String si: ss) {
				   func[k++]=si;
				   Arrays.toString(func);
			   }
			   
			   for(int j=0;j<func.length;j++) {
				   int index=CommonAction.funcEnd(s2, func[j]);
				   
				   if(s2.contains(func[j])) {
						String begin=func[j]+"(){";
						int start=s2.indexOf(begin);
						st=s2.substring(start,index+1);
						s2=s2.replace(st, "");
		 
		 if(st.contains(";")) {
		 
			 for(int i =0; i < datatypes.length; i++)
			    {
			        while(st.contains(datatypes[i]))
			        {
			        	int count=0;
			            int index1=st.indexOf(datatypes[i]);
			            String se=st.substring(index1);
			           se=se.replaceFirst(datatypes[i], "");
			           se=se.trim();
			           int spaceindex=se.indexOf(" ");
			           String sup=se.substring(0,spaceindex+1);
			           if(sup.contains("(")) {
			        	   count=1;  
			           }
			           			           
			           //if it is not function
			           if(count==0) {
			        	   int index2=se.indexOf(";");
					       se=se.substring(0,index2);
					       se=se.replaceFirst(datatypes[i], "");
			               se=se.replace(" ", "");
		   	               se=se.trim(); 
			              int index3=se.indexOf("=");  
					      String var=se.substring(0,index3+1);
			              var=var.replace("=", "");
			       //       String val=se.substring(index3+1);
			              
			              if(!var.equals("")) {
			              var=var+"@"+func[j];             
			              putVariableDatatype(var,datatypes[i]);
			              }
			              st=st.replace(se, ""); 				             
			           }
			           st=st.replaceFirst(datatypes[i], "");
			         }
			       }
			    }
				   }
			   }
	}
	
	static void countArrayDatatype(String s) {
		String s2=s;
		String st=s;
		 HashMap<String,String> function2=getFunction();	
		 
		 
		 
		 String[] datatypes=AllArrays.getDatatypesWithOutVoid();
		 int n=function2.size();
			Set<String> ss= function2.keySet();
			String[] func = new String[n];
			 int k=0;
			   for(String si: ss) {
				   func[k++]=si;
				   Arrays.toString(func);
			   }
			   
			   for(int j=0;j<func.length;j++) {
				   int index=CommonAction.funcEnd(s2, func[j]);
				   
				   if(s2.contains(func[j])) {
						String begin=func[j]+"(){";
						int start=s2.indexOf(begin);
						st=s2.substring(start,index+1);
						s2=s2.replace(st, "");
	
		 
		if(st.contains(";")) { 
			  if(st.contains("void")) {
           	   st=st.replace("void", "");
              }
		 for(int i =0; i < datatypes.length; i++)
		    {
		        while(st.contains(datatypes[i]))
		        {
		        	int count=0;
		            int index1=st.indexOf(datatypes[i]);
		            String se=st.substring(index1);
		           se=se.replaceFirst(datatypes[i], "");
		           se=se.trim();
		           int spaceindex=se.indexOf(" ");
		           String sup=se.substring(0,spaceindex+1);
		           if(sup.contains("(")) {
		        	   count=1;
		           }
		           	           
		           //if it is not function
		           if(count==0) {
		             
		        	   int index2=se.indexOf(";");
				       se=se.substring(0,index2);
				       se=se.replaceFirst(datatypes[i], "");
		               se=se.replace(" ", "");
	   	               se=se.trim(); 
	   	               if(se.contains("[")) {
		              int index3=se.indexOf("[");  
		 //             int index4=se.indexOf("]");        
				      String var=se.substring(0,index3);
		      //        String size=se.substring(index3+1,index4);
		              
		              var=var+"@"+func[j];
		              putArrayDatatype(var,datatypes[i]);
		              st=st.replace(se, ""); 
	   	               }      
		           }
		           st=st.replaceFirst(datatypes[i], "");
		        }
		    }
		}  
				   }
			   }
	}
	
	static void refernceForNewFile()
	{
		 
		 function = new HashMap<String,String>();
		 preprocessor = new HashMap<String,String>(); // key me preprocessor ka name kr dena value me include kr dena
		 array = new HashMap<String,String>();
		
		 variableDatatype = new HashMap<String,String>();
		 arrayDataType = new HashMap<String,String>();
		
		function.put("main", "void");
		preprocessor.put("#include<stdio.h>", "include");
		preprocessor.put("#include<conio.h>", "include");
	}
	
	static void putPreprocessor(String s1,String s)
	{
		preprocessor.put(s1, s);
	}

	

	static void putArray(String s1,String s)
	{
		array.put(s1, s);
	}

	static void putFunction(String s1,String s)
	{
		function.put(s1, s);
	}
	
	static void putVariableDatatype(String s1,String s)
	{
		 variableDatatype.put(s1, s);
	}
	
	static void putArrayDatatype(String s1,String s)
	{
		arrayDataType.put(s1, s);
	}
	
	
	
	
	static HashMap<String, String> getFunction()
	{
		return function;
	}
	static HashMap<String, String> getperprocessor()
	{
		return preprocessor;
	}
	static HashMap<String, String> getArray()
	{
		return array;
	}
	static HashMap<String, String> getVariableDatatype()
	{
		return variableDatatype;
	}
	
	static HashMap<String, String> getArrayDatatype()
	{
		return arrayDataType;
	}


}
