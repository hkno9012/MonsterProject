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
	
	public MarshmallowMonster(String name, double legCount, int eyeCount, boolean hasNose, int arms)//Constructor definition
	{
		this.name = name;
		this.legCount = legCount;
		this.eyeCount = eyeCount;
		this.hasNoses = hasNose;
		this.armCount = arms;
	}
	
	public String getName()//First getter
	{
		return name;//Return is an immediate exit point for a method(Should be the method's last line)
	}
	
	public double getLegCount()//Second getter
	{
		return legCount;
	}
	
	public int getEyeCount()//Third getter
	{
		return eyeCount;
	}
	
	public boolean getHasNose()//Fourth getter
	{
		return hasNoses;
	}
	
	public int getArms()//Fifth getter
	{
		return armCount;
	}
	
	public void setName(String name)//First setter(not all programs need setters)
	{
		this.name = name;//this. gives the variable value to the current object.
		//The = takes what's on the right and shoves it to the left
	}
	
	public void setLegCount(double legCount)//Second setter
	{
		this.legCount = legCount;
	}
	
	public void setEyeCount(int eyeCount)//Third setter
	{
		this.eyeCount = eyeCount;
	}
	
	public void setHasNose(boolean hasNose)//Fourth setter
	{
		this.hasNoses = hasNose;
	}
	
	public void setArms(int Arms)//Fifth setter
	{
		this.armCount = Arms;
	}
	
	public String toString()
	{
		String description = "This monster is named " + name
								+ "\n He has " + legCount + " legs"
								+ "\n He has " + eyeCount + " eyes"
								+ "\n He has " + hasNoses + " nose, unlike some monsters"
								+ "\n He has " + armCount + " arm!"
								+ "\n His favorite joke is: "
								+ "Your future";
		
		return description;
	}
}
