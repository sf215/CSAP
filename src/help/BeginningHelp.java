package help;
import java.awt.Color;





import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.border.*;
import java.awt.FlowLayout;
import java.awt.Font;



public class BeginningHelp implements ActionListener{

	private JFrame jFrame;
	private JPanel panel1;
	private JPanel panel2;
	private JPanel panel3;
	private JTextPane jText;
	private Font font;
	private JScrollPane textScrollBar;
	private JLabel jHeaderFile;
	private JLabel jKeywords;
	private JLabel jFunctions;
	private JRadioButton jRadioHeaderFile;
	private JRadioButton jRadioKeywords;
	private JRadioButton jRadioFunctions;
	private ButtonGroup jButtonGroup;
	
	
	public BeginningHelp(){
		jFrame = new JFrame("Help!");
		jFrame.setSize(800,630);
		jFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);     // ye is liye taki jab apan ise close kare to programe terminate na ho
		jFrame.getContentPane().setLayout(null);
		jFrame.setLocationRelativeTo(null);     //frame ki location center krne ke liye
		jFrame.setResizable(false);     //frame ki size fix krne ke liye 
		jFrame.setVisible(true);
		
		showPanles();
		createPanel1();
		createPanel2();
		createPanel3();
	}
	void showPanles()
	{
		
		panel1 = new JPanel();
		panel2 = new JPanel();
		panel3 = new JPanel();
		panel1.setBackground(new Color(80,80,80));
		panel3.setBackground(Color.DARK_GRAY);
		panel2.setBackground(Color.DARK_GRAY);
		panel2.setLayout(new FlowLayout());
		panel2.setBackground(new Color(180,180,180));
		panel3.setBackground(new Color(180,180,180));
		panel2.setBorder(new EtchedBorder(EtchedBorder.RAISED));
		panel3.setBorder(new EtchedBorder(EtchedBorder.RAISED));
		
		CommonReference.setPanel1(panel1);
		CommonReference.setPanel2(panel2);
		CommonReference.setPanel3(panel3);
		
		
		panel1.setBounds(0,0,800,300);
		panel2.setBounds(0,300,400,330);
		panel3.setBounds(400,300,400,330);
		
		
		jFrame.add(panel1);
		jFrame.add(panel2);
		jFrame.add(panel3);
		
		
	}
	
	void createPanel1(){
		panel1.setLayout(null);
		jText = new JTextPane();
		jText.setBackground(Color.DARK_GRAY);
		jText.setEditable(false);//textpane mai edit krne se rokne ke lioye
		font = new Font("Monospaced",Font.PLAIN,15);
		jText.setFont(font);
		jText.setForeground(new Color(222,222,222));
		textScrollBar = new JScrollPane();
		textScrollBar= new JScrollPane(jText,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
	
		CommonReference.setJText(jText);
		
		textScrollBar.setBounds(75,30,650,250);
		
		//panel1.add(jText);
		panel1.add(textScrollBar);
		
	}
	
	void createPanel2(){
		panel2.setLayout(new FlowLayout());
		
		 new Panel2Begin();
		
	}
	
	void createPanel3(){
		
		panel3.setLayout(null);
		
		jHeaderFile = new JLabel("Header Files");
		jKeywords = new JLabel("Keywords");
		jFunctions = new JLabel ("Functions");
		jRadioHeaderFile = new JRadioButton();
		jRadioKeywords = new JRadioButton();
		jRadioFunctions = new JRadioButton();
		
		jButtonGroup = new ButtonGroup();
		jButtonGroup.add(jRadioHeaderFile);
		jButtonGroup.add(jRadioKeywords);
		jButtonGroup.add(jRadioFunctions);
		
		jHeaderFile.setBounds(50,10,150,20);
		jKeywords.setBounds(50,50,150,20);
		jFunctions.setBounds(50,90,150,20);
		jRadioHeaderFile.setBounds(20,10,150,20);
		jRadioKeywords.setBounds(20,50,150,20);
		jRadioFunctions.setBounds(20,90,150,20);
		
		jRadioHeaderFile.setOpaque(false);                        // radio button ke background color ko no fill krne ke liye
		jRadioKeywords.setOpaque(false);
		jRadioFunctions.setOpaque(false);
		
		CommonReference.setJRadioHeaderFile(jRadioHeaderFile);      // commocreference class mai reference save krne ke liye
		CommonReference.setJRadioKeywords(jRadioKeywords);
		CommonReference.setJRadioFunctions(jRadioFunctions);
		
		panel3.add(jHeaderFile);
		panel3.add(jKeywords);
		panel3.add(jFunctions);
		panel3.add(jRadioHeaderFile);
		panel3.add(jRadioKeywords);
		panel3.add(jRadioFunctions);
		
		jRadioHeaderFile.addActionListener(this);
		jRadioKeywords.addActionListener(this);
		jRadioFunctions.addActionListener(this);
		
		
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==jRadioHeaderFile)
		{
			 new HeaderFiles();
		}
		if(e.getSource()==jRadioKeywords)
		{
			 new Keywords();
		}
		if(e.getSource()==jRadioFunctions)
		{
			 new Functions();
		}
	
	}
}
