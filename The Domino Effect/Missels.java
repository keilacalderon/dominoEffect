import greenfoot.*;

/**
 * Write a description of class Missels here.
 * 
 * @author Keila Calderon 
 * @version CSCI145_Final2015
 */
public class Missels extends Actor
{
    private int vSpeed; 
    private int accelCounter;
     public Missels() 
    {
        vSpeed = 1;
        accelCounter = 0;
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
        setLocation(getX(), getY() + vSpeed);
        if (accelCounter >= 10) {
            vSpeed++;
            accelCounter = 0;
        }
        accelCounter++;
    }  
}
