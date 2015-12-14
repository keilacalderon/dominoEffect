import greenfoot.*;

/**
 * Write a description of class Missels here.
 * 
 * @author keila@email.uscb.edu 
 * @version CSCI145_Final2015
 */
public class Missels extends Actor
{
    private int vSpeed; 
    private int accelCounter;
    private int speedFactor;
    public Missels(int difficulty) 
    {
        vSpeed = 1;
        accelCounter = 0;
        speedFactor = difficulty;
    }

    /**
     * Act - do whatever the Missels wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        fall();
    } // end act method

    private void fall()
    {
        setLocation(getX(), getY() + 3 + speedFactor);
        if (accelCounter >= 10) {
            vSpeed++;
            accelCounter = 0;
        }
        accelCounter++;
    }  
}
