package help;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextPane;

class Functions implements ActionListener {
	
	private JPanel panel2 = CommonReference.getPanel2();
	private JTextPane jText = CommonReference.getJText();
	
	
	JLabel jLabelTextFunctions;
	JComboBox <String>jTextFieldFunctions;
	JButton jButtonShowFunctions;
	
	
	
	Functions(){
		panel2.setLayout(null);
		
		jLabelTextFunctions = CommonReference.getJTextFunctions();
		jTextFieldFunctions = CommonReference.getJTextFieldFunctions();
		jButtonShowFunctions= CommonReference.getJButtonShowFunctions();
		
		CommonAction.removeAllPanel2Buttons();
		initialisationAllComponentFunctions(); 
		
		
	}
	
	public void initialisationAllComponentFunctions(){
		
		
		jLabelTextFunctions.setBounds(20,10,150,30);
		jTextFieldFunctions.setBounds(20,40,150,30);
		jButtonShowFunctions.setBounds(180,40,70,30);
		
		panel2.add(jLabelTextFunctions);
		panel2.add(jTextFieldFunctions);
		panel2.add(jButtonShowFunctions);
		panel2.repaint();
		
		jTextFieldFunctions.addActionListener(this);
		jButtonShowFunctions.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==jButtonShowFunctions)
		{
			buttonClick();
		}
	}
	
	void buttonClick(){
		String temp = jTextFieldFunctions.getItemAt(jTextFieldFunctions.getSelectedIndex()).toString()+"\n";
		String secondCopyOfTemp = temp.trim();
		System.out.println(secondCopyOfTemp);
		String get = MapClass.getOutPut(secondCopyOfTemp);
		
		jText.setText(get);
		jText.setCaretPosition(0);
	}
}
