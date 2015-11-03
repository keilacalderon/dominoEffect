import greenfoot.*;

/**
 * Red Blood cells flow in the blood vessels, transporting oxygen.
 * They don't do much in this scenerio. They don't interact with
 * any objects or do anything...kinda like cats.  
 * 
 * @author Keila Calderon 
 * @version CSCI145_Fall2015_GreenfootCh.5
 */
public class RedCell extends Actor
{
    private int speed;
    /**
     * Constructor. Initialize the flowing and rotating speed at a random notation 
     */
    public RedCell()
    {
        /*
         * Set the movement of speed to a random value
         * between 1 and 2
         * Set random rotation for red cells 
         */
        speed = Greenfoot.getRandomNumber(2)+1;
        setRotation(Greenfoot.getRandomNumber(360));
    } // end constructor
    /**
     * Act - do whatever the RedCell wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        /*
         * set location for RedCells and subtract speed from x-coordinate
         * rotate at a slow rate of 1 pixel per cycle
         */
        setLocation(getX()-speed, getY());
        turn(1);
        if (getX() == 0) 
        {
            getWorld().removeObject(this);
        } // end if
    } // end act method  
} // end class
