package BasicGui;

import javax.swing.*;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Panel2Begin implements ActionListener{

	Panel2Begin()
	{
		JPanel panel2 = CommonReference.getPanel2();
		panel2.remove(CommonReference.getScrollPanePanel2());
		CommonReference.getPanel3().remove(CommonReference.getScrollPanePanel3());
		CommonReference.getPanel3().revalidate();
		CommonReference.getPanel3().repaint();
		panel2.setLayout(new GridLayout());
		for(int i = 0;i<AllArrays.getPanel2Button().length;i++)
		{
			CommonReference.setPanel2AllButton(i, (new JButton(AllArrays.getPanel2Button()[i])));
			CommonReference.getPanel2AllButton(i).setBackground(Color.DARK_GRAY);
			CommonReference.getPanel2AllButton(i).setForeground(new Color(222,222,222));
			panel2.add(CommonReference.getPanel2AllButton(i));
			CommonReference.getPanel2AllButton(i).addActionListener(this);
		}
		panel2.revalidate();
		panel2.repaint();
		
	}

	
	public void actionPerformed(ActionEvent e) {
	
		if(e.getSource()==CommonReference.getPanel2AllButton(0)) // Add preprocessor clicked
		{
			new AddPreprocessor();
		}
		if(e.getSource()==CommonReference.getPanel2AllButton(1))
		{
			new Declare(); // Declare button clicked
		}
		if(e.getSource()==CommonReference.getPanel2AllButton(2))
		{
			new Initialize();
		}
		if(e.getSource()==CommonReference.getPanel2AllButton(3))
		{
			new Condition();
		}
		if(e.getSource()==CommonReference.getPanel2AllButton(4))
		{
			new Loop();	
		}
		if(e.getSource()==CommonReference.getPanel2AllButton(5))
		{
			new Operations();
		}
		if(e.getSource()==CommonReference.getPanel2AllButton(6))
		{
			new InsertFunction();
		}
		if(e.getSource()==CommonReference.getPanel2AllButton(7))
		{
			new EndOfLoops();
		}
		if(e.getSource()==CommonReference.getPanel2AllButton(8))
		{
			new Keywords();
		}
		if(e.getSource()==CommonReference.getPanel2AllButton(9))
		{
			new SelectFunction();
		}
	}
	
	

}
