package monsters;

import model.MarshmallowMonster;
import java.util.Scanner;

public class Controller
{
	//Data member section
	//Declaration section
	private MarshmallowMonster myMonster;//All data members should be private
	private MarshmallowMonster userMonster;
	
	//Constructors initialize data members!
	public Controller()//Constructor call
	{
		myMonster = new MarshmallowMonster("Perp", 2.0, 4, true, 1);
		userMonster = new MarshmallowMonster();
	}
	
	public void start()
	{
		System.out.println(myMonster);
		
		Scanner inputScanner = new Scanner(System.in);//Must declare the scanner above the inputs
		
		System.out.println("What's your monster's name?");//Prompt
		String name = inputScanner.nextLine();//Allows user input
		userMonster.setName(name);//Sets monster name
		System.out.println("Your monster's name is now " + userMonster.getName());//Repeats input to user
		
		System.out.println("How many legs does " + userMonster.getName() + " have (partial legs are allowed)");//Prompts user and adds monster name with it
		double legCount = inputScanner.nextDouble();
		userMonster.setLegCount(legCount);
		System.out.println(userMonster.getName() + " has " + userMonster.getLegCount() + " legs");
		
		System.out.println("How about " + userMonster.getName() + "'s number of eyes?");
		int eyeCount = inputScanner.nextInt();
		userMonster.setEyeCount(eyeCount);
		System.out.println(userMonster.getName() + " has " + userMonster.getEyeCount() + " eyes now");
	}
}
