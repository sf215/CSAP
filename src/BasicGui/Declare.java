package BasicGui;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.*;

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.text.Style;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledDocument;
public class Declare implements ActionListener{
	
	private JPanel  panel3 = CommonReference.getPanel3(); 
	
	private JRadioButton jVariable ;
	private JRadioButton jArray ;
	private JRadioButton jFunction ;
	
	private JLabel jLabelall;
	private JLabel jLabelRadioVariables;
	private JLabel jLabelRadioFunction;
	private JLabel jLabelRadioArray;
	
	private ButtonGroup jButtonGroup;
	
	// Common for three
	private JComboBox<String> jComboBoxdatatypes;
	private JLabel jLabelDatatypes;
	private JComboBox<String> jcomboBoxStorageClass;
	
	//End
	
	// Variable ke liye ram khani
	private JLabel jLabelUsedVariables;
	private JTextPane jTextAreaUsedVariables;
	private JScrollPane jTextAreaUsedVariablesScrollBar;
	private JLabel jLabelVariableName;
	private JTextField jFieldVariableName;
	private JLabel jLabelInitialValue;
	private JTextField jFieldInitialValue;
	private JButton jButtonSaveVariable;
	// end for variables
	
	//Function ke liye ram khani
	private JLabel jLabelUsedFunction;
	private JTextPane jTextAreaUsedFunction;
	private JScrollPane jTextAreaUsedFunctionScrollBar;
	private JLabel jLabelFunctionName;
	private JTextField jFieldFunctionName;
	private JButton jButtonSaveFunction;
	//end of function
	
	//array ke liye peshks
	private JLabel jLabelUsedArray;
	private JTextPane jTextAreaUsedArray;
	private JScrollPane jTextAreaUsedArrayScrollBar;
	private JLabel jLabelArrayName;
	private JTextField jFieldArrayName;
	private JLabel jLabelInitialSize;
	private JTextField jFieldInitialSize;
	private JButton jButtonSaveArray;
	//bs jyada mu nhi lgana isse
	
	// utilities
	private String[] usedVariablesList,usedFunctionList,usedArrayList;
	
	//End of utilities
	
	
	public void initialisationALLComponent()
	{
		//Common for both
		
		jComboBoxdatatypes = new JComboBox<String>(AllArrays.getDatatypesWithOutVoid());
		jLabelDatatypes = new JLabel("Data types");
		String[] storage  = new String[AllArrays.getStorageClass().length+1];
		storage[0] = "Select Storage class";
		for(int i=1;i<storage.length;i++)
		{
			storage[i] = AllArrays.getStorageClass()[i-1];
		}
		jcomboBoxStorageClass = new JComboBox<String>(storage);
		//Common for both
		
		Font font = new Font("monospaced",Font.PLAIN,14);
		
		// Variables ke component
		jLabelUsedVariables = new JLabel("Used Names");// isse mujhe mapclasses ke through acces krna h
		jTextAreaUsedVariables = new JTextPane();
		jTextAreaUsedVariables.setBackground(Color.darkGray);
		jTextAreaUsedVariables.setFont( font);
		jTextAreaUsedVariablesScrollBar = new JScrollPane(jTextAreaUsedVariables,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		jLabelVariableName = new JLabel("Variable Name");
		jFieldVariableName = new JTextField();
		jLabelInitialValue = new JLabel("Initial value");
		jFieldInitialValue  = new JTextField("0");
		jButtonSaveVariable = new JButton("Declare value");
		jButtonSaveVariable.setEnabled(false);
		// End of variable Component
		
		// Function ke component  lgenge
		jLabelUsedFunction = new JLabel("Used Identifier");
		jTextAreaUsedFunction = new JTextPane();
		jTextAreaUsedFunction.setBackground(Color.darkGray);
		jTextAreaUsedFunction.setFont(font);
		jTextAreaUsedFunctionScrollBar = new JScrollPane(jTextAreaUsedFunction,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		jLabelFunctionName = new JLabel("Function name");
		jFieldFunctionName = new JTextField();
		jButtonSaveFunction = new JButton("Declare function");
		jButtonSaveFunction.setEnabled(false);
		//End of function Variable
		
		//Array ke component yha mrenege
		jLabelUsedArray = new JLabel("Used Names");// isse mujhe mapclasses ke through acces krna h
		jTextAreaUsedArray = new JTextPane();
		jTextAreaUsedArray.setBackground(Color.darkGray);
		jTextAreaUsedArray.setFont(font);
		jTextAreaUsedArrayScrollBar =  new JScrollPane(jTextAreaUsedArray,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		jLabelArrayName = new JLabel("Array Name");
		jFieldArrayName = new JTextField();
		jLabelInitialSize = new JLabel("Initial size");
		jFieldInitialSize  = new JTextField("1");
		jButtonSaveArray = new JButton("Declare Array");
		jButtonSaveArray.setEnabled(false);
		//bs itte hi lgane h
		
		jButtonSaveVariable.addActionListener(this);
		jButtonSaveArray.addActionListener(this);
		jButtonSaveFunction.addActionListener(this);
		
		jTextAreaUsedArray.setEditable(false);
		jTextAreaUsedFunction.setEditable(false);
		jTextAreaUsedVariables.setEditable(false);
		
		jFieldVariableName.getDocument().addDocumentListener(dl);
		jFieldInitialValue.getDocument().addDocumentListener(dl);
		jFieldFunctionName.getDocument().addDocumentListener(dl);
		jFieldArrayName.getDocument().addDocumentListener(dl);
		jFieldInitialSize.getDocument().addDocumentListener(dl);
		
		
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
		if(jFieldVariableName.getText().equals("") || jFieldInitialValue.getText().equals("")) {
			
			jButtonSaveVariable.setEnabled(false);
		}
		else {
			jButtonSaveVariable.setEnabled(true);
		}
		if(jFieldFunctionName.getText().equals("") || jFieldFunctionName.getText().equals(null)) {
			
			jButtonSaveFunction.setEnabled(false);
		}
		else {
			jButtonSaveFunction.setEnabled(true);
		}
		if(jFieldArrayName.getText().equals("") || jFieldArrayName.getText().equals(null) || jFieldInitialSize.getText().equals("") || jFieldInitialSize.getText().equals(null)) {
		
			 jButtonSaveArray.setEnabled(false);
		}
		else {
			jButtonSaveArray.setEnabled(true);
		}

	}
	
	Declare()
	{
		panel3.setLayout(null);
		CommonAction.disableAllPanel2Button();
		initialisationALLComponent(); 
		changeUI();
		initialisedUsedList();
		variableClick();
		
	}
	
	void initialisedUsedList()
	{
		usedVariablesList = CommonAction.getVariableNameCurrentFunction();
		usedArrayList = CommonAction.getArrayNameCurrentFunction();
		usedFunctionList  =  CommonAction.getFunctionNameFullCode();
	}
	
	void changeUI()
	{
		
		jVariable = new JRadioButton("Variables");
		jArray = new JRadioButton("Array");
		jFunction = new JRadioButton("Function");
		
		jVariable.setBackground(new Color(80,80,80));
		jArray.setBackground(new Color(80,80,80));
		jFunction.setBackground(new Color(80,80,80));
		
		jLabelall = new JLabel("Please select from these");
		jLabelall.setForeground(new Color(222,222,222));
		jLabelRadioVariables = new JLabel("Variables");
		jLabelRadioVariables.setForeground(new Color(222,222,222));
		jLabelRadioFunction = new JLabel("Function");
		jLabelRadioFunction.setForeground(new Color(222,222,222));
		jLabelRadioArray = new JLabel("Array");
		jLabelRadioArray.setForeground(new Color(222,222,222));
		
		jVariable.setSelected(true);
		
		jButtonGroup = new ButtonGroup();
		jButtonGroup.add(jVariable);
		jButtonGroup.add(jArray);
		jButtonGroup.add(jFunction);
		
		jLabelall.setBounds(20,20,200,20);
		
		jVariable.setBounds(20,60,20,20);
		jLabelRadioVariables.setBounds(50, 60, 80, 20);
		
		jArray.setBounds(20,100,20,20);
		jLabelRadioArray.setBounds(50, 100, 80, 20);
		
		jFunction.setBounds(20,140,20,20);
		jLabelRadioFunction.setBounds(50, 140, 80,20);
		
		panel3.add(jLabelall);
		panel3.add(jVariable);
		panel3.add(jArray);
		panel3.add(jFunction);
		panel3.add(jLabelRadioArray);
		panel3.add(jLabelRadioFunction);
		panel3.add(jLabelRadioVariables);
		panel3.repaint();
			
		jVariable.addActionListener(this);
		jFunction.addActionListener(this);
		jArray.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==jVariable)
		{
			variableClick();
		}
		if(e.getSource()==jFunction)
		{
			functionClick();
		}
		if(e.getSource()==jArray)
		{
			arrayClick();
		}
		if(e.getSource()==jButtonSaveVariable)
		{
			saveVariable();
		}
		if(e.getSource()==jButtonSaveArray)
		{
			saveArray();
		}
		if(e.getSource()==jButtonSaveFunction)
		{
			saveFunction();
		}
	}
	
	
	// INintalisation of used list90
	public void initialisedVariableList()
	{
		jTextAreaUsedVariables.setText("");
		
		StyledDocument doc = jTextAreaUsedVariables.getStyledDocument();
		Style style = doc.addStyle("I am Style",null);
		StyleConstants.setForeground(style,Color.magenta);
		try{
			doc.insertString(doc.getLength(),"Used Variables:\n" , style);
		}
		catch(Exception e){
			
		}
		//jTextAreaUsedVariables.append("Used Variables:\n");
		StyleConstants.setForeground(style,Color.cyan);
		try{
			for(int i=0;i<usedVariablesList.length;i++)
				doc.insertString(doc.getLength(), usedVariablesList[i]+"\n", style);
		}
		catch(Exception e){
			
		}
		/*for(int i=0;i<usedVariablesList.length;i++)
			 jTextAreaUsedVariables.append(usedVariablesList[i]+"\n");*/
		StyleConstants.setForeground(style,Color.magenta);
		try{
			doc.insertString(doc.getLength(),"Used Array:\n" , style);
		}
		catch(Exception e){
			
		}
		//jTextAreaUsedVariables.append("Used Array:\n");
		StyleConstants.setForeground(style,Color.cyan);
		try{
			for(int i=0;i<usedArrayList.length;i++)
				doc.insertString(doc.getLength(), usedArrayList[i]+"\n", style);
		}
		catch(Exception e){
			
		}
		/*for(int i=0;i<usedArrayList.length;i++)
			 jTextAreaUsedVariables.append(usedArrayList[i]+"\n");*/
		StyleConstants.setForeground(style,Color.magenta);
		try{
			doc.insertString(doc.getLength(),"Used Function:\n" , style);
		}
		catch(Exception e){
			
		}
		//jTextAreaUsedVariables.append("Used Function:\n");
		StyleConstants.setForeground(style,Color.cyan);
		try{
			for(int i=0;i<usedFunctionList.length;i++)
				doc.insertString(doc.getLength(),usedFunctionList[i]+"\n" , style);
		}
		catch(Exception e){
			
		}
		/*for(int i=0;i<usedFunctionList.length;i++)
			 jTextAreaUsedVariables.append(usedFunctionList[i]+"\n");*/
		
    }
	// Variable part ends here
	
	public void initialisedFunctionList()
	{
		jTextAreaUsedFunction.setText("");
		String [] v = CommonAction.getVariableNameAllFunction();
		String [] a = CommonAction.getArrayNameAllFunction();
		
		StyledDocument doc = jTextAreaUsedFunction.getStyledDocument();  
		Style style = doc.addStyle("I am Style",null);
		
		StyleConstants.setForeground(style,Color.magenta);
		try{
			doc.insertString(doc.getLength(),"Used Variables:\n" ,style);
		}
		catch(Exception e){
			
		}
		//jTextAreaUsedFunction.append("Used Variables:\n");
		StyleConstants.setForeground(style,Color.cyan);
		try{
			for(int i=0;i<v.length;i++)
				doc.insertString(doc.getLength(),v[i]+"\n" ,style);
		}
		catch(Exception e){
			
		}
		/*for(int i=0;i<v.length;i++)
			 jTextAreaUsedFunction.append(v[i]+"\n");*/
	
		StyleConstants.setForeground(style,Color.magenta);
		try{
			doc.insertString(doc.getLength(),"Used Array:\n" ,style);
		}
		catch(Exception e){
			
		}
		//jTextAreaUsedFunction.append("Used Array:\n");
		StyleConstants.setForeground(style,Color.cyan);
		try{
			for(int i=0;i<a.length;i++)
				doc.insertString(doc.getLength(), a[i]+"\n",style);
		}
		catch(Exception e){
			
		}
		/*for(int i=0;i<a.length;i++)
			 jTextAreaUsedFunction.append(a[i]+"\n");*/
		StyleConstants.setForeground(style,Color.magenta);
		try{			
			doc.insertString(doc.getLength(),"Used Function:\n" ,style);
		}
		catch(Exception e){
			
		}
		//jTextAreaUsedFunction.append("Used Function:\n");
		StyleConstants.setForeground(style,Color.cyan);
		try{
			for(int i=0;i<usedFunctionList.length;i++)	
				doc.insertString(doc.getLength(),usedFunctionList[i]+"\n" ,style);
		}
		catch(Exception e){
			
		}
		/*for(int i=0;i<usedFunctionList.length;i++)
			 jTextAreaUsedFunction.append(usedFunctionList[i]+"\n");*/	
     }
	// Function part end here
	
	public void initialisedArrayList()
	{
		jTextAreaUsedArray.setText("");
		
		StyledDocument doc = jTextAreaUsedArray.getStyledDocument();
		Style style = doc.addStyle("I am style", null);
		
		StyleConstants.setForeground(style, Color.magenta);
		try{
			doc.insertString(doc.getLength(),"Used Variables:\n" , style);
		}
		catch(Exception e){
			
		}
		//jTextAreaUsedArray.append("Used Variables:\n");
		StyleConstants.setForeground(style,Color.cyan);
		try{
			for(int i=0;i<usedVariablesList.length;i++)
				doc.insertString(doc.getLength(),usedVariablesList[i]+"\n" , style);
		}
		catch(Exception e){
			
		}
		/*for(int i=0;i<usedVariablesList.length;i++)
			 jTextAreaUsedArray.append(usedVariablesList[i]+"\n");*/
		StyleConstants.setForeground(style,Color.magenta);
		try{
			doc.insertString(doc.getLength(),"Used Array:\n" , style);
		}
		catch(Exception e){
			
		}
		//jTextAreaUsedArray.append("Used Array:\n");
		StyleConstants.setForeground(style,Color.cyan);
		try{
			for(int i=0;i<usedArrayList.length;i++)
				doc.insertString(doc.getLength(),usedArrayList[i]+"\n" , style);
		}
		catch(Exception e){
			
		}
		//for(int i=0;i<usedArrayList.length;i++)
			 //jTextAreaUsedArray.append(usedArrayList[i]+"\n");
		StyleConstants.setForeground(style,Color.magenta);
		try{
			doc.insertString(doc.getLength(),"Used Function:\n" , style);
		}
		catch(Exception e){
			
		}
		//jTextAreaUsedArray.append("Used Function:\n");
		StyleConstants.setForeground(style,Color.cyan);
		try{
			for(int i=0;i<usedFunctionList.length;i++)
				doc.insertString(doc.getLength(),usedFunctionList[i]+"\n" , style);
		}
		catch(Exception e){
			
		}
		//for(int i=0;i<usedFunctionList.length;i++)
			// jTextAreaUsedArray.append(usedFunctionList[i]+"\n");
     }
	//Array part ends here
	//Initialisation of used List end 
	
	// yha variable wala function lgana h
	public void variableClick()
	{
		// yha dono ke ko htana bhi h mujhe manaually htnege wo dono;
		panel3.remove(jLabelUsedFunction);// function wale start ho gye
		panel3.remove(jTextAreaUsedFunction);
		panel3.remove(jTextAreaUsedFunctionScrollBar);
		panel3.remove(jLabelFunctionName);
		panel3.remove(jFieldFunctionName);
		panel3.remove(jButtonSaveFunction);// funtion wale remove ho gye
		
		panel3.remove(jLabelUsedArray);
		panel3.remove(jTextAreaUsedArray);
		panel3.remove(jTextAreaUsedArrayScrollBar);
		panel3.remove(jLabelArrayName);
		panel3.remove(jFieldArrayName);
		panel3.remove(jLabelInitialSize);
		panel3.remove(jFieldInitialSize);
		panel3.remove(jButtonSaveArray);
		//End of removing
		
		
		// ab inhe bound krnege
		
		jLabelUsedVariables.setBounds(260,20,200,20);
		//jTextAreaUsedVariables.setBounds(260,60,200,120);
		jTextAreaUsedVariablesScrollBar.setBounds(260,60,200,130);
		jLabelDatatypes.setBounds(510, 60, 100, 30);
		jComboBoxdatatypes.setBounds(510, 120, 140, 30);
		jcomboBoxStorageClass.setBounds(510,160,200,30);
		jLabelVariableName.setBounds(670,60,100,30);
		jFieldVariableName.setBounds(670,120,120,30);
		jLabelInitialValue.setBounds(810,60,100,30);
		jFieldInitialValue.setBounds(810,120,120,30);
		jButtonSaveVariable.setBounds(970,120,160,30);
		//Sare lg gye ab next
		
		jLabelUsedVariables.setForeground(new Color(222,222,222));
		jLabelDatatypes.setForeground(new Color(222,222,222));
		jLabelVariableName.setForeground(new Color(222,222,222));
		jLabelInitialValue.setForeground(new Color(222,222,222));
		
		panel3.add(jLabelUsedVariables);
		panel3.add(jTextAreaUsedVariablesScrollBar);
		panel3.add(jLabelDatatypes);
		panel3.add(jComboBoxdatatypes);
		panel3.add(jLabelVariableName);
		panel3.add(jFieldVariableName);
		panel3.add(jLabelInitialValue);
		panel3.add(jFieldInitialValue);
		panel3.add(jButtonSaveVariable);
		panel3.add(jcomboBoxStorageClass);
		panel3.validate();
		panel3.repaint();
		
		if(jComboBoxdatatypes.getItemAt(0).equals("void"))
		{
			jComboBoxdatatypes.removeItemAt(0);
		}
		panel3.repaint();
		
		initialisedVariableList();
		
	}
	
	//yha function wala function lgega
	public void functionClick()
	{
		panel3.remove(jcomboBoxStorageClass);
		
		//Removing of both
		panel3.remove(jLabelUsedVariables);// variable wala
		panel3.remove(jTextAreaUsedVariables);
		panel3.remove(jTextAreaUsedVariablesScrollBar);
		panel3.remove(jLabelVariableName);
		panel3.remove(jFieldVariableName);
		panel3.remove(jLabelInitialValue);
		panel3.remove(jFieldInitialValue);
		panel3.remove(jButtonSaveVariable);
		
		panel3.remove(jLabelUsedArray);// array wala
		panel3.remove(jTextAreaUsedArray);
		panel3.remove(jTextAreaUsedArrayScrollBar);
		panel3.remove(jLabelArrayName);
		panel3.remove(jFieldArrayName);
		panel3.remove(jLabelInitialSize);
		panel3.remove(jFieldInitialSize);
		panel3.remove(jButtonSaveArray);//End of removing
			
		jLabelUsedFunction.setBounds(260,20,200,20);
		//jTextAreaUsedFunction.setBounds(260,60,200,120);
		jTextAreaUsedFunctionScrollBar.setBounds(260,60,200,130);
		jLabelDatatypes.setBounds(510,60,100,30);
		jComboBoxdatatypes.setBounds(510,120,140,30);
		jLabelFunctionName.setBounds(670,60,100,30);
		jFieldFunctionName.setBounds(670,120,120,30);
		jButtonSaveFunction.setBounds(970,120,160,30);
		
		jLabelUsedFunction.setForeground(new Color(222,222,222));
		jLabelDatatypes.setForeground(new Color(222,222,222));
		jLabelFunctionName.setForeground(new Color(222,222,222));
		
		panel3.add(jLabelUsedFunction);
		panel3.add(jTextAreaUsedFunctionScrollBar);
		panel3.add(jLabelDatatypes);
		panel3.add(jComboBoxdatatypes);
		panel3.add(jLabelFunctionName);
		panel3.add(jFieldFunctionName);
		panel3.add(jButtonSaveFunction);

		panel3.validate();
		panel3.repaint();
		if(!(jComboBoxdatatypes.getItemAt(0).equals("void")))
		{
			jComboBoxdatatypes.insertItemAt("void",0);
		}
		
		panel3.repaint();
		
		initialisedFunctionList();
	}
	
	// yha array wala function lga dena
	public void arrayClick()
	{
		//Removing of both 
		panel3.remove(jLabelUsedVariables);// variable wala
		//panel3.remove(jTextAreaUsedVariables);
		panel3.remove(jTextAreaUsedVariablesScrollBar);
		panel3.remove(jLabelVariableName);
		panel3.remove(jFieldVariableName);
		panel3.remove(jLabelInitialValue);
		panel3.remove(jFieldInitialValue);
		panel3.remove(jButtonSaveVariable);//Variable wale ho gye
		
		panel3.remove(jLabelUsedFunction);// function wale start ho gye
		panel3.remove(jTextAreaUsedFunction);
		panel3.remove(jTextAreaUsedFunctionScrollBar);
		panel3.remove(jLabelFunctionName);
		panel3.remove(jFieldFunctionName);
		panel3.remove(jButtonSaveFunction);// funtion wale remove ho gye
		
		// ab inhe bound krnege
		jLabelUsedArray.setBounds(260,20,200,20);
		jTextAreaUsedArray.setBounds(260,60,200,120);
		jTextAreaUsedArrayScrollBar.setBounds(260,60,200,130);
		jLabelDatatypes.setBounds(510, 60, 100, 30);
		jComboBoxdatatypes.setBounds(510, 120, 140, 30);
		jcomboBoxStorageClass.setBounds(510,160,200,30);
		jLabelArrayName.setBounds(670,60,100,30);
		jFieldArrayName.setBounds(670,120,120,30);
		jLabelInitialSize.setBounds(810,60,100,30);
		jFieldInitialSize.setBounds(810,120,120,30);
		jButtonSaveArray.setBounds(970,120,160,30);
		//Sare lg gye ab next
		
		jLabelUsedArray.setForeground(new Color(222,222,222));
		jLabelDatatypes.setForeground(new Color(222,222,222));
		jLabelArrayName.setForeground(new Color(222,222,222));
		jLabelArrayName.setForeground(new Color(222,222,222));
		jLabelInitialSize.setForeground(new Color(222,222,222));
		
		panel3.add(jLabelUsedArray);
		panel3.add(jTextAreaUsedArrayScrollBar);
		panel3.add(jLabelDatatypes);
		panel3.add(jComboBoxdatatypes);
		panel3.add(jcomboBoxStorageClass);
		panel3.add(jLabelArrayName);
		panel3.add(jFieldArrayName);
		panel3.add(jLabelInitialSize);
		panel3.add(jFieldInitialSize);
		panel3.add(jButtonSaveArray);
		
		panel3.validate();
		panel3.repaint();
		
		if(jComboBoxdatatypes.getItemAt(0).equals("void"))
		{
			jComboBoxdatatypes.removeItemAt(0);
		}
		panel3.repaint();
		initialisedArrayList();
	}
	
	void removePanel3AllComponent()
	{
		panel3.remove(jLabelUsedVariables);// variable wala
		panel3.remove(jTextAreaUsedVariables);
		panel3.remove(jTextAreaUsedVariablesScrollBar);
		panel3.remove(jLabelVariableName);
		panel3.remove(jFieldVariableName);
		panel3.remove(jLabelInitialValue);
		panel3.remove(jFieldInitialValue);
		panel3.remove(jButtonSaveVariable);//Variable wale ho gye
		
		panel3.remove(jLabelUsedFunction);// function wale start ho gye
		panel3.remove(jTextAreaUsedFunction);
		panel3.remove(jTextAreaUsedFunctionScrollBar);
		panel3.remove(jLabelFunctionName);
		panel3.remove(jFieldFunctionName);
		panel3.remove(jButtonSaveFunction);// funtion wale remove ho gye
		
		panel3.remove(jLabelUsedArray);// array wala
		panel3.remove(jTextAreaUsedArray);
		panel3.remove(jTextAreaUsedArrayScrollBar);
		panel3.remove(jLabelArrayName);
		panel3.remove(jFieldArrayName);
		panel3.remove(jLabelInitialSize);
		panel3.remove(jFieldInitialSize);
		panel3.remove(jButtonSaveArray);//End of removing
		
		panel3.remove(jLabelDatatypes);
		panel3.remove(jComboBoxdatatypes);
		panel3.remove(jcomboBoxStorageClass);// Dono combo remove ho gye
		
		panel3.remove(jVariable);// ye wo radio button teen pagal se
		panel3.remove(jArray);
		panel3.remove(jFunction); // sb remove ho gye
		
		// ab 4 label or bch gye unhe bhi htana 
		panel3.remove(jLabelall);
		panel3.remove(jLabelRadioArray);
		panel3.remove(jLabelRadioFunction);
		panel3.remove(jLabelRadioVariables);
		
		panel3.repaint();
		
	}
	
	public void saveVariable()
	{
		
		
		//logic lana h sara yha logic lgana h sara ab
		String datatype = jComboBoxdatatypes.getItemAt(jComboBoxdatatypes.getSelectedIndex()).toString();
		String storage = "";
		String name = jFieldVariableName.getText().toString().trim();
		String value = jFieldInitialValue.getText().toString().trim();
		String function = Status.getFunction();
		String fullCode = CommonReference.getFullVersionCode();
		
		if(jcomboBoxStorageClass.getSelectedIndex()==0)
		{
			storage = "";
		}
		else
		{
			storage = jcomboBoxStorageClass.getItemAt(jcomboBoxStorageClass.getSelectedIndex()).toString();
		}
		
		// checkings all
		if(name.equals(""))
		{
			CommonAction.showRedWarning("Please provide variable name");
		}
		else if(value.equals(""))
		{
			CommonAction.showRedWarning("Provide proper value");
		}
		else if(!(BasicOperations.variableNameCheck(name,usedVariablesList,usedArrayList,usedFunctionList)))
		{
			jFieldVariableName.setText("");
		}
		else if(!(BasicOperations.valueCheck(datatype, value)))
		{
			jFieldInitialValue.setText("");
		}
		// all fine
		
		else 
		{
			value  = BasicOperations.valueModify(datatype, value);
			String temp = "";
			if(storage.equals(""))
				temp = datatype+" "+name+" = "+value+" ;";
			else
				temp = storage+" "+datatype+" "+name+" = "+value+" ;";
			int i1  = fullCode.indexOf(function+"(){");
			String s1 = fullCode.substring(0,i1);
			String s2 = fullCode.substring(i1,fullCode.length());
			String p1  = s2.substring(0,s2.indexOf("{")+1);
			String p2 = s2.substring(s2.indexOf("{")+1,s2.length());
	
			String actual = s1+p1+temp+p2;
		
		
			MapClasses.putVariableDatatype(name+"@"+Status.getFunction(), datatype);
		
			CommonAction.comboOperations(temp, actual,"Variable declaration successful");
			CommonAction.showStatus();
			CommonAction.showHierarchy();
			removePanel3AllComponent();
			CommonAction.enableAllPanel2Button();
			UndoWorking.addItem(temp, "variableDeclare");
		}
	}
	
	public void saveArray()
	{
		
		// yha Array wala logic lgana h m nhi krunga ye
		String datatype = jComboBoxdatatypes.getItemAt(jComboBoxdatatypes.getSelectedIndex()).toString();
		String storage = "";
		String name = jFieldArrayName.getText().toString();
		String size = jFieldInitialSize.getText().toString();
		String function = Status.getFunction();
		String fullCode = CommonReference.getFullVersionCode();

		
		if(jcomboBoxStorageClass.getSelectedIndex()==0)
		{
			storage = "";
		}
		else
		{
			storage = jcomboBoxStorageClass.getItemAt(jcomboBoxStorageClass.getSelectedIndex()).toString();
		}
		if(name.equals(""))
		{
			CommonAction.showRedWarning("Please provide proper name");
		}
		else if(size.equals(""))
		{
			CommonAction.showRedWarning("Size field cannot be empty");
		}
		else if(size.equals("0"))
		{
			CommonAction.showRedWarning("Size should be more than one");
		}
		else if(!(BasicOperations.variableNameCheck(name,usedVariablesList,usedArrayList,usedFunctionList)))
		{
			jFieldArrayName.setText("");
		}	
		else 
		{	
			
			String temp ;
			if(storage.equals(""))
			{
				temp = datatype+" "+name+"["+size+"] ;";
			}
			else
			{
				temp = storage+" "+datatype+" "+name+"["+size+"] ;";
			}
			int i1  = fullCode.indexOf(function+"(){");
			String s1 = fullCode.substring(0,i1);
			String s2 = fullCode.substring(i1,fullCode.length());
			String p1  = s2.substring(0,s2.indexOf("{")+1);
			String p2 = s2.substring(s2.indexOf("{")+1,s2.length());
	
			String actual = s1+p1+temp+p2;
			
			MapClasses.putArray(name+"@"+Status.getFunction(), size);
			MapClasses.putArrayDatatype(name+"@"+Status.getFunction(), datatype);
			
			CommonAction.comboOperations(temp, actual,"Array declaration successful");
			CommonAction.showStatus();
			CommonAction.showHierarchy();
			removePanel3AllComponent();
			CommonAction.enableAllPanel2Button();
			UndoWorking.addItem(temp, "arrayDeclare");
		}
		
	}
	public void saveFunction()
	{
		
		String datatype = jComboBoxdatatypes.getItemAt(jComboBoxdatatypes.getSelectedIndex()).toString();
		String name = jFieldFunctionName.getText().toString();
		String fullCode = CommonReference.getFullVersionCode();
		String variableList[] = CommonAction.getVariableNameAllFunction();
		String arrayList[] = CommonAction.getArrayNameAllFunction();
		if(name.equals(""))
		{
			CommonAction.showRedWarning("Please give function name");
		}
		else if(!(BasicOperations.variableNameCheck(name, variableList, arrayList, usedFunctionList)))
		{
			jFieldFunctionName.setText("");
		}
		else
		{
			String prototype = datatype+" "+name+"() ;";
			String temp = datatype+" "+name+"(){}"; // so i can use name+(){ to detect my function name
			
			String part1 = fullCode.substring(0,fullCode.lastIndexOf(".h>")+3);
			String part2 = fullCode.substring(fullCode.lastIndexOf(".h>")+3,fullCode.length());
			
			String actual = part1+prototype+part2;
			
			int i1 = actual.indexOf("{");
			String p1 = actual.substring(0,i1);
			String p2 = actual.substring(i1,actual.length());
			
		
			int i2 = p1.lastIndexOf(";");
			String pp1 = p1.substring(0,i2+1);
			String pp2 = p1.substring(i2+1,p1.length());
			actual = pp1+temp+pp2+p2;
			
			MapClasses.putFunction(name, datatype);
			Status.setFunction(name);
			CommonAction.showStatus();
			CommonAction.showHierarchy();
			
			// do formatting for temp and actual
			CommonAction.comboOperations(prototype+temp, actual, "Function declaration successful");
			removePanel3AllComponent();
			CommonAction.enableAllPanel2Button();
			UndoWorking.addItem(prototype+temp, "functionDeclare");
			
			
		}
	
		
	}
}