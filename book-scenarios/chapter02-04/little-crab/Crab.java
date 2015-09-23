import greenfoot.*;

/**
 * This class defines a crab. Crabs live on the beach.
 */
public class Crab extends Actor
{
    public void act()
    {
        if ( isAtEdge () )
        {
            turn ( 17);
        } // end if
        if ( Greenfoot.getRandomNumber(100) < 10 )
        {
            turn ( Greenfoot.getRandomNumber(91)-45 );
        } // end if

        move (5); // the crab wil move 5 pixels
        // regardless of whether its at
        // the edge of the screen
        lookForWorm();
        /**
         * Check whether we have stumbled upon a worm. 
         * If we have, eat it. If not, do nothing.
         */

        {
            if ( isTouching( Worm.class) )
            { removeTouching ( Worm.class ); 
            } // end if

        } // end method act
        


