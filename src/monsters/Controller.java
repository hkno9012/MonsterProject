package monsters;

import model.MarshmallowMonster;

public class Controller
{
	//Data member section
	//Declaration section
	private MarshmallowMonster myMonster;//All data members should be private
	
	//Constructors initialize data members!
	public Controller()
	{
		myMonster = new MarshmallowMonster("perp", 2.0, 4, true, 1);//The monster's name
	}
	
	public void start()
	{
		System.out.println(myMonster);
	}
}
