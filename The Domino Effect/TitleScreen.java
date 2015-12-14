import greenfoot.*;

/**
 * Write a description of class TitleScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TitleScreen extends World
{
    private GreenfootSound bgMusic;
    /**
     * Constructor for objects of class TitleScreen.
     * 
     */
    public TitleScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1040, 800, 1); 
        bgMusic = new GreenfootSound("20thCenturyRecorderEdition.mp3");
    } // end TitleScreen constructor 

    /**
     * Allow the player to start the game when the title 
     * screen is clicked using the space bar
     */
    public void act()
    {
        if(Greenfoot.isKeyDown("space")) // this was used in reference with the tegrity videos
        {
            Caribbean caribbean = new Caribbean();
            Greenfoot.setWorld( caribbean );
            bgMusic.pause();
        } // end if
    } // end act method

    public void started()
    {
        if (!bgMusic.isPlaying())
        {
            bgMusic.play();
        } // end if 
    } // end class
} // end TitleScreen class
