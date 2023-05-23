package OnlineSide;

import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class OnlinePayment 
{
	private JFrame payment_frame;
	private JRadioButton R_Button1,R_Button2;
	private JButton main_button;
	private JLabel Display_Label,Card_Number,Exp_Date,Card_CVV_Number,PIN;
	private JTextField Text_Number,Text_Date,Text_CVV_Number,Text_Pin;
	private JPanel upper_panel,lower_panel;
	private Font font;
	OnlinePayment()
	{}
	public void Online_Payment()
	{
		payment_frame = new JFrame("PAYMENT");
		payment_frame.setBounds(330, 100, 500, 400);
		payment_frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		payment_frame.setResizable(false);
		payment_frame.setLayout(new BorderLayout());
		
		upper_panel = new JPanel();
		upper_panel.setBackground(Color.white);
		upper_panel.setForeground(Color.DARK_GRAY);
		payment_frame.add(upper_panel,BorderLayout.PAGE_START);
		
		lower_panel = new JPanel();
		lower_panel.setBackground(Color.DARK_GRAY);
		lower_panel.setForeground(Color.WHITE);
		lower_panel.setLayout(null);
		payment_frame.add(lower_panel,BorderLayout.CENTER);
		
		font = new Font("TIMES NEW ROMAN",Font.BOLD,12);
		Upper_Panel_data();
		lower_panel_card();
		payment_frame.setVisible(true);
	}
	
	public void Upper_Panel_data()
	{
		Display_Label = new JLabel("WHICH TYPE OF CARD YOU WANT TO USE: ");
		Display_Label.setBackground(Color.white);
		Display_Label.setForeground(Color.DARK_GRAY);
		Display_Label.setFont(font);
		
		R_Button1 = new JRadioButton("Debit Card");
		R_Button1.setSize(40, 60);
		R_Button1.setBackground(Color.white);
		R_Button1.setForeground(Color.DARK_GRAY);
		R_Button1.setFont(font);
		R_Button1.addActionListener(new ActionListener()
		{
			@Override
			
			public void actionPerformed(ActionEvent ae)
			{	try {
				if(R_Button1.isSelected())
				{
					R_Button2.setEnabled(false);
					
					
				}
				else 
				{
					R_Button2.setEnabled(false);
				}}
			catch (Exception e)
			{
				System.out.println(e);
			}}
			
				}
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
		
		
		
		upper_panel.add(Display_Label);
		upper_panel.add(R_Button1);
		upper_panel.add(R_Button2);
		
		
	}
	
	public void lower_panel_card()
	{
		Card_Number = new JLabel();
		Card_Number.setText("Enter Card's Number : ");
		Card_Number.setBounds(10, 20, 190, 50);
		Card_Number.setFont(new Font("",Font.BOLD,16));
		Card_Number.setBackground(Color.DARK_GRAY);
		Card_Number.setForeground(Color.WHITE);
		
		
		Text_Number = new JTextField();
		Text_Number.setBounds(320, 30, 160, 30);
		Text_Number.setFont(font);
		Text_Number.setBackground(Color.LIGHT_GRAY);
		Text_Number.setForeground(Color.DARK_GRAY);
		
		Exp_Date = new JLabel();
		Exp_Date.setText("Enter Card's Expiry Date : ");
		Exp_Date.setBounds(10, 80, 210, 50);
		Exp_Date.setFont(new Font("",Font.BOLD,16));
		Exp_Date.setBackground(Color.DARK_GRAY);
		Exp_Date.setForeground(Color.WHITE);
		
		Text_Date = new JTextField();
		Text_Date.setBounds(320, 85, 160, 30);
		Text_Date.setFont(font);
		Text_Date.setBackground(Color.LIGHT_GRAY);
		Text_Date.setForeground(Color.DARK_GRAY);
		
		Card_CVV_Number = new JLabel();
		Card_CVV_Number.setText("Enter Card's CVV Number : ");
		Card_CVV_Number.setBounds(10, 130, 220, 50);
		Card_CVV_Number.setFont(new Font("",Font.BOLD,16));
		Card_CVV_Number.setBackground(Color.DARK_GRAY);
		Card_CVV_Number.setForeground(Color.WHITE);
		
		Text_CVV_Number = new JTextField();
		Text_CVV_Number.setBounds(320, 140, 160, 30);
		Text_CVV_Number.setFont(font);
		Text_CVV_Number.setBackground(Color.LIGHT_GRAY);
		Text_CVV_Number.setForeground(Color.DARK_GRAY);
		
		PIN = new JLabel();
		PIN.setText("Enter 4 Digit PIN Sent To Your Mobile : ");
		PIN.setBounds(10, 190, 300, 50);
		PIN.setFont(new Font("",Font.BOLD,16));
		PIN.setBackground(Color.DARK_GRAY);
		PIN.setForeground(Color.WHITE);
		
		Text_Pin = new JTextField();
		Text_Pin.setBounds(320, 200, 160, 30);
		Text_Pin.setFont(font);
		Text_Pin.setBackground(Color.LIGHT_GRAY);
		Text_Pin.setForeground(Color.DARK_GRAY);

		main_button = new JButton();
		main_button.setText("OK");
		main_button.setBounds(100, 250, 300, 50);
		main_button.setFont(new Font("",Font.BOLD,16));
		main_button.setBackground(Color.DARK_GRAY);
		main_button.setForeground(Color.WHITE);
		main_button.addActionListener(new ActionListener()
				{

					@Override
					public void actionPerformed(ActionEvent ae) {
						try {
						String pin = Text_Pin.getText();
						if(pin.equals("1234"))
						{
							payment_frame.dispose();
						DataOfStore da = new  DataOfStore();
						da.test();}
						else 
						{
							JOptionPane.showMessageDialog(payment_frame, "Sorry! Inout PIN did not match. Re-Enter");
						}}
						catch (Exception e)
						{
							System.out.println(e);
						}
						
						
					}
			
				});

		lower_panel.add(Card_Number);
		lower_panel.add(Text_Number);
		lower_panel.add(Exp_Date);
		lower_panel.add(Text_Date);
		lower_panel.add(Card_CVV_Number);
		lower_panel.add(Text_CVV_Number);
		lower_panel.add(PIN);
		lower_panel.add(Text_Pin);
		lower_panel.add(main_button);
	}

}
