package OnlineSide;
import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
public class Accounts 
{
	static int index = 0;
	
	 static ArrayList<String> Name = new ArrayList<String>();
	 static ArrayList<String> PhoneNumber = new ArrayList<String>();
	 static ArrayList<String> Address = new ArrayList<String>();
	 static ArrayList<String> Password = new ArrayList<String>();
	 static ArrayList<String> email = new ArrayList<String>();
	private JFrame  frame,Reg_frame;
	private JTextField Tfield, Reg_field1,Reg_field2,Reg_field3,Reg_field4;
	private JTextArea Reg_fieldArea;
	private JLabel label1,label2,label3,Reg_label1,Reg_label2,Reg_label3,Reg_label4,Reg_label5,Reg_label6;
	private JPanel panel,Reg_panel;
	private JPasswordField pas_field;
	private JButton button1,button2,Reg_button1,Reg_button2;
	{
		/* Adding temporary values to all Arraylists
		 * to check the functionality of 
		 * our program.
		 */
		Name.add("Haseeb");
		PhoneNumber.add("3253340");
		Address.add("Zakria Hostels");
		email.add("seecs.edu.pk");
		Password.add("seecs");
		Name.add("Haseeb Ahmad");
		PhoneNumber.add("3253340");
		Address.add("Zakria Hostels");
		email.add("seecs@seecs.edu.pk");
		Password.add("seecs123");
		
	}
	Accounts()
	{}
	public void Account_data()
	{
		frame = new JFrame();
		frame.setTitle("Log In Forum");
		frame.setSize(300,250);
		frame.setLocation(500, 250);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.setLayout(new BorderLayout());
		label1 = new JLabel("HEAVEN'S  FOODS");
		label1.setBackground(Color.DARK_GRAY);
				
		label1.setFont(new Font("TIMES NEW ROMAN",Font.BOLD,24));
		label1.setHorizontalAlignment(SwingConstants.CENTER);
		frame.add(label1,BorderLayout.PAGE_START);
		panel = new JPanel();
		panel.setBackground(Color.DARK_GRAY);
		panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
		panel.setLayout(null);
		frame.getContentPane().add(panel,BorderLayout.CENTER);
		components();
		frame.setVisible(true);
	}
	public void components()
	{ 
		label2 = new JLabel("E-Mail :");
		label2.setBounds(30, 20, 60, 40);
		label2.setFont(new Font("TIMES NEW ROMAN",Font.BOLD,14));
		label2.setForeground(Color.WHITE);
		Tfield = new JTextField();
		Tfield.setBounds(110,20,150,40);
		Tfield.setFont(new Font("TIMES NEW ROMAN",Font.BOLD,14));
		Tfield.setBackground(Color.LIGHT_GRAY);
		label3 = new JLabel();
		label3.setText("Password :");
		label3.setBounds(30,80,70,40);
		label3.setFont(new Font("TIMES NEW ROMAN",Font.BOLD,14));
		label3.setForeground(Color.WHITE);
		pas_field = new JPasswordField();
		pas_field.setBounds(110,80,150,40);
		pas_field.setBackground(Color.LIGHT_GRAY);
		button1 = new JButton("LOG IN");
		button1.setBounds(40,140,90,30);
		button1.setFont(new Font("TIMES NEW ROMAN",Font.BOLD,14));
		button1.setBackground(Color.DARK_GRAY);
		button1.setForeground(Color.WHITE);
		button1.addActionListener(new ActionListener() {											//\n
			@Override
			public void actionPerformed(ActionEvent e)
			{
			try {
				boolean mail = email.contains(Tfield.getText());
				if (mail)
				{
					index = email.indexOf(Tfield.getText());
					log_in_password();
				}
				else
				{
					JOptionPane.showMessageDialog(frame, " Your Account is not found."+
							"\n Please Enter Correct E-mail"+
							"\n Don't have Account Enter Registration Button.");
				}
				
			
				
				}
				catch(Exception a)
				{
					System.out.println(a
							);
				}
			}
		});
		button2 = new JButton("REGISTER");
		button2.setBounds(140,140,120,30);
		button2.setFont(new Font("TIMES NEW ROMAN",Font.BOLD,14));
		button2.setBackground(Color.DARK_GRAY);
		button2.setForeground(Color.WHITE);
		button2.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent ae)
			{
				frame.dispose();
				registration();
			
			}
			
		});
		panel.add(label2);
		panel.add(Tfield);
		panel.add(label3);
		panel.add(pas_field);
		panel.add(button1);
		panel.add(button2);
	}
	public void log_in_password()
		{try {
			String pass = Password.get(index);
			String write_pass = String.valueOf(pas_field.getPassword());
			if(pass.equals(write_pass))
			{	
				DataOfStore dos = new DataOfStore();
				dos.mainframe();
				frame.dispose();
			}
			else {
			
				JOptionPane.showMessageDialog(frame, " Your Account is not found."+
						"\n Please Enter Correct Password."+
						"\n Don't have Account Enter Registration Button");
			}}
			catch(Exception e)
		{
					System.out.println(e);
				
		}
			}
	public void registration()
	{
		Reg_frame = new JFrame();
		Reg_frame.setTitle("Registration Forum");
		Reg_frame.setSize(325,420);
		Reg_frame.setLocation(450, 150);
		Reg_frame.setVisible(true);
		Reg_frame.setDefaultCloseOperation(Reg_frame.EXIT_ON_CLOSE);
		Reg_frame.setResizable(false);
		Reg_frame.setLayout(new BorderLayout());
		Reg_label1 = new JLabel();
		Reg_frame.add(Reg_label1,BorderLayout.PAGE_START);
		Reg_panel = new JPanel();
		Reg_panel.setBackground(Color.DARK_GRAY);
		Reg_panel.setLayout(null);
		Reg_frame.getContentPane().add(Reg_panel,BorderLayout.CENTER);
		Reg_widgets();
		
	}
	public void Reg_widgets()
	{
		Reg_label1.setText("HEAVEN'S FOODS");
		Reg_label1.setBackground(Color.DARK_GRAY);
		Reg_label1.setFont(new Font("TIMES NEW ROMAN",Font.BOLD,24));
		Reg_label1.setHorizontalAlignment(SwingConstants.CENTER);
		Reg_label2 = new JLabel("Name: ");
		Reg_label2.setBounds(30, 10, 60, 40);
		Reg_label2.setFont(new Font("TIMES NEW ROMAN",Font.BOLD,14));
		Reg_label2.setForeground(Color.WHITE);
		Reg_field1 = new JTextField();
		Reg_field1.setBounds(100, 10, 150, 40);
		Reg_field1.setFont(new Font("TIMES NEW ROMAN",Font.BOLD,14));
		Reg_field1.setBackground(Color.LIGHT_GRAY);
		Reg_label3 = new JLabel("Phone No. ");
		Reg_label3.setBounds(30, 60, 70, 40);
		Reg_label3.setFont(new Font("TIMES NEW ROMAN",Font.BOLD,14));
		Reg_label3.setForeground(Color.WHITE);
		Reg_field2 = new JTextField();
		Reg_field2.setBounds(100, 60, 150, 40);
		Reg_field2.setFont(new Font("TIMES NEW ROMAN",Font.BOLD,14));
		Reg_field2.setBackground(Color.LIGHT_GRAY);
		Reg_label4 = new JLabel("E-Mail: ");
		Reg_label4.setBounds(30, 110, 70, 40);
		Reg_label4.setFont(new Font("TIMES NEW ROMAN",Font.BOLD,14));
		Reg_label4.setForeground(Color.WHITE);
		Reg_field3 = new JTextField();
		Reg_field3.setBounds(100, 110, 150, 40);
		Reg_field3.setFont(new Font("TIMES NEW ROMAN",Font.BOLD,14));
		Reg_field3.setBackground(Color.LIGHT_GRAY);
		Reg_label5 = new JLabel("Password: ");
		Reg_label5.setBounds(30, 160, 70, 40);
		Reg_label5.setFont(new Font("TIMES NEW ROMAN",Font.BOLD,14));
		Reg_label5.setForeground(Color.WHITE);
		Reg_field4 = new JTextField();
		Reg_field4.setBounds(100, 160, 150, 40);
		Reg_field4.setFont(new Font("TIMES NEW ROMAN",Font.BOLD,14));
		Reg_field4.setBackground(Color.LIGHT_GRAY);
		Reg_label6 = new JLabel("Address: ");
		Reg_label6.setBounds(30, 210, 70, 40);
		Reg_label6.setFont(new Font("TIMES NEW ROMAN",Font.BOLD,14));
		Reg_label6.setForeground(Color.WHITE);
		Reg_fieldArea = new JTextArea();
		Reg_fieldArea.setBounds(100,210,150,70);
		Reg_fieldArea.setFont(new Font("TIMES NEW ROMAN",Font.BOLD,14));
		Reg_fieldArea.setBackground(Color.LIGHT_GRAY);
		Reg_button1 = new JButton("OK");
		Reg_button1.setBounds(70, 300, 90, 30);;
		Reg_button1.setFont(new Font("TIMES NEW ROMAN",Font.BOLD,14));
		Reg_button1.setBackground(Color.DARK_GRAY);
		Reg_button1.setForeground(Color.WHITE);
		Reg_button1.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent ae)
			{
				try {
				int i = 0;
				Name.add(i,Reg_field1.getText());
				PhoneNumber.add(i,Reg_field2.getText());
				email.add(i,Reg_field3.getText());
				Password.add(i,Reg_field4.getText());
				Address.add(i,Reg_fieldArea.getText());
				Reg_frame.dispose();
				Account_data();
				}
				catch (Exception e)
				{
					System.out.println(e);
				}
				
			}
			
				});
		Reg_button2 = new JButton("CANCEL");
		Reg_button2.setBounds(170, 300, 100, 30);;
		Reg_button2.setFont(new Font("TIMES NEW ROMAN",Font.BOLD,14));
		Reg_button2.setBackground(Color.DARK_GRAY);
		Reg_button2.setForeground(Color.WHITE);
		Reg_button2.addActionListener(new ActionListener()
		{ 
			@Override
			public void actionPerformed(ActionEvent ae)
			{
				
				Reg_frame.dispose();
			}
		});
		
		Reg_panel.add(Reg_label2);
		Reg_panel.add(Reg_field1);
		Reg_panel.add(Reg_label3);
		Reg_panel.add(Reg_field2);
		Reg_panel.add(Reg_label4);
		Reg_panel.add(Reg_field3);
		Reg_panel.add(Reg_label5);
		Reg_panel.add(Reg_field4);
		Reg_panel.add(Reg_label6);
		Reg_panel.add(Reg_fieldArea);
		Reg_panel.add(Reg_button1);
		Reg_panel.add(Reg_button2);
		
	}

		
		
		}
	

	


