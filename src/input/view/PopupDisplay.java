package input.view;

import javax.swing.JOptionPane;
/**
 * a popup display class used for showing input and output
 * @author tjar2074
 * @version 1.0 09/24/15
 */
public class PopupDisplay 
{
     public void showResponse(String wordsFromSomewhere)
     {
    	 JOptionPane.showMessageDialog(null, wordsFromSomewhere);
     }
	
     public String grabAnswer(String stuff)
	 {
		 String answer = "";
		 
		 answer = JOptionPane.showInputDialog(null, stuff);
		 
		 return answer;
	 }
     
}
