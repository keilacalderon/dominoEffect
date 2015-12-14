import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The Diplomat will be able to navigate the world, 
 * while trying to intercept the bombs from 
 * hitting the islands.
 * 
 * @author keila@email.uscb.edu 
 * @version CSCI145_Final2015
 */
public class Diplomat extends Actor
{
    private GreenfootImage image1;
    private GreenfootImage image2;

    /**
     *  Initialize Diplomat. 
     */
    public Diplomat()
    {
        image1 = new GreenfootImage("peace_dove.png");
        image2 = new GreenfootImage("peace_dove2.png");
        setImage(image1);
    } // end Diplomat constructor 

    /**
     * Do whatever Diplomat does.
     */
    public void act() 

    {         
        checkCollision();
        checkKeyPress();
    } // end act method 

    /**
     * Check to see if the arrow keys are being 
     * pressed in order to move around in the game.
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

        if (Greenfoot.isKeyDown("right")) 
        {
            setLocation(getX()+4, getY());
            setImage(image2);
        } // end if

        if (Greenfoot.isKeyDown("left")) 
        {
            setLocation(getX()-4, getY());
            setImage(image1);
        } // end if
    } // end checkKeyPress 

    /**
     * check to see if the diplomat is 
     * touching any of the "bombs". If so, 
     * remove them, play a sound, and add to score.
     */
    private void checkCollision()
    {
        if (isTouching(Banana.class))
        {
            removeTouching(Banana.class);
            Caribbean caribbean = (Caribbean)getWorld();
            caribbean.addScore(1);
            Greenfoot.playSound("swish.mp3");
        } // end if 

        if (isTouching(Domino.class))
        {
            removeTouching(Domino.class);
            Caribbean caribbean = (Caribbean)getWorld();
            caribbean.addScore(3);
            Greenfoot.playSound("swish.mp3");
        } // end if

        if (isTouching(Missiles.class))
        {
            removeTouching(Missiles.class);
            Caribbean caribbean = (Caribbean)getWorld();
            caribbean.addScore(2);
            Greenfoot.playSound("swish.mp3");
        } // end if  
    } // end checkCollision 
} // end Diplomat class

