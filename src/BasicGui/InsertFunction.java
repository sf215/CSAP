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

class InsertFunction implements ActionListener{
	
	private JPanel panel3 = CommonReference.getPanel3();
	
	//common for both part
	
	private JLabel jLabelAll;
	
	
	private JRadioButton jRadioUserDefined;
	private JRadioButton jRadioPreDefined;
	
	private JLabel jLabelUserDefined;
	private JLabel jLabelPreDefined;
	
	private ButtonGroup jButtonGroup;
	
	// userDefined part
	
	private JLabel jLabelequals;
	private JLabel jLabelFunctionsList;
	private JComboBox<?> jComboBoxFunctionsList;
	private JComboBox<String> jComboBoxAssignedVariable;
	private JLabel jLabelAssignedVariable;
	
	private JLabel jLabelReturnType;
	private JTextField jTextFieldReturnType;
	
	private JButton jButtonDeclare;
	
	// predefined part
	
	private JRadioButton jRadioIO;
	private JRadioButton jRadioNoPara;
	private JRadioButton jRadioOnePara;
	private JRadioButton jRadioTwoPara;
	
	private JLabel jLabelIO;
	private JLabel jLabelNoPara;
	private JLabel jLabelOnePara;
	private JLabel jLabelTwoPara;
	
	private ButtonGroup jButtonGroup1;
	
	private JLabel jLabelPrintf;
	private JLabel jLabelScanf;
	private JRadioButton jRadioPrintf;
	private JRadioButton jRadioScanf;
	private ButtonGroup jButtonGroup2;
	
	private JLabel jLabelStringPrintf;
	private JLabel jlabelSelectVariablePrintf;
	private JLabel jLabelSyntaxPrintf;
	private JComboBox<String> jComboSelectVariablePrintf;
	private JTextField jTextStringPrintf;
	private JTextPane jTextSyntaxPrintf;
	private JScrollPane jTextSyntaxPrintfScrollBar;
	private JButton jViewPrintf;
	private JButton jSavePrintf;
	
	//private JLabel jLabelStringScanf;
	private JLabel jlabelSelectVariableScanf;
	private JLabel jLabelSyntaxScanf;
	private JComboBox<String> jComboSelectVariableScanf;
	//private JTextField jTextStringScanf;
	private JTextPane jTextSyntaxScanf;
	private JScrollPane jTextSyntaxScanfScrollBar;
	private JButton jViewScanf;
	private JButton jSaveScanf;
	
	private JLabel jLabelSelectNopara;
	private JComboBox<String> jComboBoxNopara;
	private JButton jButtonNoPara;
	
	private JLabel jLabelSelectOnepara;
	private JComboBox<String> jComboBoxOnepara;
	private JLabel jLabelOneParaFirst;
	private JTextField jTextFieldOneparaFirst;
	private JButton jButtonOnePara;
	
	private JLabel jLabelSelectTwopara;
	private JComboBox<String> jComboBoxTwopara;
	private JLabel jLabelTwoParaFirst;
	private JLabel jLabelTwoParaSecond;
	private JTextField jTextFieldTwoparaFirst;
	private JTextField jTextFieldTwoparaSecond;
	private JButton jButtonTwoPara;
	////////////////////////////////////////////////////////////////////////////
	private String [] userDefinedFunctions;
	private String [] userDefinedFunctitionsType;
	
	private String [] usedVariablesType;
	
	InsertFunction(){
		
		panel3.setLayout(null);
		CommonAction.disableAllPanel2Button();
		initialisationAllComponent(); 
		changeUI();
		userDefined();
	}
	
	
	
	void initialisationAllComponent(){
		//common part
		jLabelAll = new JLabel("Please select from these");
		jLabelUserDefined = new JLabel("User Defined");
		jLabelPreDefined = new JLabel("Pre Defined");
		jRadioUserDefined = new JRadioButton("userdefined");
		jRadioPreDefined = new JRadioButton("predefined");
		
		jRadioPreDefined.setBackground(new Color(80,80,80));
		jRadioUserDefined.setBackground(new Color(80,80,80));
		
		jButtonGroup = new ButtonGroup();
		jButtonGroup.add(jRadioUserDefined);
		jButtonGroup.add(jRadioPreDefined);
		//userDefined part
		userDefinedFunctions=CommonAction.getFunctionNameFullCode();
		userDefinedFunctitionsType=CommonAction.getFunctionReturnTypeFullCode();
		jLabelAssignedVariable=new JLabel("Local variable");
		jLabelequals = new JLabel("=");
		jComboBoxAssignedVariable =new JComboBox<String>(CommonAction.getVariableNameCurrentFunction());
		jComboBoxAssignedVariable.insertItemAt("", 0);
		jComboBoxAssignedVariable.setSelectedIndex(0);
		
		jLabelFunctionsList = new JLabel("Function List");
		jComboBoxFunctionsList = new JComboBox<String>(userDefinedFunctions);
		
		jLabelReturnType = new JLabel("Return Type");
		jTextFieldReturnType= new JTextField();
		jTextFieldReturnType.setText(userDefinedFunctitionsType[0]);
		jButtonDeclare = new JButton("Declare");
		
		if(jTextFieldReturnType.getText().toString().equalsIgnoreCase("void"))
			jComboBoxAssignedVariable.setEnabled(false);
		
		//predefined part
		
		

		jLabelPrintf = new JLabel("printf");
		jLabelScanf = new JLabel("scanf");
		jRadioPrintf = new JRadioButton();
		jRadioScanf = new JRadioButton();
		
		jRadioPrintf.setBackground(new Color(80,80,80));
		jRadioScanf.setBackground(new Color(80,80,80));
		
		jButtonGroup2 = new ButtonGroup();
		jButtonGroup2.add(jRadioPrintf);
		jButtonGroup2.add(jRadioScanf);
		
		jRadioIO = new JRadioButton();
		jRadioNoPara = new JRadioButton();
		jRadioOnePara = new JRadioButton();
		jRadioTwoPara = new JRadioButton();
		
		jRadioIO.setBackground(new Color(80,80,80));
		jRadioNoPara.setBackground(new Color(80,80,80));
		jRadioOnePara.setBackground(new Color(80,80,80));
		jRadioTwoPara.setBackground(new Color(80,80,80));
		
		jLabelIO = new JLabel("Input/Output");
		jLabelNoPara = new JLabel("NO Parameters");
		jLabelOnePara = new JLabel("One Parameter");
		jLabelTwoPara = new JLabel("Two Parameters");
		
		jButtonGroup1=new ButtonGroup();
		jButtonGroup1.add(jRadioIO);
		jButtonGroup1.add(jRadioNoPara);
		jButtonGroup1.add(jRadioOnePara);
		jButtonGroup1.add(jRadioTwoPara);
		
		jComboSelectVariablePrintf =new JComboBox<String>(CommonAction.getVariableNameCurrentFunction());
		jComboSelectVariablePrintf.insertItemAt("", 0);
		jComboSelectVariablePrintf.setSelectedIndex(0);
		usedVariablesType = CommonAction.getVariableDataTypeCurrentFunction();
		
		jLabelStringPrintf = new JLabel("Enter String");
		jlabelSelectVariablePrintf = new JLabel("Select variable");
		jLabelSyntaxPrintf = new JLabel("Syntax");
		//jComboSelectVariablePrintf = new JComboBox();
		jTextStringPrintf = new JTextField();
		jTextSyntaxPrintf = new JTextPane();
		jTextSyntaxPrintf.setBackground(Color.DARK_GRAY);
		jTextSyntaxPrintfScrollBar = new JScrollPane(jTextSyntaxPrintf,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		jTextSyntaxPrintf.setForeground(Color.magenta);
		jViewPrintf = new JButton("View");
		jSavePrintf = new JButton("Save");
		
		
		jComboSelectVariableScanf=new JComboBox<String>(CommonAction.getVariableNameCurrentFunction());
	//	jLabelStringScanf = new JLabel("Enter String");
		jlabelSelectVariableScanf = new JLabel("Select variable");
		jLabelSyntaxScanf = new JLabel("Syntax");
		//jComboSelectVariableScanf = new JComboBox();
	//	jTextStringScanf = new JTextField();
		jTextSyntaxScanf = new JTextPane();
		jTextSyntaxScanf.setBackground(Color.DARK_GRAY);
		jTextSyntaxScanfScrollBar = new JScrollPane(jTextSyntaxScanf,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		jTextSyntaxScanf.setForeground(Color.magenta);
		jViewScanf = new JButton("View");
		jSaveScanf = new JButton("Save");
		
		jLabelSelectNopara = new JLabel("Select Function");
		jComboBoxNopara = new JComboBox<String>(AllArrays.getNoParameterPredefinedFunctions());
		jButtonNoPara = new JButton("Call");
		
		jLabelSelectOnepara = new JLabel("Select Function"); 
		jComboBoxOnepara = new JComboBox<String>(AllArrays.getOneParameterPredefinedFunctions());
		jLabelOneParaFirst=new JLabel("Parameter");
		jTextFieldOneparaFirst = new JTextField(); 
		jButtonOnePara =new JButton("Call"); 
		
		jLabelSelectTwopara=new JLabel("Select Function");
		jComboBoxTwopara = new JComboBox<String>(AllArrays.getTwoParameterPredefinedFunctions());
		jLabelTwoParaFirst=new JLabel("First Parameter");
		jLabelTwoParaSecond=new JLabel("Second Parameter");
		jTextFieldTwoparaFirst = new JTextField();
		jTextFieldTwoparaSecond = new JTextField();
		jButtonTwoPara = new JButton("Call");
		
		jComboBoxFunctionsList.addActionListener(this);
		jButtonDeclare.addActionListener(this);
		
		jViewPrintf.addActionListener(this);
		jSavePrintf.addActionListener(this);
		
		jViewScanf.addActionListener(this);
		jSaveScanf.addActionListener(this);
		
		jTextStringPrintf.getDocument().addDocumentListener(dl);
	//	jTextStringScanf.getDocument().addDocumentListener(dl);
		jTextFieldOneparaFirst.getDocument().addDocumentListener(dl);
		jTextFieldTwoparaFirst.getDocument().addDocumentListener(dl);
		jTextFieldTwoparaSecond.getDocument().addDocumentListener(dl);
	}
	
	DocumentListener dl=new DocumentListener() {
		
		@Override
		public void removeUpdate(DocumentEvent e) {
			checkCaps();
			
		}
		
		@Override
		public void insertUpdate(DocumentEvent e) {
			checkCaps();
			
		}
		
		@Override
		public void changedUpdate(DocumentEvent e) {
			checkCaps();
			
		}
	};

	
	public void checkCaps(){
		String s="";
		
		jViewPrintf.setEnabled(true);
		jViewScanf.setEnabled(true);
		jButtonTwoPara.setEnabled(true);
		jButtonOnePara.setEnabled(true);
		
		if(jRadioPrintf.isSelected()) {
		 s=jTextStringPrintf.getText();
		}
		 if(jRadioScanf.isSelected()) {
	//		 s=jTextStringScanf.getText();
		}
		if(jRadioOnePara.isSelected()) {
			 s=jTextFieldOneparaFirst.getText();
		}
		if(jRadioTwoPara.isSelected()) {
			 s=jTextFieldTwoparaFirst.getText();
			String s2=jTextFieldTwoparaSecond.getText();
			
			for(int i=0;i<s2.length();i++) {
				if(Character.isUpperCase(s2.charAt(i))) {
					CommonAction.showRedWarning("Do not use capital letters");
					jButtonTwoPara.setEnabled(false);
				}
		}
		}
		for(int i=0;i<s.length();i++) {
		if(Character.isUpperCase(s.charAt(i))) {
			CommonAction.showRedWarning("Do not use capital letters");
			jViewPrintf.setEnabled(false);
			jViewScanf.setEnabled(false);
			jButtonTwoPara.setEnabled(false);
			jButtonOnePara.setEnabled(false);
		}
		}
		
	}
	
	void changeUI(){
		
		
		jButtonGroup.add(jRadioUserDefined);
		jButtonGroup.add(jRadioPreDefined);
		
		jLabelAll.setBounds(20,20,200,20);
		jLabelUserDefined.setBounds(50, 60, 80, 20);
		jLabelPreDefined.setBounds(50, 100, 80, 20);
		jRadioUserDefined.setBounds(20,60,20,20);
		jRadioPreDefined.setBounds(20,100,20,20);
		
		
		panel3.add(jLabelAll);
		panel3.add(jRadioUserDefined);
		panel3.add(jRadioPreDefined);
		panel3.add(jLabelUserDefined);
		panel3.add(jLabelPreDefined);
		
		jRadioUserDefined.setSelected(true);
		
		panel3.repaint();
		
		jRadioUserDefined.addActionListener(this);
		jRadioPreDefined.addActionListener(this);
		
	}
	
	
	
	void userDefined(){
		
		panel3.remove(jLabelPrintf);
		panel3.remove(jLabelScanf);
		panel3.remove(jRadioPrintf);
		panel3.remove(jRadioScanf);
		
		panel3.remove(jRadioIO); 
		panel3.remove(jRadioNoPara);
		panel3.remove(jRadioOnePara);
		panel3.remove(jRadioTwoPara);
		panel3.remove(jLabelIO); 
		panel3.remove(jLabelNoPara);
		panel3.remove(jLabelOnePara);
		panel3.remove(jLabelTwoPara);
		
		panel3.remove(jLabelStringPrintf);
		panel3.remove(jlabelSelectVariablePrintf);
		panel3.remove(jLabelSyntaxPrintf);
		panel3.remove(jComboSelectVariablePrintf);
		panel3.remove(jTextStringPrintf);
		panel3.remove(jTextSyntaxPrintfScrollBar);
		panel3.remove(jViewPrintf);
		panel3.remove(jSavePrintf);
		
	//	panel3.remove(jLabelStringScanf);
		panel3.remove(jlabelSelectVariableScanf);
		panel3.remove(jLabelSyntaxScanf);
		panel3.remove(jComboSelectVariableScanf);
	//	panel3.remove(jTextStringScanf);
		panel3.remove(jTextSyntaxScanfScrollBar);
		panel3.remove(jViewScanf);
		panel3.remove(jSaveScanf);
		
		panel3.remove(jLabelSelectNopara);
		panel3.remove(jComboBoxNopara);
		panel3.remove(jButtonNoPara);
		
		panel3.remove(jLabelSelectOnepara);
		panel3.remove(jComboBoxOnepara);
		panel3.remove(jLabelOneParaFirst);
		panel3.remove(jTextFieldOneparaFirst);
		panel3.remove(jButtonOnePara);
		
		panel3.remove(jLabelSelectTwopara);
		panel3.remove(jComboBoxTwopara);
		panel3.remove(jLabelTwoParaFirst);
		panel3.remove(jLabelTwoParaSecond);
		panel3.remove(jTextFieldTwoparaFirst);
		panel3.remove(jTextFieldTwoparaSecond);
		panel3.remove(jButtonTwoPara);

		//panel3.removeAll();
		jLabelAssignedVariable.setBounds(330,50,200,30);
		jLabelequals.setBounds(505, 95, 15, 10);
		jComboBoxAssignedVariable.setBounds(330,90,150,30);
		jLabelFunctionsList.setBounds(550,50,200,30);
		jComboBoxFunctionsList.setBounds(550,90,200,30);
		jLabelReturnType.setBounds(770,50,200,30);
		jTextFieldReturnType.setBounds(770,90,200,30);
		jButtonDeclare.setBounds(1000,90,150,30);
		
		jTextFieldReturnType.setEditable(false);
		
		
		panel3.add(jComboBoxAssignedVariable);
		panel3.add(jLabelAssignedVariable);
		panel3.add(jLabelequals);
		panel3.add(jLabelFunctionsList);
		panel3.add(jComboBoxFunctionsList);
		panel3.add(jLabelReturnType);
		panel3.add(jTextFieldReturnType);
		panel3.add(jButtonDeclare);
		
		
		panel3.revalidate();
		panel3.repaint();
		
		
		jComboBoxFunctionsList.addActionListener(this);
		
	}
	
	void preDefined(){
		
		panel3.remove(jLabelFunctionsList);
		panel3.remove(jComboBoxFunctionsList);
		panel3.remove(jLabelReturnType);
		panel3.remove(jTextFieldReturnType);
		panel3.remove(jButtonDeclare);
		panel3.remove(jComboBoxAssignedVariable);
		panel3.remove(jLabelAssignedVariable);
		panel3.remove(jLabelequals);
		//panel3.removeAll();
		
		jRadioIO.setBounds(700,20,30,30); 
		jRadioNoPara.setBounds(850,20,30,30);
		jRadioOnePara.setBounds(1010,20,30,30);
		jRadioTwoPara.setBounds(1170,20,30,30);
		
		jLabelIO.setBounds(730,20,100,30); 
		jLabelNoPara.setBounds(880,20,100,30);
		jLabelOnePara.setBounds(1040,20,100,30);
		jLabelTwoPara.setBounds(1200,20,100,30);
		
		jButtonGroup1.clearSelection();
		
		panel3.add(jRadioIO);
		panel3.add(jRadioNoPara);
		panel3.add(jRadioOnePara);
		panel3.add(jRadioTwoPara);
		panel3.add(jLabelIO);
		panel3.add(jLabelNoPara);
		panel3.add(jLabelOnePara);
		panel3.add(jLabelTwoPara);
		
		
		
		panel3.validate();
		panel3.repaint();
		
		jRadioIO.addActionListener(this);
		jRadioNoPara.addActionListener(this);
		jRadioOnePara.addActionListener(this);
	
		jRadioTwoPara.addActionListener(this);
		
	}
	void io(){
		
		
		panel3.remove(jLabelStringPrintf);
		panel3.remove(jlabelSelectVariablePrintf);
		panel3.remove(jLabelSyntaxPrintf);
		panel3.remove(jComboSelectVariablePrintf);
		panel3.remove(jTextStringPrintf);
		panel3.remove(jTextSyntaxPrintf);
		panel3.remove(jViewPrintf);
		panel3.remove(jSavePrintf);
		
	//	panel3.remove(jLabelStringScanf);
		panel3.remove(jlabelSelectVariableScanf);
		panel3.remove(jLabelSyntaxScanf);
		panel3.remove(jComboSelectVariableScanf);
	//	panel3.remove(jTextStringScanf);
		panel3.remove(jTextSyntaxScanf);
		panel3.remove(jViewScanf);
		panel3.remove(jSaveScanf);
		
		panel3.remove(jLabelSelectNopara);
		panel3.remove(jComboBoxNopara);
		panel3.remove(jButtonNoPara);
		
		panel3.remove(jLabelSelectOnepara);
		panel3.remove(jComboBoxOnepara);
		panel3.remove(jLabelOneParaFirst);
		panel3.remove(jTextFieldOneparaFirst);
		panel3.remove(jButtonOnePara);
		
		panel3.remove(jLabelSelectTwopara);
		panel3.remove(jComboBoxTwopara);
		panel3.remove(jLabelTwoParaFirst);
		panel3.remove(jLabelTwoParaSecond);
		panel3.remove(jTextFieldTwoparaFirst);
		panel3.remove(jTextFieldTwoparaSecond);
		panel3.remove(jButtonTwoPara);
		
		jButtonGroup2.clearSelection();
		
		
		jLabelPrintf.setBounds(280,30,100,30);
		jLabelScanf.setBounds(410,30,100,30);
		jRadioPrintf.setBounds(250,30,30,30);
		jRadioScanf.setBounds(380,30,30,30);
		
		panel3.add(jRadioPrintf);
		panel3.add(jLabelPrintf);
		panel3.add(jRadioScanf);
		panel3.add(jLabelScanf);
		
		panel3.revalidate();
		panel3.repaint();
		
		jRadioPrintf.addActionListener(this);
		jRadioScanf.addActionListener(this);
	}
	
	void printfUI(){
		
		
	//	panel3.remove(jLabelStringScanf);
		panel3.remove(jlabelSelectVariableScanf);
		panel3.remove(jLabelSyntaxScanf);
		panel3.remove(jComboSelectVariableScanf);
//		panel3.remove(jTextStringScanf);
		panel3.remove(jTextSyntaxScanfScrollBar);
		panel3.remove(jViewScanf);
		panel3.remove(jSaveScanf);
		
		panel3.remove(jLabelSelectNopara);
		panel3.remove(jComboBoxNopara);
		panel3.remove(jButtonNoPara);
		
		panel3.remove(jLabelSelectOnepara);
		panel3.remove(jComboBoxOnepara);
		panel3.remove(jLabelOneParaFirst);
		panel3.remove(jTextFieldOneparaFirst);
		panel3.remove(jButtonOnePara);
		
		panel3.remove(jLabelSelectTwopara);
		panel3.remove(jComboBoxTwopara);
		panel3.remove(jLabelTwoParaFirst);
		panel3.remove(jLabelTwoParaSecond);
		panel3.remove(jTextFieldTwoparaFirst);
		panel3.remove(jTextFieldTwoparaSecond);
		panel3.remove(jButtonTwoPara);
		
		panel3.validate();
		panel3.repaint();
		
		
		
		
		jTextSyntaxPrintf.setEditable(false);
		
		jLabelStringPrintf.setBounds(250,110,100,30);
		jlabelSelectVariablePrintf.setBounds(480,110,100,30);
		jLabelSyntaxPrintf.setBounds(800,60,100,30);
		jComboSelectVariablePrintf.setBounds(480,150,100,30);
		jTextStringPrintf.setBounds(250,150,200,30);
		jTextSyntaxPrintfScrollBar.setBounds(800,100,300,80);
		jViewPrintf.setBounds(630,150,100,30);
		jSavePrintf.setBounds(1200,150,100,30);
		
		jTextSyntaxPrintf.setText("");
		
		panel3.add(jLabelStringPrintf);
		panel3.add(jlabelSelectVariablePrintf);
		panel3.add(jLabelSyntaxPrintf);
		panel3.add(jComboSelectVariablePrintf);
		panel3.add(jTextStringPrintf);
		panel3.add(jTextSyntaxPrintfScrollBar);
		panel3.add(jViewPrintf);
		panel3.add(jSavePrintf);
		
		panel3.revalidate();
		panel3.repaint();
		
		
		
	}
	
	void scanfUI(){
		
		
		panel3.remove(jLabelStringPrintf);
		panel3.remove(jlabelSelectVariablePrintf);
		panel3.remove(jLabelSyntaxPrintf);
		panel3.remove(jComboSelectVariablePrintf);
		panel3.remove(jTextStringPrintf);
		panel3.remove(jTextSyntaxPrintfScrollBar);
		panel3.remove(jViewPrintf);
		panel3.remove(jSavePrintf);
		
		panel3.remove(jLabelSelectNopara);
		panel3.remove(jComboBoxNopara);
		panel3.remove(jButtonNoPara);
		
		panel3.remove(jLabelSelectOnepara);
		panel3.remove(jComboBoxOnepara);
		panel3.remove(jLabelOneParaFirst);
		panel3.remove(jTextFieldOneparaFirst);
		panel3.remove(jButtonOnePara);
		
		panel3.remove(jLabelSelectTwopara);
		panel3.remove(jComboBoxTwopara);
		panel3.remove(jLabelTwoParaFirst);
		panel3.remove(jLabelTwoParaSecond);
		panel3.remove(jTextFieldTwoparaFirst);
		panel3.remove(jTextFieldTwoparaSecond);
		panel3.remove(jButtonTwoPara);
		
		panel3.revalidate();
		panel3.repaint();
		
		String[] variables=CommonAction.getVariableNameCurrentFunction();
		if(variables.length<=0) {
			CommonAction.showRedWarning("No variables are declared in this function");
		}
		else {
		
		//jTextStringScanf.setEditable(false);
		jTextSyntaxScanf.setEditable(false);
		
		jTextSyntaxScanf.setText("");
		
	//	jLabelStringScanf.setBounds(250,110,100,30);
		jlabelSelectVariableScanf.setBounds(480,110,100,30);
		jLabelSyntaxScanf.setBounds(800,60,100,30);
		jComboSelectVariableScanf.setBounds(480,150,100,30);
	//	jTextStringScanf.setBounds(250,150,200,30);
		jTextSyntaxScanfScrollBar.setBounds(800,100,300,80);
		jViewScanf.setBounds(630,150,100,30);
		jSaveScanf.setBounds(1200,150,100,30);
		
	//	panel3.add(jLabelStringScanf);
		panel3.add(jlabelSelectVariableScanf);
		panel3.add(jLabelSyntaxScanf);
		panel3.add(jComboSelectVariableScanf);
	//	panel3.add(jTextStringScanf);
		panel3.add(jTextSyntaxScanfScrollBar);
		panel3.add(jViewScanf);
		panel3.add(jSaveScanf);
		
		panel3.revalidate();
		panel3.repaint();
		
	//	jTextStringScanf.addActionListener(this);
		
		
		
		jTextSyntaxScanf.setText("");
		}
	}
	
	void noPara(){
		
		panel3.remove(jLabelPrintf);
		panel3.remove(jLabelScanf);
		panel3.remove(jRadioPrintf);
		panel3.remove(jRadioScanf);
		
		panel3.remove(jLabelStringPrintf);
		panel3.remove(jlabelSelectVariablePrintf);
		panel3.remove(jLabelSyntaxPrintf);
		panel3.remove(jComboSelectVariablePrintf);
		panel3.remove(jTextStringPrintf);
		panel3.remove(jTextSyntaxPrintfScrollBar);
		panel3.remove(jViewPrintf);
		panel3.remove(jSavePrintf);
		
	//	panel3.remove(jLabelStringScanf);
		panel3.remove(jlabelSelectVariableScanf);
		panel3.remove(jLabelSyntaxScanf);
		panel3.remove(jComboSelectVariableScanf);
	//	panel3.remove(jTextStringScanf);
		panel3.remove(jTextSyntaxScanfScrollBar);
		panel3.remove(jViewScanf);
		panel3.remove(jSaveScanf);
		
		panel3.remove(jLabelSelectOnepara);
		panel3.remove(jComboBoxOnepara);
		panel3.remove(jLabelOneParaFirst);
		panel3.remove(jTextFieldOneparaFirst);
		panel3.remove(jButtonOnePara);
		
		panel3.remove(jLabelSelectTwopara);
		panel3.remove(jComboBoxTwopara);
		panel3.remove(jLabelTwoParaFirst);
		panel3.remove(jLabelTwoParaSecond);
		panel3.remove(jTextFieldTwoparaFirst);
		panel3.remove(jTextFieldTwoparaSecond);
		panel3.remove(jButtonTwoPara);
		
		jLabelSelectNopara.setBounds(200,110,100,30);
		jComboBoxNopara.setBounds(200,150,100,30);
		jButtonNoPara.setBounds(500,150,100,30);
		
		panel3.add(jLabelSelectNopara);
		panel3.add(jComboBoxNopara);
		panel3.add(jButtonNoPara);
		
		panel3.repaint();
		panel3.revalidate();
		
		jButtonNoPara.addActionListener(this);
	}
	
	void onePara(){
		panel3.remove(jLabelPrintf);
		panel3.remove(jLabelScanf);
		panel3.remove(jRadioPrintf);
		panel3.remove(jRadioScanf);

		
		panel3.remove(jLabelStringPrintf);
		panel3.remove(jlabelSelectVariablePrintf);
		panel3.remove(jLabelSyntaxPrintf);
		panel3.remove(jComboSelectVariablePrintf);
		panel3.remove(jTextStringPrintf);
		panel3.remove(jTextSyntaxPrintfScrollBar);
		panel3.remove(jViewPrintf);
		panel3.remove(jSavePrintf);
		
	//	panel3.remove(jLabelStringScanf);
		panel3.remove(jlabelSelectVariableScanf);
		panel3.remove(jLabelSyntaxScanf);
		panel3.remove(jComboSelectVariableScanf);
	//	panel3.remove(jTextStringScanf);
		panel3.remove(jTextSyntaxScanfScrollBar);
		panel3.remove(jViewScanf);
		panel3.remove(jSaveScanf);
		
		panel3.remove(jLabelSelectNopara);
		panel3.remove(jComboBoxNopara);
		panel3.remove(jButtonNoPara);
		
		panel3.remove(jLabelSelectTwopara);
		panel3.remove(jComboBoxTwopara);
		panel3.remove(jLabelTwoParaFirst);
		panel3.remove(jLabelTwoParaSecond);
		panel3.remove(jTextFieldTwoparaFirst);
		panel3.remove(jTextFieldTwoparaSecond);
		panel3.remove(jButtonTwoPara);
		
		jLabelSelectOnepara.setBounds(200,110,100,30); 
		jComboBoxOnepara.setBounds(200,150,100,30);
		jLabelOneParaFirst.setBounds(330,110,100,30);
		jTextFieldOneparaFirst.setBounds(330,150,100,30); 
		jButtonOnePara.setBounds(630,150,100,30);
		
		panel3.add(jLabelSelectOnepara);
		panel3.add(jComboBoxOnepara);
		panel3.add(jLabelOneParaFirst);
		panel3.add(jTextFieldOneparaFirst);
		panel3.add(jButtonOnePara);
		
		panel3.revalidate();
		panel3.repaint();
		
		jButtonOnePara.addActionListener(this);
	}
	
	void twoPara(){
		panel3.remove(jLabelPrintf);
		panel3.remove(jLabelScanf);
		panel3.remove(jRadioPrintf);
		panel3.remove(jRadioScanf);

		
		panel3.remove(jLabelStringPrintf);
		panel3.remove(jlabelSelectVariablePrintf);
		panel3.remove(jLabelSyntaxPrintf);
		panel3.remove(jComboSelectVariablePrintf);
		panel3.remove(jTextStringPrintf);
		panel3.remove(jTextSyntaxPrintfScrollBar);
		panel3.remove(jViewPrintf);
		panel3.remove(jSavePrintf);
		
	//	panel3.remove(jLabelStringScanf);
		panel3.remove(jlabelSelectVariableScanf);
		panel3.remove(jLabelSyntaxScanf);
		panel3.remove(jComboSelectVariableScanf);
	//	panel3.remove(jTextStringScanf);
		panel3.remove(jTextSyntaxScanfScrollBar);
		panel3.remove(jViewScanf);
		panel3.remove(jSaveScanf);
		
		panel3.remove(jLabelSelectNopara);
		panel3.remove(jComboBoxNopara);
		panel3.remove(jButtonNoPara);
		
		panel3.remove(jLabelSelectOnepara);
		panel3.remove(jComboBoxOnepara);
		panel3.remove(jLabelOneParaFirst);
		panel3.remove(jTextFieldOneparaFirst);
		panel3.remove(jButtonOnePara);
		
		jLabelSelectTwopara.setBounds(200,110,100,30);
		jComboBoxTwopara.setBounds(200,150,100,30);
		jLabelTwoParaFirst.setBounds(330,110,100,30);
		jLabelTwoParaSecond.setBounds(450,110,130,30);
		jTextFieldTwoparaFirst.setBounds(330,150,100,30);
		jTextFieldTwoparaSecond.setBounds(450,150,100,30);
		jButtonTwoPara.setBounds(650,150,100,30);
		
		panel3.add(jLabelSelectTwopara);
		panel3.add(jComboBoxTwopara); 
		panel3.add(jLabelTwoParaFirst);
		panel3.add(jLabelTwoParaSecond);
		panel3.add(jTextFieldTwoparaFirst);
		panel3.add(jTextFieldTwoparaSecond);
		panel3.add(jButtonTwoPara);
	
		panel3.revalidate();
		panel3.repaint();
		
		jButtonTwoPara.addActionListener(this);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		// common for all
		if(e.getSource()==jRadioUserDefined)
		{
			userDefined();
		}
		if(e.getSource()==jRadioPreDefined)
		{
			
			preDefined();
		}
		//predefined part
		if(e.getSource()==jButtonDeclare)
		{
			
			userDefinedSave();
		}
		
		//user defined part
		if(e.getSource()==jRadioIO)
		{
			io();
		}
		if(e.getSource()==jRadioNoPara)
		{
			noPara();
		}
		if(e.getSource()==jRadioOnePara)
		{
			
			onePara();
		}
		if(e.getSource()==jRadioTwoPara)
		{
			twoPara();
		}
		if(e.getSource()==jButtonNoPara)
		{
			noParaSave();
		}
		if(e.getSource()==jButtonOnePara)
		{
			
			
			OneParaSave();
		}
		if(e.getSource()==jButtonTwoPara)
		{
			TwoParaSave();
		}
		if(e.getSource()==jComboBoxFunctionsList)  
		{
			showReturnType();
		}
		if (e.getSource()== jRadioPrintf)
		{
			printfUI();
		}
		if (e.getSource()== jRadioScanf)
		{
			scanfUI();
		}
		if (e.getSource()== jViewPrintf)
		{
			viewPrintfSyntax();
		}
		if (e.getSource()== jSavePrintf)
		{
			savePrintf();
		}
		if (e.getSource()== jSaveScanf)
		{
			SaveScanf();
		}
		if (e.getSource()== jViewScanf)
		{
			ViewScanfSyntax();
		}
		
	}
	
	void ViewScanfSyntax(){
				
		String Syntax = jTextSyntaxScanf.getText();
		
		jTextSyntaxScanf.setForeground(Color.magenta);
		String v = jComboSelectVariableScanf.getSelectedItem().toString();
		String v1 = v.toString();
		
		int vIndex = jComboSelectVariableScanf.getSelectedIndex();
		
		String vType = usedVariablesType[vIndex];
		
		String pro = "";
		if (vType == "int"){
			pro = "%d";
		}
		if (vType == "char"){
			pro = "%c";
		}
		if (vType == "unsigned char"){
			pro = "%u";
		}
		if (vType == "signed char"){
			pro = "%u";
		}
		if (vType == "signed int"){
			pro = "%u";
		}
		if (vType == "signed short int"){
			pro = "%hu";
		}
		if (vType == "signed long int"){
			pro = "%ld";
		}
		if (vType == "unsigned int"){
			pro = "%u";
		}
		if (vType == "unsigned short int"){
			pro = "%hu";
		}
		if (vType == "unsigned long int"){
			pro = "%lu";
		}
		if (vType == "float"){
			pro = "%f";
		}
		if (vType == "double"){
			pro = "%f";
		}
		if (vType == "long double"){
			pro = "%lf";
		}
	
		if(Syntax.equals("")){
			
			String scanfSyntaxString = "("+'"'+pro+'"'+",&"+v1+")";
			jTextSyntaxScanf.setText(scanfSyntaxString);
		}
		if(!Syntax.equals("")){
			
			for(int i=1;i<Syntax.length() ; i++){
				if(Syntax.charAt(i)==',' && Syntax.charAt(i-1)=='"'){
					Syntax = Syntax.substring(0, i-1)+pro+Syntax.substring(i-1, Syntax.length());
					break;
				}	
			}
			int p = Syntax.lastIndexOf(")");
			Syntax = Syntax.substring(0,p)+",&"+v1+Syntax.substring(p, Syntax.length());
			
			jTextSyntaxScanf.setText(Syntax);
			
			jComboSelectVariableScanf.setSelectedItem("");
		}
		}
		
		
	
	
	void SaveScanf() {
		
		if(jTextSyntaxScanf.getText().equals("") && jComboSelectVariableScanf.getSelectedItem().toString().equals("")) {
			CommonAction.showRedWarning("Please enter parameter");
		}
		else {
		 String temp="scanf"+jTextSyntaxScanf.getText()+" ;";
		 String function = Status.getFunction();
			String fullCode = CommonReference.getFullVersionCode();
			int index = CommonAction.funcEnd(fullCode,function);
			
			String part1 = fullCode.substring(0,index);
			String part2 = fullCode.substring(index,fullCode.length());
			String actual = part1+temp+part2;
			// do formatting for temp and actual
			CommonAction.comboOperations(temp, actual, "Successfully applied");
			UndoWorking.addItem(temp, "normal");
			// ok boss
		
		panel3.removeAll();
		CommonAction.enableAllPanel2Button();
		panel3.validate();
		panel3.repaint();
		}
	}
	
	void viewPrintfSyntax(){
		
		String Syntax = jTextSyntaxPrintf.getText();
		
		String inputString = "";
		inputString = jTextStringPrintf.getText();
		//inputString=inputString.toUpperCase();
		Object v = jComboSelectVariablePrintf.getSelectedItem();
		String v1 = v.toString();
		
		int vIndex = jComboSelectVariablePrintf.getSelectedIndex();
		String pro = "";
		if(vIndex>0) {
		String vType = usedVariablesType[vIndex-1];
			
		if (vType == "int"){
			pro = "%d";
		}
		if (vType == "char"){
			pro = "%c";
		}
		if (vType == "unsigned char"){
			pro = "%u";
		}
		if (vType == "signed char"){
			pro = "%u";
		}
		if (vType == "signed int"){
			pro = "%u";
		}
		if (vType == "signed short int"){
			pro = "%hu";
		}
		if (vType == "signed long int"){
			pro = "%ld";
		}
		if (vType == "unsigned int"){
			pro = "%u";
		}
		if (vType == "unsigned short int"){
			pro = "%hu";
		}
		if (vType == "unsigned long int"){
			pro = "%lu";
		}
		if (vType == "float"){
			pro = "%f";
		}
		if (vType == "double"){
			pro = "%f";
		}
		if (vType == "long double"){
			pro = "%lf";
		}
		}
		
		if(Syntax.equals("") && !v1.equals("")){	
			String printfSyntaxString = "("+'"'+inputString+pro+'"'+","+v1+")";
			
			jTextSyntaxPrintf.setText(printfSyntaxString);
			jTextStringPrintf.setText("");
			jComboSelectVariablePrintf.setSelectedItem("");
		}
		else if(!Syntax.equals("")){
			int p = Syntax.lastIndexOf(")");
			
			 if(Syntax.charAt(p-1)=='"'){
					Syntax = Syntax.substring(0, p-1)+inputString+pro+Syntax.substring(p-1, Syntax.length());
				}	
			for(int i=1;i<Syntax.length() ; i++){
				if(Syntax.charAt(i)==',' && Syntax.charAt(i-1)=='"'){
					Syntax = Syntax.substring(0, i-1)+inputString+pro+Syntax.substring(i-1, Syntax.length());			
					break;
				}	
				
			}
			p = Syntax.lastIndexOf(")");
			if(!v1.equals(""))
			Syntax = Syntax.substring(0,p)+","+v1+Syntax.substring(p, Syntax.length());
			
			jTextSyntaxPrintf.setText(Syntax);
			jTextStringPrintf.setText("");
			jComboSelectVariablePrintf.setSelectedItem("");
		}
		
		else {
			
			jTextSyntaxPrintf.setText("("+'"'+inputString+'"'+")");
			jTextStringPrintf.setText("");
		}
	}
	
	
	
	 void savePrintf() {
		 if(jTextSyntaxPrintf.getText().equals("") && jComboSelectVariablePrintf.getSelectedItem().toString().equals("")) {
			 CommonAction.showRedWarning("Please enter the string or variable to print");
		 }
		 else {
		 String temp="printf"+jTextSyntaxPrintf.getText()+" ;";
		 String function = Status.getFunction();
			String fullCode = CommonReference.getFullVersionCode();
			int index = CommonAction.funcEnd(fullCode,function);
			
			String part1 = fullCode.substring(0,index);
			String part2 = fullCode.substring(index,fullCode.length());
			String actual = part1+temp+part2;
			// do formatting for temp and actual
			UndoWorking.addItem(temp, "normal");
			CommonAction.comboOperations(temp, actual, "Successfully applied");
			// ok boss
		
		panel3.removeAll();
		CommonAction.enableAllPanel2Button();
		panel3.validate();
		panel3.repaint();
		 }
	 }
	void showReturnType(){
		
		int index = jComboBoxFunctionsList.getSelectedIndex();
		String fType = userDefinedFunctitionsType[index];
		jTextFieldReturnType.setText(fType);
		if(jTextFieldReturnType.getText().contains("void")) {
			jComboBoxAssignedVariable.setEnabled(false);
			CommonAction.showRedWarning("Function with void return type cannot be assigned to any variable");	
		}
	}
	
	void userDefinedSave(){
		String temp = null;
		if(jComboBoxAssignedVariable.isEnabled() && !jComboBoxAssignedVariable.getSelectedItem().toString().equals("")) {
			String datatypes[]=CommonAction.getVariableDataTypeCurrentFunction();
			String[] variables=CommonAction.getVariableNameCurrentFunction();
			for(int i=0;i<datatypes.length;i++) {
				if(variables[i].equals(jComboBoxAssignedVariable.getSelectedItem().toString())) {
				if(datatypes[i].equals(jTextFieldReturnType.getText())){
					temp=jComboBoxAssignedVariable.getSelectedItem().toString()+" = "+jComboBoxFunctionsList.getSelectedItem().toString()+"() ;";
				}
				else {
					CommonAction.showRedWarning("Return type of function and assigned variables are not of same datatype");
					return;
				}
				}
			}
			// temp=jComboBoxAssignedVariable.getSelectedItem().toString()+" = "+jComboBoxFunctionsList.getSelectedItem().toString()+"() ;";
		}
		else {
			 temp=jComboBoxFunctionsList.getSelectedItem().toString()+"() ;";
		}
			String function = Status.getFunction();
			String fullCode = CommonReference.getFullVersionCode();
			int index = CommonAction.funcEnd(fullCode,function);
			
			String part1 = fullCode.substring(0,index);
			String part2 = fullCode.substring(index,fullCode.length());
			String actual = part1+temp+part2;
			// do formatting for temp and actual
			UndoWorking.addItem(temp, "normal");
			CommonAction.comboOperations(temp, actual, "Successfully applied");
			// ok boss
		
		panel3.removeAll();
		CommonAction.enableAllPanel2Button();
		panel3.validate();
		panel3.repaint();
	
		
	}
	
	void noParaSave(){
		String temp=jComboBoxNopara.getSelectedItem().toString()+"() ;";
		String function = Status.getFunction();
		String fullCode = CommonReference.getFullVersionCode();
		int index = CommonAction.funcEnd(fullCode,function);
		
		String part1 = fullCode.substring(0,index);
		String part2 = fullCode.substring(index,fullCode.length());
		String actual = part1+temp+part2;
		// do formatting for temp and actual
		UndoWorking.addItem(temp, "normal");
		CommonAction.comboOperations(temp, actual, "Successfully applied");
		// ok boss
		panel3.removeAll();
		CommonAction.enableAllPanel2Button();
		panel3.validate();
		panel3.repaint();
	}
	
	boolean stringOnePara() {
		String check=jTextFieldOneparaFirst.getText();
		if(BasicOperations.valueCheck("int",check) || BasicOperations.valueCheck("float",check)) {
			 return true;				
		}
		else {
			return false;
		}
	}
	
	void OneParaSave(){
		boolean paraIsNotString=stringOnePara();
		
		if(jTextFieldOneparaFirst.getText().equals("")) {
			CommonAction.showRedWarning("Please enter the parameter");
		}
		else {
			if(paraIsNotString) {
		String temp=jComboBoxOnepara.getSelectedItem().toString()+"( "+jTextFieldOneparaFirst.getText()+" ) ;";
		String function = Status.getFunction();
		String fullCode = CommonReference.getFullVersionCode();
		int index = CommonAction.funcEnd(fullCode,function);
		
		String part1 = fullCode.substring(0,index);
		String part2 = fullCode.substring(index,fullCode.length());
		String actual = part1+temp+part2;
		// do formatting for temp and actual
		UndoWorking.addItem(temp, "normal");
		CommonAction.comboOperations(temp, actual, "Successfully applied");
		// ok boss
		panel3.removeAll();
		CommonAction.enableAllPanel2Button();
		panel3.validate();
		panel3.repaint();
		}
			 else {
				 CommonAction.showRedWarning("Datatype of entered parameter does not match the \n default parameter datatype of this function");
			 }
	  }
	}
	
	boolean stringTwoPara() {
		String check1=jTextFieldTwoparaFirst.getText();
		String check2=jTextFieldTwoparaSecond.getText();
		if((BasicOperations.valueCheck("int",check1) || BasicOperations.valueCheck("float",check1)) && (BasicOperations.valueCheck("int",check2) || BasicOperations.valueCheck("float",check2))) {
			 return true;				
		}
		else {
			return false;
		}
	}
	
	void TwoParaSave(){
		boolean paraIsNotString=stringTwoPara();
		
		if(jTextFieldTwoparaFirst.getText().equals("") || jTextFieldTwoparaSecond.getText().equals("")) {
			CommonAction.showRedWarning("Please enter the parameter");
		}
		else {
			 if(paraIsNotString) {
		String temp=jComboBoxTwopara.getSelectedItem().toString()+"( "+jTextFieldTwoparaFirst.getText()+" , "+jTextFieldTwoparaSecond.getText()+" ) ;";
		String function = Status.getFunction();
		String fullCode = CommonReference.getFullVersionCode();
		int index = CommonAction.funcEnd(fullCode,function);
		
		String part1 = fullCode.substring(0,index);
		String part2 = fullCode.substring(index,fullCode.length());
		String actual = part1+temp+part2;
		// do formatting for temp and actual
		UndoWorking.addItem(temp, "normal");
		CommonAction.comboOperations(temp, actual, "Successfully applied");
		// ok boss
		panel3.removeAll();
		CommonAction.enableAllPanel2Button();
		panel3.validate();
		panel3.repaint();
		}
			 else {
				 CommonAction.showRedWarning("Datatype of entered parameter does not match the \n default parameter datatype of this function");
			 }
	   }
	}
}
