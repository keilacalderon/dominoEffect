import greenfoot.*; 

/**
 * A Banana can hit the islands. 
 * 
 * @author keila@email.uscb.edu 
 * @version CSCI145_Final2015
 */
public class Banana extends Actor

{
    private int vSpeed; 
    private int speedFactor;
    public Banana(int difficulty) 
    {
        vSpeed = 2;
        speedFactor = difficulty;
    }

    /**
     * Act - do whatever the Banana wants to do 
     */
    public void act()
    {
        fall();
    } // end act method

    private void fall()
    {
        setLocation(getX(), getY() + vSpeed + speedFactor);
    }
}// end Banana class
