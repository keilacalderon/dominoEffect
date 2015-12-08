import greenfoot.*;

/**
 * A bomber that will be automatically controlled. It will fire down dominos, 
 * bananas, and missels. 
 * 
 * @author Keila Calderon
 * @version ProjectFinal_Fall2015
 */
public class Bomber extends SmoothMover
{
    /**
     * Act - do whatever the Bomber does. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        turnAtEdge();
        move(2);
    }    
    
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
    }
}
