import greenfoot.*;  // (World, Actor, GreenfootImage, and Greenfoot)

/**
 * This class defines a crab. Crabs live on the beach. They like sand worms 
 * (very yummy, especially the green ones).
 * 
 * Version: 4
 * 
 * The crab is keyboard controlled and eats worms. In this version, we have added
 * a sound when the crab eats a worm.
 */

public class Crab extends Actor
{
    /*
     * Instance variables( also called fields) 
     */
    private GreenfootImage image1;
    private GreenfootImage image2;
    private int wormsEaten; 
    private int frameCount;
    
  
    
    
    /*
     * Constructor
     */
    public Crab()
    {
        // create (instatiate) the GreenfootImage objects
        // and store them in our isntance vairables
        image1 = new GreenfootImage("crab.png");
        image2 = new GreenfootImage("crab2.png");
        
        // set the current image of the Crab oject to image 1
        setImage(image1);
        
        // initialize wormsEaten to zero 
        // even though it already has a default value of zero
        wormsEaten = 0;  
        
        // initialize frameCount to zero 
        // (even though it already has a default value of zero)
        frameCount = 0; 
        
        wormCountGoal = 0;
    } // end Crab constructor
    
    /** 
     * Act - do whatever the crab wants to do. This method is called whenever
     *  the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        checkKeypress();
        move(5);
        lookForWorm();
        switchImage();
        frameCount++;
    } // end method act
    
    /**
     * Alternate the crab's image between image1 and image2
     */
    public void switchImage()
    {
        
        if (frameCount == 5 )
        {
             if (getImage()== image1)
        {
            setImage( image2 );
        } 
        else // otherwise, assume that the current image is image2
        {
            setImage( image1 );
        } // end if/ else
        // resent frameCount back to zero 
        frameCount = 0;
        } // end outer if
    }// end method swtichImage
    
    
    /**
     * Check whether a control key on the keyboard has been pressed.
     * If it has, react accordingly.
     */
    public void checkKeypress()
    {
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
     * If we have, eat it. If not, do nothing.
     */
    public void lookForWorm()
    {
        if ( isTouching(Worm.class) ) 
        {
            removeTouching(Worm.class);
            Greenfoot.playSound("slurp.wav");
            
            // increment the number of wormsEaten by 1 
            wormsEaten = wormsEaten +1; 
            
            // could also replace the above statement with 
            // either of the following:
            
            // wormsEaten++;
            //wormsEaten +=1;
            
            
            // end the game when the crab has eaten 
            // a speficied number of worms
            if (wormsEaten== 8)
            {
                Greenfoot.playSound("music.wav");
                Greenfoot.stop();
            } // end inner if 
        } // end if
    } // end method lookForWorm
} // end class Crab