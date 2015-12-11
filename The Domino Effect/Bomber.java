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
    /**
     * Act - do whatever the Bomber does. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
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
        }
    } // end turnAtEdge
} // end class

