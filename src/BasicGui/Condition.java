package BasicGui;
//import help.MapClass;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

public class Condition implements ActionListener {
	
	
	JPanel panel3 = CommonReference.getPanel3();
	
	// Common for both part
	JLabel jLabelAll;
	
	JLabel jLabelRadioIf;
	JLabel jLabelRadioElse;
	JLabel jLabelRadioElseIf;
	
	JRadioButton jRadioIf;
	JRadioButton jRadioElse;
	JRadioButton jRadioElseIf;
	
	JComboBox<String> jComboSelectVariables;
	JComboBox<String> jComboSelectOperations;
	JLabel jLabelSelectVariables;
	JLabel jLabelSelectOperations;
	
	JLabel jLabelConstant;
	JTextField jTextFieldConstant;
	
	JLabel jLabelSyntax;
	JTextArea jTextAreaSyntax;
	
	JButton jButtonShowSyntax;
	
	JButton jButtonClear;
	
	boolean varIsNull;
	boolean opIsNull;
	//
	ButtonGroup jButtonGroup;
	
	//
	//if part	
	JButton jButtonSaveIf;
	
	//
	//if-else part
	JButton jButtonSaveElse;
	
	//
	//Else if part
	
	JButton jButtonSaveElseIf;
	
	Condition()
	{
		panel3.setLayout(null);
		CommonAction.disableAllPanel2Button();
		initialisationAllComponent(); 
		changeUI();
		check();
	}
	
	void check() {
		  String s=CommonReference.getFullVersionCode();
		 
		String funcName=Status.getFunction();
	    int index=CommonAction.funcEnd(s, funcName);
	    if(s.contains(funcName)) {
			String begin=funcName+"(){";
			int start=s.indexOf(begin);
			s=s.substring(start,index+1);
	    }
	    String st=s;
		s=s.replaceAll(" ", "");
		
		int n=s.length();
		int noOfCloseBrackets=0;
		int noOfOpenBrackets=0;
		if(s.charAt(n-3)=='}') {
			
			int i=0;
			for( i=n-3;i>0;i--) {
				if(s.charAt(i)=='}') {
					noOfCloseBrackets++;
				}
				if(s.charAt(i)=='{') {
					noOfOpenBrackets++;
				}
				if(noOfCloseBrackets==noOfOpenBrackets) {
					break;
				}
			
			}
			st=s.substring(0,i+1);
			int newLine=st.lastIndexOf("\n");
			st=st.substring(newLine);
			if(st.contains("if")) {
				jRadioElse.setEnabled(true);
				jRadioElseIf.setEnabled(true);
			}
			else {
				jRadioElse.setEnabled(false);
				jRadioElseIf.setEnabled(false);
			}
		}			
	}
	
	
	public void initialisationAllComponent()
	{
		jComboSelectVariables=new JComboBox<String>(CommonAction.getVariableNameCurrentFunction());
		jComboSelectVariables.insertItemAt("", 0);
		jComboSelectVariables.setSelectedIndex(0);
		jComboSelectOperations=new JComboBox<String>(CommonAction.getAllOperations());
		jComboSelectOperations.insertItemAt("", 0);
		jComboSelectOperations.setSelectedIndex(0);
		jLabelSelectVariables=new JLabel("Select Variable");
		jLabelSelectOperations=new JLabel("Select Operation");
		
		jLabelConstant = new JLabel("To Enter Constant Value");
		jTextFieldConstant  = new JTextField();
		
		jLabelSyntax=new JLabel("Syntax");
		jTextAreaSyntax=new JTextArea();
		jTextAreaSyntax.setLineWrap(true);
		jTextAreaSyntax.setWrapStyleWord(true);
		jTextAreaSyntax.setEditable(false);
		jButtonShowSyntax=new JButton("Show Syntax");
		jButtonShowSyntax.setEnabled(false);
		
		jButtonClear=new JButton("Clear");
		
		jButtonSaveIf = new JButton("Save If");
		
		jButtonSaveElse = new JButton("Save else");
				
		jButtonSaveElseIf = new JButton("Save else");
		
		jComboSelectVariables.addActionListener(this);
		jComboSelectOperations.addActionListener(this);
		
		jTextFieldConstant.getDocument().addDocumentListener(dl);
		jTextAreaSyntax.getDocument().addDocumentListener(dl);
	}
	
	DocumentListener dl=new DocumentListener() {

		@Override
		public void changedUpdate(DocumentEvent arg0) {
			setDisable();
		
			
		}

		@Override
		public void insertUpdate(DocumentEvent arg0) {
			setDisable();
	
			
		}

		@Override
		public void removeUpdate(DocumentEvent arg0) {
			setDisable();
		
			
		}
		
	};
	
	void setDisable() {
		if(jTextFieldConstant.getText().equals("")  && varIsNull && opIsNull) {
			jButtonShowSyntax.setEnabled(false);	
		}
		else {
			jButtonShowSyntax.setEnabled(true);
		}
		if(jTextAreaSyntax.getText().equals("")) {
			jButtonSaveIf.setEnabled(false);
			jButtonSaveElse.setEnabled(false);
			jButtonSaveElseIf.setEnabled(false);
		}
		else {
			jButtonSaveIf.setEnabled(true);
			jButtonSaveElse.setEnabled(true);
			jButtonSaveElseIf.setEnabled(true);
		}

	}
	
	 boolean checkValue() {
		if(jTextFieldConstant.getText().equals("")) {
			return true;
		}
		else {
			String check=jTextFieldConstant.getText();
			 if(BasicOperations.valueCheck("int",check) || BasicOperations.valueCheck("float",check)) {
				 return true;				
			}
			else {
				return false;
			}
			}
		}
	
	
	
	public void changeUI()
	{
		jLabelAll = new JLabel("Please select from these");
		jLabelRadioIf = new JLabel("if");
		jLabelRadioElse = new JLabel("else");
		jLabelRadioElseIf = new JLabel("else if");
		jRadioIf = new JRadioButton("if");
		jRadioElse = new JRadioButton("else");
		jRadioElseIf = new JRadioButton("else if");
		
		jRadioIf.setBackground(new Color(80,80,80));
		jRadioElse.setBackground(new Color(80,80,80));
		jRadioElseIf.setBackground(new Color(80,80,80));
		
		jButtonGroup = new ButtonGroup();
		jButtonGroup.add(jRadioIf);
		jButtonGroup.add(jRadioElse);
		jButtonGroup.add(jRadioElseIf);
		
		jLabelAll.setBounds(20,20,200,20);
	
		jRadioIf.setBounds(20,60,20,20);
		jLabelRadioIf.setBounds(50, 60, 80, 20);
		
		jRadioElse.setBounds(20,140,20,20);
		jLabelRadioElse.setBounds(50, 140, 80, 20);
		
		jRadioElseIf.setBounds(20,100,20,20);
		jLabelRadioElseIf.setBounds(50,100,80,20);
		
		panel3.add(jLabelAll);
		panel3.add(jRadioIf);
		panel3.add(jRadioElse);
		panel3.add(jRadioElseIf);
		panel3.add(jLabelRadioIf);
		panel3.add(jLabelRadioElse);
		panel3.add(jLabelRadioElseIf);
		
		panel3.repaint();
		
		jRadioIf.setSelected(true);
		jRadioElse.setEnabled(false);
		jRadioElseIf.setEnabled(false);
		
		
		jRadioIf.addActionListener(this);
		jRadioElse.addActionListener(this);
		jRadioElseIf.addActionListener(this);
		
		jButtonSaveIf.addActionListener(this);
		jButtonSaveElse.addActionListener(this);
		jButtonSaveElseIf.addActionListener(this);
		
		jButtonShowSyntax.addActionListener(this);
		jButtonClear.addActionListener(this);
		radioClicked();
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==jComboSelectVariables)
		{
			setBoolean();
		}
		if(e.getSource()==jComboSelectOperations)
		{
			setBoolean();
		}
		if(e.getSource()==jRadioIf)
		{
			ifClick();
		}
		if(e.getSource()==jButtonSaveIf)
		{
			saveIf();
		}
		
		if(e.getSource()==jRadioElse)
		{
			ElseClick();
		}
		if(e.getSource()==jButtonSaveElse)
		{
			saveElse();
		}
		
		if(e.getSource()==jRadioElseIf)
		{
			elseIfClick();
		}
		if(e.getSource()==jButtonSaveElseIf)
		{
			saveElseIf();
		}
		if(e.getSource()==jButtonShowSyntax)
		{
			showSyntax();
		}
		if(e.getSource()==jButtonClear)
		{
			Clear();
		}
	}
	
	void setBoolean() {
		Object selectedVar = jComboSelectVariables.getSelectedItem();
		 Object selectedOp = jComboSelectOperations.getSelectedItem();
		 if(selectedVar.toString().equals("") && selectedOp.toString().equals("")) {
			 varIsNull=true;
			 opIsNull=true;
			 if(jTextFieldConstant.getText().equals("")) {
				 jButtonShowSyntax.setEnabled(false);
			 }
		 }
		 else {
			 jButtonShowSyntax.setEnabled(true);
		 }
		
	}
	
	public void radioClicked() {

		jComboSelectOperations.setBounds(420,100,150,30);
		jLabelSelectOperations.setBounds(420,60,100,30);
		jComboSelectVariables.setBounds(250,100,150,30);
		jLabelSelectVariables.setBounds(250,60,100,30);
		jLabelConstant.setBounds(590,60,190,30);
		jTextFieldConstant.setBounds(590,100,150,30);
		jButtonShowSyntax.setBounds(770,100,130,30);
		jLabelSyntax.setBounds(970,10,100,30);
		jTextAreaSyntax.setBounds(970,50,150,100);
		jButtonSaveIf.setBounds(1150,70,130,30);
		jButtonClear.setBounds(1150,110,130,30);
		
		if(jTextAreaSyntax.getText().equals("")) {
			jButtonSaveIf.setEnabled(false);	
			}
		
		panel3.add(jComboSelectOperations);
		panel3.add(jComboSelectVariables);
		panel3.add(jLabelSelectVariables);
		panel3.add(jLabelSelectOperations);
		panel3.add(jLabelConstant);
		panel3.add(jTextFieldConstant);
		panel3.add(jButtonShowSyntax);
		panel3.add(jLabelSyntax);
		panel3.add(jTextAreaSyntax);
		panel3.add(jButtonSaveIf);
		panel3.add(jButtonClear);
		
		panel3.repaint();
			
		
	}
	
	public void ifClick()
	{
		
		panel3.remove(jButtonSaveElse);
		panel3.remove(jButtonSaveElseIf);
		
		panel3.add(jButtonSaveIf);		
		panel3.repaint();
		
	if(jTextAreaSyntax.getText().equals("")) {
		jButtonSaveIf.setEnabled(false);	
		}
			
	}
	public void saveIf()
	{
		Boolean b=ConditionChecking();
		if(b) {
		String condition = jTextAreaSyntax.getText().toString();
		
		String function = Status.getFunction();
		String fullCode = CommonReference.getFullVersionCode();
		int index = CommonAction.funcEnd(fullCode,function);
		
		if(condition.equals(""))
		{
			CommonAction.showRedWarning("Please input your condition");
		}
		else
		{
			String temp = "if ( "+condition+" ) {"; // iske karn problem aayegi aage index calculate krne me shiza please solve that
			String part1 = fullCode.substring(0,index);
			String part2 = fullCode.substring(index,fullCode.length());
			String actual = part1+temp+part2;
			// do formatting for temp and actual
			CommonAction.comboOperations(temp,actual,"Condition applied successfully");
			UndoWorking.addItem(temp,"normal");
			removePanel3AllComponent();
			CommonAction.enableAllPanel2Button();
		}
		}
		else {
			CommonAction.showRedWarning("Not a valid condition");
			jTextAreaSyntax.setText("");
		}
	}
	
	public void ElseClick()
	{
		
		panel3.remove(jButtonSaveIf);
		panel3.remove(jButtonSaveElseIf);
		panel3.remove(jComboSelectOperations);
		panel3.remove(jComboSelectVariables);
		panel3.remove(jLabelConstant);
		panel3.remove(jTextFieldConstant);
		panel3.remove(jLabelSelectVariables);
		panel3.remove(jLabelSelectOperations);
		panel3.remove(jLabelSyntax);
		panel3.remove(jTextAreaSyntax);
		panel3.remove(jButtonShowSyntax);
		panel3.remove(jButtonClear);
		
		jButtonSaveElse.setBounds(500,70,200,30);
		
		panel3.add(jButtonSaveElse);
		
		panel3.repaint();
	}
	
	public void saveElse()
	{
		removePanel3AllComponent();
		CommonAction.enableAllPanel2Button();
		
		// Logic part start here
		
		String function = Status.getFunction();
		String fullCode = CommonReference.getFullVersionCode();
		int index = CommonAction.funcEnd(fullCode,function);
		
		String temp = "else {"; // iske karn problem aayegi aage index calculate krne me shiza please solve that
		String part1 = fullCode.substring(0,index);
		String part2 = fullCode.substring(index,fullCode.length());
		String actual = part1+temp+part2;
		
		// do formatting for temp and actual
		CommonAction.comboOperations(temp,actual,"Condition applied successfully");
		UndoWorking.addItem(temp,"normal");
		// ok boss
		
		// logic part end here
		
	}
	
	public void elseIfClick()
	{
	     radioClicked();
		panel3.remove(jButtonSaveIf);	
		panel3.remove(jButtonSaveElse);
		
		jButtonSaveElseIf.setBounds(1150,70,130,30);
		
		panel3.add(jButtonSaveElseIf);
		
		panel3.repaint();
		
		if(jTextAreaSyntax.getText().equals("")) {
			jButtonSaveElseIf.setEnabled(false);	
			}
		
	}
	

	
	public void saveElseIf()
	{
	
		CommonAction.enableAllPanel2Button();
		Boolean b=ConditionChecking();
		if(b) {
		
		// Logic part is here
		String condition = jTextAreaSyntax.getText().toString();
		
		String function = Status.getFunction();
		String fullCode = CommonReference.getFullVersionCode();
		int index = CommonAction.funcEnd(fullCode,function);
		
		if(condition.equals(""))
		{
			CommonAction.showRedWarning("Please input your condition");
		}
		else
		{
			String temp = "else if ( "+condition+" ) {"; // iske karn problem aayegi aage index calculate krne me shiza please solve that
			String part1 = fullCode.substring(0,index);
			String part2 = fullCode.substring(index,fullCode.length());
			String actual = part1+temp+part2;
			// do formatting for temp and actual
			CommonAction.comboOperations(temp, actual, "Condition applied");
			UndoWorking.addItem(temp,"normal");
			// ok boss
		}
		// End of logic part
		}
		else {
			CommonAction.showRedWarning("Not a valid condition");
			jTextAreaSyntax.setText("");
		}
	}
	
	public void showSyntax() {
		
		boolean b= checkValue();
		if(b) {
		 String var= jComboSelectVariables.getSelectedItem().toString();
		 String op=jComboSelectOperations.getSelectedItem().toString();
		 String constant=jTextFieldConstant.getText();
	 
		 String[] operators=CommonAction.getAllOperators();
		 String[] operations=CommonAction.getAllOperations();
		 int index=0;
		 for(int i=0;i<operations.length;i++) {
			 if(operations[i].equals(op))
				 index=i;
		 }
		 
		 String showOp=operators[index];
		 if(op.equals("")) {
			 showOp="";
		 }
		 if(var.equals("")) {
			 jTextAreaSyntax.append(constant+showOp);	 
		 }
		 else {
			 jTextAreaSyntax.append(var+showOp+constant);
		 }
		 jButtonSaveIf.setEnabled(true);
		 jButtonSaveElseIf.setEnabled(true);
		 jComboSelectVariables.setSelectedIndex(0);
		 jComboSelectOperations.setSelectedIndex(0);
		 jTextFieldConstant.setText("");
		}
		else {
			jButtonShowSyntax.setEnabled(false);
			CommonAction.showRedWarning("Please select proper value for constant");
			jTextFieldConstant.setText("");
		}
	}
	
	public void Clear() {
		jComboSelectVariables.setSelectedIndex(0);
		jComboSelectOperations.setSelectedIndex(0);
		jTextFieldConstant.setText("");
		jTextAreaSyntax.setText("");
		
		
	}
	
	
	public boolean ConditionChecking() {
		boolean b=true;
		String condition = jTextAreaSyntax.getText().toString();
		String[] allOp=CommonAction.getAllOperators();
		for(int i=0;i<allOp.length;i++) {
			int opIndex;
			String beforeOp;
			String afterOp;
			if(allOp[i].equals("++") || allOp[i].equals("--")) {
				
				if(condition.contains(allOp[i])) {
					
					 opIndex=condition.indexOf(allOp[i]);
					 beforeOp=condition.substring(0,opIndex);
					 
					 afterOp=condition.substring(opIndex+allOp[i].length());
					 
					 if(afterOp.equals("") || beforeOp.equals("")) {
						 for(int j=0;j<allOp.length;j++) {
								
								if(beforeOp.contains(allOp[j]) || afterOp.contains(allOp[j])) {			
									b=false;
								 
					     		}
								else {
									b=true;
								
								}
						      }	 
						 if(afterOp.equals("") && beforeOp.equals("")) {
							 
							 b=false;
						 }
						 else {
							 b=true;
						     
						 }
						 
						}
						else {
							
							b=false;
						}
					
					 
				}
			}
			else{
			if(condition.contains(allOp[i] )&& !condition.contains("++") && !condition.contains("--"))  {
				
				
				opIndex=condition.indexOf(allOp[i]);
				beforeOp=condition.substring(0,opIndex);
				 afterOp=condition.substring(opIndex+allOp[i].length());
				for(int j=0;j<allOp.length;j++) {
								
				if(beforeOp.equals("") || afterOp.equals("")) {			
					b=false;
				}
	     		}
		      }
				
			}
			
	/*		int len=allOp[i].length();
			if(condition.length()>=len && !allOp[i].equals("++") && !allOp[i].equals("--")) {
			String sub=condition.substring(condition.length()-len);	
			if(sub.equals(allOp[i])) {			
				b=false;
				break;
			}
			}
			*/
		}
	/*	if(condition.contains("++") || condition.contains("--")) {
			String sub=condition.substring(condition.length()-2);
			if(!sub.equals(condition)) {
			if(sub.equals("++") || sub.equals("--")) {
				b=true;
			}
			}
		}
		*/
		boolean containsOp=false;
		for(int i=0;i<allOp.length;i++) {
			if(condition.contains(allOp[i])) {
				containsOp=true;
				break;
			}
		}
		boolean containsVar=false;
		String[] allVar=CommonAction.getVariableNameCurrentFunction();
		for(int i=0;i<allVar.length;i++) {
			if(condition.contains(allVar[i])) {
				containsVar=true;
				break;
			}
		}
		if(containsVar && !containsOp) {
			
			for(int i=0;i<allVar.length;i++) {
			if(condition.equals(allVar[i])) {
				b=true;
				break;
			}
			else {
				b=false;
			}
			}
		}
		
		return b;
	}
	
	public void removePanel3AllComponent()
	{
		//common
		panel3.remove(jLabelAll);
		panel3.remove(jLabelRadioIf);
		panel3.remove(jLabelRadioElse);
		panel3.remove(jLabelRadioElseIf);
		panel3.remove(jRadioIf);
		panel3.remove(jRadioElse);
		panel3.remove(jRadioElseIf);
		panel3.remove(jButtonClear);
		panel3.remove(jComboSelectOperations);
		panel3.remove(jComboSelectVariables);
		panel3.remove(jLabelSelectOperations);
		panel3.remove(jLabelSelectVariables);
		panel3.remove(jButtonShowSyntax);
		panel3.remove(jTextAreaSyntax);
		panel3.remove(jLabelSyntax);
		//if
		panel3.remove(jLabelConstant);
		panel3.remove(jTextFieldConstant);
		panel3.remove(jButtonSaveIf);
		//if-else
	
		panel3.remove(jButtonSaveElse);
		
		// else if
		
		panel3.remove(jButtonSaveElseIf);
		
		panel3.repaint();
	}

}	