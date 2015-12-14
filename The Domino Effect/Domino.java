import greenfoot.*;

/**
 * The Dominos will drop from the bomber, 
 * if not intercepted by the diplomat
 * they will affect the island.
 * 
 * @author keila@email.uscb.edu 
 * @version CSCI145_Final2015
 */
public class Domino extends Actor
{
    private int vSpeed; 
    private int accelCounter;
    private int speedFactor;

    /**
     * Initialize the Domino
     */
    public Domino(int difficulty) 
    {
        vSpeed = 1;
        accelCounter = 0;
        speedFactor = difficulty;
    } // end Domino constructor

    /**
     * Act - do whatever the Domino wants to do.
     */
    public void act()
    {
        fall();
    } // end act method

    /**
     * Create acceleration for the domino as it falls. 
     * 
     */
    private void fall()
    {
        setLocation(getX(), getY() + vSpeed + speedFactor);
        if (accelCounter >= 10) 
        {
            vSpeed++;
            accelCounter = 0;
        } // end if 
        accelCounter++; 
    } // end fall method
} // end Domino class
