package help;
import javax.swing.JPanel;

import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JComboBox;




class CommonAction {
	private static JPanel panel2;	
	private static JLabel jLabelTextHeader ;
	private static JComboBox<String> jTextFieldHeaderFiles;
	private static JButton jButtonShowHeader;
	private static JLabel jLabelTextKeywords;
	private static JComboBox<String> jTextFieldKeywords;
	private static JButton jButtonShowKeywords;
	private static JLabel jLabelTextFunctions;
	private static JComboBox <String>jTextFieldFunctions;
	private static JButton jButtonShowFunctions;
	
	
	
	static void removeAllPanel2Buttons(){
		panel2 = CommonReference.getPanel2();	
		jLabelTextHeader = CommonReference.getJTextHeader();
		jTextFieldHeaderFiles = CommonReference.getJTextFieldHeaderFiles();
		jButtonShowHeader = CommonReference.getJButtonShowHeader();
		jLabelTextKeywords = CommonReference.getJTextKeywords();
		jTextFieldKeywords = CommonReference.getJTextFieldKeywords();
		jButtonShowKeywords = CommonReference.getJButtonShowKeywords();
		jLabelTextFunctions = CommonReference.getJTextFunctions();
		jTextFieldFunctions = CommonReference.getJTextFieldFunctions();
		jButtonShowFunctions = CommonReference.getJButtonShowFunctions();
		
		
		//headerFilers
		
		panel2.remove(jLabelTextHeader);
		panel2.remove(jTextFieldHeaderFiles);
		panel2.remove(jButtonShowHeader);
		
		//keywords
		panel2.remove(jLabelTextKeywords);
		panel2.remove(jTextFieldKeywords);
		panel2.remove(jButtonShowKeywords);
		
		//functions
		panel2.remove(jLabelTextFunctions);
		panel2.remove(jTextFieldFunctions);
		panel2.remove(jButtonShowFunctions);
		
		panel2.revalidate();
		panel2.repaint();
		
		
	}

}
