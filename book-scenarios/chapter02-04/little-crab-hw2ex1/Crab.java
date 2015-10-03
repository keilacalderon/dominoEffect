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
 * @version csci145_hw2_ex1
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
     /*
     * Instatiate the GreenfootImage objects
     * Initalize frameCount and wormsEaten to zero, 
     * and store them in our instance vairables
     */
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
        /*
         * Call methods that will allow crab to alternate image when
         * the crab moves and change on on the cycle we assign it.
         */
        checkKeypress();
        move(5);
        lookForWorm();
        switchImage();
        frameCount++;
    } // end method act

    /**
     * Alternate the crab's image between image1 and image2.
     */
    public void switchImage()
    {
        /*
         * Created method that will allow the crab's image to change when it moves
         * Added a frame count to allow it to change on the cycle we assign it
         */
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
         * Method created to allow the player to have more control of the 
         * game by allowing the prayer to use the arrow keys.
         */
        if (Greenfoot.isKeyDown("left")) 
        {
            turn(-4);
        } // end if
        if (Greenfoot.isKeyDown("right")) 
        {
            turn(4);
        } // end if
    } // end method checkKey

    /**
     * Check whether we have stumbled upon a worm.
     * If we have, eat it. If not, do nothing. If we have
     * eaten eight worms, we win.
     */
    public void lookForWorm()
    {
        /*
         * Method will allow the crab to eat the worm once it has touched it.
         * A sound has been added inside the if statement.
         * Once the crab has eaten 8 worms, a different sound will be played
         * allowing the player know it has "won" the game.
         */
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