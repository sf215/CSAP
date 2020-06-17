package BasicGui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;



import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/*  
 * intro
 * 1 combobox to show all the functions in the program,1 text field to show the return type of function
 * */

public class SelectFunction implements ActionListener {
	
	
	private JPanel panel3 = CommonReference.getPanel3();

	private JLabel jLabelSelectFunction ;
	private JComboBox<String> jComboFunction;
	private JLabel jLabelreturnType;
	private JTextField jFieldreturnType;
	private JButton jButtonSelectFunction;

	public  void comboForFunction() {
		String[] str = CommonAction.getFunctionNameFullCode();
		final String datatype[]  = CommonAction.getFunctionReturnTypeFullCode();
		final ArrayList<String> a = new ArrayList<String>(Arrays.asList(str));
		
		jComboFunction =  new JComboBox<String>(str);
		jComboFunction.addActionListener(new ActionListener() {

		public void actionPerformed(ActionEvent e) {
			JComboBox<?> jcmbType = (JComboBox<?>) e.getSource();
			 String v=datatype[a.indexOf(jcmbType.getSelectedItem())];
	  		jFieldreturnType.setText(v);  
			}
		});
		
		jFieldreturnType.setText(datatype[0]);
	}
	public void initialisationALLComponent()
	{
		//variables
		jLabelSelectFunction = new JLabel("Select Function");
		jLabelreturnType = new JLabel("Return Type");
		jFieldreturnType  = new JTextField();
		comboForFunction();
		jButtonSelectFunction = new JButton("Select Function");
		
		jFieldreturnType.setEditable(false);
	
		jButtonSelectFunction.addActionListener(this);
	}

	void changeUI()
	{
		jLabelSelectFunction.setBounds(500, 60, 100, 30);
		jComboFunction.setBounds(500, 120, 120, 30);
		jLabelreturnType.setBounds(670,60,100,30);
		jFieldreturnType.setBounds(670,120,120,30);
		jButtonSelectFunction.setBounds(970,120,160,30);
		
		panel3.add(jLabelSelectFunction);
		panel3.add(jComboFunction);
		panel3.add(jLabelreturnType);
		panel3.add(jFieldreturnType);	
		panel3.add(jButtonSelectFunction);
		panel3.revalidate();
		panel3.repaint();
	}	

	SelectFunction()
	{
		panel3.setLayout(null);
		CommonAction.disableAllPanel2Button();
		initialisationALLComponent(); 
		changeUI();
		
	}

	void removePanel3AllComponent()
	{
		//variables
		panel3.remove(jLabelSelectFunction);
		panel3.remove(jComboFunction);
		panel3.remove(jLabelreturnType);
		panel3.remove(jFieldreturnType);
		panel3.remove(jButtonSelectFunction);
		panel3.repaint();
	}	
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		if(e.getSource()==jButtonSelectFunction)
		{
			selectFunction();
		}
	}
	public void selectFunction()
	{
		removePanel3AllComponent();
		CommonAction.enableAllPanel2Button();
		changeFunctionWholeSetup();// aage ki process ari yha hogi
	}
	public void changeFunctionWholeSetup()
	{
		String function  = jComboFunction.getItemAt(jComboFunction.getSelectedIndex()).toString();
		Status.setFunction(function);
		MapClasses.refernceForLoadedFile(CommonReference.getFullVersionCode());
		CommonAction.showStatus();
		CommonAction.showHierarchy();
	}



}
