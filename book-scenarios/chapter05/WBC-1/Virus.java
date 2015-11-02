import greenfoot.*; // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Virus flows in the bloodstream. They are evil. Must destroy. 
 * 
 * @author Keila Calderon
 * @version CSCI145_Fall2015_GreenfootCh.5 
 */
public class Virus extends Actor
{
    /**
     * Virus flows along the bloodstream, slowly roating
     */
    public void act() 
    {
        /*
         * Make Virus move 4 cells per act cycle, 
         * and rotate counter-clockwise. 
         */
        setLocation(getX()-4, getY());
        turn(-1);
    } // end act method  
} // end class
