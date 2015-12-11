import greenfoot.*;

/**
 * A bomber that will be automatically controlled. It will fire down dominos, 
 * bananas, and missels. 
 * 
 * @author Keila Calderon 
 * @version CSCI145_Final2015
 */
public class Bomber extends Actor
{
    private GreenfootImage image1;
    private GreenfootImage image2;
    /**
     * 
     */
    public Bomber()
    {
        image1 = new GreenfootImage("bomber2.png");
        image2 = new GreenfootImage("bomber.png");
        setImage(image1);
    }
    
    public void act() 
    {
        turnAtEdge();
        move(2);
        
        if(Greenfoot.getRandomNumber(100) < 3)
        {
            getWorld().addObject(new Domino(), getX(), Greenfoot.getRandomNumber(360));
        }

        if(Greenfoot.getRandomNumber(100) < 3)
        {
            getWorld().addObject(new Banana(), getX(), Greenfoot.getRandomNumber(360));
        }

        if(Greenfoot.getRandomNumber(100) < 3)
        {
            getWorld().addObject(new Missels(), getX(), Greenfoot.getRandomNumber(360));
        }
    } // end act   

    /**
     * Check whether the bomber is at the edge of the world. If it is, turn around.
     * If not, do nothing.
     */
    public void turnAtEdge()
    {
        if ( isAtEdge() ) 
        {
            turn(90);
            setRotation(180);
        }
    } // end turnAtEdge
    
     /**
     * Alternate the crab's image between image1 and image2.
     */
    public void switchImage()
    {
        if (getImage() == image1) 
        {
            setImage(image2);
        }
        else
        {
            setImage(image1);
        }
    }
} // end class

