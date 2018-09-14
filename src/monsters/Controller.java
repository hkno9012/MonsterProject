package monsters;

import model.MarshmallowMonster;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Controller
{
	//Data member section
	//Declaration section
	private MarshmallowMonster myMonster;//All data members should be private
	private MarshmallowMonster userMonster;
	
	//Constructors initialize data members!
	public Controller()//Constructor call
	{
		myMonster = new MarshmallowMonster("Perp", "2.0", "4", "true", "1");
		userMonster = new MarshmallowMonster();
	}
	
	public void start()
	{
		JOptionPane.showMessageDialog(null, myMonster);//Creates a popup with text
		System.out.println(myMonster);
		
		Scanner inputScanner = new Scanner(System.in);//Must declare the scanner above the inputs
		
		//System.out.println("What's your monster's name?");//Prompt
		//JOptionPane.showMessageDialog(null, "What's your monster's name?");
		//String name = inputScanner.nextLine();//Allows user input
		
		String name = JOptionPane.showInputDialog("What's your monster's name");
		
		//if (validInput)userInput)
		
		userMonster.setName(name);//Sets monster name
		//System.out.println("Your monster's name is now " + userMonster.getName());//Repeats input to user
		JOptionPane.showMessageDialog(null, "Your monster's name is now " + userMonster.getName());
		
		//System.out.println("How many legs does " + userMonster.getName() + " have? (partial legs are allowed)");//Prompts user and adds monster name with it
		JOptionPane.showMessageDialog(null, "How many legs does " + userMonster.getName() + " have? (Partial legs are allowed)");
		String legCount = inputScanner.next();
		userMonster.setLegCount(legCount);
		//System.out.println(userMonster.getName() + " has " + userMonster.getLegCount() + " legs");
		JOptionPane.showMessageDialog(null, userMonster.getName() + " has " + userMonster.getLegCount() + " legs");
		
		//System.out.println("How about " + userMonster.getName() + "'s number of eyes?");
		//JOptionPane.showMessageDialog(null, "How about " + userMonster.getName() + "'s number of eyes?");
		//int eyeCount = inputScanner.nextInt();
		
		String userInput = JOptionPane.showInputDialog(null, "How about \" + userMonster.getName() + \"'s number of eyes?");
		
		userMonster.setEyeCount(userInput);
		//System.out.println(userMonster.getName() + " has " + userMonster.getEyeCount() + " eyes now");
		JOptionPane.showMessageDialog(null, userMonster.getName() + " has " + userMonster.getEyeCount() + " eyes now");
	}
	
	public boolean validInt(String maybeInt)
	{
		boolean isValid = false;
		
		try
		{
			Integer.parseInt(maybeInt);
			isValid = true;
		}
		catch (NumberFormatException error)
		{
			JOptionPane.showMessageDialog(null, "You need to type in a whole number");
		}
		
		return isValid;
	}
	
	public boolean validDouble(String mightBeDouble)
	{
		boolean isValid = false;
		
		try
		{
			Double.parseDouble(mightBeDouble);
			isValid = true;
		}
		catch (NumberFormatException error)
		{
			JOptionPane.showMessageDialog(null, "Type in a deimal value");
		}
		
		return isValid;
	}
}
