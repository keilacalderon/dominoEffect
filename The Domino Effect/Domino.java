import greenfoot.*;

/**
 * Write a description of class Domino here.
 * 
 * @author Keila Calderon 
 * @version CSCI145_Final2015
 */
public class Domino extends Actor
{
    private int vSpeed; 
    
    public Domino() 
    {
        vSpeed = 2;
    }
    
    /**
     * Act - do whatever the Domino wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        fall();
    } // end act method

    public void fall()
    {
        setLocation(getX(), getY() +vSpeed);
    }
} // end class
