package monsters;

import model.MarshmallowMonster;

public class Controller
{
	//Data member section
	//Declaration section
	private MarshmallowMonster myMonster;//All data members should be private
	
	//Constructors initialize data members!
	public Controller()//Constructor call
	{
		myMonster = new MarshmallowMonster("Perp", 2.0, 4, true, 1);
	}
	
	public void start()
	{
		System.out.println(myMonster);
	}
}
