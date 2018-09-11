package model;

public class MarshmallowMonster
{
	//Declaration section
	private String name;
	private double legCount;
	private int eyeCount;
	private boolean hasNoses;
	private int armCount;
	
	public MarshmallowMonster()
	{
		//Default Constructor
	}
	
	public MarshmallowMonster(String name)//Constructor
	{
		this.name = name;//Assigning a parameter into an instance
		//Right side has to do with class, and right side has to do with parameter
	}
	
	public MarshmallowMonster(String name, double legCount, int eyeCount, boolean hasNose, int arms)//Constructor
	{
		this.name = name;
		this.legCount = legCount;
		this.eyeCount = eyeCount;
		this.hasNoses = hasNose;
		this.armCount = arms;
	}
	
	public String toString()
	{
		String description = "";
		
		return description;
	}
}
