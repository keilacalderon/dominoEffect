import greenfoot.*;  // (World, Actor, GreenfootImage, and Greenfoot)

/**
 * This class defines a crab. Crabs live on the beach. They like sand worms 
 * (very yummy, especially the green ones).
 * 
 * Version: 5
 * 
 * In this version, the crab behaves as before, but we add animation of the 
 * image.
 * 
 * @author keila@email.uscb.edu
 * @version csci145_hw2_ex2
 */

public class Crab extends Actor
{
    private GreenfootImage image1;
    private GreenfootImage image2;
    private int wormsEaten;
    private int frameCount;

    /**
     * Create a crab and initialize its two images.
     */
    public Crab()
    {
        image1 = new GreenfootImage("crab.png");
        image2 = new GreenfootImage("crab2.png");
        setImage(image1);
        wormsEaten = 0;
        frameCount = 0;
    } // end Crab constructor 

    /** 
     * Act - do whatever the crab wants to do. This method is called whenever
     *  the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        checkKeypress();
        // move(5); commented method out in order to full ex2
        lookForWorm();
        switchImage();
        frameCount++;
    } // end method act

    /**
     * Alternate the crab's image between image1 and image2.
     */
    public void switchImage()
    {
        if (frameCount == 5)
        {
            if (getImage() == image1) 
            {
                setImage(image2);
            }
            else
            {
                setImage(image1);
            } // end if/ else
            frameCount = 0; 
        } // end outer if 
    } // end method switchImage

    /**
     * Check whether a control key on the keyboard has been pressed.
     * If it has, react accordingly.
     */
    public void checkKeypress()
    {
        /*
         * A new if statement has been added in checkKeyPress
         * in order to make the crab move only when the up-arrow 
         * is being pressed, rather than moving forward automatically. 
         */
        if (Greenfoot.isKeyDown("left")) 
        {
            turn(-4);
        } // end if
        if (Greenfoot.isKeyDown("right")) 
        {
            turn(4);
        } // end if
        if (Greenfoot.isKeyDown("up"))
        {
            move(5);
        } // end if
    } // end method checkKey

    /**
     * Check whether we have stumbled upon a worm.
     * If we have, eat it. If not, do nothing. If we have
     * eaten eight worms, we win.
     */
    public void lookForWorm()
    {
        if ( isTouching(Worm.class) ) 
        {
            removeTouching(Worm.class);
            Greenfoot.playSound("slurp.wav");

            wormsEaten = wormsEaten + 1;

            if (wormsEaten == 8) 
            {
                Greenfoot.playSound("fanfare.wav");
                Greenfoot.stop();
            } // end inner if 
        } // end if
    } // end method lookForWorm
} // end class Crab