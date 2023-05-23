package OnlineSide;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class CardPayment 
{
	private JFrame main_frame;
	private JPanel panel1,panel2;
	private JRadioButton R_Button1,R_Button2;
	private JLabel label1,label2,label3,label4;
	private JTextField TextField1;
	private JButton Button;
	private Font font;
	
	DataOfStore dos = new DataOfStore();
	
	CardPayment()
	{}
	
	public void frame()
	{
		main_frame = new JFrame("PAYMENT");
		main_frame.setBounds(330, 100, 500, 300);
		main_frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		main_frame.setResizable(false);
		main_frame.setLayout(new BorderLayout());
		
		panel1 = new JPanel();
		panel1.setBackground(Color.white);
		panel1.setForeground(Color.DARK_GRAY);
		main_frame.add(panel1,BorderLayout.PAGE_START);
		
		panel2 = new JPanel();
		panel2.setBackground(Color.DARK_GRAY);
		panel2.setForeground(Color.WHITE);
		panel2.setLayout(null);
		main_frame.add(panel2,BorderLayout.CENTER);
		font = new Font("TIMES NEW ROMAN",Font.BOLD,12);
		UpperPanel();
		LowerPanel();
		main_frame.setVisible(true);
	}

	public void UpperPanel()
	{
		label1 = new JLabel("WHICH TYPE OF CARD YOU WANT TO USE: ");
		label1.setBackground(Color.white);
		label1.setForeground(Color.DARK_GRAY);
		label1.setFont(font);
		
		R_Button1 = new JRadioButton("Debit Card");
		R_Button1.setSize(40, 60);
		R_Button1.setBackground(Color.white);
		R_Button1.setForeground(Color.DARK_GRAY);
		R_Button1.setFont(font);
		R_Button1.addActionListener(new ActionListener()
		{
			@Override
			
			public void actionPerformed(ActionEvent ae)
			{
				try {
				if(R_Button1.isSelected())
				{
					R_Button2.setEnabled(false);
					TextField();
					
					
				}
				else 
				{
					R_Button2.setEnabled(false);
				}}
				catch (Exception e)
				{
					System.out.println(e);
				}
			}}
		);
		
		R_Button2 = new JRadioButton("Credit Card");
		R_Button2.setSize(40, 60);
		R_Button2.setBackground(Color.white);
		R_Button2.setForeground(Color.DARK_GRAY);
		R_Button2.setFont(font);
		R_Button2.addActionListener(new ActionListener()
		{

			@Override
			public void actionPerformed(ActionEvent ae) 
			{	
				try {
				if(R_Button2.isSelected())
				{
					R_Button1.setEnabled(false);
					TextField();
				}
				else 
				{
					R_Button1.setEnabled(false);
				}}
				catch (Exception e)
				{
					System.out.println(e);
				}
				
			}
			
				});
		panel1.add(label1);
		panel1.add(R_Button1);
		panel1.add(R_Button2);
		}
	
	public void LowerPanel()
	{
		label2 = new JLabel();
		label2.setBounds(160, 10, 250, 30);
		label2.setFont(new Font("",Font.BOLD,16));
		label2.setBackground(Color.DARK_GRAY);
		label2.setForeground(Color.WHITE);
		
		label3 = new JLabel();
		
		label3.setBounds(190, 50, 190, 30);
		label3.setFont(new Font("",Font.BOLD,16));
		label3.setBackground(Color.DARK_GRAY);
		label3.setForeground(Color.WHITE);
		
		label4 = new JLabel();
		
		label4.setBounds(10, 90, 300, 50);
		label4.setFont(new Font("",Font.BOLD,16));
		label4.setBackground(Color.DARK_GRAY);
		label4.setForeground(Color.WHITE);
		
		TextField1 = new JTextField();
		TextField1.setBounds(320, 100, 140, 30);
		TextField1.setBackground(Color.DARK_GRAY);
		TextField1.setBorder(BorderFactory.createEmptyBorder());
		TextField1.setFont(font);
		
		Button = new JButton();
		Button.setBounds(100, 160, 300, 50);
		Button.setFont(new Font("",Font.BOLD,24));
		Button.setBorder(BorderFactory.createEmptyBorder());
		Button.setBackground(Color.DARK_GRAY);
		Button.setForeground(Color.WHITE);
		Button.addActionListener(new ActionListener()
		{

			@Override
			public void actionPerformed(ActionEvent ae) {
				try {
				String pin = TextField1.getText();
				if(pin.equals("1234"))
				{
					main_frame.dispose();
				DataOfStore da = new  DataOfStore();
				da.test();}
				else 
				{
					JOptionPane.showMessageDialog(main_frame, "Sorry! Inout PIN did not match. Re-Enter");
				}
			
			}
				catch (Exception e)
				{
					System.out.println(e);
				}
			
				}});
		
		panel2.add(label2);
		panel2.add(label3);
		panel2.add(label4);
		panel2.add(TextField1);
		panel2.add(Button);
	}
	
	public void TextField()
	{
		TextField1.setBackground(Color.LIGHT_GRAY);
		TextField1.setForeground(Color.DARK_GRAY);
				
		label2.setText("Your Card is scratched");
		
		label3.setText("Your Bill is: " + dos.price);
		
		label4.setText("Enter 4 Digit PIN Sent To Your Mobile : ");

		Button.setText("OK");
	}

}
