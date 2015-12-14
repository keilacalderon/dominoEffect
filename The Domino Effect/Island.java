import greenfoot.*;

/**
 * Islands in the Caribbean.
 * 
 * @author keila@email.uscb.edu 
 * @version CSCI145_Final2015
 */
public class Island extends Actor
{
    /**
     * Do whatever the island wants to do.
     */
    public void act()
    {         
        checkCollision();
    } // end act method 

    /**
     * check to see if the island is 
     * touching any of the "bombs". If so, 
     * remove them, play a sound, and subtract from score.
     */
    private void checkCollision()
    {
        /*
         * The Bloodstream scenario was used as a reference for this code. 
         */
        if (isTouching(Banana.class))
        {
            removeTouching(Banana.class);
            Caribbean caribbean = (Caribbean)getWorld();
            caribbean.addScore(-1);
            Greenfoot.playSound("Cannon.wav");
        } // end if banana 

        if (isTouching(Domino.class))
        {
            removeTouching(Domino.class);
            Caribbean caribbean = (Caribbean)getWorld();
            caribbean.addScore(-5);
            Greenfoot.playSound("Cannon.wav");
        } // end if banana 

        if (isTouching(Missiles.class))
        {
            removeTouching(Missiles.class);
            Caribbean caribbean = (Caribbean)getWorld();
            caribbean.addScore(-3);
            Greenfoot.playSound("Cannon.wav");
        } // end if banana 
    } // end checkCollision 
} // end Island class
