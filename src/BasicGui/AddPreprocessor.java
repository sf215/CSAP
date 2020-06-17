package BasicGui;

import javax.swing.*;
import javax.swing.text.Style;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledDocument;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.*;

public class AddPreprocessor implements ActionListener {
	
	private JPanel  panel3 = CommonReference.getPanel3(); 
	
	private JTextPane textArea ; 
	private JButton addPreprocessor ;
	private JLabel detail;
	private JLabel selectPreprocessor;
	private JScrollPane scrollPane;
	private JComboBox<String> preprocessors;
	
	private String remainingPreprocessors[]; 
	
	AddPreprocessor() {
		panel3.setLayout(null);
		CommonAction.disableAllPanel2Button();
		changeUI();
		ifAllUsed();
	}
	
	void changeUI()
	{
		
		textArea = new JTextPane();
		textArea.setText("");
		textArea.setBackground(Color.DARK_GRAY);
		Font font = new Font("monospaced",Font.PLAIN,14);
		textArea.setFont(font);
		addPreprocessor = new JButton("Add Preprocessor");
		detail = new JLabel("Used Preprocessors");
		detail.setForeground(new Color(222,222,222));
        scrollPane = new JScrollPane(textArea,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		String[]  alreadyUsed = CommonAction.getPreprocessorFullCode();
        String[] allUnUsed =  AllArrays.getPreProcessor();
        
        remainingPreprocessors = BasicOperations.removeDuplicacy(allUnUsed, alreadyUsed);
        selectPreprocessor = new JLabel("Select Preprocessor");
		preprocessors = new JComboBox<String>(remainingPreprocessors);
	
		textArea.setEditable(false);
		
		detail.setBounds(100,10,250,15);
		scrollPane.setBounds(100, 30, 300 , 150);
		selectPreprocessor.setBounds(550,60,200,30);
		preprocessors.setBounds(550,90,200,30);
		addPreprocessor.setBounds(800, 90, 150, 30);
		
		StyledDocument doc = textArea.getStyledDocument();
		Style style = doc.addStyle("I am Style",null);
		
		StyleConstants.setForeground(style,Color.orange);
		try{
		
			for(int i=0;i<alreadyUsed.length;i++)
			{
				doc.insertString(doc.getLength(),alreadyUsed[i]+"\n", style);
			//textArea.append(alreadyUsed[i]+"\n");
			}
		}
		catch(Exception e){}
        panel3.add(detail);
       // panel3.add(textArea);
		panel3.add(scrollPane);
		panel3.add(preprocessors);
		panel3.add(addPreprocessor);
		panel3.add(selectPreprocessor);
		panel3.validate();
		panel3.repaint();
		
		addPreprocessor.addActionListener(this);
	
	}
	
	void ifAllUsed()
	{
		if(remainingPreprocessors.length==0)
		{
			CommonAction.enableAllPanel2Button();
			remove();
			CommonAction.showRedWarning("All preprocessors already used");
		}
	}
	
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==addPreprocessor)
		{
			buttonClicked();
		}
	}
	
	
	void buttonClicked()
	{	
		CommonAction.enableAllPanel2Button();
		remove();
		setPreprocessorsToStrings();
	}
	
	void remove()
	{
		panel3.remove(selectPreprocessor);
		panel3.remove(preprocessors);
		panel3.remove(scrollPane);
		panel3.remove(detail);
		panel3.remove(addPreprocessor);
		panel3.repaint();
	}
	
	void setPreprocessorsToStrings()
	{
		String temp = preprocessors.getItemAt(preprocessors.getSelectedIndex()).toString().trim();
		MapClasses.putPreprocessor(temp,"include");

		String fullCode = CommonReference.getFullVersionCode();
		int index = fullCode.indexOf("#include<conio.h>");
		
		String part1 = fullCode.substring(0,index+17);
		String part3 = fullCode.substring(index+17,fullCode.length());
		String actual  = part1+temp+part3;
		
		CommonAction.comboOperations(temp, actual, "Preprocessor successfully added");
		UndoWorking.addItem(temp,"preprocessor");
	}
}
