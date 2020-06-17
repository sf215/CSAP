package BasicGui;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.text.Style;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledDocument;

public class Loop implements ActionListener {
	
	/* intro- nice lol 
	 * for loop-  1 text field for init ,1 text field for condition,1 text field for increment/decrement,
	 * 1 text field to show the syntax after clicking "ok" button
	 * while/do-while-1 text box to input condition,2 radio button to select relationship between 2 conditions
	 * (and/or),1 text area to show syntax
	 * 
	 * Isme 2 problems hai-
	 * 1.Nested loop kese apply kare
	 * 2.condition k andar ki body me kaam kese karna hai
	 * "inside loop body" wale button se abhi koi kaam nahi ho rha hai
	 * */
	private JPanel panel3 = CommonReference.getPanel3();
	
	private JLabel jLabelVariable;
	private JLabel jLabelConstant;
	private JLabel jLabelOperation;
	
	private JTextPane jTextAreaShowVariables;
	private JScrollPane jTextAreaShowVariablesScrollBar; 
	private JLabel jLabelUsedVariables;
	
	private JLabel jLabelAreaSyntax;
	private JTextPane jTextAreaSyntax;
	private JScrollPane jTextAreaSyntaxScrollBar;
	
	private JLabel jLabelCondition;
	private JTextField jFieldCondition;
	
	private JComboBox<String> jComboSelectVariables;
	private JComboBox<String> jComboSelectOperations;
	private JTextField jTextFieldConstant;
	
	private JButton jButtonInit;
	private JButton jButtonCondition;
	private JButton jButtonIncDec;
	
	private JButton jButtonClear;
	
	private JRadioButton jRadioFor ;
	private JRadioButton jRadioWhile ;
	private JRadioButton jRadioDoWhile ;
	
	private JLabel jLabelall;
	private JLabel jLabelRadioFor;
	private JLabel jLabelRadioWhile;
	private JLabel jLabelRadioDoWhile;
	
	private boolean varIsNull;
	private boolean opIsNull;
	
	private ButtonGroup jButtonGroup;
	
	//for loop
	private JLabel jLabelInit;
	private JTextField jFieldInit;
	
	private JLabel jLabelIncDec;
	private JTextField jFieldIncDec;

	private JButton okFor;
	private JButton jButtonSubmitFor;
	//
	
	//while
	private JButton okWhile;
	private JButton jButtonSubmitWhile;
	
	//do while
	private JButton jButtonSubmitDoWhile;
	//
	
	public void showVariables() {
		String[] variable=CommonAction.getVariableNameCurrentFunction();
	
		
		StyledDocument doc = jTextAreaShowVariables.getStyledDocument();
		Style style = doc.addStyle("I am Style",null);
		
		try{
			StyleConstants.setForeground(style,Color.magenta);
			doc.insertString(doc.getLength(),"Local  Variables : \n", style);
			
		}
		catch(Exception e){
			
		}
	//	jTextAreaShowVariables.append("Declared Variables in this Function \n");
		
		try{
			StyleConstants.setForeground(style,Color.cyan);
			for(int i=0;i<variable.length;i++) {
				if(!variable[i].equals("")) {
					doc.insertString(doc.getLength(),variable[i], style);
					doc.insertString(doc.getLength(),"\n", style);
				}
			}
		}
		catch(Exception e){
			
		}
		/*for(int i=0;i<variable.length;i++) {
			if(!variable[i].equals("")) {
			jTextAreaShowVariables.append(variable[i]+" = "+value[i]);
			jTextAreaShowVariables.append("\n");
			}**/
			//jTextAreaShowVariables.setLineWrap(true);
			//jTextAreaShowVariables.setWrapStyleWord(true);
			jTextAreaShowVariables.setEditable(false);
		
			

	}
	
	
	public void initialisationALLComponent()
	{
		jTextAreaShowVariables=new JTextPane();
		jTextAreaShowVariables.setBackground(Color.darkGray);
		jTextAreaShowVariablesScrollBar = new JScrollPane(jTextAreaShowVariables,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		jLabelUsedVariables=new JLabel("Select from these variables ");
		showVariables();
		
		jLabelVariable=new JLabel("Select Variable");
		jLabelOperation=new JLabel("Select Operation");
		jLabelConstant=new JLabel("Enter Constant");
		
		 jLabelCondition=new JLabel("Condition");;
		 jFieldCondition=new JTextField();
		 jFieldCondition.setEditable(false);
		 
		 jButtonClear=new JButton("Clear");
		
		jComboSelectVariables=new JComboBox<String>(CommonAction.getVariableNameCurrentFunction());
		jComboSelectVariables.insertItemAt("", 0);
		jComboSelectVariables.setSelectedIndex(0);
		jComboSelectOperations=new JComboBox<String>(CommonAction.getAllOperations());
		jComboSelectOperations.insertItemAt("", 0);
		jComboSelectOperations.setSelectedIndex(0);
		
		jTextFieldConstant=new JTextField();
		
		jButtonInit=new JButton("Init");
		jButtonCondition=new JButton("Condition");
		jButtonIncDec=new JButton("Counter");
		jButtonInit.addActionListener(this);
		jButtonCondition.addActionListener(this);
		jButtonIncDec.addActionListener(this);
		
		
		jLabelAreaSyntax = new JLabel("Syntax");
		jTextAreaSyntax =new JTextPane();
		jTextAreaSyntax.setBackground(Color.darkGray);
		jTextAreaSyntaxScrollBar = new JScrollPane(jTextAreaSyntax,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		jTextAreaSyntax.setEditable(false);
		
		//for
		 jLabelInit=new JLabel("Initialize");
		 jFieldInit=new JTextField();
		 jFieldInit.setEditable(false);
		 jLabelIncDec=new JLabel("Counter");;
		 jFieldIncDec=new JTextField();
		 jFieldIncDec.setEditable(false);
		 
		 okFor=new JButton("View");
		 okFor.setEnabled(false);
		 jButtonSubmitFor=new JButton("Save For Loop");
		 //
		 
		 //while
		 
		
		  okWhile=new JButton("View");
		  okWhile.setEnabled(false);
		  jButtonSubmitWhile=new JButton("Save While Loop");
		  //
		  
		  //do while
				  
		  jButtonSubmitDoWhile=new JButton("Save doWhile Loop");
		  //
		  
		  jButtonSubmitFor.setEnabled(false);
			jButtonSubmitWhile.setEnabled(false);
			jButtonSubmitDoWhile.setEnabled(false);
		  
		  jButtonSubmitFor.addActionListener(this);
		  okFor.addActionListener(this);
		  
		  
		  jButtonSubmitWhile.addActionListener(this);
		  okWhile.addActionListener(this);
		  
		  
		  jButtonSubmitDoWhile.addActionListener(this);		  
		  jButtonClear.addActionListener(this);
		  
		  jFieldCondition.getDocument().addDocumentListener(dl);
		  jFieldInit.getDocument().addDocumentListener(dl);
		  jFieldIncDec.getDocument().addDocumentListener(dl);
		  
		  jComboSelectVariables.addActionListener(this);
   		jComboSelectOperations.addActionListener(this);
			
			jTextFieldConstant.getDocument().addDocumentListener(dl);
			jTextAreaSyntax.getDocument().addDocumentListener(dl);
	}
	
	void setDisable() {
		if(jFieldCondition.getText().equals("") && jFieldInit.getText().equals("") && jFieldIncDec.getText().equals("")) {
			
			okFor.setEnabled(false);
			
		}
		else {
			okFor.setEnabled(true);
		}
		if((jTextFieldConstant.getText().equals("") || jTextFieldConstant.getText().equals(null))  && varIsNull && opIsNull) {
			okWhile.setEnabled(false);	
		}
		else {
			okWhile.setEnabled(true);
		}
		
		if(jTextAreaSyntax.getText().equals("")) {
			jButtonSubmitFor.setEnabled(false);
			jButtonSubmitWhile.setEnabled(false);
			jButtonSubmitDoWhile.setEnabled(false);
		}
		else {
			jButtonSubmitFor.setEnabled(true);
			jButtonSubmitWhile.setEnabled(true);
			jButtonSubmitDoWhile.setEnabled(true);
		}
		
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
	
	Loop()
	{
		panel3.setLayout(null);
		CommonAction.disableAllPanel2Button();
		initialisationALLComponent(); 
		changeUI();
	}
	
	void changeUI()
	{
		
		jRadioFor = new JRadioButton("For");
		jRadioWhile = new JRadioButton("While");
		jRadioDoWhile = new JRadioButton("do-While");
		
		jRadioFor.setBackground(new Color(80,80,80));
		jRadioWhile.setBackground(new Color(80,80,80));
		jRadioDoWhile.setBackground(new Color(80,80,80));
		
		jLabelall = new JLabel("Select the Loop");
		jLabelRadioFor = new JLabel("For");
		jLabelRadioWhile = new JLabel("While");
		jLabelRadioDoWhile = new JLabel("doWhile");
		
		jButtonGroup = new ButtonGroup();
		jButtonGroup.add(jRadioFor);
		jButtonGroup.add(jRadioWhile);
		jButtonGroup.add(jRadioDoWhile);
		
        jLabelall.setBounds(20,20,150,20);
		
		jRadioFor.setBounds(20,60,20,20);
		jLabelRadioFor.setBounds(50, 60, 60, 20);
		
		jRadioWhile.setBounds(20,100,20,20);
		jLabelRadioWhile.setBounds(50, 100, 60, 20);
		
		jRadioDoWhile.setBounds(20,140,20,20);
		jLabelRadioDoWhile.setBounds(50, 140, 60,20);
		
		jRadioFor.setSelected(true);
		
		forClick();
		
		panel3.add(jLabelall);
		panel3.add(jRadioFor);
		panel3.add(jRadioWhile);
		panel3.add(jRadioDoWhile);
		panel3.add(jLabelRadioFor);
		panel3.add(jLabelRadioWhile);
		panel3.add(jLabelRadioDoWhile);
		panel3.repaint();
			
		jRadioFor.addActionListener(this);
		jRadioWhile.addActionListener(this);
		jRadioDoWhile.addActionListener(this);
	}
		
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==jComboSelectVariables)
		{
			setBoolean();
		}
		if(e.getSource()==jComboSelectOperations)
		{
			setBoolean();
		}
		if(e.getSource()==jRadioFor)
		{
			forClick();
		}
		if(e.getSource()==jRadioWhile)
		{
			whileClick();
		}
		if(e.getSource()==jRadioDoWhile)
		{
			DoWhileClick();
		}
		if(e.getSource()==okFor)
		{
			okForClick();
		}
		if(e.getSource()==okWhile)
		{
			okWhileClick();
		}
		
		
		if(e.getSource()==jButtonSubmitDoWhile)
		{
			saveDoWhile();
		}
		if(e.getSource()==jButtonSubmitWhile)
		{
			saveWhile();
		}
		if(e.getSource()==jButtonSubmitFor)
		{
			saveFor();
		}
		if(e.getSource()==jButtonInit)
		{
			setInit();
		}
		if(e.getSource()==jButtonCondition)
		{
			setCondition();
		}
		if(e.getSource()==jButtonIncDec)
		{
			setIncDec();
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
				 okWhile.setEnabled(false);
			 }
		 }
		 else {
			 okWhile.setEnabled(true);
		 }
		
	}
	
	public void forClick()
	{
		jTextAreaSyntax.setText("");
		//remove while component
		panel3.remove(jLabelCondition);
		panel3.remove(jFieldCondition);
		panel3.remove(jLabelUsedVariables);
		panel3.remove(jTextAreaShowVariablesScrollBar);
		panel3.remove(jButtonCondition);
		panel3.remove(jComboSelectOperations);
		panel3.remove(jComboSelectVariables);
		panel3.remove(jTextFieldConstant);
		panel3.remove(okWhile);
		panel3.remove(jTextAreaSyntax);
		panel3.remove(jButtonSubmitWhile);
		panel3.remove(jLabelOperation);
		panel3.remove(jLabelConstant);
		panel3.remove(jLabelVariable);
		panel3.remove(jButtonClear);
		//
		
		//remove do while components
		panel3.remove(jButtonSubmitDoWhile);
		
		//
		
		//set bounds
		jLabelUsedVariables.setBounds(150,20,220,20);
		jTextAreaShowVariablesScrollBar.setBounds(150,60,220,140);
		jLabelInit.setBounds(450,30,200,20);
		jFieldInit.setBounds(450,60,100,30);
		jLabelVariable.setBounds(450,100,100,30);
		jComboSelectVariables.setBounds(450,130,100,30);
		jButtonInit.setBounds(450,170,100,30);
		jLabelCondition.setBounds(575, 30, 160, 30);
		jFieldCondition.setBounds(575, 60, 160, 30);
		jLabelOperation.setBounds(575,100,155,30);
		jComboSelectOperations.setBounds(575,130,160,30);
		jButtonCondition.setBounds(575,170,155,30);
		jLabelIncDec.setBounds(750,30,150,30);
		jFieldIncDec.setBounds(750,60,100,30);
		jLabelConstant.setBounds(750,100,100,30);
		jTextFieldConstant.setBounds(750,130,100,30);
		jButtonIncDec.setBounds(750,170,100,30);
		okFor.setBounds(900, 70, 80, 30);
		jButtonClear.setBounds(900,120,80,30);
		jLabelAreaSyntax.setBounds(1000,30,170,20);
		jTextAreaSyntaxScrollBar.setBounds(1000,70,170,130);
		jButtonSubmitFor.setBounds(1200,110,120,30);
		
		
		//
		
		//add to panel
		panel3.add(jLabelUsedVariables);
		panel3.add(jTextAreaShowVariablesScrollBar);
		panel3.add(jLabelInit);
		panel3.add(jFieldInit);
		panel3.add(jLabelCondition);
		panel3.add(jFieldCondition);
		panel3.add(jLabelIncDec);
		panel3.add(jFieldIncDec);
		panel3.add(okFor);
		panel3.add(jLabelAreaSyntax);
		panel3.add(jTextAreaSyntaxScrollBar);
		panel3.add(jButtonSubmitFor);
		panel3.add(jComboSelectOperations);
		panel3.add(jComboSelectVariables);
		panel3.add(jTextFieldConstant);
		panel3.add(jButtonInit);
		panel3.add(jButtonCondition);
		panel3.add(jButtonIncDec);
		panel3.add(jButtonClear);
		panel3.add(jLabelVariable);
		panel3.add(jLabelConstant);
		panel3.add(jLabelOperation);
		panel3.revalidate();
		panel3.repaint();
		
	}	
	
	public void whileClick() {
		jTextAreaSyntax.setText("");
		//remove components of for
		panel3.remove(jLabelUsedVariables);
		panel3.remove(jTextAreaShowVariablesScrollBar);
		panel3.remove(jComboSelectOperations);
		panel3.remove(jComboSelectOperations);
		panel3.remove(jTextFieldConstant);
		panel3.remove(jButtonCondition);
		panel3.remove(jButtonIncDec);
		panel3.remove(jButtonInit);
		panel3.remove(jLabelInit);
		panel3.remove(jFieldInit);
		panel3.remove(jFieldCondition);
		panel3.remove(jLabelCondition);
		panel3.remove(jLabelIncDec);
		panel3.remove(jFieldIncDec);
		panel3.remove(okFor);
		panel3.remove(jTextAreaSyntax);
		panel3.remove(jButtonSubmitFor);
		panel3.remove(jLabelOperation);
		panel3.remove(jLabelConstant);
		panel3.remove(jLabelVariable);
		panel3.remove(jButtonClear);
		panel3.remove(jLabelConstant);
		panel3.remove(jLabelOperation);
		panel3.remove(jLabelVariable);
		//
		
		//remove components of do-while
		
		panel3.remove(jButtonSubmitDoWhile);
		//
		
		//set bounds
		jLabelUsedVariables.setBounds(150,20,220,20);
		jTextAreaShowVariablesScrollBar.setBounds(150,60,220,140);
	//	jLabelCondition.setBounds(400,10,200,20);
	//	jFieldCondition.setBounds(400,50,120,30);
	//	jButtonCondition.setBounds(400,100,100,30);
		jLabelVariable.setBounds(530,50,120,30);
		jComboSelectVariables.setBounds(650,60,160,30);
		jLabelOperation.setBounds(530,110,150,30);
		jComboSelectOperations.setBounds(650,120,160,30);
		jLabelConstant.setBounds(530,160,150,30);
		jTextFieldConstant.setBounds(650,170,160,30);
		okWhile.setBounds(840, 80, 100, 30);
		jLabelAreaSyntax.setBounds(950,30,170,20);
		jTextAreaSyntaxScrollBar.setBounds(950,70,170,130);
		jButtonSubmitWhile.setBounds(1150,110,160,30);
		jButtonClear.setBounds(840,120,100,30);
		
		//
		
		//add to panel
		panel3.add(jLabelUsedVariables);
		panel3.add(jTextAreaShowVariablesScrollBar);
	//	panel3.add(jLabelCondition);
	//	panel3.add(jFieldCondition);
	//	panel3.add(jButtonCondition);	
		panel3.add(okWhile);
		panel3.add(jLabelAreaSyntax);
		panel3.add(jTextAreaSyntaxScrollBar);
		panel3.add(jButtonSubmitWhile);
		panel3.add(jComboSelectOperations);
		panel3.add(jComboSelectVariables);
		panel3.add(jTextFieldConstant);
		panel3.add(jButtonClear);
		panel3.add(jLabelVariable);
		panel3.add(jLabelConstant);
		panel3.add(jLabelOperation);
		panel3.revalidate();
		panel3.repaint();
	}
	
	public void DoWhileClick(){
		jTextAreaSyntax.setText("");
		
	        whileClick();
			panel3.remove(jButtonSubmitWhile);
			jButtonSubmitDoWhile.setBounds(1150,110,160,30);
					
			panel3.add(jButtonSubmitDoWhile);
			panel3.repaint();
		
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
		
	
	public void setInit() {
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
			 jFieldInit.setText(jFieldInit.getText() + constant+showOp);	 
		 }
		 else {
			 jFieldInit.setText(jFieldInit.getText() + var+showOp+constant);
		 }
		 
		 jComboSelectVariables.setSelectedIndex(0);
		 jComboSelectOperations.setSelectedIndex(0);
		jTextFieldConstant.setText("");
		}
		else {
			okFor.setEnabled(false);
			CommonAction.showRedWarning("Please select proper value for constant");
			jTextFieldConstant.setText("");
		}
	}
	
	public void setCondition() {
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
			 jFieldCondition.setText(jFieldCondition.getText() + constant+showOp);	 
		 }
		 else {
			 jFieldCondition.setText(jFieldCondition.getText() +var+showOp+constant);
		 }
		 
		 jComboSelectVariables.setSelectedIndex(0);
		 jComboSelectOperations.setSelectedIndex(0);
		jTextFieldConstant.setText("");
		}
		else {
			okFor.setEnabled(false);
			CommonAction.showRedWarning("Please select proper value for constant");
			jTextFieldConstant.setText("");
		}
		
	}
	
	public void setIncDec() {
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
			 jFieldIncDec.setText( jFieldIncDec.getText() + constant+showOp); 
		 }
		 else {
			 jFieldIncDec.setText( jFieldIncDec.getText()+var+showOp+constant);
		 }
		 
		 jComboSelectVariables.setSelectedIndex(0);
		 jComboSelectOperations.setSelectedIndex(0);
		jTextFieldConstant.setText("");
		}
		else {
			okFor.setEnabled(false);
			CommonAction.showRedWarning("Please select proper value for constant");
			jTextFieldConstant.setText("");
		}
	}
	
	void Clear() {
		jFieldInit.setText("");
		jFieldCondition.setText("");
		jFieldIncDec.setText("");
		jTextFieldConstant.setText("");
   	 jComboSelectVariables.setSelectedIndex(0);
	 jComboSelectOperations.setSelectedIndex(0);
	 jTextAreaSyntax.setText("");
		
	}
	
	void removePanel3AllComponent()
	{
		
		panel3.remove(jLabelUsedVariables);
		panel3.remove(jTextAreaShowVariablesScrollBar);
		panel3.remove(jComboSelectOperations);
		panel3.remove(jComboSelectVariables);
		panel3.remove(jTextFieldConstant);
		panel3.remove(jButtonCondition);
		panel3.remove(jButtonIncDec);
		panel3.remove(jButtonInit);
		panel3.remove(jLabelOperation);
		panel3.remove(jLabelConstant);
		panel3.remove(jLabelVariable);
		panel3.remove(jButtonClear);
		
		//remove components of for
		panel3.remove(jLabelInit);
		panel3.remove(jFieldInit);
		panel3.remove(jFieldCondition);
		panel3.remove(jLabelCondition);
		panel3.remove(jLabelIncDec);
		panel3.remove(jFieldIncDec);
		panel3.remove(okFor);
		panel3.remove(jLabelAreaSyntax);
		panel3.remove(jTextAreaSyntaxScrollBar);
		panel3.remove(jButtonSubmitFor);
		//
		
		//remove components of while
		panel3.remove(jLabelCondition);
		panel3.remove(jFieldCondition);	
		panel3.remove(okWhile);
		panel3.remove(jButtonSubmitWhile);
		//
		
		//remove components of do-while
		panel3.remove(jButtonSubmitDoWhile);
		//
		
		//remove radio buttons and their labels
		panel3.remove(jRadioFor);
		panel3.remove(jRadioWhile);
		panel3.remove(jRadioDoWhile); 
		 
		panel3.remove(jLabelall);
		panel3.remove(jLabelRadioFor);
		panel3.remove(jLabelRadioWhile);
		panel3.remove(jLabelRadioDoWhile);
		//
		panel3.repaint();
		
	}
	
	
	
	public void okForClick() {
	
		String init=jFieldInit.getText();
		String condition=jFieldCondition.getText();
		String IncDec=jFieldIncDec.getText();
		
		Boolean b1=ConditionChecking(init);
		Boolean b2=ConditionChecking(condition);
		Boolean b3=ConditionChecking(IncDec);
		
		if(b1 && b2 && b3) {
		
		StyledDocument doc = jTextAreaSyntax.getStyledDocument();
		Style style = doc.addStyle("I am Style",null);
		
		StyleConstants.setForeground(style,Color.magenta);
		try{
			doc.insertString(doc.getLength(),"("+init+";"+condition+";"+IncDec+")", style);
		
		}
		catch(Exception e){
			
		}
		//jTextAreaSyntax.append("("+init+";"+condition+";"+IncDec+")");
		
		jFieldInit.setText("");
		jFieldCondition.setText("");
		jFieldIncDec.setText("");
		jButtonSubmitFor.setEnabled(true);
		}
		else {
			
			jFieldInit.setText("");
			jFieldCondition.setText("");
			jFieldIncDec.setText("");
			CommonAction.showRedWarning("Not a valid syntax");
		}
		
	}
	
	public void okWhileClick() {
		boolean b=checkValue();
	    if(b) {
		setCondition();
		String condition=jFieldCondition.getText();
		jFieldCondition.setText("");
		
		StyledDocument doc = jTextAreaSyntax.getStyledDocument();
		Style style = doc.addStyle("I am Style",null);
		
		StyleConstants.setForeground(style,Color.magenta);
		try{
			doc.insertString(doc.getLength(),condition, style);
		
		}
		catch(Exception e){
			
		}
		
		
		
		jButtonSubmitWhile.setEnabled(true);
		jButtonSubmitDoWhile.setEnabled(true);
	    }
	    else {
	    	okWhile.setEnabled(false);
			CommonAction.showRedWarning("Please select proper value for constant");
			jTextFieldConstant.setText("");
	    }
		
	}
	
	
	
	public void saveFor() {
		removePanel3AllComponent();
		CommonAction.enableAllPanel2Button();
		// logic part is here hahaha
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
			String temp = "for"+condition+"{"; // iske karn problem aayegi aage index calculate krne me shiza please solve that
			String part1 = fullCode.substring(0,index);
			String part2 = fullCode.substring(index,fullCode.length());
			String actual = part1+temp+part2;
			// do formatting for temp and actual
			CommonAction.comboOperations(temp, actual, "For loop applied successfully");
			UndoWorking.addItem(temp,"normal");
			// ok boss
		}
		// bhai ho gya itta hi h logic part
	}
	
	public void saveDoWhile() {
		
		Boolean b=ConditionChecking("");
		if(b) {
		
		removePanel3AllComponent();
		CommonAction.enableAllPanel2Button();
		//Logic part h yha // problem aayegi to currently m isse nhi kr paunga
		
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
			String temp = "do {";
			String part1 = fullCode.substring(0,index);
			String part2 = fullCode.substring(index,fullCode.length());
			String actual = part1+temp+part2;
			Status.setDoWhileCondition(condition);
			// do formatting for temp and actual
			CommonAction.comboOperations(temp,actual,"Do loop applied");
			UndoWorking.addItem(temp,"normal");
			// ok boss
		}
		}
		else {
			jTextAreaSyntax.setText("");
			CommonAction.showRedWarning("Not a valid Syntax");
		}
		
		// bs bs ho gya
	}
	
	public void saveWhile() {
		
		Boolean b=ConditionChecking("");
		if(b) {
		
		removePanel3AllComponent();
		CommonAction.enableAllPanel2Button();
		// logic part please mind your moves
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
			//Status.setDoWhileCondition(condition); // do while ki condition set kr rha hu
			String temp = "while ( "+condition+" ) {"; // iske karn problem aayegi aage index calculate krne me shiza please solve that
			String part1 = fullCode.substring(0,index);
			String part2 = fullCode.substring(index,fullCode.length());
			String actual = part1+temp+part2;
			// do formatting for temp and actual
			CommonAction.comboOperations(temp, actual,"While loop applied successfully");
			UndoWorking.addItem(temp, "normal");
			// ok boss

		}
		// logic part end ab befikr ghume
		
	}
	
	else {
		jTextAreaSyntax.setText("");
		CommonAction.showRedWarning("Not a valid Syntax");
	}
	}


public boolean ConditionChecking(String s) {
	boolean b=true;
	String condition;
	if(jRadioFor.isSelected()) {
	  condition=s;
	}
	else {
		 condition = jTextAreaSyntax.getText().toString();
	}
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
							
			if( beforeOp.equals("") || afterOp.equals("")) {	
				
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

}
