package BasicGui;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Set;
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

public class Operations implements ActionListener {
	/* 
	 * 4 type k operation hai,arithmetic,relational,bitwise,assignment
	 * har type k operation k liye-1 combobox to select variable,1 combobox to select operator,
	 * 1 text field to show syntax after clicking "ok" button
	 *  */

	private JPanel  panel3 = CommonReference.getPanel3();
	
	private static HashMap<String,String> Arithmetic=Operators.getArithmetic();
	private static HashMap<String,String> Relational=Operators.getRelational();
	private static HashMap<String,String> Bitwise=Operators.getBitwise();
	private static HashMap<String,String> Assignment=Operators.getAssignment();
	
	//radio buttons for type of operations
	private JRadioButton jArithmetic ;
	private JRadioButton jRelational ;
	private JRadioButton jBitwise ;
	private JRadioButton jAssignment ;
	
	private JLabel jLabelall;
	private JLabel jLabelRadioArithmetic;
	private JLabel jLabelRadioRelational;
	private JLabel jLabelRadioBitwise;
	private JLabel jLabelRadioAssignment;
	
	private ButtonGroup jButtonGroup;
	//

	// Common for all
	private JComboBox<String> jComboBoxVariables;
	private JLabel jLabelVariables;
	
	private JComboBox<String> jComboBoxAssignedVariable;
	private JLabel jLabelAssignedVariable;
	
	private JLabel jLabelEqual;
	
	private JLabel jLabelConstant;
	private JTextField jFieldConstant;
	
	private JButton jButtonSelectAssignedVar;
    
	private ButtonGroup Alloperations;
	private JRadioButton variable;
	private JRadioButton operation;
	private JRadioButton constant;
    
	private JButton jButtonClear;
	
	private JLabel jShowSyntax;
	//
	
	//components for arithmetic
	private JLabel jLabelSelectArithmetic;
	private JComboBox<String> jComboBoxSelectArithmetic;
	private JButton jButtonSelectArithmetic;
	private JTextPane jTextAreaShowArithmetic;
	private JScrollPane jTextAreaShowArithmeticScrollBar;
	private JButton jButtonSubmitArithmetic;
	//
	
	//components for relational
	private JLabel jLabelSelectRelational;
	private JComboBox<String> jComboBoxSelectRelational;
	private JButton jButtonSelectRelational;
	private JTextPane jTextAreaShowRelational;
	private JScrollPane jTextAreaShowRelationalScrollBar;
	private JButton jButtonSubmitRelational;
	//
		
	//components for bitwise
	private JLabel jLabelSelectBitwise;
	private JComboBox<String> jComboBoxSelectBitwise;
	private JButton jButtonSelectBitwise;
	private JTextPane jTextAreaShowBitwise;
	private JScrollPane jTextAreaShowBitwiseScrollBar;
	private JButton jButtonSubmitBitwise;
	//
	
	//components for assignment
	private JLabel jLabelSelectAssignment;
	private JComboBox<String> jComboBoxSelectAssignment;
	private JButton jButtonSelectAssignment;
	private JTextPane jTextAreaShowAssignment;
	private JScrollPane jTextAreaShowAssignmentScrollBar;
	private JButton jButtonSubmitAssignment;
	//
	
	

	public void comboForArithmetic() {
		 Set<String> s= Arithmetic.keySet();
		 int n=Arithmetic.size();
		 String[] str = new String[n];
		 int i=0;
		   for(String st: s) {
			   str[i++]=st;
			   Arrays.toString(str);
		   }
		   jComboBoxSelectArithmetic=new JComboBox<String>(str);
		   jComboBoxSelectArithmetic.insertItemAt("", 0);
		   jComboBoxSelectArithmetic.setSelectedIndex(0);
	}
	public void comboForRelational() {
		 Set<String> s= Relational.keySet();
		 int n=Relational.size();
		 String[] str = new String[n];
		 int i=0;
		   for(String st: s) {
			   str[i++]=st;
			   Arrays.toString(str);
		   }
		   jComboBoxSelectRelational=new JComboBox<String>(str);
		   jComboBoxSelectRelational.insertItemAt("", 0);
		   jComboBoxSelectRelational.setSelectedIndex(0);
	}
	public void comboForBitwise() {
		 Set<String> s= Bitwise.keySet();
		 int n=Bitwise.size();
		 String[] str = new String[n];
	//	 String[] value = new String[n];
		 
		 int i=0;
		   for(String st: s) {
			   str[i++]=st;
			   Arrays.toString(str);
		   }
		   jComboBoxSelectBitwise=new JComboBox<String>(str);
		   jComboBoxSelectBitwise.insertItemAt("", 0);
		   jComboBoxSelectBitwise.setSelectedIndex(0);
	}
	public void comboForAssignment() {
		 Set<String> s= Assignment.keySet();
		 int n=Assignment.size();
		 String[] str = new String[n];
		 int i=0;
		   for(String st: s) {
			   str[i++]=st;
			   Arrays.toString(str);
		   }
		   jComboBoxSelectAssignment=new JComboBox<String>(str);
		   jComboBoxSelectAssignment.insertItemAt("", 0);
		   jComboBoxSelectAssignment.setSelectedIndex(0);
	}
	
	public void initialisationALLComponent()
	{
		//Common for all
		jLabelVariables=new JLabel("Select Variables");
		jComboBoxVariables =new JComboBox<String>(CommonAction.getVariableNameCurrentFunction());
		jComboBoxVariables.insertItemAt("", 0);
		jComboBoxVariables.setSelectedIndex(0);
		jButtonSelectAssignedVar=new JButton("Select");
		jButtonSelectAssignedVar.setEnabled(false);
		
		jLabelEqual=new JLabel("=");
		
		jLabelAssignedVariable=new JLabel("<html>Select Variable to<br/> Which Assign Operation</html>");
		jComboBoxAssignedVariable =new JComboBox<String>(CommonAction.getVariableNameCurrentFunction());
		jComboBoxAssignedVariable.insertItemAt("", 0);
		jComboBoxAssignedVariable.setSelectedIndex(0);
		
		jLabelConstant=new JLabel("<html>Add a Constant Here<html>");
		jFieldConstant=new JTextField();
		
		jShowSyntax = new JLabel("Syntax");
		jShowSyntax.setBounds(950,50,100,20);
		panel3.add(jShowSyntax);
		
		Alloperations=new ButtonGroup();
		variable=new JRadioButton();
		operation=new JRadioButton();
		constant=new JRadioButton();
		Alloperations.add(variable);
		Alloperations.add(operation);
		Alloperations.add(constant);
		
		variable.setBackground(new Color(80,80,80));
		operation.setBackground(new Color(80,80,80));
		constant.setBackground(new Color(80,80,80));
		
		jButtonClear=new JButton("Clear");
		
		//
		//components for arithmetic
		jLabelSelectArithmetic=new JLabel("Select operation");
		comboForArithmetic();
		jTextAreaShowArithmetic=new JTextPane();
		jTextAreaShowArithmetic.setBackground(Color.darkGray);
		jTextAreaShowArithmeticScrollBar = new JScrollPane(jTextAreaShowArithmetic,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		jButtonSelectArithmetic=new JButton("View");
		jButtonSelectArithmetic.setEnabled(false);
		jButtonSubmitArithmetic=new JButton("Submit");
		jButtonSubmitArithmetic.setEnabled(false);
		//
		//components for relational
		jLabelSelectRelational=new JLabel("Select operation");
		comboForRelational();
		jTextAreaShowRelational=new JTextPane();
		jTextAreaShowRelational.setBackground(Color.darkGray);
		jTextAreaShowRelationalScrollBar = new JScrollPane(jTextAreaShowRelational,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		jButtonSelectRelational=new JButton("View");
		jButtonSelectRelational.setEnabled(false);
		jButtonSubmitRelational=new JButton("Submit");
		jButtonSubmitRelational.setEnabled(false);
		//
		//components for bitwise
		jLabelSelectBitwise=new JLabel("Select operation");
		comboForBitwise();
		jTextAreaShowBitwise=new JTextPane();
		jTextAreaShowBitwise.setBackground(Color.darkGray);
		jTextAreaShowBitwiseScrollBar = new JScrollPane(jTextAreaShowBitwise,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		jButtonSelectBitwise=new JButton("View");
		jButtonSelectBitwise.setEnabled(false);
		jButtonSubmitBitwise=new JButton("Submit");
		jButtonSubmitBitwise.setEnabled(false);
		//
		//components for assignment
		jLabelSelectAssignment=new JLabel("Select operation");
		comboForAssignment();
		jTextAreaShowAssignment=new JTextPane();
		jTextAreaShowAssignment.setBackground(Color.darkGray);
		jTextAreaShowAssignmentScrollBar = new JScrollPane (jTextAreaShowAssignment,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		jButtonSelectAssignment=new JButton("View");
		jButtonSelectAssignment.setEnabled(false);
		jButtonSubmitAssignment=new JButton("Submit");
		jButtonSubmitAssignment.setEnabled(false);
		//
		
		
		variable.setSelected(true);
		selectVariable();
		
		jComboBoxVariables.addActionListener(this);
		jComboBoxSelectArithmetic.addActionListener(this);
		jComboBoxSelectBitwise.addActionListener(this);
		jComboBoxSelectRelational.addActionListener(this);
		jComboBoxSelectAssignment.addActionListener(this);
		
		jComboBoxAssignedVariable.addActionListener(this);
		
		jButtonSelectArithmetic.addActionListener(this);
		jButtonSubmitArithmetic.addActionListener(this);
		
		jButtonSelectRelational.addActionListener(this);
		jButtonSubmitRelational.addActionListener(this);
		
		jButtonSelectBitwise.addActionListener(this);
		jButtonSubmitBitwise.addActionListener(this);
		
		jButtonSelectAssignment.addActionListener(this);
		jButtonSubmitAssignment.addActionListener(this);
		
		jButtonSelectAssignedVar.addActionListener(this);
		
		variable.addActionListener(this);
		operation.addActionListener(this);
		constant.addActionListener(this);
		jFieldConstant.getDocument().addDocumentListener(dl);
		jTextAreaShowAssignment.getDocument().addDocumentListener(dl);
		jTextAreaShowRelational.getDocument().addDocumentListener(dl);
		jTextAreaShowBitwise.getDocument().addDocumentListener(dl);
		jTextAreaShowArithmetic.getDocument().addDocumentListener(dl);
		
		jButtonClear.addActionListener(this);
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
		if(jFieldConstant.getText().equals("") && constant.isSelected()) {
			 jButtonSelectArithmetic.setEnabled(false);
			 jButtonSelectRelational.setEnabled(false);
			 jButtonSelectBitwise.setEnabled(false);
			 jButtonSelectAssignment.setEnabled(false);
			 
		 }
		 else {
			 jButtonSelectArithmetic.setEnabled(true);
			 jButtonSelectRelational.setEnabled(true);
			 jButtonSelectBitwise.setEnabled(true);
			 jButtonSelectAssignment.setEnabled(true);
		 }
		if(jTextAreaShowAssignment.getText().equals("")) {
			jButtonSubmitAssignment.setEnabled(false);
		}
		else {
			jButtonSubmitAssignment.setEnabled(true);
		}
		if(jTextAreaShowBitwise.getText().equals("")) {
			jButtonSubmitBitwise.setEnabled(false);
		}
		else {
			jButtonSubmitBitwise.setEnabled(true);
		}
		if(jTextAreaShowRelational.getText().equals("")) {
			jButtonSubmitRelational.setEnabled(false);
		}
		else {
			jButtonSubmitRelational.setEnabled(true);
		}
		if(jTextAreaShowArithmetic.getText().equals("")) {
			jButtonSubmitArithmetic.setEnabled(false);
		}
		else {
			jButtonSubmitArithmetic.setEnabled(true);
		}
	}
	
	Operations()
	{
		panel3.setLayout(null);
		CommonAction.disableAllPanel2Button();
		initialisationALLComponent(); 
		changeUI();
	}
	
	void changeUI()
	{
		
		jArithmetic = new JRadioButton("Arithmetic");
		jRelational = new JRadioButton("Relational");
		jBitwise = new JRadioButton("Bitwise");
		jAssignment = new JRadioButton("Assignment");
		
		jArithmetic.setBackground(new Color(80,80,80));
		jRelational.setBackground(new Color(80,80,80));
		jBitwise.setBackground(new Color(80,80,80));
		jAssignment.setBackground(new Color(80,80,80));
		
		jLabelall = new JLabel("Select the type of Operation");
		jLabelRadioArithmetic = new JLabel("Arithmetic");
		jLabelRadioRelational = new JLabel("Relational");
		jLabelRadioBitwise = new JLabel("Bitwise");
		jLabelRadioAssignment = new JLabel("Assignment");
		
		jButtonGroup = new ButtonGroup();
		jButtonGroup.add(jArithmetic);
		jButtonGroup.add(jRelational);
		jButtonGroup.add(jBitwise);
		jButtonGroup.add(jAssignment);
		
		jLabelall.setBounds(20,20,200,20);
		
		jArithmetic.setBounds(20,60,20,20);
		jLabelRadioArithmetic.setBounds(50, 60, 80, 20);
		
		jRelational.setBounds(20,100,20,20);
		jLabelRadioRelational.setBounds(50, 100, 80, 20);
		
		jBitwise.setBounds(20,140,20,20);
		jLabelRadioBitwise.setBounds(50, 140, 80,20);
		
		jAssignment.setBounds(20,180,20,20);
		jLabelRadioAssignment.setBounds(50, 180, 80,20);
		
		jArithmetic.setSelected(true);
		ArithmeticClick();
		
		panel3.add(jLabelall);
		panel3.add(jArithmetic);
		panel3.add(jRelational);
		panel3.add(jBitwise);
		panel3.add(jAssignment);
		panel3.add(jLabelRadioArithmetic);
		panel3.add(jLabelRadioRelational);
		panel3.add(jLabelRadioBitwise);
		panel3.add(jLabelRadioAssignment);
		panel3.repaint();
			
		jArithmetic.addActionListener(this);
		jRelational.addActionListener(this);
		jBitwise.addActionListener(this);
		jAssignment.addActionListener(this);
	}
	
	
	

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==jComboBoxAssignedVariable)
		{
			disableSelect();
		}
		if(e.getSource()==jComboBoxVariables)
		{
			disableOk();
		}
		if(e.getSource()==jComboBoxSelectArithmetic)
		{
			disableOk();
		}
		if(e.getSource()==jComboBoxSelectBitwise)
		{
			disableOk();
		}
		if(e.getSource()==jComboBoxSelectRelational)
		{
			disableOk();
		}
		if(e.getSource()==jComboBoxSelectAssignment)
		{
			disableOk();
		}
		if(e.getSource()==jArithmetic)
		{
			ArithmeticClick();
		}
		if(e.getSource()==jRelational)
		{
			RelationalClick();
		}
		if(e.getSource()==jBitwise)
		{
			BitwiseClick();
		}
		if(e.getSource()==jAssignment)
		{
			AssignmentClick();
		}
		if(e.getSource()==variable)
		{
			selectVariable();
		}
		if(e.getSource()==operation)
		{
			selectOperation();
		}
		if(e.getSource()==constant)
		{
			selectConstant();
		}
		if(e.getSource()==jButtonSelectAssignedVar)
		{
			selectAssignedVar();
		}
		
		if(e.getSource()==jButtonSelectArithmetic)
		{
			okArithmetic();
		}
		if(e.getSource()==jButtonSelectRelational)
		{
			okRelational();
		}
		if(e.getSource()==jButtonSelectBitwise)
		{
			okBitwise();
		}
		if(e.getSource()==jButtonSelectAssignment)
		{
			okAssignment();
		}
		
		
		if(e.getSource()==jButtonSubmitArithmetic)
		{
			saveArithmetic();
		}
		if(e.getSource()==jButtonSubmitRelational)
		{
			saveRelational();
		}
		if(e.getSource()==jButtonSubmitBitwise)
		{
			saveBitwise();
		}
		if(e.getSource()==jButtonSubmitAssignment)
		{
			saveAssignment();
		}
		if(e.getSource()==jButtonClear)
		{
			Clear();
		}
		
	} 
	
	void disableSelect() {
		Object selectedVar = jComboBoxAssignedVariable.getSelectedItem();
		 if(selectedVar.toString().equals("")) {
			 jButtonSelectAssignedVar.setEnabled(false);
		 }
		 else {
			 jButtonSelectAssignedVar.setEnabled(true);
		 }
	}
	
	void disableOk() {
		Object selectedVar = jComboBoxVariables.getSelectedItem();
		if( variable.isSelected()) {
		 if(selectedVar.toString().equals("")) {
			 jButtonSelectArithmetic.setEnabled(false);
			 jButtonSelectRelational.setEnabled(false);
			 jButtonSelectBitwise.setEnabled(false);
			 jButtonSelectAssignment.setEnabled(false);
			 
		 }
		 else {
			 jButtonSelectArithmetic.setEnabled(true);
			 jButtonSelectRelational.setEnabled(true);
			 jButtonSelectBitwise.setEnabled(true);
			 jButtonSelectAssignment.setEnabled(true);
		 }
	}
		if( operation.isSelected()) {
			Object selectedOp1 = jComboBoxSelectArithmetic.getSelectedItem();
			Object selectedOp2 = jComboBoxSelectBitwise.getSelectedItem();
			Object selectedOp3 = jComboBoxSelectRelational.getSelectedItem();
			Object selectedOp4 = jComboBoxSelectAssignment.getSelectedItem();
			 if(selectedOp1.toString().equals("")) {
				 jButtonSelectArithmetic.setEnabled(false);
				 
			 }
			 else {
				 jButtonSelectArithmetic.setEnabled(true);
		
			 }
			 if(selectedOp2.toString().equals("")) {
				
				 jButtonSelectBitwise.setEnabled(false);
				 
			 }
			 else {
			
				 jButtonSelectBitwise.setEnabled(true);
				
			 }
			 if(selectedOp3.toString().equals("")) {
				
				 jButtonSelectRelational.setEnabled(false);
			
			 }
			 else {
				
				 jButtonSelectRelational.setEnabled(true);
			
			 }
			 if(selectedOp4.toString().equals("")) {
					
				 jButtonSelectAssignment.setEnabled(false);
			
			 }
			 else {
				
				 jButtonSelectAssignment.setEnabled(true);
			
			 }
		}
	}
	
	public void ArithmeticClick() {
		
		variable.setSelected(true);
		selectVariable();
		Clear();
		
		//remove relational components
		panel3.remove(jLabelSelectRelational);
		panel3.remove(jComboBoxSelectRelational);
		panel3.remove(jButtonSelectRelational);
		panel3.remove(jTextAreaShowRelational);
		panel3.remove(jButtonSubmitRelational);
		//
		//remove bitwise components
		panel3.remove(jLabelSelectBitwise);
		panel3.remove(jComboBoxSelectBitwise);
		panel3.remove(jButtonSelectBitwise);
		panel3.remove(jTextAreaShowBitwise);
		panel3.remove(jButtonSubmitBitwise);
		//
		//remove assignment components
		panel3.remove(jLabelSelectAssignment);
		panel3.remove(jComboBoxSelectAssignment);
		panel3.remove(jButtonSelectAssignment);
		panel3.remove(jTextAreaShowAssignment);
		panel3.remove(jButtonSubmitAssignment);
		//
		
		//set bounds
		jLabelAssignedVariable.setBounds(200, 30, 120, 100);
		jComboBoxAssignedVariable.setBounds(200, 120, 100, 30);
		jButtonSelectAssignedVar.setBounds(200, 160, 100, 30);
		jLabelEqual.setBounds(310,110,50,50);
		jLabelVariables.setBounds(350, 60, 100, 30);
		variable.setBounds(390,90,50,10);
		jComboBoxVariables.setBounds(350, 120, 100, 30);		
		jLabelSelectArithmetic.setBounds(500,60,100,30);
		operation.setBounds(550,90,50,10);
		jComboBoxSelectArithmetic.setBounds(500,120,120,30);
		jLabelConstant.setBounds(660,60,100,30);
		constant.setBounds(710,90,50,10);
		jFieldConstant.setBounds(660,120,120,30);
		jTextAreaShowArithmeticScrollBar.setBounds(950,70,170,100);
		jButtonSelectArithmetic.setBounds(800, 120, 100, 30);
		jButtonSubmitArithmetic.setBounds(1150,90,150,30);
		jButtonClear.setBounds(1150,130,150,30);
		
		//
		
		//add to panel
		panel3.add(variable);
		panel3.add(operation);
		panel3.add(constant);
		panel3.add(jLabelAssignedVariable);
		panel3.add(jLabelEqual);
		panel3.add(jComboBoxAssignedVariable);
		panel3.add(jButtonSelectAssignedVar);
		panel3.add(jLabelVariables);
		panel3.add(jComboBoxVariables);
		panel3.add(jLabelSelectArithmetic);
		panel3.add(jComboBoxSelectArithmetic);
		panel3.add(jLabelConstant);
		panel3.add(jFieldConstant);
		panel3.add(jTextAreaShowArithmeticScrollBar);
		panel3.add(jButtonSelectArithmetic);
		panel3.add(jButtonSubmitArithmetic);
		panel3.add(jButtonClear);
		panel3.repaint();
		//
	}
	
	public void RelationalClick() {
		
		variable.setSelected(true);
		selectVariable();
		Clear();
		
		//remove aritmetic components
				panel3.remove(jLabelSelectArithmetic);
				panel3.remove(jComboBoxSelectArithmetic);
				panel3.remove(jButtonSelectArithmetic);
				panel3.remove(jTextAreaShowArithmetic);
				panel3.remove(jButtonSubmitArithmetic);
				//
				//remove bitwise components
				panel3.remove(jLabelSelectBitwise);
				panel3.remove(jComboBoxSelectBitwise);
				panel3.remove(jButtonSelectBitwise);
				panel3.remove(jTextAreaShowBitwise);
				panel3.remove(jButtonSubmitBitwise);
				//
				//remove assignment components
				panel3.remove(jLabelSelectAssignment);
				panel3.remove(jComboBoxSelectAssignment);
				panel3.remove(jButtonSelectAssignment);
				panel3.remove(jTextAreaShowAssignment);
				panel3.remove(jButtonSubmitAssignment);
				//
				
				//set bounds
				jLabelAssignedVariable.setBounds(200, 30, 120, 100);
				jComboBoxAssignedVariable.setBounds(200, 120, 100, 30);
				jButtonSelectAssignedVar.setBounds(200, 160, 100, 30);
				jLabelEqual.setBounds(310,110,50,50);
				jLabelVariables.setBounds(350, 60, 100, 30);
				variable.setBounds(390,90,50,10);
				jComboBoxVariables.setBounds(350, 120, 100, 30);
				jLabelSelectRelational.setBounds(500,60,100,30);
				operation.setBounds(550,90,50,10);
				jComboBoxSelectRelational.setBounds(500,120,120,30);
				jLabelConstant.setBounds(660,60,100,30);
				constant.setBounds(710,90,50,10);
				jFieldConstant.setBounds(660,120,120,30);
				jTextAreaShowRelationalScrollBar.setBounds(950,70,170,100);
				jButtonSelectRelational.setBounds(800, 120, 100, 30);
				jButtonSubmitRelational.setBounds(1150,90,150,30);
				jButtonClear.setBounds(1150,130,150,30);
				//
				
				//add to panel
				panel3.add(variable);
				panel3.add(operation);
				panel3.add(constant);
				panel3.add(jLabelAssignedVariable);
				panel3.add(jLabelEqual);
				panel3.add(jComboBoxAssignedVariable);
				panel3.add(jButtonSelectAssignedVar);
				panel3.add(jLabelVariables);
				panel3.add(jComboBoxVariables);
				panel3.add(jLabelSelectRelational);
				panel3.add(jComboBoxSelectRelational);
				panel3.add(jLabelConstant);
				panel3.add(jFieldConstant);
				panel3.add(jTextAreaShowRelationalScrollBar);
				panel3.add(jButtonSelectRelational);
				panel3.add(jButtonSubmitRelational);
				panel3.add(jButtonClear);
				panel3.revalidate();
				panel3.repaint();
				//
		
	}
	
	public void BitwiseClick() {
		
		variable.setSelected(true);
		selectVariable();
		Clear();
		
		//remove relational components
				panel3.remove(jLabelSelectRelational);
				panel3.remove(jComboBoxSelectRelational);
				panel3.remove(jButtonSelectRelational);
				panel3.remove(jTextAreaShowRelational);
				panel3.remove(jButtonSubmitRelational);
				//
				//remove arithmetic components
				panel3.remove(jLabelSelectArithmetic);
				panel3.remove(jComboBoxSelectArithmetic);
				panel3.remove(jButtonSelectArithmetic);
				panel3.remove(jTextAreaShowArithmetic);
				panel3.remove(jButtonSubmitArithmetic);
				//
				//remove assignment components
				panel3.remove(jLabelSelectAssignment);
				panel3.remove(jComboBoxSelectAssignment);
				panel3.remove(jButtonSelectAssignment);
				panel3.remove(jTextAreaShowAssignment);
				panel3.remove(jButtonSubmitAssignment);
				//
				
				//set bounds
				jLabelAssignedVariable.setBounds(200, 30, 120, 100);
				jComboBoxAssignedVariable.setBounds(200, 120, 100, 30);
				jButtonSelectAssignedVar.setBounds(200, 160, 100, 30);
				jLabelEqual.setBounds(310,110,50,50);
				jLabelVariables.setBounds(350, 60, 100, 30);
				variable.setBounds(390,90,50,10);
				jComboBoxVariables.setBounds(350, 120, 100, 30);
				jLabelSelectBitwise.setBounds(500,60,100,30);
				operation.setBounds(550,90,50,10);
				jComboBoxSelectBitwise.setBounds(500,120,120,30);
				jLabelConstant.setBounds(660,60,100,30);
				constant.setBounds(710,90,50,10);
				jFieldConstant.setBounds(660,120,120,30);
				jTextAreaShowBitwiseScrollBar.setBounds(950,70,170,100);
				jButtonSelectBitwise.setBounds(800, 120, 100, 30);
				jButtonSubmitBitwise.setBounds(1150,90,150,30);
				jButtonClear.setBounds(1150,130,150,30);
				//
				
				//add to panel
				panel3.add(variable);
				panel3.add(operation);
				panel3.add(constant);
				panel3.add(jLabelAssignedVariable);
				panel3.add(jLabelEqual);
				panel3.add(jComboBoxAssignedVariable);
				panel3.add(jButtonSelectAssignedVar);
				panel3.add(jLabelVariables);
				panel3.add(jComboBoxVariables);
				panel3.add(jLabelSelectBitwise);
				panel3.add(jComboBoxSelectBitwise);
				panel3.add(jLabelConstant);
				panel3.add(jFieldConstant);
				panel3.add(jTextAreaShowBitwiseScrollBar);
				panel3.add(jButtonSelectBitwise);
				panel3.add(jButtonSubmitBitwise);
				panel3.add(jButtonClear);
				panel3.revalidate();
				panel3.repaint();
				//
	}
	public void AssignmentClick() {
		
		variable.setSelected(true);
		selectVariable();
		Clear();
		
		panel3.remove(jLabelAssignedVariable);
		panel3.remove(jComboBoxAssignedVariable);
		panel3.remove(jLabelEqual);
		panel3.remove(jButtonSelectAssignedVar);
		//remove relational components
				panel3.remove(jLabelSelectRelational);
				panel3.remove(jComboBoxSelectRelational);
				panel3.remove(jButtonSelectRelational);
				panel3.remove(jTextAreaShowRelational);
				panel3.remove(jButtonSubmitRelational);
				//
				//remove bitwise components
				panel3.remove(jLabelSelectBitwise);
				panel3.remove(jComboBoxSelectBitwise);
				panel3.remove(jButtonSelectBitwise);
				panel3.remove(jTextAreaShowBitwise);
				panel3.remove(jButtonSubmitBitwise);
				//
				//remove arithmetic components
				panel3.remove(jLabelSelectArithmetic);
				panel3.remove(jComboBoxSelectArithmetic);
				panel3.remove(jButtonSelectArithmetic);
				panel3.remove(jTextAreaShowArithmetic);
				panel3.remove(jButtonSubmitArithmetic);
				//
				
				//set bounds
				jLabelVariables.setBounds(350, 60, 100, 30);
				variable.setBounds(390,90,50,10);
				jComboBoxVariables.setBounds(350, 120, 100, 30);
				jLabelSelectAssignment.setBounds(500,60,100,30);
				operation.setBounds(550,90,50,10);
				jComboBoxSelectAssignment.setBounds(500,120,120,30);
				jLabelConstant.setBounds(660,60,100,30);
				constant.setBounds(710,90,50,10);
				jFieldConstant.setBounds(660,120,120,30);
				jTextAreaShowAssignmentScrollBar.setBounds(950,70,170,100);
				jButtonSelectAssignment.setBounds(800, 120, 100, 30);
				jButtonSubmitAssignment.setBounds(1150,90,150,30);
				jButtonClear.setBounds(1150,130,150,30);
				//
				
				//add to panel
				panel3.add(variable);
				panel3.add(operation);
				panel3.add(constant);
				panel3.add(jLabelVariables);
				panel3.add(jComboBoxVariables);
				panel3.add(jLabelSelectAssignment);
				panel3.add(jComboBoxSelectAssignment);
				panel3.add(jLabelConstant);
				panel3.add(jFieldConstant);
				panel3.add(jTextAreaShowAssignmentScrollBar);
				panel3.add(jButtonSelectAssignment);
				panel3.add(jButtonSubmitAssignment);
				panel3.add(jButtonClear);
				panel3.revalidate();
				panel3.repaint();
				//		
	}
	
	
	public void removePanel3AllComponent() {
		panel3.remove(jLabelVariables);
		panel3.remove(jComboBoxVariables);
		panel3.remove(jLabelAssignedVariable);
		panel3.remove(jComboBoxAssignedVariable);
		panel3.remove(jLabelEqual);
		panel3.remove(jLabelConstant);
		panel3.remove(jFieldConstant);
		panel3.remove(jButtonSelectAssignedVar);
		panel3.remove(variable);
		panel3.remove(operation);
		panel3.remove(constant);
		panel3.remove(jButtonClear);
		panel3.remove(jShowSyntax);
		//arithmetic
		panel3.remove(jLabelSelectArithmetic);
		panel3.remove(jComboBoxSelectArithmetic);
		panel3.remove(jButtonSelectArithmetic);
		panel3.remove(jTextAreaShowArithmeticScrollBar);
		panel3.remove(jButtonSubmitArithmetic);
		//
		//relational
		panel3.remove(jLabelSelectRelational);
		panel3.remove(jComboBoxSelectRelational);
		panel3.remove(jButtonSelectRelational);
		panel3.remove(jTextAreaShowRelationalScrollBar);
		panel3.remove(jButtonSubmitRelational);
		//
       //bitwise
		panel3.remove(jLabelSelectBitwise);
		panel3.remove(jComboBoxSelectBitwise);
		panel3.remove(jButtonSelectBitwise);
		panel3.remove(jTextAreaShowBitwiseScrollBar);
		panel3.remove(jButtonSubmitBitwise);
		//
		//assignment
		panel3.remove(jLabelSelectAssignment);
		panel3.remove(jComboBoxSelectAssignment);
		panel3.remove(jButtonSelectAssignment);
		panel3.remove(jTextAreaShowAssignmentScrollBar);
		panel3.remove(jButtonSubmitAssignment);
		//
		panel3.remove(jLabelall);
		panel3.remove(jArithmetic);
		panel3.remove(jLabelRadioArithmetic);
		panel3.remove(jRelational);
		panel3.remove(jLabelRadioRelational);
		panel3.remove(jBitwise);
		panel3.remove(jLabelRadioBitwise);
		panel3.remove(jAssignment);
		panel3.remove(jLabelRadioAssignment);
		
		
		panel3.revalidate();
		panel3.repaint();
		
	}
	
	public void selectAssignedVar() {
		
		
		jTextAreaShowArithmetic.setText("");
		jTextAreaShowRelational.setText("");
		jTextAreaShowBitwise.setText("");
		jTextAreaShowAssignment.setText("");
		
		String assigned=jComboBoxAssignedVariable.getSelectedItem().toString();	
		StyledDocument doc = jTextAreaShowArithmetic.getStyledDocument();
		Style style = doc.addStyle("I am Style",null);
		
		StyleConstants.setForeground(style,Color.magenta);
		try{
			doc.insertString(doc.getLength(), assigned+" = ", style);
		}			
		catch(Exception e){
			
		}
		StyledDocument doc1 = jTextAreaShowBitwise.getStyledDocument();
		Style style1 = doc.addStyle("I am Style",null);
		
		StyleConstants.setForeground(style1,Color.magenta);
		try{
			doc1.insertString(doc1.getLength(), assigned+" = ", style1);
		}
		catch(Exception e){
			
		}
		
		StyledDocument doc2 = jTextAreaShowRelational.getStyledDocument();
		Style style2 = doc.addStyle("I am Style",null);
		
		StyleConstants.setForeground(style2,Color.magenta);
		try{
			doc2.insertString(doc2.getLength(), assigned+" = ", style2);
		}
		catch(Exception e){
			
		}
		
		StyledDocument doc3 = jTextAreaShowAssignment.getStyledDocument();
		Style style3 = doc.addStyle("I am Style",null);
		
		StyleConstants.setForeground(style3,Color.magenta);
		try{
			doc3.insertString(doc3.getLength(), assigned+" = ", style3);
		}
		catch(Exception e){
			
		}
	//	jComboBoxAssignedVariable.setEnabled(false);
		
		
		//jTextAreaShowArithmetic.append(assigned+" = ");
		//jTextAreaShowBitwise.append(assigned+" = ");
		//jTextAreaShowRelational.append(assigned+" = ");
		//jTextAreaShowAssignment.append(assigned+" = ");
		
	}
	
	public void selectVariable() {
		jFieldConstant.setText("");
		jComboBoxSelectArithmetic.setSelectedIndex(0);
		jComboBoxSelectBitwise.setSelectedIndex(0);
		jComboBoxSelectRelational.setSelectedIndex(0);
		jComboBoxSelectAssignment.setSelectedIndex(0);
		
		jComboBoxVariables.setEnabled(true);
		jComboBoxSelectArithmetic.setEnabled(false);
		jComboBoxSelectBitwise.setEnabled(false);
		jComboBoxSelectRelational.setEnabled(false);
		jComboBoxSelectAssignment.setEnabled(false);
		jFieldConstant.setEnabled(false);
		
		
	}
	
	public void selectOperation() {
		jFieldConstant.setText("");
		jComboBoxVariables.setSelectedIndex(0);
		
		jComboBoxVariables.setEnabled(false);
		jComboBoxSelectArithmetic.setEnabled(true);
		jComboBoxSelectBitwise.setEnabled(true);
		jComboBoxSelectRelational.setEnabled(true);
		jComboBoxSelectAssignment.setEnabled(true);
		jFieldConstant.setEnabled(false);
		
		
	}
	
	public void selectConstant() {
		jComboBoxVariables.setSelectedIndex(0);
		jComboBoxSelectArithmetic.setSelectedIndex(0);
		jComboBoxSelectBitwise.setSelectedIndex(0);
		jComboBoxSelectRelational.setSelectedIndex(0);
		jComboBoxSelectAssignment.setSelectedIndex(0);
		
		jComboBoxVariables.setEnabled(false);
		jComboBoxSelectArithmetic.setEnabled(false);
		jComboBoxSelectBitwise.setEnabled(false);
		jComboBoxSelectRelational.setEnabled(false);
		jComboBoxSelectAssignment.setEnabled(false);
		jFieldConstant.setEnabled(true);
	}
	
	 boolean checkValue() {
			if(jFieldConstant.getText().equals("")) {
				return true;
			}
			else {
				String check=jFieldConstant.getText();
				 if(BasicOperations.valueCheck("int",check) || BasicOperations.valueCheck("float",check)) {
					 return true;				
				}
				else {
					return false;
				}
				}
			}
	
     public void okArithmetic() {
    	
		 //String var=usedVariables.get(jComboBoxVariables.getSelectedItem()); iise shiza se baat krke wapas lgana pd skta h
    	
    	 boolean b=checkValue();
 	    if(b) {
    	 
    	 String var= jComboBoxVariables.getSelectedItem().toString();
		 String op=Arithmetic.get(jComboBoxSelectArithmetic.getSelectedItem());
		 String cons=jFieldConstant.getText();
		 jComboBoxSelectArithmetic.setSelectedIndex(0);
		 jComboBoxVariables.setSelectedIndex(0);
		 jFieldConstant.setText("");
		 
		 StyledDocument doc = jTextAreaShowArithmetic.getStyledDocument();
		 Style style = doc.addStyle("I am Style",null);
		
		 StyleConstants.setForeground(style,Color.magenta);
		 try{
			if(variable.isSelected()) {
			doc.insertString(doc.getLength(), var, style);
			}
			if(operation.isSelected()) {
			doc.insertString(doc.getLength(), op, style);
			}
			if(constant.isSelected()) {
			doc.insertString(doc.getLength(), cons, style);
			}
	
		}
		catch(Exception e){
			
		}
	 
		// if(variable.isSelected()) {
			// jTextAreaShowArithmetic.append(var);
		 //}
		// if(operation.isSelected()) {
			// jTextAreaShowArithmetic.append(op);
		 //}
		 //if(constant.isSelected()) {
			// jTextAreaShowArithmetic.append(cons);
		 //}
 	    }
 	   else {
	    	jButtonSelectArithmetic.setEnabled(false);
			CommonAction.showRedWarning("Please select proper value for constant");
			jFieldConstant.setText("");
	    }
  		
	  }
     public void okRelational() {
		 //String var=usedVariables.get(jComboBoxVariables.getSelectedItem()); isse shiza se baat krke wapas lgana pd skta h
    	 boolean b=checkValue();
  	    if(b) {
    	 
    	 String var=jComboBoxVariables.getSelectedItem().toString();
		 String op=Relational.get(jComboBoxSelectRelational.getSelectedItem());
		 String cons=jFieldConstant.getText();
		 jComboBoxSelectRelational.setSelectedIndex(0);
		 jComboBoxVariables.setSelectedIndex(0);
		 jFieldConstant.setText("");
		 
		 StyledDocument doc = jTextAreaShowRelational.getStyledDocument();
		 Style style = doc.addStyle("I am Style",null);
		 
		 StyleConstants.setForeground(style,Color.magenta);
		 try{
			if(variable.isSelected()) {
				doc.insertString(doc.getLength(), var, style);
			}
			if(operation.isSelected()){
				doc.insertString(doc.getLength(), op, style);
			}
			if(constant.isSelected()) {
				doc.insertString(doc.getLength(), cons, style);
			}
		 }
		 catch(Exception e){
			 
		 }
		 
		 /*if(variable.isSelected()) {
			 jTextAreaShowRelational.append(var);
		 }
		 if(operation.isSelected()) {
			 jTextAreaShowRelational.append(op);
		 }
		 if(constant.isSelected()) {
			 jTextAreaShowRelational.append(cons);
		 }*/
		
  	    }
  	  else {
	    	jButtonSelectRelational.setEnabled(false);
			CommonAction.showRedWarning("Please select proper value for constant");
			jFieldConstant.setText("");
	    }
		
	  }
     public void okBitwise() {
		 //String var=usedVariables.get(jComboBoxVariables.getSelectedItem()); isse shiza se baat krke wapas lgana pd skta h
    	 
    	 boolean b=checkValue();
   	    if(b) {
    	 String var=jComboBoxVariables.getSelectedItem().toString();
    	 String op=Bitwise.get(jComboBoxSelectBitwise.getSelectedItem());
    	 String cons=jFieldConstant.getText();
		 jComboBoxSelectBitwise.setSelectedIndex(0);
		 jComboBoxVariables.setSelectedIndex(0);
		 jFieldConstant.setText("");
		 
		 StyledDocument doc = jTextAreaShowBitwise.getStyledDocument();
		 Style style = doc.addStyle("I am Style",null);
		 
		 StyleConstants.setForeground(style,Color.magenta);
		 try{
			if(variable.isSelected()) {
				doc.insertString(doc.getLength(), var, style);
			}
			if(operation.isSelected()){
				doc.insertString(doc.getLength(), op, style);
			}
			if(constant.isSelected()) {
				doc.insertString(doc.getLength(), cons, style);
			}
		 }
		 catch(Exception e){
			 
		 }
		 
		 
		/*if(variable.isSelected()) {
			 jTextAreaShowBitwise.append(var);
		 }
		 if(operation.isSelected()) {
			 jTextAreaShowBitwise.append(op);
		 }
		 if(constant.isSelected()) {
			 jTextAreaShowBitwise.append(cons);
		 }**/
		
   	    }
   	 else {
	    	jButtonSelectBitwise.setEnabled(false);
			CommonAction.showRedWarning("Please select proper value for constant");
			jFieldConstant.setText("");
	    }
	  }
     public void okAssignment() {
		 //String var=usedVariables.get(jComboBoxVariables.getSelectedItem()); isse shiza se baat krke wapas lgana pd skta h
    	 
    	 boolean b=checkValue();
    	    if(b) {
    	 String var=jComboBoxVariables.getSelectedItem().toString();
		 String op=Assignment.get(jComboBoxSelectAssignment.getSelectedItem());
		 String cons=jFieldConstant.getText();
		 jComboBoxSelectAssignment.setSelectedIndex(0);
		 jComboBoxVariables.setSelectedIndex(0);
		 jFieldConstant.setText("");
		 
		 
		 StyledDocument doc =  jTextAreaShowAssignment.getStyledDocument();
		 Style style = doc.addStyle("I am Style",null);
		 
		 StyleConstants.setForeground(style,Color.magenta);
		 try{
			if(variable.isSelected()) {
				doc.insertString(doc.getLength(), var, style);
			}
			if(operation.isSelected()){
				doc.insertString(doc.getLength(), op, style);
			}
			if(constant.isSelected()) {
				doc.insertString(doc.getLength(), cons, style);
			}
		 }
		 catch(Exception e){
			 
		 }
		 
		 /*if(variable.isSelected()) {
			 jTextAreaShowAssignment.append(var);
		 }
		 if(operation.isSelected()) {
			 jTextAreaShowAssignment.append(op);
		 }
		 if(constant.isSelected()) {
			 jTextAreaShowAssignment.append(cons);
		 }*/
    	    }
    	    else {
    	    	jButtonSelectAssignment.setEnabled(false);
    			CommonAction.showRedWarning("Please select proper value for constant");
    			jFieldConstant.setText("");
    	    }
	  }
     
     public void Clear(){
    	 jComboBoxVariables.setSelectedIndex(0);
    	 jFieldConstant.setText("");
 		 jComboBoxSelectArithmetic.setSelectedIndex(0);
 		 jComboBoxSelectBitwise.setSelectedIndex(0);
 		 jComboBoxSelectRelational.setSelectedIndex(0);
 		 jComboBoxSelectAssignment.setSelectedIndex(0);
 		jComboBoxAssignedVariable.setSelectedIndex(0);
    	 
		 jTextAreaShowAssignment.setText("");
		 jTextAreaShowBitwise.setText("");
		 jTextAreaShowRelational.setText("");
		 jTextAreaShowArithmetic.setText("");
	 }
	
     
     public boolean ConditionChecking(String s) {
 		boolean b=true;
 		
 		String condition = s;
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
 	

     
     public void saveArithmetic()
 	{
 		String operation = jTextAreaShowArithmetic.getText().toString();
 		
 		boolean b=ConditionChecking(operation);
 		if(b) {
 		
		String function = Status.getFunction();
		String fullCode = CommonReference.getFullVersionCode();
		int index = CommonAction.funcEnd(fullCode,function);
		
		if(operation.equals(""))
		{
			CommonAction.showRedWarning("Please input your condition");
		}
		else
		{
			String temp = operation+" ;"; // iske karn problem aayegi aage index calculate krne me shiza please solve that
			String part1 = fullCode.substring(0,index);
			String part2 = fullCode.substring(index,fullCode.length());
			String actual = part1+temp+part2;
			// do formatting for temp and actual
			CommonAction.comboOperations(temp, actual, "Arithmetic applied successfully");
			UndoWorking.addItem(temp,"normal");
			removePanel3AllComponent();
	 		CommonAction.enableAllPanel2Button();
			// ok boss
		}
		// logic part end ab befikr ghume
 		}
 		else {
 			CommonAction.showRedWarning("Not a valid operation");
 			jTextAreaShowArithmetic.setText("");
 		}
 	}
     public void saveRelational()
  	{	
  		String operation = jTextAreaShowRelational.getText().toString();
		
  		boolean b=ConditionChecking(operation);
 		if(b) {
  		
		String function = Status.getFunction();
		String fullCode = CommonReference.getFullVersionCode();
		int index = CommonAction.funcEnd(fullCode,function);
		
		if(operation.equals(""))
		{
			CommonAction.showRedWarning("Please input your condition");
		}
		else
		{
			String temp = operation+" ;"; // iske karn problem aayegi aage index calculate krne me shiza please solve that
			String part1 = fullCode.substring(0,index);
			String part2 = fullCode.substring(index,fullCode.length());
			String actual = part1+temp+part2;
			// do formatting for temp and actual
			actual =Formatting.format(actual);
			temp   = Formatting.format(temp);
			CommonAction.comboOperations(temp, actual, "Relational applied successfully");
			UndoWorking.addItem(temp,"normal");
			removePanel3AllComponent();
	  		CommonAction.enableAllPanel2Button();
			// ok boss
		}
		// logic part end ab befikr ghume
 		}
 		else {
 			CommonAction.showRedWarning("Not a valid operation");
 			jTextAreaShowRelational.setText("");
 		}
  	}
     public void saveBitwise()
  	{
  		//logic part begins from here
  		String operation = jTextAreaShowBitwise.getText().toString();
  		
  		boolean b=ConditionChecking(operation);
 		if(b) {
		
		String function = Status.getFunction();
		String fullCode = CommonReference.getFullVersionCode();
		int index = CommonAction.funcEnd(fullCode,function);
		
		if(operation.equals(""))
		{
			CommonAction.showRedWarning("Please input your condition");
		}
		else
		{
			String temp = operation+" ;"; // iske karn problem aayegi aage index calculate krne me shiza please solve that
			String part1 = fullCode.substring(0,index);
			String part2 = fullCode.substring(index,fullCode.length());
			String actual = part1+temp+part2;
			// do formatting for temp and actual
			CommonAction.comboOperations(temp, actual, "Bitwise applied successfully");
			UndoWorking.addItem(temp,"normal");
			removePanel3AllComponent();
	  		CommonAction.enableAllPanel2Button();
			// ok boss
		}
		// logic part end ab befikr ghume
 		}
 		else {
 			CommonAction.showRedWarning("Not a valid operation");
 			jTextAreaShowBitwise.setText("");
 		}
  	}
     public void saveAssignment()
  	{
  		
  		String operation = jTextAreaShowAssignment.getText().toString();
		
  		boolean b=ConditionChecking(operation);
 		if(b) {
  		
		String function = Status.getFunction();
		String fullCode = CommonReference.getFullVersionCode();
		int index = CommonAction.funcEnd(fullCode,function);
		
		if(operation.equals(""))
		{
			CommonAction.showRedWarning("Please input your condition");
		}
		else
		{
			String temp = operation+" ;"; // iske karn problem aayegi aage index calculate krne me shiza please solve that
			String part1 = fullCode.substring(0,index);
			String part2 = fullCode.substring(index,fullCode.length());
			String actual = part1+temp+part2;
			// do formatting for temp and actual
			CommonAction.comboOperations(temp, actual, "Assignment applied successfully");
			UndoWorking.addItem(temp,"normal");
			removePanel3AllComponent();
	  		CommonAction.enableAllPanel2Button();
			// ok boss
		}
		// logic part end ab befikr ghume
 		}
 		else {
 			CommonAction.showRedWarning("Not a valid operation");
 			jTextAreaShowAssignment.setText("");
 		}
  	}
}
