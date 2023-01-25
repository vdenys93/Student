package model;

/**
 * @Viktoriia Denys - vdenys
 * CIS175 - Spring 2023
 * Jan 24, 2023
 */
public class Student {
	private String name; 
	private int age; 
	private double gpa; 

	
	// constructors
	public Student() {
	}
	
	public Student (String sName)
	{
		name = sName; 
	} // end constructor
	
	// method to set the name
	public void setName (String sName)
	{
		name = sName;	// store name
		} 
	

	public String getName ()
	{
		return name;
		} 
	
	
	public void setAge(int sAge)
	{
		age = sAge;	
		} 
	

	public int getAge()
	{
		return age;
	}
	
	
	public void setGpa (double sGpa)
	{
		gpa = sGpa;	
		

	} 
	public double getGpa ()
	{
		return gpa;
	}


	
	
} 


