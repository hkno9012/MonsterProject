package model;

public class MarshmallowMonster
{
	//Declaration section
	private String name;
	private String legCount;
	private String eyeCount;
	private String hasNoses;
	private String armCount;
	
	public MarshmallowMonster()
	{
		//Default Constructor
	}
	
	public MarshmallowMonster(String name)//Constructor
	{
		this.name = name;//Assigning a parameter into an instance
		//Right side has to do with class, and right side has to do with parameter
	}
	
	public MarshmallowMonster(String name, String legCount, String eyeCount, String hasNose, String arms)//Constructor definition
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
	
	public String getLegCount()//Second getter
	{
		return legCount;
	}
	
	public String getEyeCount()//Third getter
	{
		return eyeCount;
	}
	
	public String getHasNose()//Fourth getter
	{
		return hasNoses;
	}
	
	public String getArms()//Fifth getter
	{
		return armCount;
	}
	
	public void setName(String name)//First setter(not all programs need setters)
	{
		this.name = name;//this. gives the variable value to the current object.
		//The = takes what's on the right and shoves it to the left
	}
	
	public void setLegCount(String legCount)//Second setter
	{
		this.legCount = legCount;
	}
	
	public void setEyeCount(String eyeCount)//Third setter
	{
		this.eyeCount = eyeCount;
	}
	
	public void setHasNose(String hasNose)//Fourth setter
	{
		this.hasNoses = hasNose;
	}
	
	public void setArms(String Arms)//Fifth setter
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
