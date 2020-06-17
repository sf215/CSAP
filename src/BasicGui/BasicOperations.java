package BasicGui;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class BasicOperations {
	
	static String valueModify(String datatype,String value)
	{
		if(datatype.contains("char"))
		{
			char c = '\'';
			if(value.contains("'"))
				return value;
			else
				return Character.toString(c)+value+Character.toString(c);
		}
		else if(datatype.contains("float")||datatype.contains("double"))
		{
			char c = '.';
			if(value.contains(Character.toString(c)))
				return value;
			else
				return value+".0";
		}
		else return value;
	}
	
	
	static boolean valueCheck(String datatype,String value)// retrun true if value is correct else return false
	{
		if(datatype.contains("char"))
		{
			if(!(value.length()==1||value.length()==3))
			{
				CommonAction.showRedWarning(value +" is not permitted with datatype "+datatype);
				return false;
			}
			if(value.length()==3)
			{
				char a = value.charAt(0);
				char b = value.charAt(2);
				if(!((a=='\'')&&(b=='\'')))
				{
					CommonAction.showRedWarning(value +" is not permitted with datatype "+datatype);
					return false;
				}
			}
		}
		else if(datatype.contains("int"))
		{
			for(int i=0;i<value.length();i++)
			{
				char c = value.charAt(i);
				if(!(c>=48&&c<=57))
				{
					CommonAction.showRedWarning(value +" is not permitted with datatype "+datatype);
					return false;
				}
			}
		}
		else if(datatype.contains("float")||datatype.contains("double"))
		{
			if(value.contains("."))
			{
				int index  = value.indexOf(".");
				int lastIndex = value.lastIndexOf(".");
				if(index!=lastIndex)
				{
					CommonAction.showRedWarning(value +" is not permitted with datatype "+datatype);
					return false;
				}
				if(index==value.length()-1)
				{
					CommonAction.showRedWarning(value +" is not permitted with datatype "+datatype);
					return false;
				}
			}
			for(int i =0;i<value.length();i++)
			{
				char c = value.charAt(i);
				if(c=='.')
					continue;
				else
					if(!(c>=48&&c<=57))
					{
						CommonAction.showRedWarning(value +" is not permitted with datatype "+datatype);
						return false;
					}
			}
		}
		return true;
	}
	
	
	static boolean variableNameCheck(String s,String[] variable,String[] array,String [] function)
	{
	
		for(int i=0;i<s.length();i++)
		{
			char c = s.charAt(i);
			if(c>=65&&c<=90)
			{
				CommonAction.showRedWarning("Capital character are not allowed in our ide");
				return false;
			}
		}
		char c = s.charAt(0);
		if(!((c==36)||(c==95)||(c<=122&&c>=97)))
		{
			CommonAction.showRedWarning("Identifier first character should be alphabet, dollar, underscore");
			return false;
		}
		for(int i=1;i<s.length();i++)
		{
			char c1 = s.charAt(i);
			if(!((c1==36)||(c1==95)||(c1<=122&&c1>=97)||(c1>=48&&c1<=57)))
			{
				CommonAction.showRedWarning(s+" is not permitted");
				return false;
			}
				
		}
		for(int i=0;i<variable.length;i++)
		{
			if(variable[i].equals(s))
			{
				CommonAction.showRedWarning("Name already used as local variable");
				return false;
			}
		}
		for(int i=0;i<array.length;i++)
		{
			if(array[i].equals(s))
			{
				CommonAction.showRedWarning("Name already used as local array");
				return false;
			}
		}
		for(int i=0;i<function.length;i++)
		{
			if(function[i].equals(s))
			{
				CommonAction.showRedWarning("Name already used as function");
				return false;
			}
		}
		return true;
	}
	

	static String[] removeDuplicacy(String source[], String destination[])  // do array me source me se destination ko htane ke liye
	{
		List<String> a1= Arrays.asList(source);
		//	System.out.println("all prep "+a1);
		
		List<String> a2= Arrays.asList(destination);	
		//	System.out.println("all used "+a2);
			
		List <String> resultArrayList= new ArrayList<String>(a1);
		resultArrayList.removeAll(a2);
		String[] last =resultArrayList.toArray(new String[0]);
			
		return last;
	}

}
