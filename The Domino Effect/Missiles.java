import greenfoot.*;

/**
 * The Missiles will drop from the bomber, 
 * if not intercepted by the diplomat
 * they will affect the island.
 * 
 * @author keila@email.uscb.edu 
 * @version CSCI145_Final2015
 */
public class Missiles extends Actor
{
    private int vSpeed; 
    private int accelCounter;
    private int speedFactor;
    /**
     * Intialize Missiles
     */
    public Missiles(int difficulty) 
    {
        vSpeed = 1;
        accelCounter = 0;
        speedFactor = difficulty;
    } // end Missiles constructor

    /**
     * Act - do whatever the Missels wants to do. .
     */
    public void act()
    {
        fall();
    } // end act method

    /**
     *  Create acceleration for the Missiles as it falls. 
     */
    private void fall()
    {
        setLocation(getX(), getY() + 3 + speedFactor);
        if (accelCounter >= 10) 
        {
            vSpeed++;
            accelCounter = 0;
        } // end if
        accelCounter++;
    }  // end fall method
} // end Missiles class
