package help;

import javax.swing.JButton;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextPane;

class Keywords implements ActionListener {
	
	JPanel panel2 = CommonReference.getPanel2();
	JPanel panel1 = CommonReference.getPanel1();
	JTextPane jText = CommonReference.getJText();	
	
	JLabel jLabelTextKeywords;
	JComboBox<String> jTextFieldKeywords;
	JButton jButtonShowKeywords;
	

	
	Keywords(){
		panel2.setLayout(null);
		
		jLabelTextKeywords= CommonReference.getJTextKeywords();
		jTextFieldKeywords= CommonReference.getJTextFieldKeywords();
		jButtonShowKeywords= CommonReference.getJButtonShowKeywords();
		
		
		CommonAction.removeAllPanel2Buttons();
		initialisationAllComponentKeywords(); 
	
		
	}
	
	public void initialisationAllComponentKeywords(){
		
		
	
		jLabelTextKeywords.setBounds(20,10,150,30);
		jTextFieldKeywords.setBounds(20,40,150,30);
		jButtonShowKeywords.setBounds(180,40,70,30);
		
		panel2.add(jLabelTextKeywords);
		panel2.add(jTextFieldKeywords);
		panel2.add(jButtonShowKeywords);
		panel2.repaint();
		
		jTextFieldKeywords.addActionListener(this);
		jButtonShowKeywords.addActionListener(this);
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==jButtonShowKeywords)
		{
			buttonClick();
		}
	}
	
	void buttonClick(){
		String temp = jTextFieldKeywords.getItemAt(jTextFieldKeywords.getSelectedIndex()).toString()+"\n";
		String secondCopyOfTemp = temp.trim();
		
		String get = MapClass.getOutPut(secondCopyOfTemp);
		
		jText.setText(get);
		jText.setCaretPosition(0);
	}

	

}
