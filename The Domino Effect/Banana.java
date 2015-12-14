import greenfoot.*; 

/**
 * Bananas fall from the bomber, if not intercepted 
 * by the Diplomat they can hit the islands 
 * and cause points to be deducted. 
 * 
 * @author keila@email.uscb.edu 
 * @version CSCI145_Final2015
 */
public class Banana extends Actor

{
    private int vSpeed; 
    private int speedFactor;
    /**
     * Intialize Banana
     */
    public Banana(int difficulty) 
    {
        vSpeed = 2; // this was used in reference to a greenfoot tutorial found online
        speedFactor = difficulty;
    } // end banana constructor 

    /**
     * Act - do whatever the Banana wants to do 
     */
    public void act()
    {
        fall();
    } // end act method

    /**
     *  Add speed for the banana to fall down.
     */
    private void fall()
    {
        setLocation(getX(), getY() + vSpeed + speedFactor);
    } // end fall method
}// end Banana class
