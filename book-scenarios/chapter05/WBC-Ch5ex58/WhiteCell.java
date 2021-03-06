import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * This is a white blood cell. This kind of cell has the job to catch 
 * bacteria and remove them from the blood.
 * 
 * @author Keila Calderon
 * @version CSCI145_Fall2015_GreenfootCh.5 
 */
public class WhiteCell extends Actor
{
    /**
     * Act: move up and down when cursor keys are pressed.
     */
    public void act() 
    {
        checkKeyPress();
        checkCollision();
    } // end act method

    /**
     * Check whether a keyboard key has been pressed and react if it has.
     */
    private void checkKeyPress()
    {
        if (Greenfoot.isKeyDown("up")) 
        {
            setLocation(getX(), getY()-8);
        } // end if

        if (Greenfoot.isKeyDown("down")) 
        {
            setLocation(getX(), getY()+8);
        } // end if

        if (Greenfoot.isKeyDown("left")) 
        {
            setLocation(getX()-4, getY());
        } // end if

        if (Greenfoot.isKeyDown("right")) 
        {
            setLocation(getX()+4, getY());
        } // end if
    } // end checkKeyPress method

    /**
     * Check whether the WhiteCell is touching a virus 
     */
    private void checkCollision()

    {
        /*
         * Remove bacteria if the WhiteCell object is touching any
         * and play the slurp sound if it is. 
         */
        if (isTouching(Bacteria.class))
        {
            removeTouching(Bacteria.class);
            Greenfoot.playSound("slurp.wav");
            Bloodstream bloodstream = (Bloodstream)getWorld();
            bloodstream.addScore(20);
        } // end if bacteria

        /*
         * If WhiteCell object is touching virus play
         * game over sound then call the stop method  
         */
        if (isTouching(Virus.class) )
        {
            removeTouching(Virus.class);
            Bloodstream bloodstream = (Bloodstream)getWorld();
            bloodstream.addScore(-80);
        } // end if virus
    } // end checkCollision method
} // end class
