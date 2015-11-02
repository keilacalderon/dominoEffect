import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Bacteria fload along in the bloodstream. They are bad. Best to destroy
 * them if you can.
 * 
 * @author Keila Calderon
 * @version CSCI145_Fall2015_GreenfootCh.5 
 */
public class Bacteria extends Actor
{
     /*
     * Create a new instance varible of type int
     * called speed, in order to make the movement 
     * more interesting
     */
    private int speed;
    /**
     * Constructor. Nothing to do so far.
     */
    public Bacteria()
    {
        /*
         * Set the movement of speed to a random value 
         * between 1 and 3
         */
        speed = Greenfoot.getRandomNumber(3)+1;
    }

    /**
     * Float along the bloodstream, slowly rotating.
     */
    public void act() 
    {
         /*
         * subtract the varaible speed from the
         * x-coordinate rather than the value 2
         */
        setLocation(getX()-speed, getY());
        turn(1);
        if (getX() == 0) 
        {
            getWorld().removeObject(this);
        } // end if
    } // end act method
} // end class
