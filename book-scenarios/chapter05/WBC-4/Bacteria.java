import greenfoot.*;  

/**
 * Bacteria fload along in the bloodstream. They are bad. Best to destroy
 * them if you can.
 * 
 * @author Michael Kölling
 * @version 1.0
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
     * Constructor: Initialise the speed to a somewhat random value.
     */
    public Bacteria()
    {
        /*
         * Set the movement of speed to a random value 
         * between 1 and 3
         */
        speed = Greenfoot.getRandomNumber(5) + 1;
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
            Bloodstream bloodstream = (Bloodstream)getWorld();
            bloodstream.addScore(-15);
            bloodstream.removeObject(this);
        }
    }
    
}
