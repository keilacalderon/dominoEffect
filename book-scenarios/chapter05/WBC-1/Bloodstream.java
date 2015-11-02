import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The bloodstream is the setting for our White Blood Cell scenario. 
 * It's a place where blood cells, bacteria and viruses float around.
 * 
 * @author Michael Kölling
 * @version 0.1
 */
public class Bloodstream extends World
{

    /**
     * Constructor: Set up the staring objects.
     */
    public Bloodstream()
    {    
        super(780, 360, 1); 

        prepare();
    } // end constructor

    /**
     * Create new floating objects at irregular intervals.
     */
    public void act()
    {
        if (Greenfoot.getRandomNumber(100) < 3)
        /*
         * Add new bacteria objects to a set x-coordinate 
         * location and a random y-coordinate location
         */
        {
            addObject(new Bacteria(), 779, Greenfoot.getRandomNumber(360));
        } // end if bacteria
        if (Greenfoot.getRandomNumber(100) < 1)
        /*
         * Add new lining objects to appear on the right top 
         * and bottom sides of the Bloodstream World 
         * and setting the probability of new objects 1%
         */
        {
            addObject(new Lining(), 779, 359);    
            addObject(new Lining(), 779, 0);
        }// end if lining
        if (Greenfoot.getRandomNumber(100) < 1)
        /*
         * Add new virus objects at the right edge of the screen.
         * Setting the y-coordinate random, and setting the probability
         * of new objects 1%
         */
        {
            addObject(new Virus(), 779, Greenfoot.getRandomNumber(360));
        } // end if virus
    } // end act method
    
    /**
     * Prepare the world for the start of the program. In this case: Create
     * a white blood cell and the lining at the edge of the blood stream.
     */
    private void prepare()
    {
        WhiteCell whitecell = new WhiteCell();
        addObject(whitecell, 83, 179);
        Lining lining = new Lining();
        addObject(lining, 126, 1);
        Lining lining2 = new Lining();
        addObject(lining2, 342, 5);
        Lining lining3 = new Lining();
        addObject(lining3, 589, 2);
        Lining lining4 = new Lining();
        addObject(lining4, 695, 5);
        Lining lining5 = new Lining();
        addObject(lining5, 114, 359);
        Lining lining6 = new Lining();
        Lining lining7 = new Lining();
        addObject(lining7, 295, 353);
        Lining lining8 = new Lining();
        Lining lining9 = new Lining();
        Lining lining10 = new Lining();
        addObject(lining10, 480, 358);
        Lining lining11 = new Lining();
        addObject(lining11, 596, 359);
        Lining lining12 = new Lining();
        addObject(lining12, 740, 354);
    } // end prepare method
} // end clas
