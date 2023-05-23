package OnlineSide;
import javax.swing.*;
import java.awt.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class DataOfStore extends Accounts
{
	
	 private String text;
	 private JTextField text_item_name, text_item_quantity, text_item_price,item_Ser_number_cus_list,
	 					item_unitprice_cus_list,item_name_cus_list, item_quantity_cus_list,item_price_cus_list,total_price,Text_Name,Text_Price,Text_Sr_Number;
	 private JFrame data_frame,order_frame,frame;
	 private JPanel panel1,panel2,panel3,panel4,innerpanel,innerpanel1,table_panel, button_panel,Update_panel1,Update_panel2,Update_Inner;
	 private JLabel label1,label2,label3,label4,cus_name_label,cus_phone_label,cus_address_label,cus_email_label,cus_grandtotal_label,cus_orderstatus_label,
	 				Label_Name,Label_Price,Label_Sr_Number,Label_Request;
	 private JRadioButton R_Button1,R_Button2,R_Button3,Updat_R_Button1,Updat_R_Button2,Updat_R_Button3;
	 private JButton button1,button2,button3,button4,cus_button1,cus_button2,cus_button3,cus_button4,cart_button,order_button, 
	 					Updat_OK_Button,Updat_Delete_Button,Updat_Updat_Button,Updat_Add_Button;
	 private Font font,fnt;
	 private JTable table,customer_table,Updat_Table;
	 static  double price = 0;
	 private ArrayList<Integer> Bakery_values = new ArrayList<>();
	 private ArrayList<Integer> Vege_values = new ArrayList<>();
	 private ArrayList<Integer> Fruit_values = new ArrayList<>();
	 private ArrayList<String> Bak_Items = new ArrayList<>();
	 private ArrayList<String> Vegetables = new ArrayList<>();
	 private ArrayList<String> Fruits = new ArrayList<>();
	 private static ArrayList<String> Customer_List = new ArrayList<>();
	 private static ArrayList<Double> Customer_List_Price = new ArrayList<>();
	 private static ArrayList<Double> Item_Quantity = new ArrayList<>();
	 private static ArrayList<Double> Unit_Price = new ArrayList<>();
	 {


			/* Temporary values added
			 * to check the running of 
			 * our Software
			 */
			Bak_Items.add("Strawberry Cakes");
			Bak_Items.add("Chocolate Frosted Donuts");
			Bak_Items.add("Cinnamon Twist Donuts");
			Bak_Items.add("Strawberry Frosted Donuts");
			Bak_Items.add("Old-fashioned Donuts");
			Bak_Items.add("Brown Bread");
			Bak_Items.add("Honey and Oats Bread");
			Bak_Items.add("Baguette Bread");
			Bakery_values.add(250);
			Bakery_values.add(260);
			Bakery_values.add(270);
			Bakery_values.add(280);
			Bakery_values.add(290);
			Bakery_values.add(300);
			Bakery_values.add(310);
			Bakery_values.add(320);
			Vegetables.add("Beetroot/Beet");
			Vegetables.add("Cabbage");
			Vegetables.add("Carrot");
			Vegetables.add("Eggplant");
			Vegetables.add("Green Onion");
			Vege_values.add(50);
			Vege_values.add(60);
			Vege_values.add(70);
			Vege_values.add(80);
			Vege_values.add(90);
			Fruits.add("Apple");
			Fruits.add("Mango");
			Fruits.add("Avocado");
			Fruits.add("Banana");
			Fruits.add("Kiwi Fruit");
			Fruit_values.add(90);
			Fruit_values.add(100);
			Fruit_values.add(110);
			Fruit_values.add(120);
			Fruit_values.add(130);
}

	 DataOfStore()
	 {}
	 
	 public void mainframe()
	 {
		 data_frame = new JFrame("HEAVEN'S FOODS");
		 data_frame.setBounds(300, 100, 800, 600);
		 data_frame.setResizable(false);
		 data_frame.setLayout(new BorderLayout());
		 data_frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 panel1 = new JPanel();
		 panel1.setBorder(BorderFactory.createMatteBorder(10, 10, 10, 10, Color.LIGHT_GRAY));
		 data_frame.getContentPane().add(panel1,BorderLayout.PAGE_START);
		 panel2 = new JPanel();
		 panel2.setLayout(new BorderLayout());
		 panel2.setBorder(BorderFactory.createMatteBorder(10, 10, 10, 10, Color.WHITE));
		 data_frame.getContentPane().add(panel2,BorderLayout.CENTER);
		 innerpanel = new JPanel();
		 innerpanel.setBackground(Color.LIGHT_GRAY);
		 innerpanel1 = new JPanel();
		 innerpanel1.setBackground(Color.LIGHT_GRAY);
		 panel2.add(innerpanel1,BorderLayout.PAGE_END);
		 panel2.add(innerpanel,BorderLayout.PAGE_START);
		 panel2.setBackground(Color.DARK_GRAY);
		 panel3 = new JPanel();
		 panel3.setBackground(Color.LIGHT_GRAY);
		 panel3.setLayout(new GridLayout(2,2));
		 panel3.setBorder(BorderFactory.createMatteBorder(5, 250, 5, 200, Color.white));
		 data_frame.getContentPane().add(panel3,BorderLayout.PAGE_END);
		 panel4 = new JPanel();
		 data_frame.getContentPane().add(panel4,BorderLayout.LINE_START);
		 panel4.setBackground(Color.LIGHT_GRAY);
		 panel4.setLayout(new GridLayout(3,1));
		 panel4.setBorder(BorderFactory.createMatteBorder(100, 10, 100, 10, Color.white));
		 page_start_panel();
		 order_display_panel();
		 order_panel();
		 data_frame.setVisible(true);
	 }
	 public void page_start_panel()
	 {
		 font = new Font("TIMES NEW ROMAN",Font.BOLD,14);
		 text = "<html><h5 align=\"center\"><font size=\"4\" face=\"TIMES NEW ROMAN\" color=\"darkgray\">WELCOME TO HEAVEN'S FOODS<BR>           ";
		 text = text+"                              WE PROVIDE THE BEST ORGANIC FOOD<BR>        ";
		 text = text+"                                            AND<BR>                       ";
		 text = text+"                           BAKERY ITEMS YOU WILL EVER TASTE IN TOWN<BR>  </h5>";
		 label1 = new JLabel(text);
		 table = new JTable();
		 table.setBackground(Color.LIGHT_GRAY);
		 table.setForeground(Color.DARK_GRAY);
		 DefaultTableModel model5 = new DefaultTableModel();
		 model5.setColumnCount(3);
		 Object obj [] = {"Serial # ","Item"," Rs / kg "}; 
		 model5.setColumnIdentifiers(obj);
		 table.setModel(model5);
		 table.setFont(fnt);
		 table.addMouseListener(new MouseAdapter(){


			@Override
			public void mouseClicked(MouseEvent ae) {
				
				try {
				int Rowindex = table.getSelectedRow();
				text_item_name.setText(table.getValueAt(Rowindex, 1).toString());
				text_item_price.setText(table.getValueAt(Rowindex, 2).toString());
				text_item_quantity.setText("");
				}
				catch (Exception e)
				{
					System.out.println(e);
				}
			}

			 
		 });
		 JScrollPane jpc = new JScrollPane(table);
		 R_Button1 = new JRadioButton();
		 R_Button1.setText("BAKERY ITEMS");
		 R_Button1.setBounds(100, 20, 150, 40);
		 R_Button1.setFont(font);
		 R_Button1.setBackground(Color.LIGHT_GRAY);
		 R_Button1.setForeground(Color.DARK_GRAY);
		 R_Button1.addActionListener(new ActionListener()

		{
			@Override
			public void actionPerformed(ActionEvent ae)
			{ int k = 1;
				try {
				
				if(R_Button1.isSelected())
				{	
					DefaultTableModel model = new DefaultTableModel();
					model.setColumnCount(3);
					model.setRowCount(Bak_Items.size());
					Object obj [] = {"Serial # ","Item"," Rs / kg "}; 
					model.setColumnIdentifiers(obj);
					table.setModel(model);
					
					 
					 
					R_Button2.setEnabled(false);
					R_Button3.setEnabled(false);
					
					
				for(int i = 0; i<Bak_Items.size();i++)
				 {
					 
					 for(int j = 0;j<=2;j++)
					 { 
						
						 if(j==0)
						 {
							 table.setValueAt(k, i, 0);
							 k++;
						 }
						 else if (j==1)
						 {
							 table.setValueAt(Bak_Items.get(i), i, 1);
						 }
						 else if (j==2)
						 {
							 table.setValueAt(Bakery_values.get(i), i, 2);
							 
						 }
					 }
				 }
			}
				else 
				{
					R_Button2.setEnabled(true);
					R_Button3.setEnabled(true);
					DefaultTableModel model1 = new DefaultTableModel();
					model1.setColumnCount(3);
					Object obj [] = {"Serial # ","Item"," Rs / kg "}; 
					model1.setColumnIdentifiers(obj);
					table.setModel(model1);
					
					
				}}
				catch(Exception a)
				{
					System.out.println(a);
				}
				
			}
			});
		 R_Button2 = new JRadioButton();
		 R_Button2.setText("VEGETABLES");
		 R_Button2.setBounds(250, 20, 150, 40);
		 R_Button2.setFont(font);
		 R_Button2.setBackground(Color.LIGHT_GRAY);
		 R_Button2.setForeground(Color.DARK_GRAY);
		 R_Button2.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent ae)
			{	
				int k = 1;
				try {
				if(R_Button2.isSelected())
				{
					DefaultTableModel model2 = new DefaultTableModel();
					model2.setColumnCount(3);
					model2.setRowCount(Vegetables.size());
					Object obj1 [] = {"Serial # ","Item"," Rs / kg "}; 
					model2.setColumnIdentifiers(obj1);
					table.setModel(model2);
					R_Button1.setEnabled(false);
					R_Button3.setEnabled(false);
				for(int i = 0; i<Vegetables.size();i++)
			 {
				 
				 for(int j = 0;j<=2;j++)
				 { 
					
					 if(j==0)
					 {
						 table.setValueAt(k, i, 0);
						 k++;
					 }
					 else if (j==1)
					 {
						 table.setValueAt(Vegetables.get(i), i, 1);
					 }
					 else if (j==2)
					 {
						 table.setValueAt(Vege_values.get(i), i, 2);
						 
					 }
				 }
			 };
				
			}
				else 
				{
					R_Button1.setEnabled(true);
					R_Button3.setEnabled(true);
					DefaultTableModel model3 = new DefaultTableModel();
					model3.setColumnCount(3);
					Object obj1 [] = {"Serial # ","Item"," Rs / kg "}; 
					model3.setColumnIdentifiers(obj1);
					table.setModel(model3);
				}}
				catch(Exception a)
				{
					System.out.println(a);
				}
			
			
			
			
			}});
		 R_Button3 = new JRadioButton();
		 R_Button3.setText("FRUITS");
		 R_Button3.setBounds(400, 20, 150, 40);
		 R_Button3.setFont(font);
		 R_Button3.setBackground(Color.LIGHT_GRAY);
		 R_Button3.setForeground(Color.DARK_GRAY);
		 R_Button3.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent ae)
			{	
				
				  int k = 1;
				
		
				try {
				if(R_Button3.isSelected())
				{
					DefaultTableModel model4 = new DefaultTableModel();
					model4.setColumnCount(3);
					model4.setRowCount(Fruits.size());
					Object obj2 [] = {"Serial # ","Item"," Rs / kg "}; 
					model4.setColumnIdentifiers(obj2);
					table.setModel(model4);
					
					R_Button1.setEnabled(false);
					R_Button2.setEnabled(false);{
					for(int i = 0; i<Fruits.size();i++)
			 {
				 
				 for(int j = 0;j<=2;j++)
				 { 
					
					 if(j==0)
					 {
						 table.setValueAt(k, i, 0);
						 k++;
					 }
					 else if (j==1)
					 {
						 table.setValueAt(Fruits.get(i), i, 1);
					 }
					 else if (j==2)
					 {
						 table.setValueAt(Fruit_values.get(i), i, 2);
						 
					 }
				 }
			 }
			 
			}
		}
				else {
					R_Button1.setEnabled(true);
					R_Button2.setEnabled(true);
					//table.setModel(new DefaultTableModel(null,new String [] {"Serial # ","Item"," Rs / kg "}));
					DefaultTableModel model5 = new DefaultTableModel();
					Object obj2 [] = {"Serial # ","Item"," Rs / kg "};
					model5.setColumnCount(3);
					model5.setColumnIdentifiers(obj2);
					table.setModel(model5);
					//model2.fireTableDataChanged();
					//table.revalidate();
				}}
				catch(Exception a)
				{
					System.out.println(a);
				}}});
		 label2 = new JLabel("WHAT DO YOU WANT TO BUY FROM US!");
		 label2.setBounds(150, 50, 300, 400);
		 label2.setFont(font);
		 label2.setForeground(Color.DARK_GRAY);
		 label3 = new JLabel("Select The Things You Want To Buy");
		 label3.setFont(font);
		 label3.setBackground(Color.LIGHT_GRAY);
		 label3.setForeground(Color.DARK_GRAY);
		 panel1.add(label1);
		 innerpanel.add(label2);
		 innerpanel.add(R_Button1);
		 innerpanel.add(R_Button2);
		 innerpanel.add(R_Button3);
		 innerpanel1.add(label3);
		 panel2.add(jpc,BorderLayout.CENTER);
		 }
	 public void order_panel()

	 {
		 text_item_name = new JTextField("Item Name");
		 text_item_name.setToolTipText("Item Name");
		 text_item_name.setFont(font);
		 text_item_quantity = new JTextField("Enter Quantity");
		 text_item_quantity.setToolTipText("Enter Quantity");
		 text_item_quantity.setFont(font);
		 text_item_price = new JTextField("Item Price");
		 text_item_price.setToolTipText("Item Price");
		 text_item_price.setFont(font);
		 button1 = new JButton("Add To Wish List");
		 button1.setFont(font);
		 button1.setBackground(Color.LIGHT_GRAY);
		 button1.setForeground(Color.DARK_GRAY);
		 button1.addActionListener(new ActionListener()
		 {@Override
		 public void actionPerformed(ActionEvent ae) 
			 {
			 try {
			 		
			 		double unit_price = Double.parseDouble(text_item_price.getText());
				 	double quantity = Double.parseDouble(text_item_quantity.getText());
					double price_item = unit_price*quantity; 
					Customer_List.add(text_item_name.getText());
					Unit_Price.add(unit_price);
					Item_Quantity.add(quantity);
					Customer_List_Price.add(price_item);
			 }
			 catch (Exception e)
			 {
				 System.out.println(e);
			 }}});
		 
		 panel3.add(text_item_name);
		 panel3.add(text_item_quantity);
		 panel3.add(text_item_price);
		 panel3.add(button1);
		 
	 }
	 public void customer_List_frame()
	 		{
			order_frame = new JFrame("ORDER LIST");
			order_frame.setBounds(300, 100, 800, 400);
			order_frame.setResizable(false);
			order_frame.setLayout(new GridLayout(2,1));
			
			table_panel = new JPanel();
			table_panel.setLayout(new BorderLayout());
			table_panel.setBorder(BorderFactory.createMatteBorder(10, 0, 10, 0, Color.LIGHT_GRAY));
			order_frame.getContentPane().add(table_panel);
			
			button_panel = new JPanel();
			button_panel.setLayout(null);
			button_panel.setBackground(Color.LIGHT_GRAY);
			order_frame.getContentPane().add(button_panel);
			
			order_frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			customer_table = new JTable();
			DefaultTableModel model = new DefaultTableModel();
			Object column_count[] = {"Item #", "Item Name","Price / kg " ,"Quantity Bought"," Total" };
			model.setColumnCount(5);
			model.setColumnIdentifiers(column_count);
			model.setRowCount(Customer_List.size());
			customer_table.setModel(model);
			customer_table.setFont(font);
			JScrollPane pane = new JScrollPane(customer_table);
			table_panel.add(pane,BorderLayout.CENTER);
			customer_table.addMouseListener(new MouseAdapter()
			{
				@Override
				public void mouseClicked(MouseEvent ae) {
					
					try {
					item_Ser_number_cus_list.setText("");
					item_name_cus_list.setText("");
					item_unitprice_cus_list.setText("");
					item_quantity_cus_list.setText("");
					item_price_cus_list.setText("");
					
					int Rowindex = customer_table.getSelectedRow();
					item_Ser_number_cus_list.setText(customer_table.getValueAt(Rowindex, 0).toString());
					item_name_cus_list.setText(customer_table.getValueAt(Rowindex, 1).toString());
					item_unitprice_cus_list.setText(customer_table.getValueAt(Rowindex, 2).toString());
					item_quantity_cus_list.setText(customer_table.getValueAt(Rowindex, 3).toString());
					item_price_cus_list.setText(customer_table.getValueAt(Rowindex, 4).toString());}
					catch (Exception e)
					{
						System.out.println(e);
					}
				}});

			{ int count = 1;
			 for (int i = 0;i<Customer_List.size();i++)
			 {
				 for(int column = 0; column<5;column++)
				 {
					 if(column == 0)
					 {
						 customer_table.setValueAt(count, i, 0);	
						 count++;
					 }
					 
					 else if (column == 1)
					 {
						 customer_table.setValueAt(Customer_List.get(i), i, 1);
					 }
					 else if (column == 2)
					 {
						 customer_table.setValueAt(Unit_Price.get(i), i, 2);
					 }
					 else if (column == 3)
					 {
						 customer_table.setValueAt(Item_Quantity.get(i), i, 3);
					 }
					 else if( column == 4)
					 {
						 customer_table.setValueAt( Customer_List_Price.get(i), i, 4);
					 }	 
				 }
			 }
			
		}
			
			order_frame.setVisible(true);
	 		}
	 public void order_display_panel()
	 {
	 	button2 = new JButton();
	 	button2.setText("LOG OUT");
	 	button2.setFont(font);
	 	button2.setBackground(Color.LIGHT_GRAY);
	 	button2.setForeground(Color.DARK_GRAY);
	 	button2.addActionListener(new ActionListener()
		 {
			 @Override

			 public void actionPerformed(ActionEvent ae)
			 {
				try {
				 int value =  JOptionPane.showConfirmDialog(data_frame,"Are You Sure You Want To "
				 											+ "LOG OUT?", "Log Out Confirmation",
				 											JOptionPane.YES_NO_OPTION, 
				 											JOptionPane.QUESTION_MESSAGE);
				
				 if(value == JOptionPane.YES_OPTION)
				 {
					 data_frame.dispose();
					 Accounts acc = new Accounts();
					 acc.Account_data();
				 }	 
			 }
			 catch (Exception e)
				{
					System.out.println(e);
				}
			 
				 }});
		 button3 = new JButton("CART");
		 button3.setFont(font);
		 button3.setBackground(Color.LIGHT_GRAY);
		 button3.setForeground(Color.DARK_GRAY);
		 button3.addActionListener(new ActionListener() 
		{	
			 @Override
			 public void actionPerformed(ActionEvent ae)
			 {try {
				 data_frame.dispose();
				 customer_List_frame();
				 cart_button();
			 }
			 catch (Exception e)
				{
					System.out.println(e);
				}}
			 
		});
		 button4 = new JButton("PLACE ORDER");
		 button4.setFont(font);
		 button4.setBackground(Color.LIGHT_GRAY);
		 button4.setForeground(Color.DARK_GRAY);
		 button4.addActionListener(new ActionListener()
		{	
			 @Override
			 public void actionPerformed(ActionEvent ae)
			 {
			try
			{
				data_frame.dispose();
				 customer_List_frame();
				 button_panel();
				 
			 }
				catch(Exception e)
				{
					 System.out.println(e);
				}
				}
			 
				 });
		 panel4.add(button2);
		 panel4.add(button3);
		 panel4.add(button4);
		 
	 }
	 public void button_panel()
	 		{
	 			label4 = new JLabel("Grand Total");
	 			label4.setFont(font);
	 			label4.setBounds(330, 5, 80, 30);

	 			total_price = new JTextField();
	 			total_price.setBounds(415, 5, 80, 30);
	 			total_price.setFont(font);
	 			
	 			item_Ser_number_cus_list = new JTextField("Item Serial Number");
	 			item_Ser_number_cus_list.setBounds(5,5,200,30);
	 			item_Ser_number_cus_list.setToolTipText("Item Serial Number");
	 			item_Ser_number_cus_list.setFont(font);
	 			item_Ser_number_cus_list.setEditable(false);
	 			
	 			
	 			item_name_cus_list = new JTextField("Item Name");
	 			item_name_cus_list.setBounds(5,40,200,30);
	 			item_name_cus_list.setToolTipText("Item Name");
	 			item_name_cus_list.setFont(font);
	 			item_name_cus_list.setEditable(false);
	 			
	 			cus_button1 = new JButton("UPDATE");
	 			cus_button1.setBounds(220, 40, 100, 30);
	 			cus_button1.setFont(font);
	 			cus_button1.addActionListener(new ActionListener()

	 			{
	 				@Override
	 				public void actionPerformed(ActionEvent ae)
	 				{
	 					try
	 					{
	 					int rowindex = customer_table.getSelectedRow();
	 					int index = Item_Quantity.indexOf(customer_table.getValueAt(rowindex, 3));
	 					Item_Quantity.remove(index);
	 					Customer_List_Price.remove(index);

	 					double quantity = Double.parseDouble(item_quantity_cus_list.getText());
	 					double pric = Double.parseDouble(item_unitprice_cus_list.getText());
	 					item_price_cus_list.setText(quantity*pric+"");
	 					
	 					Item_Quantity.add(index, quantity);
	 					Customer_List_Price.add(index,quantity*pric);
	 					
	 					customer_table.setValueAt(quantity, rowindex, 3);
	 					customer_table.setValueAt(quantity*pric, rowindex, 4);
	 					
	 					DefaultTableModel model = (DefaultTableModel) customer_table.getModel();
	 					
	 					price = 0;
	 		 			for(int i = 0; i<model.getRowCount();i++)
	 		 			{
	 		 				price += (double)customer_table.getValueAt(i, 4);
	 		 			}
	 		 			total_price.setText(price+"");
	 					}
	 					
	 					catch (Exception e)
	 					{
	 						System.out.println(e);
	 					}
	 					}});
	 			
	 			cus_button2 = new JButton("DELETE");
	 			cus_button2.setBounds(220, 75, 100, 30);
	 			cus_button2.setFont(font);
	 			cus_button2.addActionListener(new ActionListener()
	 			{
	 				@Override
	 				public void actionPerformed(ActionEvent ae)
	 				
	 				{
	 					try {
	 					DefaultTableModel model = (DefaultTableModel) customer_table.getModel();
	 					int Rowindex = customer_table.getSelectedRow();
	 					model.removeRow(Rowindex);
	 					
	 					
	 					price = 0;
	 		 			for(int i = 0; i<model.getRowCount();i++)
	 		 			{
	 		 				price += (double)customer_table.getValueAt(i, 4);
	 		 			}
	 		 			total_price.setText(price+"");}
	 					catch(Exception e)
	 					{
	 						System.out.println(e);
	 					}
	 					
	 					
	 				}});
	 			
	 			cus_button3 = new JButton("OK");
	 			cus_button3.setBounds(220, 110, 100, 30);
	 			cus_button3.setFont(font);
	 			cus_button3.addActionListener(new ActionListener()
	 			{
	 				@Override
	 				public void actionPerformed(ActionEvent ae)
	 				{
	 					try
	 					{Payment p = new Payment();
	 					order_frame.dispose();
	 					p.PaymentFrame();
	 					}
	 					catch (Exception e)
	 					{
	 						System.out.println(e);
	 					}
	 				}
	 				
	 			});		
	 			cus_button4 = new JButton("BACK TO MAIN PAGE");
	 			cus_button4.setBounds(220,145, 200, 30);
	 			cus_button4.setFont(font);
	 			cus_button4.addActionListener(new ActionListener()
	 			{
	 				@Override
	 				public void actionPerformed(ActionEvent ae)
	 				{
	 					try{order_frame.dispose();
	 					mainframe();}
	 					catch (Exception e)
	 					{
	 						System.out.println(e);
	 					}
	 				}});
	 			
	 			item_unitprice_cus_list = new JTextField("Price / kg");
	 			item_unitprice_cus_list.setBounds(5,75,200,30);
	 			item_unitprice_cus_list.setToolTipText("Price / kg");
	 			item_unitprice_cus_list.setFont(font);
	 			item_unitprice_cus_list.setEditable(false);
	 			
	 			item_quantity_cus_list = new JTextField("Item Quantity You Bought");
	 			item_quantity_cus_list.setBounds(5,110,200,30);
	 			item_quantity_cus_list.setToolTipText("Item Quantity You Bought");
	 			item_quantity_cus_list.setFont(font);
	 			
	 			item_price_cus_list = new JTextField("Item Total Price");
	 			item_price_cus_list.setBounds(5,145,200,30);
	 			item_price_cus_list.setToolTipText("Item Total Price");
	 			item_price_cus_list.setFont(font);
	 			item_price_cus_list.setEditable(false);
	 			
	 			
	 			{
	 			price = 0;
	 			for(int i = 0; i<Customer_List.size();i++)
	 			{
	 				price += (double)customer_table.getValueAt(i, 4);
	 			}
	 			total_price.setText(price +"");
	 			}
	 			
	 			button_panel.add(cus_button1);
	 			button_panel.add(cus_button2);
	 			button_panel.add(cus_button3);
	 			button_panel.add(cus_button4);
	 			button_panel.add(label4);
	 			button_panel.add(item_Ser_number_cus_list);
	 			button_panel.add(item_unitprice_cus_list);
	 			button_panel.add(item_name_cus_list);
	 			button_panel.add(item_quantity_cus_list);
	 			button_panel.add(item_price_cus_list);
	 			button_panel.add(total_price);
	 			
	 			
	 		}
	 public void cart_button()
	 		{
	 			cart_button = new JButton("BACK TO MAIN PAGE");
	 			cart_button.setFont(font);
	 			cart_button.setBounds(270, 5, 250, 50);
	 			cart_button.addActionListener(new ActionListener()
	 			{	

	 				@Override
	 				public void actionPerformed(ActionEvent ae)
	 				{
	 					try {
	 					order_frame.dispose();
	 					mainframe();}
	 					catch (Exception e)
	 					{
	 						System.out.println(e);
	 					}
	 				}
	 				
	 					});
	 			
	 			button_panel.add(cart_button);
	 			
	 		}
	 public void order_widgets()
	 		{
	 			cus_name_label = new JLabel();
	 			cus_name_label.setText("Name : " + Name.get(index));
	 			cus_name_label.setFont(new Font("TIMES NEW ROMAN",Font.BOLD,18));
	 			cus_name_label.setBounds(20, 5, 200, 30);
	 			
	 			cus_phone_label = new JLabel();
	 			cus_phone_label.setText("Phone Number : " + PhoneNumber.get(index));
	 			cus_phone_label.setFont(new Font("TIMES NEW ROMAN",Font.BOLD,18));
	 			cus_phone_label.setBounds(240, 5, 250, 30);
	 			
	 			cus_address_label = new JLabel();
	 			cus_address_label.setText("Address : " + Address.get(index));
	 			cus_address_label.setFont(new Font("TIMES NEW ROMAN",Font.BOLD,18));
	 			cus_address_label.setBounds(470, 5, 250, 30);
	 			
	 			cus_email_label = new JLabel();
	 			cus_email_label.setText("E-Mail : " + email.get(index));
	 			cus_email_label.setFont(new Font("TIMES NEW ROMAN",Font.BOLD,18));
	 			cus_email_label.setBounds(230, 35, 230, 30);
	 			
	 			cus_grandtotal_label = new JLabel();
	 			cus_grandtotal_label.setText("Total Price : " + price);
	 			cus_grandtotal_label.setFont(new Font("TIMES NEW ROMAN",Font.BOLD,18));
	 			cus_grandtotal_label.setBounds(270, 70, 250, 30);
	 			
	 			cus_orderstatus_label = new JLabel();
	 			cus_orderstatus_label.setText("Payment Status : " + "PAYED");
	 			cus_orderstatus_label.setFont(new Font("TIMES NEW ROMAN",Font.BOLD,18));
	 			cus_orderstatus_label.setBounds(250, 105, 250, 30);
	 			
	 			order_button = new JButton();
	 			order_button.setText("OK");
	 			order_button.setFont(new Font("TIMES NEW ROMAN",Font.BOLD,18));
	 			order_button.setBounds(220,140, 240, 30);
	 			order_button.addActionListener(new ActionListener()
	 			{
	 				@Override
	 				
	 				public void actionPerformed(ActionEvent ae)
	 				{
	 					try {
	 					order_frame.dispose();
	 				}
	 					catch (Exception e)
	 					{
	 						System.out.println(e);
	 					}}
	 				
	 					});
	 			
	 			
	 			button_panel.add(cus_name_label);
	 			button_panel.add(cus_phone_label);
	 			button_panel.add(cus_address_label);
	 			button_panel.add(cus_email_label);
	 			button_panel.add(cus_grandtotal_label);
	 			button_panel.add(cus_orderstatus_label);
	 			button_panel.add(order_button);
	 		}
	 public void test()
	 		{
		 		try {
	 			customer_List_frame();
	 			order_widgets();}
		 		catch (Exception e)
				{
					System.out.println(e);
				}
	 		}
	 public void Update_display_frame()
		{
			try {
			frame = new JFrame();
			frame.setLayout(new GridLayout(2,1));
			frame.setBounds(300, 100, 600, 450);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.setResizable(false);
			
			Update_panel1 = new JPanel();
			Update_panel1.setLayout(new BorderLayout());
			Update_panel1.setBackground(Color.black);
			Update_panel1.setBorder(BorderFactory.createMatteBorder(5, 10, 5, 10, Color.LIGHT_GRAY));
			frame.add(Update_panel1);
			
			Update_panel2 = new JPanel();
			Update_panel2.setLayout(null);
			Update_panel2.setBorder(BorderFactory.createMatteBorder(5, 10, 10, 10, Color.LIGHT_GRAY));
			frame.add(Update_panel2);
			
			Update_Inner = new JPanel();
			Update_Inner.setBackground(Color.LIGHT_GRAY);
			Update_panel1.add(Update_Inner,BorderLayout.PAGE_START);

			fnt = new Font("TIMES NEW ROMAN",Font.BOLD,16);

			Update_Display_panel();
			Update_Button_Panel();
			frame.setVisible(true);}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
	 public void Update_Display_panel()
		{
			Label_Request = new JLabel();
			Label_Request.setText("Select The List Type You Want Change.");
			Label_Request.setFont(fnt);
			
			Updat_Table = new JTable();
			DefaultTableModel model = new DefaultTableModel();
			model.setColumnCount(3);
			Object obj [] = {"Serial # ","Item"," Rs / kg "}; 
			model.setColumnIdentifiers(obj);
			Updat_Table.setModel(model);
			Updat_Table.setFont(fnt);
			Updat_Table.addMouseListener(new MouseAdapter()
			{
				@Override
				public void mouseClicked(MouseEvent ae) {
				try {
					int rownumber = Updat_Table.getSelectedRow();
					Text_Sr_Number.setText(Updat_Table.getValueAt(rownumber, 0).toString());
					Text_Name.setText(Updat_Table.getValueAt(rownumber, 1).toString());
					Text_Price.setText(Updat_Table.getValueAt(rownumber, 2).toString());
				}
				catch (Exception e)
				{
					System.out.println(e);
				}
			}});
			
			JScrollPane sp = new JScrollPane(Updat_Table);
			
			Updat_R_Button1 = new JRadioButton();
			Updat_R_Button1.setText("BAKERY ITEMS");
			Updat_R_Button1.setFont(new Font("",Font.BOLD,12));
			Updat_R_Button1.setBackground(Color.LIGHT_GRAY);
			Updat_R_Button1.setForeground(Color.DARK_GRAY);
			Updat_R_Button1.addActionListener(new ActionListener()
			{

				@Override
				public void actionPerformed(ActionEvent arg0) 
				{
					int k = 1;
					try {
					
					if(Updat_R_Button1.isSelected())
					{	
						DefaultTableModel model = new DefaultTableModel();
						model.setColumnCount(3);
						model.setRowCount(Bak_Items.size());
						Object obj [] = {"Serial # ","Item"," Rs / kg "}; 
						model.setColumnIdentifiers(obj);
						Updat_Table.setModel(model);
					
						 
						 
						Updat_R_Button2.setEnabled(false);
						Updat_R_Button3.setEnabled(false);
						
						
					for(int i = 0; i<Bak_Items.size();i++)
					 {
						 
						 for(int j = 0;j<=2;j++)
						 { 
							
							 if(j==0)
							 {
								 Updat_Table.setValueAt(k, i, 0);
								 k++;
							 }
							 else if (j==1)
							 {
								 Updat_Table.setValueAt(Bak_Items.get(i), i, 1);
							 }
							 else if (j==2)
							 {
								 Updat_Table.setValueAt(Bakery_values.get(i), i, 2);
								 
							 }
						 }
					 }
				}
					else 
					{
						Updat_R_Button2.setEnabled(true);
						Updat_R_Button3.setEnabled(true);
						DefaultTableModel model1 = new DefaultTableModel();
						model1.setColumnCount(3);
						Object obj [] = {"Serial # ","Item"," Rs / kg "}; 
						model1.setColumnIdentifiers(obj);
						 Updat_Table.setModel(model1);
						
						
					}}
				
				catch(Exception a)
				{
					JOptionPane.showMessageDialog(frame, a);
				}}});
			
			Updat_R_Button2 = new JRadioButton();
			Updat_R_Button2.setText("VEGETABLES");
			Updat_R_Button2.setFont(new Font("",Font.BOLD,12));
			Updat_R_Button2.setBackground(Color.LIGHT_GRAY);
			Updat_R_Button2.setForeground(Color.DARK_GRAY);
			Updat_R_Button2.addActionListener(new ActionListener()
			{

				@Override
				public void actionPerformed(ActionEvent arg0) 
				{
					int k = 1;
					try {
					
					if(Updat_R_Button2.isSelected())
					{	
						DefaultTableModel model = new DefaultTableModel();
						model.setColumnCount(3);
						model.setRowCount(Vegetables.size());
						Object obj [] = {"Serial # ","Item"," Rs / kg "}; 
						model.setColumnIdentifiers(obj);
						Updat_Table.setModel(model);
						Updat_R_Button1.setEnabled(false);
						Updat_R_Button3.setEnabled(false);
						
						
					for(int i = 0; i<Vegetables.size();i++)
					 {
						 
						 for(int j = 0;j<=2;j++)
						 { 
							
							 if(j==0)
							 {
								 Updat_Table.setValueAt(k, i, 0);
								 k++;
							 }
							 else if (j==1)
							 {
								 Updat_Table.setValueAt(Vegetables.get(i), i, 1);
							 }
							 else if (j==2)
							 {
								 Updat_Table.setValueAt(Vege_values.get(i), i, 2);
								 
							 }
						 }
					 }
				}
					else 
					{
						Updat_R_Button1.setEnabled(true);
						Updat_R_Button3.setEnabled(true);
						DefaultTableModel model1 = new DefaultTableModel();
						model1.setColumnCount(3);
						Object obj [] = {"Serial # ","Item"," Rs / kg "}; 
						model1.setColumnIdentifiers(obj);
						 Updat_Table.setModel(model1);
						
						
					}}
				
				catch(Exception a)
				{
					JOptionPane.showMessageDialog(frame, a);
				}}});
			Updat_R_Button3 = new JRadioButton();
			Updat_R_Button3.setText("FRUITS");
			Updat_R_Button3.setFont(new Font("",Font.BOLD,12));
			Updat_R_Button3.setBackground(Color.LIGHT_GRAY);
			Updat_R_Button3.setForeground(Color.DARK_GRAY);
			Updat_R_Button3.addActionListener(new ActionListener()
			{

				@Override
				public void actionPerformed(ActionEvent arg0) 
				{
					int k = 1;
					try {
					
					if(Updat_R_Button3.isSelected())
					{	
						DefaultTableModel model = new DefaultTableModel();
						model.setColumnCount(3);
						model.setRowCount(Fruits.size());
						Object obj [] = {"Serial # ","Item"," Rs / kg "}; 
						model.setColumnIdentifiers(obj);
						Updat_Table.setModel(model); 
						Updat_R_Button1.setEnabled(false);
						Updat_R_Button2.setEnabled(false);
						
						
					for(int i = 0; i<Fruits.size();i++)
					 {
						 
						 for(int j = 0;j<=2;j++)
						 { 
							
							 if(j==0)
							 {
								 Updat_Table.setValueAt(k, i, 0);
								 k++;
							 }
							 else if (j==1)
							 {
								 Updat_Table.setValueAt(Fruits.get(i), i, 1);
							 }
							 else if (j==2)
							 {
								 Updat_Table.setValueAt(Fruit_values.get(i), i, 2);
								 
							 }
						 }
					 }
				}
					else 
					{
						Updat_R_Button1.setEnabled(true);
						Updat_R_Button2.setEnabled(true);
						DefaultTableModel model1 = new DefaultTableModel();
						model1.setColumnCount(3);
						Object obj [] = {"Serial # ","Item"," Rs / kg "}; 
						model1.setColumnIdentifiers(obj);
						 Updat_Table.setModel(model1);
						
						
					}}
				catch(Exception a)
				{
					JOptionPane.showMessageDialog(frame, a);
				}}});

			Update_Inner.add(Label_Request);
			Update_Inner.add(Updat_R_Button1);
			Update_Inner.add(Updat_R_Button2);
			Update_Inner.add(Updat_R_Button3);
			Update_panel1.add(sp,BorderLayout.CENTER);
		}
	 public void Update_Button_Panel()
		{
			Label_Sr_Number = new JLabel();
			Label_Sr_Number.setText("Serial No.");
			Label_Sr_Number.setBounds(15, 10, 70, 40);
			Label_Sr_Number.setFont(fnt);
			
			Text_Sr_Number = new JTextField();
			Text_Sr_Number.setBounds(95, 15, 150, 30);
			
			Label_Name = new JLabel();
			Label_Name.setText("Name : ");
			Label_Name.setBounds(15, 50, 70, 40);
			Label_Name.setFont(fnt);
			
			Text_Name = new JTextField();
			Text_Name.setBounds(95, 55, 150, 30);
			
			Label_Price = new JLabel();
			Label_Price.setText("Price : ");
			Label_Price.setBounds(15, 90, 70, 40);
			Label_Price.setFont(fnt);
			
			Text_Price = new JTextField();
			Text_Price.setBounds(95, 95, 150, 30);
			
			Updat_Add_Button = new JButton();
			Updat_Add_Button.setText("ADD");
			Updat_Add_Button.setBounds(300, 15, 100, 30);
			Updat_Add_Button.setBackground(Color.LIGHT_GRAY);
			Updat_Add_Button.setBorder(BorderFactory.createEmptyBorder());											
			Updat_Add_Button.addActionListener(new ActionListener()
			{

				@Override
				public void actionPerformed(ActionEvent ae) 
				{
					try {
						
						if(Updat_R_Button1.isSelected())
						{
							String name = Text_Name.getText();
						int pric = Integer.parseInt(Text_Price.getText());
						Bak_Items.add(name);
						Bakery_values.add(pric);
						
						DefaultTableModel model = new DefaultTableModel();
						model.setColumnCount(3);
						model.setRowCount(Bak_Items.size());
						Object obj [] = {"Serial # ","Item"," Rs / kg "}; 
						model.setColumnIdentifiers(obj);
						Updat_Table.setModel(model);
						
						int k = 1;
						for(int i = 0; i<Bak_Items.size();i++)
						 {
							 
							 for(int j = 0;j<=2;j++)
							 { 
								
								 if(j==0)
								 {
									 Updat_Table.setValueAt(k, i, 0);
									 k++;
								 }
								 else if (j==1)
								 {
									 Updat_Table.setValueAt(Bak_Items.get(i), i, 1);
								 }
								 else if (j==2)
								 {
									 Updat_Table.setValueAt(Bakery_values.get(i), i, 2);
									 
								 }}}}
						
						else if(Updat_R_Button2.isSelected())
						{
						String name = Text_Name.getText();
						int pric = Integer.parseInt(Text_Price.getText());
						Vegetables.add(name);
						Vege_values.add(pric);
						
						DefaultTableModel model = new DefaultTableModel();
						model.setColumnCount(3);
						model.setRowCount(Vegetables.size());
						Object obj [] = {"Serial # ","Item"," Rs / kg "}; 
						model.setColumnIdentifiers(obj);
						Updat_Table.setModel(model);
						
						int k = 1;
						for(int i = 0; i<Vegetables.size();i++)
						 {
							 
							 for(int j = 0;j<=2;j++)
							 { 
								
								 if(j==0)
								 {
									 Updat_Table.setValueAt(k, i, 0);
									 k++;
								 }
								 else if (j==1)
								 {
									 Updat_Table.setValueAt(Vegetables.get(i), i, 1);
								 }
								 else if (j==2)
								 {
									 Updat_Table.setValueAt(Vege_values.get(i), i, 2);
									 
								 }}}}
						else if(Updat_R_Button3.isSelected())
						{
						String name = Text_Name.getText();
						int pric = Integer.parseInt(Text_Price.getText());
						Fruits.add(name);
						Fruit_values.add(pric);
						
						DefaultTableModel model = new DefaultTableModel();
						model.setColumnCount(3);
						model.setRowCount(Fruits.size());
						Object obj [] = {"Serial # ","Item"," Rs / kg "}; 
						model.setColumnIdentifiers(obj);
						Updat_Table.setModel(model);
						
						int k = 1;
						for(int i = 0; i<Fruits.size();i++)
						 {
							 
							 for(int j = 0;j<=2;j++)
							 { 
								
								 if(j==0)
								 {
									 Updat_Table.setValueAt(k, i, 0);
									 k++;
								 }
								 else if (j==1)
								 {
									 Updat_Table.setValueAt(Fruits.get(i), i, 1);
								 }
								 else if (j==2)
								 {
									 Updat_Table.setValueAt(Fruit_values.get(i), i, 2);
									 
								 }}}}
					}
					catch(Exception e)
					{
						System.out.println(e);
					}
				}});

			
			Updat_Updat_Button = new JButton();
			Updat_Updat_Button.setText("UPDATE");
			Updat_Updat_Button.setBounds(300, 55, 100, 30);
			Updat_Updat_Button.setBackground(Color.LIGHT_GRAY);
			Updat_Updat_Button.setBorder(BorderFactory.createEmptyBorder());
			Updat_Updat_Button.addActionListener(new ActionListener()
			{

			@Override
			public void actionPerformed(ActionEvent ae)
			{
				try {

					if(Updat_R_Button1.isSelected())
					{

						int selectedRow = Updat_Table.getSelectedRow();
						int i = Bak_Items.indexOf(Updat_Table.getValueAt(selectedRow, 1).toString());
						Bak_Items.remove(i);
						Bakery_values.remove(i);
						String name = Text_Name.getText();
						double itemprice = Double.parseDouble(Text_Price.getText());
						Updat_Table.setValueAt(name, selectedRow, 1);
						Updat_Table.setValueAt(itemprice, selectedRow, 2);
						Bak_Items.add(i, name);
						int j = (int) itemprice;
						Bakery_values.add(i,j);
					}
					
					else if (Updat_R_Button2.isSelected())
					{
						
						int selectedRow = Updat_Table.getSelectedRow();
						int i = Vegetables.indexOf(Updat_Table.getValueAt(selectedRow, 1).toString());
						Vegetables.remove(i);
						Vege_values.remove(i);
						String name = Text_Name.getText();
						double itemprice = Double.parseDouble(Text_Price.getText());
						Updat_Table.setValueAt(name, selectedRow, 1);
						Updat_Table.setValueAt(itemprice, selectedRow, 2);
						Vegetables.add(i, Updat_Table.getValueAt(selectedRow, 1).toString());
						int j = (int) itemprice;
						Vege_values.add(i,j);
					}
					
					else if (Updat_R_Button3.isSelected())
					{
						
						
						int selectedRow = Updat_Table.getSelectedRow();
						int i = Fruits.indexOf(Updat_Table.getValueAt(selectedRow, 1).toString());
						Fruits.remove(i);
						Fruit_values.remove(i);
						String name = Text_Name.getText();
						double itemprice = Double.parseDouble(Text_Price.getText());
						Updat_Table.setValueAt(name, selectedRow, 1);
						Updat_Table.setValueAt(itemprice, selectedRow, 2);
						Fruits.add(i, name);
						int j = (int) itemprice;
						Fruit_values.add(i,j);
						
					}
								
								
							
				}
					
				
				
				catch (Exception a)
				{
					System.out.println(a);
				}
			}
				
			
			
			
			
			});
			
			
			
			
			Updat_Delete_Button = new JButton();
			Updat_Delete_Button.setText("DELETE");
			Updat_Delete_Button.setBounds(300, 95, 100, 30);
			Updat_Delete_Button.setBackground(Color.LIGHT_GRAY);
			Updat_Delete_Button.setBorder(BorderFactory.createEmptyBorder());
			Updat_Delete_Button.addActionListener(new ActionListener()
					{

						@Override
						public void actionPerformed(ActionEvent ae) 
						{
							try {
							if(Updat_R_Button1.isSelected())
							{
								int Index = Updat_Table.getSelectedRow();
								Bak_Items.remove(Updat_Table.getValueAt(Index, 1).toString());
								Bakery_values.remove(Updat_Table.getValueAt(Index, 2));
								DefaultTableModel model1 = (DefaultTableModel) Updat_Table.getModel();
								model1.removeRow(Index);
								
							}
							else if (Updat_R_Button2.isSelected())
							{
								
								int Index = Updat_Table.getSelectedRow();
								Vegetables.remove(Updat_Table.getValueAt(Index, 1).toString());
								Vege_values.remove(Updat_Table.getValueAt(Index, 2));
								DefaultTableModel model1 = (DefaultTableModel) Updat_Table.getModel();
								model1.removeRow(Index);
							}
							else if (Updat_R_Button3.isSelected())
							{
								
								int Index = Updat_Table.getSelectedRow();
								Fruits.remove(Updat_Table.getValueAt(Index, 1).toString());
								Fruit_values.remove(Updat_Table.getValueAt(Index, 2));
								DefaultTableModel model1 = (DefaultTableModel) Updat_Table.getModel();
								model1.removeRow(Index);
							}
							
							
							
							
						}
							catch (Exception e)
							{
								System.out.println(e);	
							}
							}
				
					});
			
			
			
			Updat_OK_Button = new JButton();
			Updat_OK_Button.setText("OK");
			Updat_OK_Button.setBounds(410, 55, 150, 30);
			Updat_OK_Button.setBackground(Color.LIGHT_GRAY);
			Updat_OK_Button.setBorder(BorderFactory.createEmptyBorder());
			Updat_OK_Button.addActionListener(new ActionListener()
					{

						@Override
						public void actionPerformed(ActionEvent arg0) {
							try {
							frame.dispose();
							mainframe();
							
						}
							catch (Exception e)
							{
								System.out.println(e);	
							}
							}
				
					});

			Update_panel2.add(Label_Sr_Number);
			Update_panel2.add(Text_Sr_Number);
			Update_panel2.add(Label_Name);
			Update_panel2.add(Text_Name);
			Update_panel2.add(Label_Price);
			Update_panel2.add(Text_Price);
			Update_panel2.add(Updat_Add_Button);
			Update_panel2.add(Updat_Updat_Button);
			Update_panel2.add(Updat_Delete_Button);
			Update_panel2.add(Updat_OK_Button);
			
		}

}
	 
