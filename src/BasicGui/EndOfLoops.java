package BasicGui;

public class EndOfLoops {
	EndOfLoops()
	{
		performAction();
	}
	boolean doLoop()
	{
		
		String fullCode = CommonReference.getFullVersionCode();
		int indexEndFunction = CommonAction.funcEnd(fullCode, Status.getFunction());
		String condition = Status.getDoWhileCondition();
		if(condition==null||condition.equals(""))
			return false;
		else
		{
	
			// string bna do wali
			// case 1 do exist then change condition accordingly
			int indexOfDo = fullCode.lastIndexOf("do {");
			int functionIndex = fullCode.indexOf(Status.getFunction()+"(){");
			String consider = fullCode.substring(indexOfDo,indexEndFunction);
			if(indexOfDo==-1)
			{
				return false;
			}
			// case do jha h aap ussi function me ho na
			if(!((indexOfDo>functionIndex)&&(indexEndFunction>indexOfDo)))
			{

				return false ; // Means aapke working function me do nhi h
			}
			// counting no of opening braces and closing braces
			int openingBraces = 0;
			int ClosingBraces = 0;
			for(int i = consider.lastIndexOf("do {")+4;i<consider.length();i++)
			{
				if(consider.charAt(i)=='}')
					ClosingBraces++;
				if(consider.charAt(i)=='{')// after part y krke dekh lenege 
				{
					openingBraces++;
				}
			}
			if(openingBraces==ClosingBraces)
				return true;
			else
				return false;
		}
		
		
	}
	
	boolean needed(String function,String fullCode,int index)  // Yha mujhe check krna h ki whether i need ending braces or not isse hm kafi error prevent kr skte h
	{
		
		String s  = fullCode.substring(fullCode.indexOf(function+"(){"), index+1);
		int opening = 0;
		int closing = 0;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)=='{')
				opening++;
			if(s.charAt(i)=='}')
				closing++;
		}
		if(opening<=closing)
			return false;
		else
		return true;
	}
	void performAction()
	{
		
		String function = Status.getFunction();
		String fullCode = CommonReference.getFullVersionCode();
		int index = CommonAction.funcEnd(fullCode,function);
		if(!needed(function,fullCode,index))
		{
			CommonAction.showRedWarning("No opening block to close exist");
		}
		else
		{
			String temp = "";
			if(doLoop())
			{
				temp = "} while ( "+(Status.getDoWhileCondition())+" ) ;";
				Status.setDoWhileCondition("");
				UndoWorking.addItem(temp, "whileEnd");
			}
			else
			{
				temp ="}";
				UndoWorking.addItem(temp,"end");
			}
			String part1 = fullCode.substring(0,index);
			String part2 = fullCode.substring(index,fullCode.length());
			String actual = part1+temp+part2;
			CommonAction.comboOperations(temp, actual, "Successfully ended");
		}
	}
}
