package Resturant_System;
import java.awt.event.KeyEvent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
public class Parent_Resturant
{
	public double itemcost1;
	public double itemcost2;
	public double itemcost3;
	
	public double ChickenBiryani;
	public double MuttonKarhai;
	public double AcharGosht;
	public double AloQeema;
	
	public double SoftDrinks;
	public double MineralWater;
	public double Shakes;
	public double Coffee;

	public double cChickenBiryani = 150;
	public double cMuttonKarhai = 250;
	public double cAcharGosht = 400;
	public double cAloQeema = 400;
	
	public double cSoftDrinks = 50;
	public double cMineralWater = 50;
	public double cShakes = 250;
	public double cCoffee = 250;

	public double GetAmount()
	{
		itemcost1 = ChickenBiryani + MuttonKarhai + AcharGosht + AloQeema;
		itemcost2 = SoftDrinks + MineralWater + Shakes + Coffee;
		itemcost3 = itemcost1 + itemcost2;
		return itemcost3;
	}
	private JFrame frame;
	public void iExitSystem()
	{
		frame = new JFrame();
		if (JOptionPane.showConfirmDialog(frame,"Confirm if you want to exit", " Restaurant Management System", JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION)
		{
			System.exit(0);
		}
	}
	public double mcTax= 0.90;
	
	public double cFindTax(double cAmount) 
	{
		double FindTax = cAmount -(cAmount * mcTax);
		return FindTax;
	}
	public void NumbersOnly (java.awt.event.KeyEvent evt) 
	{
		char iNumber = evt.getKeyChar();
		if(!(Character.isDigit(iNumber))
			||(iNumber == KeyEvent.VK_BACK_SPACE)
			||(iNumber == KeyEvent.VK_DELETE))
		{
			evt.consume();
		}
	}
	}

