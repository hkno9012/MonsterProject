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
		//_______________________________________________________________________________
		
		String name = JOptionPane.showInputDialog("What's your monster's name");
		//if (validInput)userInput)
		userMonster.setName(name);//Sets monster name
		//System.out.println("Your monster's name is now " + userMonster.getName());//Repeats input to user
		JOptionPane.showMessageDialog(null, "Your monster's name is now " + userMonster.getName());
		//____________________________________________________________________________________________
		//System.out.println("How many legs does " + userMonster.getName() + " have? (partial legs are allowed)");//Prompts user and adds monster name with it
		String legCount = JOptionPane.showInputDialog("How many legs does " + userMonster.getName() + " have? (Partial legs are allowed)");
		//String legCount = inputScanner.next();
		userMonster.setLegCount(legCount);
		//System.out.println(userMonster.getName() + " has " + userMonster.getLegCount() + " legs");
		JOptionPane.showMessageDialog(null, userMonster.getName() + " has " + userMonster.getLegCount() + " legs");
		//_______________________________________________________________________________________________________
		//System.out.println("How about " + userMonster.getName() + "'s number of eyes?");
		//JOptionPane.showMessageDialog(null, "How about " + userMonster.getName() + "'s number of eyes?");
		//int eyeCount = inputScanner.nextInt();
		String eyeCount = JOptionPane.showInputDialog("How about the number of eyes " + userMonster.getName() + " has?");
		userMonster.setEyeCount(eyeCount);
		//System.out.println(userMonster.getName() + " has " + userMonster.getEyeCount() + " eyes now");
		JOptionPane.showMessageDialog(null, userMonster.getName() + " has " + userMonster.getEyeCount() + " eyes now");
		//_____________________________________________________________________________________________________________
		//while (!hasNose.equals("True") || !hasNose.equals("False"))
		String hasNose = JOptionPane.showInputDialog("Does " + userMonster.getName() + " have a nose? (True or False)");
		//while (!hasNose.equals("True") || !hasNose.equals("False"))
		//{
			if (hasNose.equals("True") || hasNose.equals("true") || hasNose.equals("T") || hasNose.equals("t"))//use .equal for strings, not ==
			{
				userMonster.setHasNose("True");
				JOptionPane.showMessageDialog(null, userMonster.getName() + " now has a nose");
			}
			else if (hasNose.equals("False") || hasNose.equals("false") || hasNose.equals("F") || hasNose.equals("f"))
			{
				userMonster.setHasNose("False");
				JOptionPane.showMessageDialog(null, userMonster.getName() + " does not have a nose");
			}
			else
			{
				JOptionPane.showMessageDialog(null, "Please choose True or False");
				//while (!hasNose.equals("True") || !hasNose.equals("False"))
				//{
				
				//}
			//}
		}
		//________________________________________________________________________________
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
