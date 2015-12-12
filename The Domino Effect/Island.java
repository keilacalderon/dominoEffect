import greenfoot.*;

/**
 * An Island in Central_America.
 * 
 * @author keila@email.uscb.edu 
 * @version CSCI145_Final2015
 */
public class Island extends Actor
{
    public void act()
    {         
        checkCollision();
    } // end act method 

    private void checkCollision()
    {
        if (isTouching(Banana.class))
        {
            removeTouching(Banana.class);
            Caribbean caribbean = (Caribbean)getWorld();
            caribbean.addScore(-1);
        } // end if banana 

        if (isTouching(Domino.class))
        {
            removeTouching(Domino.class);
            Caribbean caribbean = (Caribbean)getWorld();
            caribbean.addScore(-5);
        } // end if banana 

        if (isTouching(Missels.class))
        {
            removeTouching(Missels.class);
            Caribbean caribbean = (Caribbean)getWorld();
            caribbean.addScore(-3);
        } // end if banana 
    } // end checkCollision 
}
