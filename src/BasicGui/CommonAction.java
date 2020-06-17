package BasicGui;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.swing.JTextPane;
import javax.swing.text.BadLocationException;
import javax.swing.text.Style;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledDocument;
import java.util.*;
import java.io.File;
import java.io.FileOutputStream;
import javax.swing.*;

public class CommonAction {
	
	
	static void newBeginningWithExist()
	{
		JPanel panel2 = CommonReference.getPanel2();
		JPanel panel3 = CommonReference.getPanel3();
	
		panel2.removeAll();
		panel3.removeAll();
		panel2.revalidate();
		panel3.revalidate();
		panel2.repaint();
		panel3.repaint();
		
		CommonReference.getCurrentCode().setText("");
		CommonReference.getFullCode().setText("");
		CommonReference.getWarning().setText("");
		CommonReference.getstatus().setText("");
		DefaultListModel<String> model= new DefaultListModel<String>();
		JList<String> heirarchy = CommonReference.getHierarchy();
		
		model.addElement("");
		heirarchy.setModel(model);
		
	}
	
	
	static void writeToFile(String s)
	{
		s=s.toLowerCase();
		File file = CommonReference.getFile();
		
		try{
			FileOutputStream fout = new FileOutputStream(file);
			for(int i=0;i<s.length();i++)
			{
				fout.write((s.charAt(i)));
			}
			fout.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void enableAllPanel2Button()
	{
		for(int i = 0;i<AllArrays.getPanel2Button().length;i++)
			CommonReference.getPanel2AllButton(i).setEnabled(true);
	}
	static void disableAllPanel2Button()
	{
		for(int i = 0;i<AllArrays.getPanel2Button().length;i++)
			CommonReference.getPanel2AllButton(i).setEnabled(false);
	}
	
	static void showGreenWarning(String s)
	{
		JTextPane warning  = CommonReference.getWarning();
		
		StyledDocument doc = warning.getStyledDocument();
		Style style = doc.addStyle("I am Style",null);
		
		warning.setText("");
		StyleConstants.setForeground(style,Color.GREEN);
		
		try
		{
			doc.insertString(doc.getLength(),s, style);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void showRedWarning(String s)
	{
		JTextPane warning =  CommonReference.getWarning();
		StyledDocument doc = warning.getStyledDocument();
		Style style = doc.addStyle("I am Style",null);
		
		warning.setText("");
		StyleConstants.setForeground(style,Color.RED);
		
		try
		{
			doc.insertString(doc.getLength(),s, style);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	
	static void overrideFullCode(String s) 
	{
		String[] keywords={"auto","break","case","char","const",
				"continue","default","double","else",
				"enum","extern","float","goto","int",
				"long","registor","return","short","signed",
				"sizeof","static","struct","switch","typedef","union","main",
				"unsigned","void","volatile"};

		String[] preprocessor={"#include<stdio.h>","#include<string.h>","#include<ctype.h>",
				"#include<math.h>","#include<time.h>","#include<stdlib.h>",
				"#include<conio.h>","#include<asset.h>","#include<locale.h>",
				"#include<setjmp.h>","#include<signal.h>","#include<stdarg.h>"};

		String[] loopAndFunction={"do","for","if","while"};

		String[] indent={"{",";","}"};

		s=s.toLowerCase();

		JTextPane textPane=CommonReference.getFullCode();
		textPane.setText("");

		StyledDocument doc = textPane.getStyledDocument();
		Style style = textPane.addStyle("I'm a Style", null);

		List<String> listKeywords = Arrays.asList(keywords);
		List<String> listPreprocessors = Arrays.asList(preprocessor);
		List<String> listLoopAndFunction = Arrays.asList(loopAndFunction);
		List<String> listIndent = Arrays.asList(indent);


		for(int i=3;i<s.length();i++)
		{
			if(s.charAt(i)=='('&&s.charAt(i-1)=='r'&&s.charAt(i-2)=='o'&&s.charAt(i-3)=='f')
			{	
				s =s.substring(0,i)+" "+s.substring(i,s.length());
			}
		}

		for(int i=1;i<s.length();i++)
		{
			if(s.charAt(i)=='{'&&s.charAt(i-1)==')')
			{
				s =s.substring(0,i)+" "+s.substring(i,s.length());
			}
		}
	
		String s1= s.replace("\n","SNS");
		String s2= s1.replace("\t","STS");
		String s3= s2.replace(" ","SBS");

		String [] tokens = s3.split("[S]");

		List<String> listIn = Arrays.asList(tokens);
		for(String o:listIn){

			
			if (o.equals("B")){
				try {

					o=o.replace("B"," ");
					doc.insertString(doc.getLength(),"", style);

				}
				catch (BadLocationException ex) {
					
				}
			}
			if (o.equals("N")){
				try {

					o=o.replace("N","\n");
					doc.insertString(doc.getLength(),"", style);

				}
				catch (BadLocationException ex) {

				}
			}
			if (o.equals("T")){
				try {

					o=o.replace("T","   ");
					doc.insertString(doc.getLength(),o, style);

				}
				catch (BadLocationException ex) {

				}
			}


			if(listKeywords.contains(o)){

				StyleConstants.setForeground(style, Color.yellow);
				try {

					doc.insertString(doc.getLength(),o, style);

				}
				catch (BadLocationException ex) {

				}
			}

			if(listPreprocessors.contains(o)){

				StyleConstants.setForeground(style, Color.orange);
				try {

					doc.insertString(doc.getLength(),o, style);

				}
				catch (BadLocationException ex) {

				}
			}

			if(listLoopAndFunction.contains(o)){

				StyleConstants.setForeground(style, Color.green);
				try {

					doc.insertString(doc.getLength(),o, style);

				} 
				catch (BadLocationException ex) {

				}
			}
			if(listIndent.contains(o)){

				StyleConstants.setForeground(style, Color.pink);
				try {

					doc.insertString(doc.getLength(),o, style);

				} 
				catch (BadLocationException ex) {

				}
			}

			if( !listIndent.contains(o) && !listLoopAndFunction.contains(o) && !listPreprocessors.contains(o) && !listKeywords.contains(o)){

				StyleConstants.setForeground(style, Color.white);

				try {
					doc.insertString(doc.getLength(), o, style);
				} 
				catch (BadLocationException e) {
				}
			}


		}
		
		
	}

	
	static void overrideCurrentCode(String s)
	{
		String[] keywords={"auto","break","case","char","const",
				"continue","default","double","else",
				"enum","extern","float","goto","int",
				"long","registor","return","short","signed",
				"sizeof","static","struct","switch","typedef","union","main",
				"unsigned","void","volatile"};

		String[] preprocessor={"#include<stdio.h>","#include<string.h>","#include<ctype.h>",
				"#include<math.h>","#include<time.h>","#include<stdlib.h>",
				"#include<conio.h>","#include<asset.h>","#include<locale.h>",
				"#include<setjmp.h>","#include<signal.h>","#include<stdarg.h>"};

		String[] loopAndFunction={"do","for","if","while"};

		String[] indent={"{",";","}"};

		s=s.toLowerCase();

		JTextPane textPane=CommonReference.getCurrentCode();
		textPane.setText("");

		StyledDocument doc = textPane.getStyledDocument();
		Style style = textPane.addStyle("I'm a Style", null);

		List<String> listKeywords = Arrays.asList(keywords);
		List<String> listPreprocessors = Arrays.asList(preprocessor);
		List<String> listLoopAndFunction = Arrays.asList(loopAndFunction);
		List<String> listIndent = Arrays.asList(indent);


		for(int i=3;i<s.length();i++)
		{
			if(s.charAt(i)=='('&&s.charAt(i-1)=='r'&&s.charAt(i-2)=='o'&&s.charAt(i-3)=='f')
			{	
				s =s.substring(0,i)+" "+s.substring(i,s.length());
			}
		}

		for(int i=1;i<s.length();i++)
		{
			if(s.charAt(i)=='{'&&s.charAt(i-1)==')')
			{
				s =s.substring(0,i)+" "+s.substring(i,s.length());
			}
		}
	
		String s1= s.replace("\n","SNS");
		String s2= s1.replace("\t","STS");
		String s3= s2.replace(" ","SBS");

		String [] tokens = s3.split("[S]");

		List<String> listIn = Arrays.asList(tokens);
		for(String o:listIn){

		
			if (o.equals("B")){
				try {

					o=o.replace("B"," ");
					doc.insertString(doc.getLength(),"", style);

				}
				catch (BadLocationException ex) {
					
				}
			}
			if (o.equals("N")){
				try {

					o=o.replace("N","\n");
					doc.insertString(doc.getLength(),"", style);

				}
				catch (BadLocationException ex) {

				}
			}
			if (o.equals("T")){
				try {

					o=o.replace("T","   ");
					doc.insertString(doc.getLength(),o, style);

				}
				catch (BadLocationException ex) {

				}
			}


			if(listKeywords.contains(o)){

				StyleConstants.setForeground(style, Color.yellow);
				try {

					doc.insertString(doc.getLength(),o, style);

				}
				catch (BadLocationException ex) {

				}
			}

			if(listPreprocessors.contains(o)){

				StyleConstants.setForeground(style, Color.orange);
				try {

					doc.insertString(doc.getLength(),o, style);

				}
				catch (BadLocationException ex) {

				}
			}

			if(listLoopAndFunction.contains(o)){

				StyleConstants.setForeground(style, Color.green);
				try {

					doc.insertString(doc.getLength(),o, style);

				} 
				catch (BadLocationException ex) {

				}
			}
			if(listIndent.contains(o)){

				StyleConstants.setForeground(style, Color.pink);
				try {

					doc.insertString(doc.getLength(),o, style);

				} 
				catch (BadLocationException ex) {

				}
			}

			if( !listIndent.contains(o) && !listLoopAndFunction.contains(o) && !listPreprocessors.contains(o) && !listKeywords.contains(o)){

				StyleConstants.setForeground(style, Color.white);

				try {
					doc.insertString(doc.getLength(), o, style);
				} 
				catch (BadLocationException e) {
				}
			}


		}
		
		
	}

	static void showStatus()
	{
		
		int variables = CommonAction.getVariableNameAllFunction().length;
		int arrays = CommonAction.getArrayNameAllFunction().length;
		int function = CommonAction.getFunctionNameFullCode().length;
		String fileName = CommonReference.getFile().getName();
		
		 
		String s =fileName+"\nVariable: "+variables+"\nArrays: "+arrays+"\nfunction: "+function+
				"\nCurrent Function: "+Status.getFunction();	
		JTextPane status   = CommonReference.getstatus();
		//System.out.println(s);
		status.setText("");
		
		String[] format = {"Total", "Variable:", "Total", "Arrays:","Total", "function:", "Current", "Function:"};
		List<String> format1 = Arrays.asList(format);
		
	
		String [] s1=s.split("[\\s]");
		List <String>s2= Arrays.asList(s1);
		
		StyledDocument doc = status.getStyledDocument();
		Style style = doc.addStyle("I am Style",null);
		
		for(String o:s2){
			
			if(format1.contains(o)){
				
				StyleConstants.setForeground(style,Color.magenta);
				try{
					doc.insertString(doc.getLength(),o+" ", style);
				
				}
				catch(Exception e)
				{
					e.printStackTrace();
				}	
			
			}
			
			if(!format1.contains(o)){
			 	
				StyleConstants.setForeground(style,Color.cyan);
				try{
					doc.insertString(doc.getLength(),o+"\n", style);
					StyleConstants.setForeground(style,Color.white);
					doc.insertString(doc.getLength(),"--------------------\n", style);
					//System.out.println(o);
				}
				catch(Exception e)
				{
					e.printStackTrace();
				}
			}
			status.setCaretPosition(0);
		}
		
		
	}
	
	static void showHierarchy()
	{
		//System.out.println("000000");
		String function = Status.getFunction();
		String s  = "";
		
		Set<String> keys = MapClasses.getFunction().keySet();
		String[] allFunction = new String[keys.size()];
		int k = 0 ; 
        for(String key: keys){
            allFunction[k] = key;
            k++;
        }
		
		keys = MapClasses.getVariableDatatype().keySet();
		String[] variable = new String[keys.size()];
		k = 0 ; 
        for(String key: keys){
            variable[k] = key;
            k++;
        }
		
        keys = MapClasses.getArray().keySet();
		String[] arrays = new String[keys.size()];
		k = 0 ; 
        for(String key: keys){
            arrays[k] = key;
            k++;
        }
		
		for(int i=-1;i<allFunction.length;i++)
		{
			if(i==-1)
			{
				
	      
				s += function+" ";
				for(int j=0;j<variable.length;j++)
				{
					String var2=variable[j].substring(variable[j].indexOf("@")+1);
					if(var2.equals(function))
					{
						
						s+=variable[j].substring(0,variable[j].indexOf("@"))+" ";
					}
				}
				for(int j=0;j<arrays.length;j++)
				{
					String var2=arrays[j].substring(arrays[j].indexOf("@")+1);
					if(var2.equals(function))
						s+=arrays[j].substring(0,arrays[j].indexOf("@"))+" ";
				}
			}
			else
			{
				if(allFunction[i].equals(Status.getFunction()))
					continue;
				function = allFunction[i];
				s += function+" ";
				for(int j=0;j<variable.length;j++)
				{
					String var2=variable[j].substring(variable[j].indexOf("@")+1);
					if(var2.equals(function))
					{
						s+=variable[j].substring(0,variable[j].indexOf("@"))+" ";
					}
						
				}
				for(int j=0;j<arrays.length;j++)
				{
					String var2=arrays[j].substring(arrays[j].indexOf("@")+1);
					if(var2.equals(function))
						s+=arrays[j].substring(0,arrays[j].indexOf("@"))+" ";
				}	
			}
			s+=" ";
		}
		
		DefaultListModel<String> model= new DefaultListModel<String>();
		JList<String> heirarchy = CommonReference.getHierarchy();
		
		model.addElement("");
		
		s=s.replace("\n"," ");
		String [] s1 = s.split("[\\s]");
		List<String> s2 = Arrays.asList(s1);
		
		heirarchy.setBackground(Color.darkGray);
		heirarchy.setForeground(Color.cyan);
		
		String [] var=CommonAction.getVariableNameAllFunction();
		List<String> listVar = Arrays.asList(var);
		String [] arr = CommonAction.getArrayNameAllFunction();
		List<String> listArr = Arrays.asList(arr);
		
		for(String o:s2){
			o=o.trim();
			//System.out.println(o);

			if(listVar.contains(o)){
				model.addElement("      > "+o);
			}
			if(listArr.contains(o)){
				model.addElement("      ~ "+o);
			}
			if(!listVar.contains(o) && !listArr.contains(o)){
				model.addElement(o);
			}	
		}
		heirarchy.setModel(model);
		
	}
	
	
	// Shiza ne bnaya taki hme end of function wale ki curly braces mil ske
	
	
	public static int funcEnd(String st,String funcName){
		HashMap<String,String> function = new HashMap<String,String>();		
		int n;
		Set<String> s;
		String[] funcstr;
		boolean b=false;
		String str=st;
		int startFunc = 0;
		int count=0;
		if(st.contains(funcName)) {
			if(funcName.equals("main")) {
				return str.lastIndexOf("}");
			}
			while(str.contains(funcName)) {			 
				 startFunc=str.indexOf(funcName);
				int index2=startFunc+funcName.length();
				char c=str.charAt(index2);

				if(c=='(') {
					b=true;
					break;
				}
				else {						
					String replace = new String(new char[funcName.length()]).replace("\0", "2");
					str=str.replaceFirst(funcName, replace);
				}
			}
			if(b) {
				str=str.substring(startFunc);

				//if function call is before function definition
				int e=str.indexOf(")");
				char f=str.charAt(e+2);
				while(f==';') {
				//while(str.indexOf(";")<str.indexOf("{")) {
				char t=funcName.charAt(0);
				char z='7';
				String t1=funcName.replace(t,z);
				str=str.replaceFirst(funcName,t1);
				count=count+startFunc;
				startFunc=str.indexOf(funcName);
				str=str.substring(startFunc);
			    e=str.indexOf(")");
				 f=str.charAt(e+1);
				}
				
				str=str.replaceFirst("\\{", " ");
             
				int indexOfStartBracket=str.indexOf("{");
				int indexOfEndBracket=str.indexOf("}");
				
				//Case 1:no loops inside the function
				if(indexOfStartBracket>indexOfEndBracket && indexOfStartBracket>=0) {
					return indexOfEndBracket+count+startFunc;
				}
				//
				else {

	//Case 2:if inside a function there are conditions or loop that also require "{" &"}" brackets
		
				function=MapClasses.getFunction();
				n=function.size();
				s=function.keySet();
				funcstr=new String[n];
				 int i=0;
				   for(String x: s) {
					   funcstr[i++]=x;
					   Arrays.toString(funcstr);
				   }
				   int min=str.length()-1;
				   int indexOfnextFunc = 0;
				   		  
				   for(int j=0;j<n;j++) {
					   String temp=funcstr[j]+"(){";
					 //  System.out.println(temp);
					   if(!funcstr[j].equals(funcName)) {
						   indexOfnextFunc=str.indexOf(temp);
						//   System.out.println(indexOfnextFunc);
						   if(indexOfnextFunc<min && indexOfnextFunc>0) {
						       min=indexOfnextFunc;   
						    //   System.out.println("min= "+min);
						   }
					   }
					  
				   }
			//	   System.out.println("final min ="+min);
				   str=str.substring(0,min);
				//   System.out.println(str);
				   int y=str.lastIndexOf("}");
				//   System.out.println(y);
				   return y+startFunc+count;
				   
				   
				}

				
			}
			else {
				return 0;
			}
			
		}
		else {
			return 0;
		}
	}
	

	
	// these function are declared to get current variable array and that shit ie function name of current working functions only.
	// ye decide hua that taki hm local global ko achhe se maintain kr ske 
	// Ye local ka kaam krenge
	static String[] getVariableNameCurrentFunction()
	{
		String [] a;
		String function  = Status.getFunction();
		ArrayList<String> a1 = new ArrayList<String>();
		Set<?> entries = MapClasses.getVariableDatatype().entrySet();
		Iterator<?> iterator = entries.iterator();
        while(iterator.hasNext()){
           
			@SuppressWarnings("rawtypes")
			Map.Entry mapping = (Map.Entry)iterator.next();
            String var = mapping.getKey().toString();
            String var2=var.substring(var.indexOf("@")+1);
            if(var2.equals(function)) {     	
            	a1.add(var.substring(0,var.indexOf('@')));
            }
        }
        a = new String[a1.size()];
        a=a1.toArray(a);
		return a;
		
	}
	
	static String[] getVariableDataTypeCurrentFunction()
	{
		String [] a;
		String function  = Status.getFunction();
		ArrayList<String> a1 = new ArrayList<String>();
		Set<?> entries = MapClasses.getVariableDatatype().entrySet();
		Iterator<?> iterator = entries.iterator();
        while(iterator.hasNext()){
            @SuppressWarnings("rawtypes")
			Map.Entry mapping = (Map.Entry)iterator.next();
            String var = mapping.getKey().toString();
            String var2=var.substring(var.indexOf("@")+1);
            if(var2.equals(function))
            	a1.add(MapClasses.getVariableDatatype().get(var));
        }
        a = new String[a1.size()];
        a=a1.toArray(a);
		return a;
	}
	//Array part ki teeno cheeze
	static String[] getArrayNameCurrentFunction()
	{
		String [] a;
		String function  = Status.getFunction();
		ArrayList<String> a1 = new ArrayList<String>();
		Set<?> entries = MapClasses.getArray().entrySet();
		Iterator<?> iterator = entries.iterator();
        while(iterator.hasNext()){
            @SuppressWarnings("rawtypes")
			Map.Entry mapping = (Map.Entry)iterator.next();
            String var = mapping.getKey().toString();
            String var2=var.substring(var.indexOf("@")+1);
            if(var2.equals(function))
            	a1.add(var.substring(0,var.indexOf('@')));
        }
        a = new String[a1.size()];
        a=a1.toArray(a);
		return a;
	}
	static String[] getArraySizeCurrentFunction()
	{
		String [] a;
		String function  = Status.getFunction();
		ArrayList<String> a1 = new ArrayList<String>();
		Set<?> entries = MapClasses.getArray().entrySet();
		Iterator<?> iterator = entries.iterator();
        while(iterator.hasNext()){
            @SuppressWarnings("rawtypes")
			Map.Entry mapping = (Map.Entry)iterator.next();
            String var = mapping.getKey().toString();
            String var2=var.substring(var.indexOf("@")+1);
            if(var2.equals(function))
            	a1.add(MapClasses.getArray().get(var));
        }
        a = new String[a1.size()];
        a=a1.toArray(a);
		return a;
	}
	static String [] getArrayDataTypeCurrentFunction()
	{
		String [] a;
		String function  = Status.getFunction();
		ArrayList<String> a1 = new ArrayList<String>();
		Set<?> entries = MapClasses.getArrayDatatype().entrySet();
		Iterator<?> iterator = entries.iterator();
        while(iterator.hasNext()){
            @SuppressWarnings("rawtypes")
			Map.Entry mapping = (Map.Entry)iterator.next();
            String var = mapping.getKey().toString();
            String var2=var.substring(var.indexOf("@")+1);
            if(var2.equals(function))
            	a1.add(MapClasses.getArrayDatatype().get(var));
        }
        a = new String[a1.size()];
        a=a1.toArray(a);
		return a;
	}
	// end
	
	// these functions are declared to get String[]  array and all variable names that exist in code of loaded file.
	static String[] getVariableNameAllFunction()
	{
		String [] a;
		ArrayList<String> a1 = new ArrayList<String>();
		Set<?> entries = MapClasses.getVariableDatatype().entrySet();
		Iterator<?> iterator = entries.iterator();
        while(iterator.hasNext()){
            @SuppressWarnings("rawtypes")
			Map.Entry mapping = (Map.Entry)iterator.next();
            String var = mapping.getKey().toString();
            	a1.add(var.substring(0,var.indexOf('@')));
        }
        a = new String[a1.size()];
        a=a1.toArray(a);
		return a;
	}
	static String[] getVariableDataTypeAllFunction()
	{
		String [] a;
		ArrayList<String> a1 = new ArrayList<String>();
		Set<?> entries = MapClasses.getVariableDatatype().entrySet();
		Iterator<?> iterator = entries.iterator();
        while(iterator.hasNext()){
            @SuppressWarnings("rawtypes")
			Map.Entry mapping = (Map.Entry)iterator.next();
            String var = mapping.getKey().toString();
            	a1.add(MapClasses.getVariableDatatype().get(var));
        }
        a = new String[a1.size()];
        a=a1.toArray(a);
		return a;
	}
	//Array part ki teeno cheeze
	static String[] getArrayNameAllFunction()
	{
		String [] a;
		ArrayList<String> a1 = new ArrayList<String>();
		Set<?> entries = MapClasses.getArray().entrySet();
		Iterator<?> iterator = entries.iterator();
        while(iterator.hasNext()){
            @SuppressWarnings("rawtypes")
			Map.Entry mapping = (Map.Entry)iterator.next();
            String var = mapping.getKey().toString();
            	a1.add(var.substring(0,var.indexOf('@')));
        }
        a = new String[a1.size()];
        a=a1.toArray(a);
		return a;
	}
	static String[] getArraySizeAllFunction()
	{
		String [] a;
		ArrayList<String> a1 = new ArrayList<String>();
		Set<?> entries = MapClasses.getArray().entrySet();
		Iterator<?> iterator = entries.iterator();
        while(iterator.hasNext()){
            @SuppressWarnings("rawtypes")
			Map.Entry mapping = (Map.Entry)iterator.next();
            String var = mapping.getKey().toString();
            	a1.add(MapClasses.getArray().get(var));
        }
        a = new String[a1.size()];
        a=a1.toArray(a);
		return a;
	}
	static String [] getArrayDataTypeAllFunction()
	{
		String [] a;
		ArrayList<String> a1 = new ArrayList<String>();
		Set<?> entries = MapClasses.getArrayDatatype().entrySet();
		Iterator<?> iterator = entries.iterator();
        while(iterator.hasNext()){
            @SuppressWarnings("rawtypes")
			Map.Entry mapping = (Map.Entry)iterator.next();
            String var = mapping.getKey().toString();
            	a1.add(MapClasses.getArrayDatatype().get(var));
        }
        a = new String[a1.size()];
        a=a1.toArray(a);
		return a;
	}
	static String[] getFunctionNameFullCode()
	{
		String [] a;
		ArrayList<String> a1 = new ArrayList<String>();
		Set<?> entries = MapClasses.getFunction().entrySet();
		Iterator<?> iterator = entries.iterator();
        while(iterator.hasNext()){
            @SuppressWarnings("rawtypes")
			Map.Entry mapping = (Map.Entry)iterator.next();
            String var = mapping.getKey().toString();
            	a1.add(var);
        }
        a = new String[a1.size()];
        a=a1.toArray(a);
		return a;
	}
	static String[] getFunctionReturnTypeFullCode()
	{
		String [] a;
		ArrayList<String> a1 = new ArrayList<String>();
		Set<?> entries = MapClasses.getFunction().entrySet();
		Iterator<?> iterator = entries.iterator();
        while(iterator.hasNext()){
            @SuppressWarnings("rawtypes")
			Map.Entry mapping = (Map.Entry)iterator.next();
            String var = mapping.getKey().toString();
            	a1.add(MapClasses.getFunction().get(var));
        }
        a = new String[a1.size()];
        a=a1.toArray(a);
		return a;
	}
	static String[] getPreprocessorFullCode()
	{
		String a[];
		Set<?> entries = MapClasses.getperprocessor().entrySet();
		ArrayList<String> a1 = new ArrayList<String>();
        Iterator<?> iterator = entries.iterator();
        while(iterator.hasNext()){
            @SuppressWarnings("rawtypes")
			Map.Entry mapping = (Map.Entry)iterator.next();   
            a1.add(mapping.getKey().toString());
        }
        a = new String[a1.size()];
        a=a1.toArray(a);
		return a;
	}
	
	static void comboOperations(String current,String full,String message)
	{
		full =Formatting.format(full);
		current   = Formatting.format(current);
		
		CommonReference.setFullVersionCode(full);
		CommonReference.setCurrentVersionCode(current);
		
		CommonAction.overrideCurrentCode(CommonReference.getCurrentVersionCode());
		CommonAction.overrideFullCode(CommonReference.getFullVersionCode());
		
		CommonAction.writeToFile(CommonReference.getFullVersionCode());
		
		CommonAction.showGreenWarning(message);
	}
	// end
	
	static void backWholePanel3()
	{
		
		JPanel panel3 = CommonReference.getPanel3();
		if(panel3!=null)
		{
			panel3.removeAll();
			CommonAction.enableAllPanel2Button();
			panel3.validate();
			panel3.repaint();
		}
	}
	//
	
static String[] getAllOperations() {
		
		HashMap <String,String> Arithmetic=Operators.getArithmetic();
		
		 Set<String> s1= Arithmetic.keySet();
		 int n1=Arithmetic.size();
		 String[] operations1 = new String[n1];
		 int i1=0;
		   for(String st: s1) {
			   operations1[i1++]=st;
			   Arrays.toString(operations1);
		   }
		
	   HashMap <String,String> Relational=Operators.getRelational();   
	     Set<String> s2= Relational.keySet();
	     int n2=Relational.size();
		 String[] operations2 = new String[n2];
		 int i2=0;
		   for(String st: s2) {
			   operations2[i2++]=st;
			   Arrays.toString(operations2);
		   }   
		   HashMap <String,String> Bitwise=Operators.getBitwise();   
		     Set<String> s3= Bitwise.keySet();
		     int n3=Bitwise.size();
			 String[] operations3 = new String[n3];
			 int i3=0;
			   for(String st: s3) {
				   operations3[i3++]=st;
				   Arrays.toString(operations3);
			   }   
		     
			   HashMap <String,String> Assignment=Operators.getAssignment();   
			     Set<String> s4= Assignment.keySet();
			     int n4=Assignment.size();
				 String[] operations4 = new String[n4];
				 int i4=0;
				   for(String st: s4) {
					   operations4[i4++]=st;
					   Arrays.toString(operations4);
				   }   
		 	
		     
		String[] one=new String[operations1.length+operations2.length];
		  System.arraycopy(operations1, 0, one, 0, operations1.length);
		  System.arraycopy(operations2, 0, one, operations1.length, operations2.length);
		  
	   String[] two=new String[operations3.length+operations4.length];    
	   System.arraycopy(operations3, 0, two,0, operations3.length);
	   System.arraycopy(operations4, 0, two, operations3.length, operations4.length);
	   
	   String[] three=new String[one.length+two.length];
	   System.arraycopy(one, 0, three, 0, one.length);
	  System.arraycopy(two, 0, three, one.length, two.length);
	  
	  
	  return three;
	}
	
	static String[] getAllOperators() {
		HashMap <String,String> Arithmetic=Operators.getArithmetic();
		String[] operators1=Arithmetic.values().toArray(new String[0]);
		
		HashMap <String,String> Relational=Operators.getRelational();
		String[] operators2=Relational.values().toArray(new String[0]);
		
		HashMap <String,String> Bitwise=Operators.getBitwise();
		String[] operators3=Bitwise.values().toArray(new String[0]);
		
		HashMap <String,String> Assignment=Operators.getAssignment();
		String[] operators4=Assignment.values().toArray(new String[0]);
		
		String[] one=new String[operators1.length+operators2.length];
		  System.arraycopy(operators1, 0, one, 0, operators1.length);
		  System.arraycopy(operators2, 0, one, operators1.length, operators2.length);
		  
		  String[] two=new String[operators3.length+operators4.length];    
		   System.arraycopy(operators3, 0, two,0, operators3.length);
		   System.arraycopy(operators4, 0, two, operators3.length, operators4.length);
		   
		   String[] three=new String[one.length+two.length];
		   System.arraycopy(one, 0, three, 0, one.length);
		  System.arraycopy(two, 0, three, one.length, two.length);
		  
		  return three;
		
	}
}
