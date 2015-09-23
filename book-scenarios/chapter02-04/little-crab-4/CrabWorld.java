import greenfoot.*;  // (Actor, World, Greenfoot, GreenfootImage)

public class CrabWorld extends World
{
    /**
     * Create the crab world (the beach). Our world has a size 
     * of 560x560 cells, where every cell is just 1 pixel.
     */
    public CrabWorld() 
    {
        // Define the size (in cells) and resolution (in pixels
        // per cell) of the CrabWorld
        super(560, 560, 1);

        /*
        // Instantiate a new Crab object 
        // and assign it to a variable called myCrab
        Crab myCrab = new Crab();

        // Place the newly created Crab object
        // into the world at x= 250, y=200
        addObject( myCrab, 250, 200 );

        // add three lobster objects to the Crabworld
        // at arbitrary locations
        Lobster myLobster1 = new Lobster();
        Lobster myLobster2 = new Lobster(); 
        Lobster myLobster3 = new Lobster(); 
        addObject ( myLobster1, 500, 500 ); 
        addObject ( myLobster2, 100, 350 );
        addObject ( myLobster3, 500, 130 ); 

        // add two worms objects to the Crabworld
        // at arbitrary locations
        Worm myWorm1 = new Worm();
        Worm myWorm2 = new Worm();
        addObject ( myWorm1, 200, 350 ); 
        addObject ( myWorm2, 350, 250 );
         */

        prepare();
    } // end CrabWorld constructor 

    /**
     * Prepare the world for the start of the program. That is: create the initial
     * objects and add them to the world.
     */
    private void prepare()
    {
        Crab crab = new Crab();
        addObject(crab, 265, 260);
        Lobster lobster = new Lobster();
        addObject(lobster, 263, 131);
        Lobster lobster2 = new Lobster();
        addObject(lobster2, 420, 241);
        Lobster lobster3 = new Lobster();
        addObject(lobster3, 101, 472);
        lobster.setLocation(128, 58);
        lobster2.setLocation(465, 405);
        Worm worm = new Worm();
        addObject(worm, 288, 135);
        Worm worm2 = new Worm();
        addObject(worm2, 435, 217);
        Worm worm3 = new Worm();
        addObject(worm3, 373, 349);
        Worm worm4 = new Worm();
        addObject(worm4, 306, 455);
        Worm worm5 = new Worm();
        addObject(worm5, 125, 372);
        Worm worm6 = new Worm();
        addObject(worm6, 130, 183);
        Worm worm7 = new Worm();
        addObject(worm7, 351, 102);
        Worm worm8 = new Worm();
        addObject(worm8, 481, 76);
        Worm worm9 = new Worm();
        addObject(worm9, 374, 297);
        Worm worm10 = new Worm();
        addObject(worm10, 168, 283);
        Worm worm11 = new Worm();
        addObject(worm11, 323, 208);
        Worm worm12 = new Worm();
        addObject(worm12, 247, 355);
        removeObject(worm9);
        removeObject(worm7);
    }
} // end class CrabWorld 
