package help;


import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextPane;
import javax.swing.JButton;

//import BasicGui.CommonReference;

class CommonReference {

	
	static JPanel panel1;
	static JPanel panel2;
	static JPanel panel3;
	
	//panel1
	static JTextPane jText;
	
	//panel 3 
	static JRadioButton jRadioHeaderFile;
	static JRadioButton jRadioKeywords;
	static JRadioButton jRadioFunctions;
	
	//panel2
	static JLabel jTextHeader;
	static JComboBox<String> jTextFieldHeaderFiles;
	static JButton jButtonShowHeader;
	
	static JLabel jTextKeywords;
	static JComboBox <String>jTextFieldKeywords;
	static JButton jButtonShowKeywords;
	
	static JLabel jTextFunctions;
	static JComboBox <String>jTextFieldFunctions;
	static JButton jButtonShowFunctions;

	
	//panels ke refrence store krne ke liye
	static void setPanel1(JPanel panel1) {
		CommonReference.panel1 = panel1;
	}
	static JPanel getPanel1() {
		return panel1;
	}
	static void setPanel2(JPanel panel2) {
		CommonReference.panel2 = panel2;
	}
	static JPanel getPanel2() {
		return panel2;
	}
	static void setPanel3(JPanel panel3) {
		CommonReference.panel3 = panel3;
	}
	static JPanel getPanel3() {
		return panel3;
	}
	
	//panel 1 ke reference
	static void setJText(JTextPane jText) {
		CommonReference.jText = jText;
	}
	static JTextPane getJText() {
		return jText;
	}
	
	
	//panel 3 ke sare elements ke refrence store krene ke liye
	static void setJRadioHeaderFile(JRadioButton jRadioHeaderFile) {
		CommonReference.jRadioHeaderFile = jRadioHeaderFile;
	}
	static JRadioButton getJRadioHeaderFile() {
		return jRadioHeaderFile;		
	}
	static void setJRadioKeywords(JRadioButton jRadioKeywords) {
		CommonReference.jRadioKeywords = jRadioKeywords;
	}
	static JRadioButton getJKeywords() {
		return jRadioKeywords;		
	}
	static void setJRadioFunctions(JRadioButton jRadioFunctions) {
		CommonReference.jRadioFunctions = jRadioFunctions;
	}
	static JRadioButton getJFunctions() {
		return jRadioFunctions;		
	}
	
	
	// panel 2 ke refrence store karane ke liye
	
	//headerfiles
	static void setJTextHeader(JLabel jTextHeader) {
		CommonReference.jTextHeader = jTextHeader;
	}
	static JLabel getJTextHeader() {
		return jTextHeader;
	}
	static void setJTextFieldHeaderFiles(JComboBox <String>jTextFieldHeaderFiles) {
		CommonReference.jTextFieldHeaderFiles = jTextFieldHeaderFiles;
	}
	static JComboBox <String>getJTextFieldHeaderFiles() {
		return jTextFieldHeaderFiles;
	}
	static void setJButtonShowHeader(JButton jButtonShowHeader) {
		CommonReference.jButtonShowHeader = jButtonShowHeader;
	}
	static JButton getJButtonShowHeader() {
		return jButtonShowHeader;
	}
	
	//keywords
	static void setJTextKeywords(JLabel jTextHeaderKeywords) {
		CommonReference.jTextKeywords = jTextHeaderKeywords;
	}
	static JLabel getJTextKeywords() {
		return jTextKeywords;
	}
	static void setJTextFieldKeywords(JComboBox<String> jTextFieldKeywords) {
		CommonReference.jTextFieldKeywords = jTextFieldKeywords;
	}
	static JComboBox<String> getJTextFieldKeywords() {
		return jTextFieldKeywords;
	}
	static void setJButtonShowKeywords(JButton jButtonShowKeywords) {
		CommonReference.jButtonShowKeywords = jButtonShowKeywords;
	}
	static JButton getJButtonShowKeywords() {
		return jButtonShowKeywords;
	}
	//functions
	static void setJTextFunctions(JLabel jTextHeaderFunctions) {
		CommonReference.jTextFunctions = jTextHeaderFunctions;
	}
	static JLabel getJTextFunctions() {
		return jTextFunctions;
	}
	static void setJTextFieldFunctions(JComboBox<String> jTextFieldFunctions) {
		CommonReference.jTextFieldFunctions = jTextFieldFunctions;
	}
	static JComboBox <String>getJTextFieldFunctions() {
		return jTextFieldFunctions;
	}
	static void setJButtonShowFunctions(JButton jButtonShowFunctions) {
		CommonReference.jButtonShowFunctions = jButtonShowFunctions;
	}
	static JButton getJButtonShowFunctions() {
		return jButtonShowFunctions;
	}
	
}
