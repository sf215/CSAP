package BasicGui;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.text.Style;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledDocument;
import java.util.*;

public class Initialize implements ActionListener {
	
	/* intro:
	 * Variables-1 combobox to select declared variables,1 text box to show initial value,1 text box   
	 * to input new value from user
	 * Array-1 combobox to select declared arrays,1 text box to show size of array,1 text box to enter
	 * elements of array,1 text field to display all entered elements,1 save button to save the element
	 * in array,this button will disable and stop taking input after array size is full(eg array size=5
	 * then button will be disabled after clicking 5 times)
	 * */
	
	
	private JPanel panel3 = CommonReference.getPanel3();
	

	
	// Common for both part
	private JLabel jLabelAll;
	private JLabel jLabelRadioVariables;
	private JLabel jLabelRadioArray;
	private JRadioButton jRadioVariable;
	private JRadioButton jRadioArray;
	//
	
	private ButtonGroup jButtonGroup;
	
	//Variable part
	private JLabel jLabelSelectVariable ;
	private JComboBox<String> jComboVariables;
	//JLabel jLabelValue;
	//JTextField jFieldValue;
	private JLabel jLabelnewValue;
	private JTextField jFieldnewValue;
	private JButton jButtonSaveVariable;
	
	//
	
	
	//array part
	private JLabel jLabelSelectArray;
	private JComboBox<String> jComboArray;
	private JLabel jLabelsize;
	private JTextField jFieldsize;
	private JLabel jLabelElement;
	private JTextField jFieldElement;
	private JButton jButtonElement;
	private JButton jButtonSaveArray;
	private JTextPane jTextAreaEnteredElement;
	private JScrollPane jTextAreaEnteredElementScrollBar;
	
	//
	
	private String [] variableName = CommonAction.getVariableNameCurrentFunction();
	
	private String [] variableDatatype = CommonAction.getVariableDataTypeCurrentFunction();
	
	private String[] arrayName = CommonAction.getArrayNameCurrentFunction();
	private String[] arraySize = CommonAction.getArraySizeCurrentFunction();
	private String [] arrayDatatype = CommonAction.getArrayDataTypeCurrentFunction();
 	
	
	public  void comboForVariables() {
		
		jComboVariables =  new JComboBox<String>(variableName);
		
	 }
	
	public void comboForArray() {
		
		final ArrayList<String> sizeList = new ArrayList<String>(Arrays.asList(arrayName));
		  
		jComboArray =  new JComboBox<String>(arrayName);
		if(arraySize.length>0)
		{
			jFieldsize.setText(arraySize[0]);
		}
		jComboArray.addActionListener(new ActionListener() {

				public void actionPerformed(ActionEvent e) {
					JComboBox<?> jcmbType = (JComboBox<?>) e.getSource();
					 String v=arraySize[sizeList.indexOf(jcmbType.getSelectedItem())];
			  		jFieldsize.setText(v);  
					
				}
			});
	}
	
	public void showElements() {
		
		jButtonElement.addActionListener(new ActionListener() {
			 int clicks=0;			
			public void actionPerformed(ActionEvent e) {
				
				String text = jFieldElement.getText();
				ArrayList<String> s = new ArrayList<String>(Arrays.asList(arrayName));
				String datatype = arrayDatatype[s.indexOf(jComboArray.getSelectedItem())];
				
				if(text.equals(""))
				{
					CommonAction.showRedWarning("Provide value to insert");
				}
				else if(!BasicOperations.valueCheck(datatype, text))
				{
					
				}
				else
				{
					int size=Integer.parseInt(jFieldsize.getText());
					clicks++;
					if(clicks>=size) {
						jButtonElement.setEnabled(false);
					}
					String element=jFieldElement.getText();
					
					StyledDocument doc = jTextAreaEnteredElement.getStyledDocument();
			        Style style = jTextAreaEnteredElement.addStyle("I'm a Style", null);

			        if(clicks==1)
					try {
						StyleConstants.setForeground(style, Color.magenta);
						doc.insertString(doc.getLength(),element , style);
						jFieldElement.setText("");
					}
					catch(Exception i){}
					/*if(clicks==1)
						jTextAreaEnteredElement.append(element);*/
					else{
					
						try{
							StyleConstants.setForeground(style, Color.magenta);
							doc.insertString(doc.getLength(), " , "+element, style);
						}
						catch(Exception j){}
						//jTextAreaEnteredElement.append(" , "+element);
					jFieldElement.setText("");
					}
					
				}
			}
			});
		}

	public void initialisationALLComponent()
	{
	//variables
		jLabelSelectVariable = new JLabel("Declared Variables");
		
		jLabelSelectVariable.setForeground(new Color(222,222,222));
		
		comboForVariables();
		jLabelnewValue=new JLabel("New value");
		jFieldnewValue=new JTextField();
		jButtonSaveVariable = new JButton("Declare value");
		
		
		jLabelnewValue.setForeground(new Color(222,222,222));
		
		jButtonSaveVariable.setEnabled(false);
		
	//Array
		jLabelSelectArray=new JLabel("Declared Arrays");
		jLabelsize=new JLabel("Size");
		jFieldsize=new JTextField();
		jTextAreaEnteredElement=new JTextPane();
		jTextAreaEnteredElement.setBackground( Color.DARK_GRAY);
		jTextAreaEnteredElementScrollBar = new JScrollPane(jTextAreaEnteredElement,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		comboForArray();
		jLabelElement=new JLabel("Enter element");
		jFieldElement=new JTextField();
		jButtonElement=new JButton("Save Element");
		showElements();
		jButtonSaveArray=new JButton("Declare Array");
		jButtonSaveArray.setEnabled(false);
		
		jLabelSelectArray.setForeground(new Color(222,222,222));
		jLabelsize.setForeground(new Color(222,222,222));
		jLabelElement.setForeground(new Color(222,222,222));
		
		jFieldsize.setEditable(false);
		jTextAreaEnteredElement.setEditable(false);
		
		jButtonSaveVariable.addActionListener(this);
		jButtonSaveArray.addActionListener(this);
		
		jFieldnewValue.getDocument().addDocumentListener(dl);
		jTextAreaEnteredElement.getDocument().addDocumentListener(dl);
		
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
		if(jFieldnewValue.getText().equals("") || jFieldnewValue.getText().equals(null)) {
			
			jButtonSaveVariable.setEnabled(false);
		}
		else {
			jButtonSaveVariable.setEnabled(true);
		}
      if(jTextAreaEnteredElement.getText().equals("") || jTextAreaEnteredElement.getText().equals(null)) {
			
    	  jButtonSaveArray.setEnabled(false);
		}
		else {
			jButtonSaveArray.setEnabled(true);
		}
	}
	
	Initialize()
	{
		panel3.setLayout(null);
		
		if(variableName.length>0&&arrayName.length==0)
		{
			CommonAction.disableAllPanel2Button();
			initialisationALLComponent(); 
			changeUI();
			variableClick();
			jRadioArray.setEnabled(false);
			jRadioVariable.setSelected(true);
			CommonAction.showRedWarning("No array exist to initialise");
		}
		else if(arrayName.length>0&&variableName.length==0)
		{
			CommonAction.disableAllPanel2Button();
			initialisationALLComponent(); 
			changeUI();
			arrayClick();
			jRadioVariable.setEnabled(false);
			jRadioArray.setSelected(true);
			CommonAction.showRedWarning("No variable to initialise");
		}
		else if(arrayName.length>0&&variableName.length>0)
		{
			CommonAction.disableAllPanel2Button();
			initialisationALLComponent(); 
			changeUI();
			jRadioVariable.setSelected(true);
			variableClick();
		}
		else
		{
			CommonAction.showRedWarning("No array and vairable exist to initialize");
		}
		panel3.revalidate();
		panel3.repaint();
		
	}
	
	
	
	void changeUI()
	{
		jRadioVariable = new JRadioButton("Variables");
		jRadioArray = new JRadioButton("Array");
		
		jRadioVariable.setBackground(new Color(80,80,80));
		jRadioArray.setBackground(new Color(80,80,80));
		
		jLabelAll = new JLabel("Please select from these");
		jLabelRadioVariables = new JLabel("Variables");
		jLabelRadioArray = new JLabel("Array");
		
		jLabelAll.setForeground(new Color(222,222,222));
		jLabelRadioVariables.setForeground(new Color(222,222,222));
		jLabelRadioArray.setForeground(new Color(222,222,222));
		
		jButtonGroup = new ButtonGroup();
		jButtonGroup.add(jRadioVariable);
		jButtonGroup.add(jRadioArray);
		
		jLabelAll.setBounds(20,20,200,20);
		
		jRadioVariable.setBounds(20,60,20,20);
		jLabelRadioVariables.setBounds(50, 60, 80, 20);
		
		jRadioArray.setBounds(20,100,20,20);
		jLabelRadioArray.setBounds(50, 100, 80, 20);
		
		panel3.add(jLabelAll);
		panel3.add(jRadioVariable);
		panel3.add(jRadioArray);
		panel3.add(jLabelRadioArray);
		panel3.add(jLabelRadioVariables);
		panel3.repaint();
		
		
		
		jRadioVariable.addActionListener(this);
		jRadioArray.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==jRadioVariable)
		{
			variableClick();
		}
		
    	if(e.getSource()==jRadioArray)
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
		
		
	}
	public void variableClick() {
		panel3.remove(jLabelSelectArray);
		panel3.remove(jComboArray);
		panel3.remove(jLabelsize);
		panel3.remove(jFieldsize);
		panel3.remove(jLabelElement);
		panel3.remove(jFieldElement);
		panel3.remove(jButtonElement);
		panel3.remove(jTextAreaEnteredElementScrollBar);
		panel3.remove(jButtonSaveArray);
		
		jLabelSelectVariable.setBounds(500, 60, 120, 30);
		jComboVariables.setBounds(500, 120, 120, 30);
		
		jLabelnewValue.setBounds(670,60,100,30);
		jFieldnewValue.setBounds(670,120,120,30);
		jButtonSaveVariable.setBounds(840,120,160,30);
		
		
		panel3.add(jLabelSelectVariable);
		panel3.add(jComboVariables);
		
		panel3.add(jLabelnewValue);
		panel3.add(jFieldnewValue);
		panel3.add(jButtonSaveVariable);
		panel3.repaint();
	}
	
	public void arrayClick() {
		panel3.remove(jLabelSelectVariable);
		panel3.remove(jComboVariables);
		
		panel3.remove(jLabelnewValue);
		panel3.remove(jFieldnewValue);
		panel3.remove(jButtonSaveVariable);
		
		
		jLabelSelectArray.setBounds(500, 60, 100, 30);
		jComboArray.setBounds(500, 120, 120, 30);
		jLabelsize.setBounds(640,60,100,30);
		jFieldsize.setBounds(640,120,120,30);
		jLabelElement.setBounds(780,60,100,30);
		jFieldElement.setBounds(780,120,120,30);
		jTextAreaEnteredElementScrollBar.setBounds(950,70,150,100);
		jButtonElement.setBounds(1150,80,160, 30);
		jButtonSaveArray.setBounds(1150,130,160,30);
		
		panel3.add(jLabelSelectArray);
		panel3.add(jComboArray);
		panel3.add(jLabelsize);
		panel3.add(jFieldsize);
		panel3.add(jLabelElement);
		panel3.add(jFieldElement);
		panel3.add(jTextAreaEnteredElementScrollBar);
		panel3.add(jButtonElement);
		panel3.add(jButtonSaveArray);
		panel3.revalidate();
		panel3.repaint();
		
		
	}
	
	void removePanel3AllComponent()
	{
		//variables
		panel3.remove(jLabelSelectVariable);
		panel3.remove(jComboVariables);
	
		panel3.remove(jLabelnewValue);
		panel3.remove(jFieldnewValue);
		panel3.remove(jButtonSaveVariable);
		
		//function
		panel3.remove(jLabelSelectArray);
		panel3.remove(jComboArray);
		panel3.remove(jLabelsize);
		panel3.remove(jFieldsize);
		panel3.remove(jLabelElement);
		panel3.remove(jFieldElement);
		panel3.remove(jButtonElement);
		panel3.remove(jTextAreaEnteredElementScrollBar);
		panel3.remove(jButtonSaveArray);
		
		//common
		panel3.remove(jRadioVariable);
		panel3.remove(jRadioArray);
		panel3.remove(jLabelAll);
		panel3.remove(jLabelRadioArray);
		panel3.remove(jLabelRadioVariables);
		panel3.repaint();
	}
	
	public void saveVariable()
	{
	
		String name = jComboVariables.getItemAt(jComboVariables.getSelectedIndex()).toString();
		String value = jFieldnewValue.getText().toString();
		String function = Status.getFunction();
		String fullCode = CommonReference.getFullVersionCode();
		int index = CommonAction.funcEnd(fullCode,function);
		String datatype = "";
		
		ArrayList<String> s = new ArrayList<String>(Arrays.asList(variableName));
		datatype = variableDatatype[s.indexOf(name)];
		if(value.equals(""))
		{
			CommonAction.showRedWarning("Please insert proper value");
		}
		else if(!(BasicOperations.valueCheck(datatype, value)))
		{
			jFieldnewValue.setText("");
		}
		else
		{
			value = BasicOperations.valueModify(datatype, value);
			String temp = name+" = "+value+" ;";
			String part1 = fullCode.substring(0,index);
			String part2 = fullCode.substring(index,fullCode.length());
			String actual = part1+temp+part2;
			
		
			
			CommonAction.comboOperations(temp, actual, "Variable initialisation successful");
			removePanel3AllComponent();
			CommonAction.enableAllPanel2Button();
			UndoWorking.addItem(temp, "normal");
		}
		
	}
	
	
	public void saveArray() {
	
		String name = jComboArray.getItemAt(jComboArray.getSelectedIndex()).toString();
		String allValues = jTextAreaEnteredElement.getText(); 
		String function = Status.getFunction();
		String fullCode = CommonReference.getFullVersionCode();
		int index = CommonAction.funcEnd(fullCode,function);
		
		
		
		ArrayList<String> s = new ArrayList<String>(Arrays.asList(arrayName));
		String datatype = arrayDatatype[s.indexOf(name)];
		
		if(allValues.equals(""))
		{
			CommonAction.showRedWarning("Please provide value to insert");
		}
		
		else
		{
			
			String []values = allValues.split(","); // array contain all values
			int enteredLength = values.length;
			
		
			
			for(int i=0;i<values.length;i++)
				values[i] = values[i].trim();
			
	
				for(int i=0;i<values.length;i++)
				{
					values[i]  = BasicOperations.valueModify(datatype, values[i]);
				}
				
				String temp = "";
			
				for(int i=0;i<enteredLength;i++)
				{
					temp+= name+"[" +i+ "] = " + values[i] +" ;"; 
				}
				
		
				fullCode = CommonReference.getFullVersionCode(); // As full code change ho gya ab
				index = CommonAction.funcEnd(fullCode,function);
				String part1 = fullCode.substring(0,index);
				String part2 = fullCode.substring(index,fullCode.length());
				String actual = part1+temp+part2;
					
				CommonAction.comboOperations(temp,actual, "Array initilisation successful");
				
				removePanel3AllComponent();
				CommonAction.enableAllPanel2Button();
				UndoWorking.addItem(temp,"arrayInitialise");
	
		}
	}
	

}
