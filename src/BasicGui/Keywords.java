package BasicGui;


import java.awt.Color;
import java.awt.event.*;

import javax.swing.*;

public class Keywords implements ActionListener {
	
	private JPanel panel3 = CommonReference.getPanel3();
	
	private JLabel jLabelSelect;
	private JLabel jLabelBreak;
	private JLabel jLabelReturn;
	private JLabel jLabelContinue;
	
	private JRadioButton jRadioBreak;
	private JRadioButton jRadioReturn;
	private JRadioButton jRadioContinue;
	private ButtonGroup jButtonGroup;
	
	private JButton jButtonBreak;
	private JButton jButtonReturn;
	private JButton jButtonContinue;
	
	private JLabel jLabelVariableList;
	private JComboBox<String> jComboVariableList;
	private JLabel jLabelValue;
	private JTextField jFieldValue;
	
	private JRadioButton jRadioButtonSelectionVariable;
	private JRadioButton jRadioButtonSelectionField;
	private JLabel jLabelSelectionVariable;
	private JLabel jLabelSelectionField;
	
	private ButtonGroup jButtonSelection;
	
	private String fullCode;
	private String function;
	private int functionLastIndex;
	private String[] variableList;
	private String datatype ;
	
	void initialiseVariables()
	{
		fullCode = CommonReference.getFullVersionCode();
		function = Status.getFunction();
		functionLastIndex = CommonAction.funcEnd(fullCode, function);
		variableList = CommonAction.getVariableNameCurrentFunction();
		
		String [] functionList = CommonAction.getFunctionNameFullCode();
		String[] functionDatatype = CommonAction.getFunctionReturnTypeFullCode();
		
		for(int i=0;i<functionList.length;i++)
		{
			if(functionList[i].equals(function))
			{
				datatype = functionDatatype[i];
				break;
			}
		}
		
	}
	
	Keywords(){
		
		panel3.setLayout(null);
		CommonAction.disableAllPanel2Button();
		initialiseVariables();
		initialisationAllComponent(); 
		changeUI();		
		returnStatement();
		if(datatype.equals("void"))
		{
			jRadioButtonSelectionField.setEnabled(false);
			jRadioButtonSelectionVariable.setEnabled(false);
		}
		else if(variableList.length==0)
		{
			jRadioButtonSelectionField.setSelected(true);
			jRadioButtonSelectionVariable.setEnabled(false);
			selectionFieldClicked();
		}
		else
		{
			jRadioButtonSelectionField.setSelected(true);
			selectionFieldClicked();
		}
		if(!insideLoop())
		{
			jRadioContinue.setEnabled(false);
			jRadioBreak.setEnabled(false);
		}
		
	}
	
	boolean insideLoop()
	{
		int startingIndex = fullCode.indexOf(function+"(){");
		String s1 = fullCode.substring(startingIndex,functionLastIndex+1);
		s1 = s1.substring(s1.indexOf("{")+1,s1.lastIndexOf("}"));
	
		int forindex = s1.lastIndexOf("for");
		int whileindex = s1.lastIndexOf("while");
		int dowhileindex = s1.lastIndexOf("do");
		
		int workingindex = -1;
		
		if(forindex==-1&&whileindex==-1&&dowhileindex==-1)
			return false;
		if((forindex>=whileindex)&&(forindex>=dowhileindex))
			workingindex = forindex;
		else if((whileindex>=forindex)&&(whileindex>=dowhileindex))
			workingindex = whileindex;
		else
			workingindex = dowhileindex;
		
		int openingbraces = 0;
		boolean oneget  = false;
		for(int i=workingindex;i<s1.length();i++)
		{
			if(oneget&&openingbraces==0)
				return false;
			if(s1.charAt(i)=='{')
			{
				openingbraces++;
				oneget = true;
			}
			if(s1.charAt(i)=='}')
				openingbraces--;
		}
		if(oneget&&openingbraces!=0)
			return true;
		return false;
	}
	
	void initialisationAllComponent(){
		
		jLabelSelect =new JLabel("Select Keyword");
		
		jLabelBreak =new JLabel("Break");
		jLabelReturn = new JLabel("Return");
		jLabelContinue = new JLabel("Continue");
		
		jRadioBreak = new JRadioButton("break");
		jRadioReturn = new JRadioButton("return");
		jRadioContinue = new JRadioButton("continue");
		
		jRadioBreak.setBackground(new Color(80,80,80));
		jRadioReturn.setBackground(new Color(80,80,80));
		jRadioContinue.setBackground(new Color(80,80,80));
		
		
		jButtonGroup = new ButtonGroup();
		jButtonSelection = new ButtonGroup();
		
		jButtonBreak = new JButton("Break");
		jButtonContinue = new JButton("Continue");
		jButtonReturn  = new JButton("Return");
		
		jLabelVariableList = new JLabel("Select Variable");
		jComboVariableList = new JComboBox <String>(variableList);
		
		jLabelValue = new JLabel("Insert Value");
		jFieldValue = new JTextField();
		
		jRadioButtonSelectionField = new JRadioButton();
		jRadioButtonSelectionVariable = new JRadioButton();
		jLabelSelectionField = new JLabel("Constant");
		jLabelSelectionVariable = new JLabel("Variable");
		
		jRadioButtonSelectionField.setBackground(new Color(80,80,80));
		jRadioButtonSelectionVariable.setBackground(new Color(80,80,80));
		
		jButtonGroup.add(jRadioBreak);
		jButtonGroup.add(jRadioContinue);
		jButtonGroup.add(jRadioReturn);
		
		jButtonSelection.add(jRadioButtonSelectionField);
		jButtonSelection.add(jRadioButtonSelectionVariable);
		
		jRadioReturn.setSelected(true);
	
		
		jLabelSelect.setBounds(20,20,100,30);
		
		jLabelBreak.setBounds(50, 100, 80, 20);
		jLabelReturn.setBounds(50, 60, 80, 20);
		jLabelContinue.setBounds(50,140,80,20);
		
		jRadioBreak.setBounds(20,100,20,20);
		jRadioReturn.setBounds(20,60,20,20);
		jRadioContinue.setBounds(20,140,20,20);
		
		jButtonBreak.setBounds(650,110,150,30);
		jButtonReturn.setBounds(650,110,150,30);
		jButtonContinue.setBounds(650, 110, 150, 30);
		
		jLabelVariableList.setBounds(200,110,100,30);
		jComboVariableList.setBounds(200,150,100,30);	
		
		jLabelValue.setBounds(200,110,100,30);
		jFieldValue.setBounds(200, 150, 100, 30);
		
		jRadioButtonSelectionField.setBounds(170,60,20,30);
		jLabelSelectionField.setBounds(200,60,80,30);
		
		jRadioButtonSelectionVariable.setBounds(320, 60, 20, 30);
		jLabelSelectionVariable.setBounds(350, 60,	80, 30);
		

		jRadioBreak.addActionListener(this);
		jRadioReturn.addActionListener(this);
		jRadioContinue.addActionListener(this);
		
		jButtonBreak.addActionListener(this);
		jButtonContinue.addActionListener(this);
		jButtonReturn.addActionListener(this);
		
		jRadioButtonSelectionField.addActionListener(this);
		jRadioButtonSelectionVariable.addActionListener(this);
	}
	
	void changeUI(){
		
		panel3.add(jLabelSelect);
		panel3.add(jLabelBreak);
		panel3.add(jLabelReturn);
		panel3.add(jLabelContinue);
		panel3.add(jRadioBreak);
		panel3.add(jRadioReturn);
		panel3.add(jRadioContinue);
		
		panel3.validate();
		panel3.repaint();
		
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==jRadioBreak){
			breakStatement();
		}
		if(e.getSource()==jRadioReturn){
			returnStatement();
		}
		if(e.getSource()==jRadioContinue){
			continueStatement();	
		}
		if(e.getSource()==jRadioButtonSelectionField)
		{
			selectionFieldClicked();
		}
		if(e.getSource()==jRadioButtonSelectionVariable)
		{
			selectionVaribleClicked();
		}
		if(e.getSource()==jButtonBreak)
		{
			breakButtonClicked();
		}
		if(e.getSource()==jButtonContinue)
		{
			continueButtonClicked();
		}
		if(e.getSource()==jButtonReturn)
		{
			returnButtonClicked();
		}
		
	}
	
	void removeRadioReturn()
	{
		panel3.remove(jButtonReturn);
		
		panel3.remove(jLabelVariableList);
		panel3.remove(jComboVariableList);
		panel3.remove(jFieldValue);
		panel3.remove(jLabelValue);
		
		panel3.remove(jRadioButtonSelectionVariable);
		panel3.remove(jRadioButtonSelectionField);
		panel3.remove(jLabelSelectionVariable);
		panel3.remove(jLabelSelectionField);
		
		panel3.validate();
		panel3.repaint();
	}
	
	void breakStatement(){
		
		removeRadioReturn();
		panel3.remove(jButtonContinue);
		
		panel3.add(jButtonBreak);
		
		panel3.revalidate();
		panel3.repaint();
		
		
	}
	void continueStatement(){
		
		removeRadioReturn();
		panel3.remove(jButtonBreak);
		
		panel3.add(jButtonContinue);
		
		panel3.validate();
		panel3.repaint();
		
	}
	
	void returnStatement(){
		
		panel3.remove(jButtonBreak);
		panel3.remove(jButtonContinue);
		
		panel3.add(jButtonReturn);
		panel3.add(jRadioButtonSelectionVariable);
		panel3.add(jRadioButtonSelectionField);
		panel3.add(jLabelSelectionVariable);
		panel3.add(jLabelSelectionField);
		
		panel3.validate();
		panel3.repaint();
	}
	
	void selectionFieldClicked()
	{
		panel3.add(jLabelValue);
		panel3.add(jFieldValue);
		
		panel3.remove(jLabelVariableList);
		panel3.remove(jComboVariableList);
		panel3.revalidate();
		panel3.repaint();
	}
	void selectionVaribleClicked()
	{
		panel3.remove(jLabelValue);
		panel3.remove(jFieldValue);
		
		panel3.add(jLabelVariableList);
		panel3.add(jComboVariableList);
		
		panel3.revalidate();
		panel3.repaint();
	}
	
	
	void breakButtonClicked()
	{
		String temp = "break ;";
		String part1 = fullCode.substring(0,functionLastIndex);
		String part2 = fullCode.substring(functionLastIndex,fullCode.length());
		String actual = part1+temp+part2;
		CommonAction.comboOperations(temp, actual, "Loop break applied successfully");
		panel3.removeAll();
		panel3.revalidate();
		panel3.repaint();
		CommonAction.enableAllPanel2Button();	
		UndoWorking.addItem(temp,"normal");
	}
	void continueButtonClicked()
	{
		String temp = "continue ;";
		String part1 = fullCode.substring(0,functionLastIndex);
		String part2 = fullCode.substring(functionLastIndex,fullCode.length());
		String actual = part1+temp+part2;
		CommonAction.comboOperations(temp, actual, "Loop Continue applied successfully");
		panel3.removeAll();
		panel3.revalidate();
		panel3.repaint();
		CommonAction.enableAllPanel2Button();	
		UndoWorking.addItem(temp,"normal");
	}
	void returnButtonClicked()
	{
		if(datatype.equals("void"))
		{
			String temp = "return ;";
			String part1 = fullCode.substring(0,functionLastIndex);
			String part2 = fullCode.substring(functionLastIndex,fullCode.length());
			String actual = part1+temp+part2;
			CommonAction.comboOperations(temp, actual, "Return applied successfully");
			panel3.removeAll();
			panel3.revalidate();
			panel3.repaint();
			CommonAction.enableAllPanel2Button();	
			UndoWorking.addItem(temp,"normal");
		}
		
		else if(jRadioButtonSelectionVariable.isSelected()==true)
		{
			String variable = jComboVariableList.getItemAt(jComboVariableList.getSelectedIndex()).toString();
			String temp = "return "+variable+" ;";
			String part1 = fullCode.substring(0,functionLastIndex);
			String part2 = fullCode.substring(functionLastIndex,fullCode.length());
			String actual = part1+temp+part2;
			CommonAction.comboOperations(temp, actual, "Return with variable applied successfully");
			panel3.removeAll();
			panel3.revalidate();
			panel3.repaint();
			CommonAction.enableAllPanel2Button();	
			UndoWorking.addItem(temp,"normal");
			
		}
		else 
		{
			String value = jFieldValue.getText();
			boolean permitted = true;
			if(value.equals(""))
				CommonAction.showRedWarning("Provide value to insert");
			else
			{
				if(value.length()==1)
				{
					char c = value.charAt(0);
					if(c>=65&&c<=97)
					{
						permitted =false;
						CommonAction.showRedWarning("Capitals are not allowed at all");
					}
				}
				else if(value.length()>=2)
				{
					for(int i=0;i<value.length();i++)
					{
						char c = value.charAt(i);
						if(!(c>=48&&c<=57))
						{
							permitted = false;
							CommonAction.showRedWarning("Provided value is not allowed");
						}
					}
				}
				if(permitted)
				{
					value = BasicOperations.valueModify(datatype, value);
					String temp = "return "+value+" ;";
					String part1 = fullCode.substring(0,functionLastIndex);
					String part2 = fullCode.substring(functionLastIndex,fullCode.length());
					String actual = part1+temp+part2;
					CommonAction.comboOperations(temp, actual, "Return with value applied successfully");
					panel3.removeAll();
					panel3.revalidate();
					panel3.repaint();
					CommonAction.enableAllPanel2Button();	
					UndoWorking.addItem(temp,"normal");
				}
			}
		}
	}

}