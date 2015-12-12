import greenfoot.*;

/**
 * Write a description of class Domino here.
 * 
 * @author keila@email.uscb.edu 
 * @version CSCI145_Final2015
 */
public class Domino extends Actor
{
    private int vSpeed; 
    private int accelCounter;
    private int speedFactor;

     public Domino(int difficulty) 
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

    public void fall()
    {
        setLocation(getX(), getY() + vSpeed + speedFactor);
        if (accelCounter >= 10) {
            vSpeed++;
            accelCounter = 0;
        }
        accelCounter++;
    }
} // end class
