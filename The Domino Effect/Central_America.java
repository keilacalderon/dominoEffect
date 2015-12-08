import greenfoot.*;

/**
 * Write a description of class Central_America here.
 * 
 * @author Keila Calderon 
 * @version CSCI145_Final
 */
public class Central_America extends World
{

    private int startIsland = 3;
    /**
     * Constructor for objects of class Central_America.
     * 
     */
    public Central_America()
    {    
        super(1200, 800, 1); 
        prepare();
    } // end constructor 
    
    /**
     * Prepare the world for the start of the program. That is: create the initial
     * objects and add them to the world.
     */
    private void prepare()
    {
        Bomber bomber = new Bomber();
        addObject(bomber, 80, 90);
        addIsland(startIsland);
    } // end prepare
    
    private void addIsland(int count) 
    {
        for(int i = 0; i < count; i++) 
        {
            int x = Greenfoot.getRandomNumber(getWidth()/2);
            int y = Greenfoot.getRandomNumber(getHeight()/2);
            addObject(new Island(), x, y);
        }
    }
} // end class
