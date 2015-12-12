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
    private int increaseCounter;
    /**
     * 
     */
    public Bomber()
    {
        image1 = new GreenfootImage("bomber1.png");
        image2 = new GreenfootImage("bomber2.png");
        setImage(image1);
        increaseCounter = 0;
    }
    
    public void act() 
    {
        turnAtEdge();
        move(2);
        
        if(Greenfoot.getRandomNumber(1000) < 3)
        {
            getWorld().addObject(new Domino(), getX()+10, getY()+3);
            increaseCounter++;
        }

        if(Greenfoot.getRandomNumber(500) < 3)
        {
            getWorld().addObject(new Banana(), getX()+4, getY()+3);
            increaseCounter++;
        }

        if(Greenfoot.getRandomNumber(800) < 3)
        {
            getWorld().addObject(new Missels(), getX()+4, getY()+3);
            increaseCounter++;
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
            setImage();
        }
    } // end turnAtEdge
    
    public void setImage()
    {
        if (getImage() == image1) 
        {
            setImage(image2);
            setRotation(180);
        }
        else
        {
            setImage(image1);
            setRotation(360);
        }
    }
}

