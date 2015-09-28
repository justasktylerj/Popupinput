package input.model;

/**
 * 
 * @author tjar2074
 *
 */
public class Thingy 
{
    private String name;
    private int age;
    private double weight;
    
    public Thingy()
    {
    	name = "";
    	age = -99;
    	weight = -.008;
    }
    
    public Thingy(String name, int age, double weight)
    {
    // this. refers to current instance of object	
    	this.name = name;
    	this.age = age;
    	this.weight = weight;	
    }
    
    public String getName()
    {
    	return name;
    }
    public int getAge()
    {
    	return age;
    }
    public double getWeight()
    {
    	return weight;
    }
}

