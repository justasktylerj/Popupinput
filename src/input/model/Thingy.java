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
    
    /**
     * Creates variable for name, age, weight
     */
    public Thingy()
    {
    	name = "";
    	age = -99;
    	weight = -.008;
    }

    /**
     * 
     * @param name
     * @param age
     * @param weight
     */
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

    public void setName(String name)
    {
    	this.name = name;
    }
    
    public void setAge(int age)
    {
    	this.age = age;
    }
    
    public void setWeight(double weight)
    {
    	this.weight = weight;
    }
}

