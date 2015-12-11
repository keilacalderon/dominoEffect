import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Diplomat here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Diplomat extends Actor
{
    /**
     * Act - do whatever the Diplomat wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 

    {         
        checkCollision();
        checkKeyPress();
    } // end act method 

    private void checkKeyPress()
    {
        if (Greenfoot.isKeyDown("up")) 
        {
            setLocation(getX(), getY()-8);
        }
        
        if (Greenfoot.isKeyDown("down")) 
        {
            setLocation(getX(), getY()+8);
        }
        
        if (Greenfoot.isKeyDown("right")) 
        {
            setLocation(getX()+4, getY());
        }
        
        if (Greenfoot.isKeyDown("left")) 
        {
            setLocation(getX()-4, getY());
        }
    } // end checkKeyPress 
    
    private void checkCollision()
    {
        if (isTouching(Banana.class))
        {
            removeTouching(Banana.class);
            Caribbean caribbean = (Caribbean)getWorld();
            caribbean.addScore(1);
        } // end if banana 

        if (isTouching(Domino.class))
        {
            removeTouching(Domino.class);
            Caribbean caribbean = (Caribbean)getWorld();
            caribbean.addScore(3);
        } // end if banana 

        if (isTouching(Missels.class))
        {
            removeTouching(Missels.class);
            Caribbean caribbean = (Caribbean)getWorld();
            caribbean.addScore(2);
        } // end if banana 
    } // end checkCollision 
}    

