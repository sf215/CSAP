package help;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JComboBox;
import javax.swing.JTextPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



class HeaderFiles implements ActionListener {
	
	private JPanel panel2 = CommonReference.getPanel2();
	private JTextPane jText = CommonReference.getJText();
	
	private JLabel jLabelTextHeader;
	private JComboBox <String>jTextFieldHeaderFiles;
	private JButton jButtonShowHeader;
	
	
	
	HeaderFiles(){
		panel2.setLayout(null);
		
		jLabelTextHeader= CommonReference.getJTextHeader();
		jTextFieldHeaderFiles= CommonReference.getJTextFieldHeaderFiles();
		jButtonShowHeader = CommonReference.getJButtonShowHeader();
		
		CommonAction.removeAllPanel2Buttons();
		initialisationAllComponentHeaderFiles(); 
		
		
	}
	
	public void initialisationAllComponentHeaderFiles(){
		
		
		
		jLabelTextHeader.setBounds(20,10,150,30);
		jTextFieldHeaderFiles.setBounds(20,40,150,30);
		jButtonShowHeader.setBounds(180,40,70,30);
		
		panel2.add(jLabelTextHeader);
		panel2.add(jTextFieldHeaderFiles);
		panel2.add(jButtonShowHeader);
		panel2.repaint();
		
		jTextFieldHeaderFiles.addActionListener(this);
		jButtonShowHeader.addActionListener(this);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==jButtonShowHeader)
		{
			buttonClick();
		}
	}
	
	void buttonClick(){
		String temp = jTextFieldHeaderFiles.getItemAt(jTextFieldHeaderFiles.getSelectedIndex()).toString()+"\n";
		String secondCopyOfTemp = temp.trim();
		
		String get = MapClass.getOutPut(secondCopyOfTemp);
		
		jText.setText(get);
		jText.setCaretPosition(0);
	}
	
}
