package Resturant_System;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.ImageIcon;
import javax.swing.JSeparator;
import java.awt.SystemColor;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JTextField;

public class Resturant_System {

	private JFrame frmTheMonalRrestaurant;
	private JTextField textBiryani;
	private JTextField textAchargosht;
	private JTextField text_Aloqeema;
	private JTextField txtmeal;
	private JTextField textPulao;
	private JTextField text_Softdrinks;
	private JTextField text_Tax;
	private JTextField text_Subtotal;
	private JTextField text_Total;
	private JTextField text_Mineralwater;
	private JTextField text_Strawberryshake;
	private JTextField text_Chocolateshake;
	private JTextField text_drinks;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() 
			{
				try {
					Resturant_System window = new Resturant_System();
					window.frmTheMonalRrestaurant.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Resturant_System() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmTheMonalRrestaurant = new JFrame();
		frmTheMonalRrestaurant.setTitle("The Monal Rrestaurant Management System");
		frmTheMonalRrestaurant.setBounds(0, 0, 1110, 710);
		frmTheMonalRrestaurant.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmTheMonalRrestaurant.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.activeCaptionBorder);
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 6));
		panel.setBounds(10, 10, 1070, 143);
		frmTheMonalRrestaurant.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\HP\\Desktop\\mmmm.PNG"));
		lblNewLabel_1.setBorder(new LineBorder(Color.WHITE, 10));
		lblNewLabel_1.setForeground(UIManager.getColor("Button.background"));
		lblNewLabel_1.setBounds(22, 23, 133, 93);
		panel.add(lblNewLabel_1);
		
		
		JLabel lblNewLabel = new JLabel("THE MONAL RESTAURANT MANAGEMENT SYSTEM");
		lblNewLabel.setBackground(new Color(0, 0, 0));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBorder(new LineBorder(Color.WHITE, 10));
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 33));
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setBounds(150, 23, 896, 93);
		panel.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(189, 183, 107));
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 4));
		panel_1.setBounds(10, 146, 1070, 527);
		frmTheMonalRrestaurant.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel txtBiryani = new JLabel("Chicken Biryani");
		txtBiryani.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent evt) 
			{
				Child_Restaurant iNum = new Child_Restaurant();
				iNum.NumbersOnly(evt);
			}
		});
		txtBiryani.setForeground(Color.BLACK);
		txtBiryani.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 22));
		txtBiryani.setBounds(34, 86, 202, 31);
		panel_1.add(txtBiryani);
		
		JLabel lblNewLabel_3 = new JLabel("Meals");
		lblNewLabel_3.setForeground(Color.BLACK);
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 35));
		lblNewLabel_3.setBounds(129, 25, 142, 38);
		panel_1.add(lblNewLabel_3);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(24, 73, 313, 2);
		panel_1.add(separator_1);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(24, 74, 15, 249);
		panel_1.add(separator);
		separator.setOrientation(SwingConstants.VERTICAL);
		
		JSeparator separator_1_1 = new JSeparator();
		separator_1_1.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent evt)
			{
				Child_Restaurant iNum = new Child_Restaurant();
				iNum.NumbersOnly(evt);
			}
		});
		separator_1_1.setBounds(27, 127, 310, 19);
		panel_1.add(separator_1_1);
		
		JLabel txtKarhai = new JLabel("Mutton Karhai");
		txtKarhai.setForeground(Color.BLACK);
		txtKarhai.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 22));
		txtKarhai.setBounds(34, 136, 202, 31);
		panel_1.add(txtKarhai);
		
		JSeparator separator_1_1_1 = new JSeparator();
		separator_1_1_1.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent evt) 
			{
				Child_Restaurant iNum = new Child_Restaurant();
				iNum.NumbersOnly(evt);
			}
		});
		separator_1_1_1.setBounds(24, 177, 310, 19);
		panel_1.add(separator_1_1_1);
		
		JLabel txtAchar = new JLabel("Achar Gosht");
		txtAchar.setForeground(Color.BLACK);
		txtAchar.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 22));
		txtAchar.setBounds(34, 186, 155, 31);
		panel_1.add(txtAchar);
		
		JSeparator separator_1_1_1_1 = new JSeparator();
		separator_1_1_1_1.setBounds(27, 221, 310, 19);
		panel_1.add(separator_1_1_1_1);
		
		JLabel txtQeema = new JLabel("Alo Qeema");
		txtQeema.setForeground(Color.BLACK);
		txtQeema.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 22));
		txtQeema.setBounds(34, 229, 155, 31);
		panel_1.add(txtQeema);
		
		JSeparator separator_1_1_1_1_1 = new JSeparator();
		separator_1_1_1_1_1.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
			}
		});
		separator_1_1_1_1_1.setBounds(27, 270, 310, 19);
		panel_1.add(separator_1_1_1_1_1);
		
		JLabel lblNewLabel_2_1_1_1_1 = new JLabel("Cost of Meal");
		lblNewLabel_2_1_1_1_1.setForeground(Color.BLACK);
		lblNewLabel_2_1_1_1_1.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 23));
		lblNewLabel_2_1_1_1_1.setBounds(34, 279, 155, 31);
		panel_1.add(lblNewLabel_2_1_1_1_1);
		
		JSeparator separator_1_1_1_1_1_1 = new JSeparator();
		separator_1_1_1_1_1_1.setBounds(27, 320, 310, 19);
		panel_1.add(separator_1_1_1_1_1_1);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setOrientation(SwingConstants.VERTICAL);
		separator_2.setBounds(335, 73, 2, 250);
		panel_1.add(separator_2);
		
		JSeparator separator_1_2 = new JSeparator();
		separator_1_2.setBounds(556, 79, 313, 2);
		panel_1.add(separator_1_2);
		
		JSeparator separator_1_3 = new JSeparator();
		separator_1_3.setBounds(556, 127, 313, 19);
		panel_1.add(separator_1_3);
		
		JSeparator separator_1_4 = new JSeparator();
		separator_1_4.setBounds(556, 177, 313, 19);
		panel_1.add(separator_1_4);
		
		JSeparator separator_1_5 = new JSeparator();
		separator_1_5.setBounds(556, 221, 313, 19);
		panel_1.add(separator_1_5);
		
		JSeparator separator_1_6 = new JSeparator();
		separator_1_6.setBounds(556, 270, 313, 19);
		panel_1.add(separator_1_6);
		
		JSeparator separator_2_1 = new JSeparator();
		separator_2_1.setOrientation(SwingConstants.VERTICAL);
		separator_2_1.setBounds(868, 80, 2, 243);
		panel_1.add(separator_2_1);
		
		JLabel lblNewLabel_3_1 = new JLabel("Drinks");
		lblNewLabel_3_1.setForeground(Color.BLACK);
		lblNewLabel_3_1.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 35));
		lblNewLabel_3_1.setBounds(675, 25, 142, 38);
		panel_1.add(lblNewLabel_3_1);
		
		JLabel txtDrinks = new JLabel("Soft Drinks ");
		txtDrinks.setForeground(Color.BLACK);
		txtDrinks.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 22));
		txtDrinks.setBounds(566, 86, 202, 31);
		panel_1.add(txtDrinks);
		
		JLabel txtWater = new JLabel("Shakes");
		txtWater.setForeground(Color.BLACK);
		txtWater.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 22));
		txtWater.setBounds(566, 136, 202, 31);
		panel_1.add(txtWater);
		
		JLabel txtChocolate = new JLabel("Mineral Water");
		txtChocolate.setForeground(Color.BLACK);
		txtChocolate.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 22));
		txtChocolate.setBounds(566, 186, 202, 31);
		panel_1.add(txtChocolate);
		
		JLabel txtStrawberry = new JLabel("Coffee");
		txtStrawberry.setForeground(Color.BLACK);
		txtStrawberry.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 22));
		txtStrawberry.setBounds(566, 229, 202, 31);
		panel_1.add(txtStrawberry);
		
		JLabel txtdrinks = new JLabel("Cost of Drink");
		txtdrinks.setForeground(Color.BLACK);
		txtdrinks.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 23));
		txtdrinks.setBounds(566, 279, 202, 31);
		panel_1.add(txtdrinks);
		
		JLabel txtTax = new JLabel("Tax");
		txtTax.setForeground(Color.BLACK);
		txtTax.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 23));
		txtTax.setBounds(34, 375, 155, 31);
		panel_1.add(txtTax);
		
		JLabel txtSubtotal = new JLabel("Sub Total");
		txtSubtotal.setForeground(Color.BLACK);
		txtSubtotal.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 23));
		txtSubtotal.setBounds(34, 413, 155, 31);
		panel_1.add(txtSubtotal);
		
		JLabel txtTotal = new JLabel("Total");
		txtTotal.setForeground(Color.BLACK);
		txtTotal.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 23));
		txtTotal.setBounds(34, 449, 155, 31);
		panel_1.add(txtTotal);
		
		JButton btnClear = new JButton("Clear");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				JTextField Cleartext=null;
				for (java.awt.Component  c:panel_1.getComponents())
				{
					if (c.getClass().toString().contains("javax.swing.JTextField"))
							{
						Cleartext =(JTextField)c;
						Cleartext.setText("0");
							}
				}
			}
		});
		btnClear.setForeground(new Color(0, 0, 0));
		btnClear.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 23));
		btnClear.setBackground(new Color(220, 220, 220));
		btnClear.setBounds(320, 403, 102, 51);
		panel_1.add(btnClear);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				Child_Restaurant iExit = new Child_Restaurant();
				iExit.iExitSystem();
			}
		});
		btnExit.setForeground(new Color(0, 0, 0));
		btnExit.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 23));
		btnExit.setBackground(new Color(220, 220, 220));
		btnExit.setBounds(320, 466, 102, 51);
		panel_1.add(btnExit);
		
		JButton btnTotal = new JButton("Total");
		btnTotal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				Child_Restaurant itemcost = new Child_Restaurant ();
				double iTax, iSubtotal, iTotal;
				
				itemcost.ChickenBiryani =itemcost.cChickenBiryani * Double.parseDouble(textBiryani.getText());
				itemcost.MuttonKarhai =itemcost.cMuttonKarhai * Double.parseDouble(textPulao.getText());
				itemcost.AcharGosht =itemcost.cAcharGosht * Double.parseDouble(textAchargosht.getText());
				itemcost.AloQeema =itemcost.cAloQeema * Double.parseDouble(text_Aloqeema.getText());
				
				itemcost.SoftDrinks =itemcost.cSoftDrinks * Double.parseDouble(text_Softdrinks.getText());
				itemcost.MineralWater =itemcost.cMineralWater * Double.parseDouble(text_Mineralwater.getText());
				itemcost.Shakes =itemcost.cShakes * Double.parseDouble(text_Strawberryshake.getText());
				itemcost.Coffee =itemcost.cCoffee * Double.parseDouble(text_Chocolateshake.getText());
				
				iSubtotal = itemcost.GetAmount();
				iTax = itemcost.cFindTax(iSubtotal);
				iTotal = iSubtotal + iTax;
				
				String Subtotal = String.format("%.1f", iSubtotal);
				text_Subtotal.setText(Subtotal);
				
				String Tax = String.format("%.1f", iTax);
				text_Tax.setText(Tax);
				
				String Total = String.format("%.1f", iTotal);
				text_Total.setText(Total);
				
				String cMeals = String.format("%.1f", itemcost.itemcost1);
				txtmeal.setText(cMeals);
				
				String cDrinks = String.format("%.1f", itemcost.itemcost2);
				text_drinks.setText(cDrinks);
				
				
			}
		});
		btnTotal.setForeground(new Color(0, 0, 0));
		btnTotal.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 23));
		btnTotal.setBackground(new Color(220, 220, 220));
		btnTotal.setBounds(320, 342, 102, 51);
		panel_1.add(btnTotal);
		
		textBiryani = new JTextField();
		textBiryani.setFont(new Font("Tahoma", Font.PLAIN, 17));
		textBiryani.setHorizontalAlignment(SwingConstants.CENTER);
		textBiryani.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent evt) 
			{
				Child_Restaurant iNum = new Child_Restaurant();
				iNum.NumbersOnly(evt);
			}
		});
		textBiryani.setBounds(188, 90, 117, 27);
		panel_1.add(textBiryani);
		textBiryani.setColumns(10);
		
		textAchargosht = new JTextField();
		textAchargosht.setFont(new Font("Tahoma", Font.PLAIN, 17));
		textAchargosht.setHorizontalAlignment(SwingConstants.CENTER);
		textAchargosht.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent evt) 
			{
				Child_Restaurant iNum = new Child_Restaurant();
				iNum.NumbersOnly(evt);
			}
		});
		textAchargosht.setColumns(10);
		textAchargosht.setBounds(188, 184, 117, 27);
		panel_1.add(textAchargosht);
		
		text_Aloqeema = new JTextField();
		text_Aloqeema.setHorizontalAlignment(SwingConstants.CENTER);
		text_Aloqeema.setFont(new Font("Tahoma", Font.PLAIN, 17));
		text_Aloqeema.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent evt) 
			{
				Child_Restaurant iNum = new Child_Restaurant();
				iNum.NumbersOnly(evt);
			}
		});
		text_Aloqeema.setColumns(10);
		text_Aloqeema.setBounds(188, 233, 117, 27);
		panel_1.add(text_Aloqeema);
		
		txtmeal = new JTextField();
		txtmeal.setFont(new Font("Tahoma", Font.PLAIN, 17));
		txtmeal.setHorizontalAlignment(SwingConstants.CENTER);
		txtmeal.setColumns(10);
		txtmeal.setBounds(188, 283, 117, 27);
		panel_1.add(txtmeal);
		
		textPulao = new JTextField();
		textPulao.setHorizontalAlignment(SwingConstants.CENTER);
		textPulao.setFont(new Font("Tahoma", Font.PLAIN, 17));
		textPulao.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent evt)
			{
				Child_Restaurant iNum = new Child_Restaurant();
				iNum.NumbersOnly(evt);
			}
		});
		textPulao.setColumns(10);
		textPulao.setBounds(188, 137, 117, 27);
		panel_1.add(textPulao);
		
		text_Softdrinks = new JTextField();
		text_Softdrinks.setHorizontalAlignment(SwingConstants.CENTER);
		text_Softdrinks.setFont(new Font("Tahoma", Font.PLAIN, 17));
		text_Softdrinks.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent evt) 
			{
				Child_Restaurant iNum = new Child_Restaurant();
				iNum.NumbersOnly(evt);
			}
		});
		text_Softdrinks.setColumns(10);
		text_Softdrinks.setBounds(741, 87, 117, 27);
		panel_1.add(text_Softdrinks);
		
		text_Tax = new JTextField();
		text_Tax.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent evt)
			{
				Child_Restaurant iNum = new Child_Restaurant();
				iNum.NumbersOnly(evt);
			}
		});
		text_Tax.setFont(new Font("Tahoma", Font.PLAIN, 17));
		text_Tax.setHorizontalAlignment(SwingConstants.CENTER);
		text_Tax.setColumns(10);
		text_Tax.setBounds(160, 378, 117, 27);
		panel_1.add(text_Tax);
		
		text_Subtotal = new JTextField();
		text_Subtotal.setHorizontalAlignment(SwingConstants.CENTER);
		text_Subtotal.setFont(new Font("Tahoma", Font.PLAIN, 17));
		text_Subtotal.setColumns(10);
		text_Subtotal.setBounds(160, 416, 117, 27);
		panel_1.add(text_Subtotal);
		
		text_Total = new JTextField();
		text_Total.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent evt) 
			{
				Child_Restaurant iNum = new Child_Restaurant();
				iNum.NumbersOnly(evt);
			}
		});
		text_Total.setFont(new Font("Tahoma", Font.PLAIN, 17));
		text_Total.setHorizontalAlignment(SwingConstants.CENTER);
		text_Total.setColumns(10);
		text_Total.setBounds(160, 452, 117, 27);
		panel_1.add(text_Total);
		
		text_Mineralwater = new JTextField();
		text_Mineralwater.setHorizontalAlignment(SwingConstants.CENTER);
		text_Mineralwater.setFont(new Font("Tahoma", Font.PLAIN, 17));
		text_Mineralwater.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent evt)
			{
				Child_Restaurant iNum = new Child_Restaurant();
				iNum.NumbersOnly(evt);
			}
		});
		text_Mineralwater.setColumns(10);
		text_Mineralwater.setBounds(741, 137, 117, 27);
		panel_1.add(text_Mineralwater);
		
		text_Strawberryshake = new JTextField();
		text_Strawberryshake.setHorizontalAlignment(SwingConstants.CENTER);
		text_Strawberryshake.setFont(new Font("Tahoma", Font.PLAIN, 17));
		text_Strawberryshake.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent evt)
			{
				Child_Restaurant iNum = new Child_Restaurant();
				iNum.NumbersOnly(evt);
			}
		});
		text_Strawberryshake.setColumns(10);
		text_Strawberryshake.setBounds(741, 233, 117, 27);
		panel_1.add(text_Strawberryshake);
		
		text_Chocolateshake = new JTextField();
		text_Chocolateshake.setHorizontalAlignment(SwingConstants.CENTER);
		text_Chocolateshake.setFont(new Font("Tahoma", Font.PLAIN, 17));
		text_Chocolateshake.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent evt)
			{
				Child_Restaurant iNum = new Child_Restaurant();
				iNum.NumbersOnly(evt);
			}
		});
		text_Chocolateshake.setColumns(10);
		text_Chocolateshake.setBounds(741, 187, 117, 27);
		panel_1.add(text_Chocolateshake);
		
		text_drinks = new JTextField();
		text_drinks.setHorizontalAlignment(SwingConstants.CENTER);
		text_drinks.setFont(new Font("Tahoma", Font.PLAIN, 17));
		text_drinks.setColumns(10);
		text_drinks.setBounds(741, 280, 117, 27);
		panel_1.add(text_drinks);
		
		JSeparator separator_1_6_1 = new JSeparator();
		separator_1_6_1.setBounds(556, 320, 313, 19);
		panel_1.add(separator_1_6_1);
		
		JSeparator separator_2_1_1 = new JSeparator();
		separator_2_1_1.setOrientation(SwingConstants.VERTICAL);
		separator_2_1_1.setBounds(556, 80, 2, 243);
		panel_1.add(separator_2_1_1);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\HP\\Desktop\\chicken biryanii.PNG"));
		lblNewLabel_2.setBounds(356, 62, 160, 63);
		panel_1.add(lblNewLabel_2);
		
		JLabel lblNewLabel_4 = new JLabel("New label");
		lblNewLabel_4.setIcon(new ImageIcon("C:\\Users\\HP\\Desktop\\krhai.PNG"));
		lblNewLabel_4.setBounds(366, 130, 117, 60);
		panel_1.add(lblNewLabel_4);
		JLabel lblNewLabel_5 = new JLabel("New label");
		lblNewLabel_5.setIcon(new ImageIcon("C:\\Users\\HP\\Desktop\\achar gosht.PNG"));
		lblNewLabel_5.setBounds(366, 186, 134, 74);
		panel_1.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("New label");
		lblNewLabel_6.setIcon(new ImageIcon("C:\\Users\\HP\\Desktop\\efefefe.PNG"));
		lblNewLabel_6.setBounds(365, 260, 117, 63);
		panel_1.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("New label");
		lblNewLabel_7.setIcon(new ImageIcon("C:\\Users\\HP\\Desktop\\drinkss.PNG"));
		lblNewLabel_7.setBounds(901, 62, 122, 63);
		panel_1.add(lblNewLabel_7);
		JLabel lblNewLabel_9 = new JLabel("New label");
		lblNewLabel_9.setIcon(new ImageIcon("C:\\Users\\HP\\Desktop\\shakes.PNG"));
		lblNewLabel_9.setBounds(911, 132, 112, 60);
		panel_1.add(lblNewLabel_9);
		
		JLabel lblNewLabel_8 = new JLabel("New label");
		lblNewLabel_8.setIcon(new ImageIcon("C:\\Users\\HP\\Desktop\\water.PNG"));
		lblNewLabel_8.setBounds(921, 200, 79, 50);
		panel_1.add(lblNewLabel_8);
		JLabel lblNewLabel_10 = new JLabel("New label");
		lblNewLabel_10.setIcon(new ImageIcon("C:\\Users\\HP\\Desktop\\COFFFEEE.PNG"));
		lblNewLabel_10.setBounds(901, 260, 122, 63);
		panel_1.add(lblNewLabel_10);
		
		JLabel lblNewLabel_11 = new JLabel("Total Cost");
		lblNewLabel_11.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 10));
		lblNewLabel_11.setIcon(new ImageIcon("C:\\Users\\HP\\Desktop\\RESR.PNG"));
		lblNewLabel_11.setBounds(-158, 0, 1228, 540);
		panel_1.add(lblNewLabel_11);
		
		JLabel lblNewLabel_12 = new JLabel("T");
		lblNewLabel_12.setBounds(34, 349, 45, 13);
		panel_1.add(lblNewLabel_12);
	}
}
