package input.view;

import javax.swing.JOptionPane;
/**
 * a popup display class used for showing input and output
 * @author tjar2074
 * @version 1.0 09/24/15
 */
public class PopupDisplay 
{
/**
 * 	displays the supplied text as a popup window
 * @param wordsFromSomewhere the text to be displayed
 */
     public void showResponse(String wordsFromSomewhere)
     {
    	 JOptionPane.showMessageDialog(null, wordsFromSomewhere);
     }

    /**
     * 
     */
     //
     /**
     *  displays a popup the supplied string parameter with a field with a field to type in response.
     * returns answer t supplied question as string
     * @param stuff
     * @return
     */
     public String grabAnswer(String stuff)
	 {
		 String answer = "";
		 
		 answer = JOptionPane.showInputDialog(null, stuff);
		 
		 return answer;
	 }
     
}
