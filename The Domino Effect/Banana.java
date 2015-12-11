import greenfoot.*; 

/**
 * A Banana can hit the islands. 
 * 
 * @author Keila Calderon 
 * @version CSCI145_Final2015
 */
public class Banana extends Actor

{
    private int vSpeed; 
    public Banana() 
    {
        vSpeed = 2;
    }
    
    /**
     * Act - do whatever the Banana wants to do 
     */
    public void act()
    {
        fall();
    } // end act method

    public void fall()
    {
        setLocation(getX(), getY() +vSpeed);
    }
}// end Banana class
