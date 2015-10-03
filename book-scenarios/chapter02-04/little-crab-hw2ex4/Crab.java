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
 * @version csci145_hw2_ex4
 */

public class Crab extends Actor
{
    private GreenfootImage image1;
    private GreenfootImage image2;
    private int wormsEaten;
    private int frameCount;
    private int currentFlipAngle; 

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
        currentFlipAngle = 0;
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
        // move(5); commented method out in order to fullill ex2
        lookForWorm();
        // switchImage(); commented method out in order to fullfill ex4
        checkFlipAround(); // added in order to preform task specified in 
        // checkFlipAround method (ex3)
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
        frameCount++;
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
         * 
         * A new if statement has been added in checkKeyPress
         * in order to make the crab move only when the up-arrow 
         * is being pressed, rather than moving forward automatically. (ex2)
         */

        /*
         * Switch Image method has been added so that the crab animates only
         * when an arrow is being pressed (ex4).
         */
        if (Greenfoot.isKeyDown("left")) 
        {
            turn(-4);
            switchImage();
        } // end if
        if (Greenfoot.isKeyDown("right")) 
        {
            turn(4);
            switchImage();
        } // end if
        if (Greenfoot.isKeyDown("up"))
        {
            move(5);
            switchImage();
        } // end if
    } // end method checkKey

    /**
     * Check to see if the down-arrow key is being pressed
     */
    public void checkFlipAround()
    {
        /*
         * A new method has been created so that when you press the down
         * arrrow key, the crab will flip around 3 to 4 cycles up to
         * 180 degress (but not more than) 180 degrees from the direction
         * in which the crab was originally facing.
         */
        if (Greenfoot.isKeyDown("down"))
        {
            if (currentFlipAngle < 180)
            {
                turn(45);
                switchImage();
                currentFlipAngle = currentFlipAngle +45;
            } // end inner if
        }
        else 
        {
            currentFlipAngle = 0;
        } // end if 
    } // end method checkFlipAround 

    /**
     * Check whether we have stumbled upon a worm.
     * If we have, eat it. If not, do nothing. If we have
     * eaten eight worms, we win.
     */
    public void lookForWorm()
    {
        /*Method will allow the crab to eat the worm once it has touched it.
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