import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The Lining are objects at the edge of the vein.
 * 
 * @author Keila Calderon
 * @version CSCI145_Fall2015_GreenfootCh.5 
 */
public class Lining extends Actor
{
    /**
     * Lining objects move continuously left 1px per act cycle while 
     * making the lining objects disappear when they reach the left edge
     */
    public void act() 
    { 
        /*
         * Set the lining's location and subtract 1 to the x-coordinate
         * in order to make it move by one pixel per act cycle
         */
        setLocation(getX()-1, getY());
        if (getX() == 0) 
        /*
         * if lining objects have reached the left edge,
         * remove THIS (lining) object 
         */
        {
            getWorld().removeObject(this);
        } // end if
    } // end act method    
} // end class
