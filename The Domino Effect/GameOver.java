import greenfoot.*;

/**
 * Write a description of class GameOver here.
 * 
 * @author Keila Calderon 
 * @version CSCI145_Final2015
 */
public class GameOver extends World
{
    private GreenfootSound bgMusic;
    private int score;
    private boolean win;
    /**
     * Constructor for objects of class GameOver.
     * 
     */
    public GameOver(int score, boolean win)
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1040, 800, 1); 
        bgMusic = new GreenfootSound("Fail.mp3");
        bgMusic.play();
        this.score = score;
        this.win = win;
        showEndMessage();
    }

    /**
     * Allows the player to go back to the title screen 
     * when the game over screen is clicked with the space bar
     */
    public void act()
    {
        if (Greenfoot.isKeyDown("space"))
        {
            TitleScreen titlescreen = new TitleScreen();
            Greenfoot.setWorld( titlescreen );
            bgMusic.pause();
        }// end if
    } // end method act

    /**
     * Show the end-of-game message on screen.
     */
    private void showEndMessage()
    {
        if (win) 
        {
            showText("Congrats, you're a hero!", 853, 495);
        }
        else
        {
            showText("Uh-oh! You lost!", 853, 495);
        }
        showText(score + " points", 921, 739);
    }
}
