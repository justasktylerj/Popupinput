package input.controller;

import input.model.Thingy;
import input.view.PopupDisplay;
import input.controller.InputRunner;

public class PopupController 
{
    private PopupDisplay myPopups;
    
    public PopupController()
    {
    	myPopups = new PopupDisplay(); 
    }
	public void start()
    {
        String myName = myPopups.grabAnswer("Type in your name");
		myPopups.showResponse("You dare speak the name " + myName);
		
		String userNumber = myPopups.grabAnswer("type in your age");
		int myAge = Integer.parseInt(userNumber);
		
		
		while(!isInteger(userNumber))
		{
			userNumber = myPopups.grabAnswer("Type in a positie integer for your age!!!");
		}
		
		if(isInteger(userNumber))
		{
			myAge = Integer.parseInt(userNumber);
		}
		else
		{
			myAge = 9999999;
		}
		
		
		myPopups.showResponse("You dare speak the age " + myAge);
		
		String tempWeight = myPopups.grabAnswer("type in your weight");
		double myWeight;
		
		while(!isDouble(userNumber))
		{
			userNumber = myPopups.grabAnswer("Type in a double for your age!!!");
		}
		
		if(isDouble(tempWeight))
		{
			myWeight = Double.parseDouble(tempWeight);
		}
		else
		{
			myPopups.showResponse("You dare speak the weight " + myWeight);
		}
		
		myTestThing = new Thingy(myName, myAge, myWeight);
    }    
	
	private boolean isInteger(String input)
	{
		boolean isInt = false;
		
		try
		{
			int temp = Integer.parseInt(input);
			isInt = true;
		}
		catch(NumberFormatException error)
		{
			myPopups.showResponse("not an int  - bad value will be used");
		}
		
		return isInt;
	}
	private boolean isDouble(String input)
	{
		boolean isDouble = false;
		
		try
		{
		double temp = Double.parseDouble(input);
			isDouble = true;
		}
		catch(NumberFormatException error)
		{
			myPopups.showResponse("not a double  - bad value will be used");
		}
		
		return isDouble;
	}
	
}
