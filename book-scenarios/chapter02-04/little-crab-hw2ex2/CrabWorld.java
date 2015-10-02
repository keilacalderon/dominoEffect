import greenfoot.*;  // imports Actor, World, Greenfoot, GreenfootImage

/**
 * The CrabWorld is the place where crabs and other creatures live. 
 * It creates the initial population.
 * 
 * @author keila@email.uscb.edu
 * @version csci145_hw2_ex1
 */
public class CrabWorld extends World
{
    /**
     * Create the crab world (the beach). Our world has a size 
     * of 560x560 cells, where every cell is just 1 pixel.
     */
    public CrabWorld() 
    {
        super(560, 560, 1);
        prepare();
    } // end CrabWorld constructor

    /**
     * Prepare the world for the start of the program. That is: create the initial
     * objects and add them to the world.
     */
    private void prepare()
    {
        /* 
         * Make 10 Worms appear in random locations inside CrabWorld
         */
        Crab crab = new Crab();
        addObject(crab, 231, 203);
        Worm worm = new Worm(); 
        addObject(worm, Greenfoot.getRandomNumber(531) +15, Greenfoot.getRandomNumber(531) +15);
        Worm worm2 = new Worm();
        addObject(worm2, Greenfoot.getRandomNumber(531) +15, Greenfoot.getRandomNumber(531) +15);
        Worm worm3 = new Worm(); 
        addObject(worm3, Greenfoot.getRandomNumber(531) +15, Greenfoot.getRandomNumber(531) +15);
        Worm worm4 = new Worm(); 
        addObject(worm4, Greenfoot.getRandomNumber(531) +15, Greenfoot.getRandomNumber(531) +15);
        Worm worm5 = new Worm(); 
        addObject(worm5, Greenfoot.getRandomNumber(531) +15, Greenfoot.getRandomNumber(531) +15);
        Worm worm6 = new Worm(); 
        addObject(worm6, Greenfoot.getRandomNumber(531) +15, Greenfoot.getRandomNumber(531) +15);
        Worm worm7 = new Worm(); 
        addObject(worm7, Greenfoot.getRandomNumber(531) +15, Greenfoot.getRandomNumber(531) +15);
        Worm worm8 = new Worm(); 
        addObject(worm8, Greenfoot.getRandomNumber(531) +15, Greenfoot.getRandomNumber(531) +15);
        Worm worm9 = new Worm(); 
        addObject(worm9, Greenfoot.getRandomNumber(531) +15, Greenfoot.getRandomNumber(531) +15);
        Worm worm10 = new Worm(); 
        addObject(worm10, Greenfoot.getRandomNumber(531) +15, Greenfoot.getRandomNumber(531) +15);
        Lobster lobster = new Lobster();
        addObject(lobster, 334, 65);
        Lobster lobster2 = new Lobster();
        addObject(lobster2, 481, 481);
        Lobster lobster3 = new Lobster();
        addObject(lobster3, 79, 270);
    } // end prepare 
} // end class CrabWorld