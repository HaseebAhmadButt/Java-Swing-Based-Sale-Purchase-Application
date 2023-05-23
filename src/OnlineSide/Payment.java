package OnlineSide;
import javax.swing.*;
import java.awt.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Payment
{
	private JFrame frame;
	private JPanel panel1,panel2;
	private JButton Button1,Button2;
	private JLabel label1;
	private Font Font;

	public Payment()
	{}
	
	public void PaymentFrame()
	{
		frame = new JFrame("PAYMENT METHOD");
		frame.setBounds(500,200, 350, 200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new BorderLayout());
		frame.setResizable(false);
		
		panel1 = new JPanel();
		panel1.setBackground(Color.white);
		panel1.setForeground(Color.DARK_GRAY);
		frame.add(panel1,BorderLayout.PAGE_START);
		
		panel2 = new JPanel();
		panel2.setBackground(Color.DARK_GRAY);
		panel2.setForeground(Color.white);
		panel2.setLayout(null);
		frame.add(panel2,BorderLayout.CENTER);
		
		Font = new Font("TIMES NEW ROMAN",Font.BOLD,18);
		
		Label();
		Buttons();
		frame.setVisible(true);
	}
	
	
	public void Label()
	{
		label1 = new JLabel();
		label1.setText("SELECT TYPE OF PAYMENT METHOD");
		label1.setFont(Font);
		panel1.add(label1);
		
	}
	
	public void Buttons()
	{
		Button1 = new JButton("CARD PAYMENT");
		Button1.setBounds(42, 10, 250, 40);
		Button1.setFont(Font);
		Button1.setBackground(Color.DARK_GRAY);
		Button1.setForeground(Color.white);
		Button1.addActionListener(new ActionListener()
		{

			@Override
			public void actionPerformed(ActionEvent arg0) {
				try {
				CardPayment cap = new CardPayment();
				frame.dispose();
				cap.frame();
		}
				catch (Exception e)
				{
					System.out.println(e);
				}}
			
				});
		
		
		Button2 = new JButton("ONLINE PAYMENT");
		Button2.setBounds(42, 60, 250, 40);
		Button2.setFont(Font);
		Button2.setBackground(Color.DARK_GRAY);
		Button2.setForeground(Color.white);
		Button2.addActionListener(new ActionListener()
		{

			@Override
			public void actionPerformed(ActionEvent arg0) {
				try {
				OnlinePayment cap = new OnlinePayment();
				frame.dispose();
				cap.Online_Payment();
		}
				catch (Exception e)
				{
					System.out.println(e);
				}}
			
				});
		
		panel2.add(Button1);
		panel2.add(Button2);
		
		
		
	}

}
