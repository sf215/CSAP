package BasicGui;

import javax.swing.*;
import javax.swing.plaf.ColorUIResource;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



import help.BeginningHelp;

public class Beginning implements ActionListener{
	
	private static JFrame jFrame ;
	private static JPanel panel0;
	private static JPanel panel1;
	private static JPanel panel2;
	private static JPanel panel3;
	
	private static JTextPane jTextPanel2;
	private static JTextPane jTextPanel3;
	private static JScrollPane jTextPanel2ScrollBar;
	private static JScrollPane jTextPanel3ScrollBar;
	
	private String path;
	private JSplitPane splitPane1;
	private JToolBar jToolBar;
	
	private JTextPane currentCode;
	private JTextPane fullCode;
	private JTextPane warning;
	private JTextPane status;
	private JList<String> hierarchy;
	private DefaultListModel<String> model;
	
	private JButton create;
	private JButton load;
	private JButton run ;
	private JButton compile;
	private JButton undo;
	private JButton close;
	private JButton back;
	
	private JButton help;
	
	private JScrollPane warnningScrollBar;
	private JScrollPane statusScrollBar;
	private JScrollPane fullCodeScrollBar ;
	private JScrollPane currentCodeScrollBar ;
	private JScrollPane hierarchyScrollBar;
	
	private Font font = new Font("monospaced",Font.PLAIN,14);
	
	
	Beginning()
	{
		jFrame = new JFrame("CSAP");
		jFrame.setBackground(Color.gray);
		jFrame.setSize(1370,730);
		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Cross pe click krne pe app bnd krne ke liye
		jFrame.getContentPane().setLayout(new FlowLayout());
		jFrame.setVisible(true);
		jFrame.setExtendedState(JFrame.MAXIMIZED_BOTH);
		
		ImageIcon c= new ImageIcon(this.getClass().getResource("/img/Csap_Icon.png"));
		jFrame.setIconImage(c.getImage());
		
		showPanles();
		createToolBar();
		createPanel1();
	}
	
	void showPanles()
	{
		panel0 = new JPanel();
		panel1 = new JPanel();
		panel2 = new JPanel();
		panel3 = new JPanel();
		
		jTextPanel2 = new JTextPane();
		jTextPanel3 = new JTextPane();
		jTextPanel2.setEditable(false);
		jTextPanel3.setEditable(false);
		jTextPanel2.setText(Data.panel2Info);
		jTextPanel2.setForeground(new Color(222,222,222));
		jTextPanel2.setFont(font);
		jTextPanel2.setCaretPosition(0);
		jTextPanel3.setText(Data.panel3Info);
		jTextPanel3.setForeground(new Color(222,222,222));
		jTextPanel3.setFont(font);
		jTextPanel3.setCaretPosition(0);
		
		jTextPanel2ScrollBar = new JScrollPane(jTextPanel2,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		jTextPanel3ScrollBar = new JScrollPane(jTextPanel3,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED); 
		
		panel0.setLayout(new BorderLayout());
		panel0.setBackground(new Color(80,80,80));
		panel2.setLayout(new BorderLayout());
		panel2.setBackground(new Color(80,80,80));
		panel3.setLayout(new BorderLayout());
		panel3.setBackground(new Color(80,80,80));
		
		CommonReference.setPanel1(panel0);
		CommonReference.setPanel1(panel1);
		CommonReference.setPanel2(panel2);
		CommonReference.setPanel3(panel3);
		
		CommonReference.setScrollPanePanel2(jTextPanel2ScrollBar);
		CommonReference.setScrollPanePanel3(jTextPanel3ScrollBar);
		
		panel0.setPreferredSize(new Dimension(1370,32));
		panel1.setPreferredSize(new Dimension(1370,300));
		panel2.setPreferredSize(new Dimension(1370,110));
		panel3.setPreferredSize(new Dimension(1370,250));
		
		panel1.setBackground(new Color(80,80,80));
		jTextPanel2ScrollBar.setBounds(0,0,1370,100);
		jTextPanel2.setBackground(new Color(80,80,80));
		jTextPanel3ScrollBar.setBounds(0,0,1370,250);
		jTextPanel3.setBackground(new Color(80,80,80));
		//panel3Scrollbar.setBounds(0,0,1370,200);
		
		//jFrame.add(panel3Scrollbar);
		panel2.add(jTextPanel2ScrollBar);
		panel3.add(jTextPanel3ScrollBar);
		jFrame.add(panel0);
		jFrame.add(panel1);
		
		splitPane1  = new JSplitPane(JSplitPane.VERTICAL_SPLIT,panel2,panel3); 
		
		jFrame.getContentPane().add(splitPane1);
	}
	
		
	
	void createToolBar()
	{
		
		jToolBar =new JToolBar("its toolbar");
		jToolBar.setBackground(new Color(80,80,80));
		jToolBar.setFloatable(false);    //taki tool bar drag na kiya ja sake
		
		CommonReference.setJToolBar(jToolBar);
		
		panel0.add(jToolBar, BorderLayout.PAGE_START);
		
		try{
		ImageIcon c= new ImageIcon(this.getClass().getResource("/img/create.png"));
		Image c1= c.getImage();
		Image c2=  c1.getScaledInstance(30,30,java.awt.Image.SCALE_SMOOTH);
		c = new ImageIcon(c2);
		
		ImageIcon l= new ImageIcon(this.getClass().getResource("/img/load.png"));
		Image l1= l.getImage();
		Image l2=  l1.getScaledInstance(30,30,java.awt.Image.SCALE_SMOOTH);
		l = new ImageIcon(l2);
		
		ImageIcon r= new ImageIcon(this.getClass().getResource("/img/run.png"));
		Image r1= r.getImage();
		Image r2=  r1.getScaledInstance(30,30,java.awt.Image.SCALE_SMOOTH);
		r = new ImageIcon(r2);
		
		ImageIcon u= new ImageIcon(this.getClass().getResource("/img/undo.png"));
		Image u1= u.getImage();
		Image u2=  u1.getScaledInstance(30,30,java.awt.Image.SCALE_SMOOTH);
		u = new ImageIcon(u2);
		
		ImageIcon cl= new ImageIcon(this.getClass().getResource("/img/close.png"));
		Image cl1= cl.getImage();
		Image cl2=  cl1.getScaledInstance(30,30,java.awt.Image.SCALE_SMOOTH);
		cl = new ImageIcon(cl2);
		
		ImageIcon b= new ImageIcon(this.getClass().getResource("/img/back.png"));
		Image b1= b.getImage();
		Image b2=  b1.getScaledInstance(30,30,java.awt.Image.SCALE_SMOOTH);
		b = new ImageIcon(b2);
		
		ImageIcon co= new ImageIcon(this.getClass().getResource("/img/console.png"));
		Image co1= co.getImage();
		Image co2=  co1.getScaledInstance(30,30,java.awt.Image.SCALE_SMOOTH);
		co = new ImageIcon(co2);
		
		ImageIcon h= new ImageIcon(this.getClass().getResource("/img/help.png"));
		Image h1= h.getImage();
		Image h2=  h1.getScaledInstance(30,30,java.awt.Image.SCALE_SMOOTH);
		h = new ImageIcon(h2);
		
		create = new JButton (c);
		load = new JButton (l);
		run = new JButton (r);
		compile = new JButton (co);
		undo = new JButton (u);
		close = new JButton (cl);
		back= new JButton (b);
		help = new JButton (h);
		}
		catch(Exception e)
		{
			JOptionPane.showMessageDialog(null,"Image may be deleted or path may corrupted please close and open again");
			// Isse joption pane hi rhendena isse red warning ya green se replace mt krna 
		}
	
		CommonReference.setCreate(create);
		CommonReference.setLoad(load);
		CommonReference.setRun(run);
		CommonReference.setUndo(undo);
		CommonReference.setClose(close);
		CommonReference.setBack(back);
		CommonReference.setCompile(compile);
		CommonReference.setHelp(help);
		
		create.setBackground(new Color(80,80,80));
		load.setBackground(new Color(80,80,80));
		run.setBackground(new Color(80,80,80));
		undo.setBackground(new Color(80,80,80));
		close.setBackground(new Color(80,80,80));
		back.setBackground(new Color(80,80,80));
		compile.setBackground(new Color(80,80,80));
		help.setBackground(new Color(80,80,80));
		
		create.setBorder(null);
		load.setBorder(null);
		run.setBorder(null);
		undo.setBorder(null);
		close.setBorder(null);
		back.setBorder(null);
		compile.setBorder(null);
		help.setBorder(null);
		
		jToolBar.addSeparator();
		jToolBar.add(create);
		jToolBar.addSeparator();
		jToolBar.add(load);
		jToolBar.addSeparator();
		jToolBar.addSeparator();
		jToolBar.add(run);
		jToolBar.addSeparator();
		jToolBar.add(compile);
		jToolBar.addSeparator();
		jToolBar.addSeparator();
		jToolBar.add(undo);
		jToolBar.addSeparator();
		jToolBar.add(close);
		jToolBar.addSeparator();
		jToolBar.add(back);
		jToolBar.addSeparator();
		jToolBar.addSeparator();
		jToolBar.add(help);
		
		create.setToolTipText("Create");
		load.setToolTipText("Load");
		run.setToolTipText("Run");
		undo.setToolTipText("Undo");
		close.setToolTipText("Close");
		back.setToolTipText("Back");
		compile.setToolTipText("compile");
		help.setToolTipText("Help");
		
		
		create.addActionListener(Beginning.this);
		load.addActionListener(Beginning.this);
		run.addActionListener(Beginning.this);
		undo.addActionListener(Beginning.this);
		close.addActionListener(Beginning.this);
		back.addActionListener(Beginning.this);
		compile.addActionListener(Beginning.this);
		help.addActionListener(Beginning.this);
		
		
		
	}
	
	void createPanel1()
	{
		panel1.setLayout(null);
		
		currentCode = new JTextPane();
		fullCode = new JTextPane();
		warning = new JTextPane();
		status = new JTextPane();
		model = new DefaultListModel<String>();
		hierarchy = new JList<String>(model);
		
		currentCode.setEditable(false);
		fullCode.setEditable(false);
		warning.setEditable(false);
		status.setEditable(false);
		//hierarchy.setEditable(false);
		
		currentCode.setBackground(Color.darkGray);
        currentCode.setFont(font);
        fullCode.setBackground(Color.darkGray);
        fullCode.setFont(font);
        warning.setBackground(Color.darkGray);
        warning.setFont(font);
        status.setBackground(Color.darkGray);
        status.setFont(font);
        hierarchy.setBackground(Color.darkGray);
        hierarchy.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        status.setFont(font);
	
		
		CommonReference.setCurrentCode(currentCode);
		CommonReference.setFullCode(fullCode);
		CommonReference.setWarning(warning);
		CommonReference.setStatus(status);
		CommonReference.setHierarchy(hierarchy);
		
		
		fullCodeScrollBar = new JScrollPane(fullCode,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		currentCodeScrollBar = new JScrollPane(currentCode,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		warnningScrollBar = new JScrollPane(warning,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		statusScrollBar = new JScrollPane(status,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		hierarchyScrollBar= new JScrollPane(hierarchy,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		
		JLabel currentCommand  = new JLabel("Current Code:");
		currentCommand.setForeground(new Color(222,222,222));
		JLabel fullCommand = new JLabel("Full code:");
		fullCommand.setForeground(new Color(222,222,222));
		JLabel warn = new JLabel("Warning:");
		warn.setForeground(new Color(222,222,222));
		JLabel status = new JLabel("Status:");
		status.setForeground(new Color(222,222,222));
		JLabel hierarchyLabel = new JLabel("Outline:");
		hierarchyLabel.setForeground(new Color(222,222,222));
	
		
		currentCodeScrollBar.setBounds(50,30,410,110);
		fullCodeScrollBar.setBounds(470,30,510,250);
		warnningScrollBar.setBounds(50,170,410,110);
		statusScrollBar.setBounds(990,30,175,250);
		hierarchyScrollBar.setBounds(1175,30,130,250);
		
		currentCommand.setBounds(50,5,275,25);
		fullCommand.setBounds(470,5,275,25);
		status.setBounds(990,5,275,25);
		warn.setBounds(50,145,275,25);
		hierarchyLabel.setBounds(1175,5,275,25);
	
		panel1.add(fullCodeScrollBar);
		panel1.add(currentCodeScrollBar);
		panel1.add(warnningScrollBar);
		panel1.add(statusScrollBar);
		panel1.add(hierarchyScrollBar);
		panel1.add(currentCommand);
		panel1.add(fullCommand);
		panel1.add(warn);
		panel1.add(status);
		panel1.add(hierarchyLabel);
	}
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==create)
		{
		//	UIManager UI=new UIManager();
			UIManager.put("OptionPane.background",new ColorUIResource(80,80,80));
			UIManager.put("Panel.background",new ColorUIResource(80,80,80));
			UIManager.put("Label.foreground",new ColorUIResource(222,222,222));
			
			if(path!=null)
			{
				 int dialogButton = JOptionPane.YES_NO_OPTION;
				 int dialogResult =  JOptionPane.showConfirmDialog (null, "Are You sure?","Warning",dialogButton);
				    if (dialogResult == JOptionPane.YES_OPTION)
				    {
				    
				    	CommonAction.newBeginningWithExist();
				    	MapClasses.refershAllParameter();
				    	path = new FileChooserDemo().call();
						boolean result = new FileHandling(path).open();
						if(result)
						{
							try{
								new CodeStart().newFile();// yha fileoutput stream ke karn error aa skti h to wha throws lg rha h hence yha bhi handle krna pd rha h usse
							}catch(Exception e1)
							{
								CommonAction.showRedWarning("New file can not be created.");
							}
						}
						else
						{
							path = null;
						}
						
				    }
			}
			else
			{
				path = new FileChooserDemo().call();
				boolean result = new FileHandling(path).open();
				if(result)
				{
					try{
						new CodeStart().newFile();// yha fileoutput stream ke karn error aa skti h to wha throws lg rha h hence yha bhi handle krna pd rha h usse
					}catch(Exception e1)
					{
						CommonAction.showRedWarning("File is not loaded properly, try again.");
					}
				}
				else
				{
					path = null;
				}
			}
		}
		if(e.getSource()==load)
		{
		
			UIManager.put("OptionPane.background",new ColorUIResource(80,80,80));
			UIManager.put("Panel.background",new ColorUIResource(80,80,80));
			UIManager.put("Label.foreground",new ColorUIResource(222,222,222));
			if(path!=null)
			{
				int dialogButton = JOptionPane.YES_NO_OPTION;
				int dialogResult = JOptionPane.showConfirmDialog (null, "Are You sure?","Warning",dialogButton);
				if (dialogResult == JOptionPane.YES_OPTION)
				{
				   CommonAction.newBeginningWithExist();
				   MapClasses.refershAllParameter();
				    path = new FileChooserDemo().call();
					boolean result = new FileHandling(path).update();
					if(result)
					{
						try{
							new CodeStart().existingFile();
						}catch(Exception e1)
						{	
							CommonAction.showRedWarning("File can not load ");
						}
					}
					else
					{
						path = null;
					}
				}
				
			}
			else
			{
				path = new FileChooserDemo().call();
				boolean result = new FileHandling(path).update();
				if(result)
				{
					try{
						new CodeStart().existingFile();
					}catch(Exception e1)
					{	
						CommonAction.showRedWarning("File can not load ");
					}
				}
				else
				{
					path = null;
				}
			}
		}
		if(e.getSource()==help)
		{
			new BeginningHelp();
		}
		if(e.getSource()==compile)
		{
			
		}
		if(e.getSource()==back)
		{
			if(path!=null)
				CommonAction.backWholePanel3();
			else
				CommonAction.showRedWarning("Open a file first");
		}
		if(e.getSource()==close)
		{
		//	UIManager UI=new UIManager();
			UIManager.put("OptionPane.background",new ColorUIResource(80,80,80));
			UIManager.put("Panel.background",new ColorUIResource(80,80,80));
			UIManager.put("Label.foreground",new ColorUIResource(222,222,222));
			
			if(path!=null)
			{
				int dialogButton = JOptionPane.YES_NO_OPTION;
				int dialogResult = JOptionPane.showConfirmDialog (null, "Are You sure?","Warning",dialogButton);
				 				
				if (dialogResult == JOptionPane.YES_OPTION)
				{
					 CommonAction.newBeginningWithExist();
					 MapClasses.refershAllParameter();
					path=null;
					CommonAction.showGreenWarning("File closed successfully");
				}
			}
			else
			{
				CommonAction.showRedWarning("File parameter is not initialised");
			}
		}
		if(e.getSource()==undo)
		{
			if(path!=null)
				UndoWorking.removeItem();
			else
				CommonAction.showRedWarning("Open file first");
		}
		if(e.getSource()==compile)
		{
			if(path!=null)
				RunFile.compile();
			else
				CommonAction.showRedWarning("Select file properly");
		}
		if(e.getSource()==run)
		{
			if(path!=null)
				RunFile.run();
			else
				CommonAction.showRedWarning("Select file first");
		}
	}

	public static void main(String[] args)
	{
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new Beginning();
			}
		});
		
	}
}
