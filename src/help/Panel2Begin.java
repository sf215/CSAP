package help;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;

class Panel2Begin {
	
	private JLabel jLabelTextHeader;
	private JComboBox<String> jTextFieldHeaderFiles;
	private JButton jButtonShowHeader;
	
	private JLabel jLabelTextKeywords;
	private JComboBox <String>jTextFieldKeywords;
	private JButton jButtonShowKeywords;
	
	private JLabel jLabelTextFunctions;
	private JComboBox<String> jTextFieldFunctions;
	private JButton jButtonShowFunctions;
	
	Panel2Begin(){
		
	String[] header = AllArraysHelp.getPreProcessor();
	String[] keywords = AllArraysHelp.getReservedkeyword();
	String[] functions = AllArraysHelp.getFunctions();
	
	jLabelTextHeader = new JLabel("List Of Header Files");
	
	jTextFieldHeaderFiles = new JComboBox<String>(header);
	jButtonShowHeader = new JButton("Show");
	
	CommonReference.setJTextHeader(jLabelTextHeader);
	CommonReference.setJTextFieldHeaderFiles(jTextFieldHeaderFiles );
	CommonReference.setJButtonShowHeader(jButtonShowHeader);
	
	jLabelTextKeywords = new JLabel("List Of Keywords");
	jTextFieldKeywords = new JComboBox<String>(keywords);
	jButtonShowKeywords = new JButton("Show");
	
	CommonReference.setJTextKeywords(jLabelTextKeywords);
	CommonReference.setJTextFieldKeywords(jTextFieldKeywords);
	CommonReference.setJButtonShowKeywords(jButtonShowKeywords);
	

	jLabelTextFunctions = new JLabel("List Of Functions");
	jTextFieldFunctions = new JComboBox<String>(functions);
	jButtonShowFunctions = new JButton("Show");
	
	CommonReference.setJTextFunctions(jLabelTextFunctions);
	CommonReference.setJTextFieldFunctions(jTextFieldFunctions);
	CommonReference.setJButtonShowFunctions(jButtonShowFunctions);
	}
}
