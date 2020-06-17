package BasicGui;

import java.util.ArrayList;

public class UndoWorking {
	
	private static ArrayList<String> undoListDetail = new ArrayList<String>() ;
	private static ArrayList<String> undoListFunction = new ArrayList<String>();
	private static ArrayList<String> undoListMode = new ArrayList<String>();
	
	static void addItem(String code,String Mode)
	{
		undoListDetail.add(code);
		undoListFunction.add(Status.getFunction());
		undoListMode.add(Mode);
	}
	
	static void removeItem()
	{
		if(undoListMode.size()==0)
			CommonAction.showRedWarning("No undo applicable");
		else
		{
			String mode = undoListMode.get(undoListMode.size()-1);	
			if(mode.equals("preprocessor"))
			{
				removePreprocessor();
			}
			else if(mode.equals("variableDeclare"))
			{
				removeVariableDeclare();
			}
			else if(mode.equals("arrayDeclare"))
			{
				removeArrayDeclare();
			}
			else if(mode.equals("functionDeclare"))
			{
				removeFunctionDeclare();
			}
			else if(mode.equals("normal"))
			{
				removeNormal();
			}
			else if(mode.equals("end"))
			{
				removeEnd();
			}
			else if(mode.equals("whileEnd"))
			{
				removeWhileEnd();
			}
			else if(mode.equals("arrayInitialise"))
			{
				removeArrayInitialise();
			}
			CommonAction.enableAllPanel2Button();
			CommonAction.backWholePanel3();
			undoListDetail.remove(undoListDetail.size()-1);
			undoListMode.remove(undoListMode.size()-1);
			undoListFunction.remove(undoListFunction.size()-1);
		}
	}
	
	private static void removePreprocessor()
	{
		String fullCode = CommonReference.getFullVersionCode();
		fullCode = fullCode.replace(undoListDetail.get(undoListDetail.size()-1), "");
		MapClasses.getperprocessor().remove(undoListDetail.get(undoListDetail.size()-1));
		CommonAction.comboOperations("", fullCode,"Undo Successful");
		
	}
	private static void removeVariableDeclare()
	{
		String fullCode = CommonReference.getFullVersionCode();
		String remove = undoListDetail.get(undoListDetail.size()-1);
		int functionStartIndex  = fullCode.indexOf(undoListFunction.get(undoListFunction.size()-1)+"(){");
		int functionendIndex = CommonAction.funcEnd(fullCode,undoListFunction.get(undoListFunction.size()-1));
		String part1 = fullCode.substring(0,functionStartIndex);
		String part2 = "";
		if(fullCode.length()!=functionendIndex+1)
			part2 = fullCode.substring(functionendIndex+1,fullCode.length() );
		String consider = fullCode.substring(functionStartIndex,functionendIndex+1);
		consider = consider.replace(remove,"");
		String split[] = remove.split(" ");
		String variable = "";
		if(split[3].equals("="))
			variable = split[2];
		else
			variable = split[1];
		MapClasses.getVariableDatatype().remove(variable+"@"+undoListFunction.get(undoListFunction.size()-1));
		CommonAction.showStatus();
		CommonAction.showHierarchy();
		String actual = part1+consider+part2;
		CommonAction.comboOperations("", actual, "Variable undo successful");
	
	}
	private static void removeArrayDeclare()
	{
		String fullCode = CommonReference.getFullVersionCode();
		String remove = undoListDetail.get(undoListDetail.size()-1);
		int functionStartIndex  = fullCode.indexOf(undoListFunction.get(undoListFunction.size()-1)+"(){");
		int functionendIndex = CommonAction.funcEnd(fullCode,undoListFunction.get(undoListFunction.size()-1));
		String part1 = fullCode.substring(0,functionStartIndex);
		String part2 = "";
		if(fullCode.length()!=functionendIndex+1)
			part2 = fullCode.substring(functionendIndex+1,fullCode.length() );
		String consider = fullCode.substring(functionStartIndex,functionendIndex+1);
		consider = consider.replace(remove,"");
		String split[] = remove.split(" ");
		String variable = "";
		variable = split[split.length-2];
		variable = variable.substring(0,variable.indexOf("["));
		MapClasses.getArray().remove(variable+"@"+undoListFunction.get(undoListFunction.size()-1));
		MapClasses.getArrayDatatype().remove(variable+"@"+undoListFunction.get(undoListFunction.size()-1));
		CommonAction.showStatus();
		CommonAction.showHierarchy();
		String actual = part1+consider+part2;
		CommonAction.comboOperations("", actual, "Variable undo successful");
	}
	private static void removeFunctionDeclare()
	{
		String fullCode = CommonReference.getFullVersionCode();
		String functionName  = undoListFunction.get(undoListFunction.size()-1);
		String remove = undoListDetail.get(undoListDetail.size()-1);
		int functionStartIndex  = fullCode.indexOf(undoListFunction.get(undoListFunction.size()-1)+"(){");
		int functionendIndex = CommonAction.funcEnd(fullCode,undoListFunction.get(undoListFunction.size()-1));
		String part1 = fullCode.substring(0,functionStartIndex);
		String part2 = "";
		if(fullCode.length()!=functionendIndex+1)
			part2 = fullCode.substring(functionendIndex+1,fullCode.length() );
		String remove1 = remove.substring(0,remove.indexOf(";")+1);
		part1 = part1.replace(remove1, "");
		String datatype = remove.substring(0,remove.indexOf(" "));
		int datatypeIndex = part1.lastIndexOf(datatype);
		part1 = part1.substring(0,datatypeIndex);
		String actual = part1+part2;
		Status.setFunction("main");
		MapClasses.getFunction().remove(functionName);
		CommonAction.showStatus();
		CommonAction.showHierarchy();
		CommonAction.comboOperations("", actual, "Function remove successful");
		
	}
	private static void removeNormal()
	{
		String fullCode = CommonReference.getFullVersionCode();
		int functionStartIndex  = fullCode.indexOf(undoListFunction.get(undoListFunction.size()-1)+"(){");
		int functionendIndex = CommonAction.funcEnd(fullCode,undoListFunction.get(undoListFunction.size()-1));
		String part1 = fullCode.substring(0,functionStartIndex);
		String part2 = "";
		if(fullCode.length()!=functionendIndex+1)
			part2 = fullCode.substring(functionendIndex+1,fullCode.length() );
		String temp = undoListDetail.get(undoListDetail.size()-1);
		int index = fullCode.lastIndexOf(temp);
		String c1 = fullCode.substring(functionStartIndex,index);
		String c2 = fullCode.substring(index,functionendIndex+1);
		c2 = c2.replace(temp,"");
		String actual = part1+c1+c2+part2;
		CommonAction.comboOperations("", actual, "Undo successful, changes applied");
	
	}
	private static void removeEnd()
	{
		String fullCode = CommonReference.getFullVersionCode();
		int functionStartIndex  = fullCode.indexOf(undoListFunction.get(undoListFunction.size()-1)+"(){");
		int functionendIndex = CommonAction.funcEnd(fullCode,undoListFunction.get(undoListFunction.size()-1));
		String part1 = fullCode.substring(0,functionStartIndex);
		String part2 = "";
		if(fullCode.length()!=functionendIndex+1)
			part2 = fullCode.substring(functionendIndex+1,fullCode.length() );
		String consider = fullCode.substring(functionStartIndex,functionendIndex+1);
		String c1 = consider.substring(0,consider.lastIndexOf("}"));
		String actual = part1+c1+part2;
		CommonAction.comboOperations("", actual,"Undo successful");
	
	}
	private static void removeWhileEnd()
	{
		String fullCode = CommonReference.getFullVersionCode();
		int functionStartIndex  = fullCode.indexOf(undoListFunction.get(undoListFunction.size()-1)+"(){");
		int functionendIndex = CommonAction.funcEnd(fullCode,undoListFunction.get(undoListFunction.size()-1));
		String part1 = fullCode.substring(0,functionStartIndex);
		String part2 = "";
		if(fullCode.length()!=functionendIndex+1)
			part2 = fullCode.substring(functionendIndex+1,fullCode.length() );
		String consider = fullCode.substring(functionStartIndex,functionendIndex+1);
		String c1  = consider.substring(0,consider.lastIndexOf("}"));
		String c2 = "}";
		c1 = c1.substring(0,c1.lastIndexOf("}"));
		String actual = part1+c1+c2+part2;
		CommonAction.comboOperations("", actual, "Undo successful");
		
	}
	private static void removeArrayInitialise()
	{
		String fullCode = CommonReference.getFullVersionCode();
		int functionStartIndex  = fullCode.indexOf(undoListFunction.get(undoListFunction.size()-1)+"(){");
		int functionendIndex = CommonAction.funcEnd(fullCode,undoListFunction.get(undoListFunction.size()-1));
		String part1 = fullCode.substring(0,functionStartIndex);
		String part2 = "";
		if(fullCode.length()!=functionendIndex+1)
			part2 = fullCode.substring(functionendIndex+1,fullCode.length() );
	
		String consider = fullCode.substring(functionStartIndex,functionendIndex+1);
		
		String remove = undoListDetail.get(undoListDetail.size()-1);
	
		
		String removable[] = remove.split(";");
		for(int i=0;i<removable.length;i++)
		{
			removable[i] = removable[i].trim();
			int lastIndex = consider.lastIndexOf(removable[i]);
			String p1 = consider.substring(0,lastIndex);
			String p2 = consider.substring(lastIndex+removable[i].length()+2);
			consider = p1+p2;
		}
		
		
		// yha tk changs krne hai mujhe
		
		String actual = part1+consider+part2;
		CommonAction.comboOperations("",actual,"Undo successful");
		CommonAction.showStatus();
		CommonAction.showHierarchy();
	}
}


