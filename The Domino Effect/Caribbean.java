import greenfoot.*;

/**
 * The Caribbean. This is where the bomber will attack
 * 
 * @author Keila Calderon 
 * @version CSCI145_Final2015
 */
public class Caribbean extends World
{
    private int score;
    private int time; 
    private boolean win;
    private GreenfootSound bgMusic;
    /**
     * Constructor for objects of class Caribbean.
     * Create the carribean and all the objects in it.
     */
    public Caribbean()
    {    
        super(1040, 800, 1); 
        prepare();
        score = 5; 
        time = 3000; 
        showScore();
        showTime();
        bgMusic = new GreenfootSound("Lacrimosa.mp3");
        bgMusic.playLoop();
    } // end constructor 

    /**
     * Prepare the world for the start of the program. 
     */
    private void prepare()
    {
        Bomber bomber = new Bomber();
        addObject(bomber, 80, 90);
        Island island = new Island();
        addObject(island, 262, 766);
        Island island2 = new Island();
        addObject(island2, 777, 766);
        Palm palm = new Palm();
        addObject(palm, 370, 564);
        Palm palm2 = new Palm();
        addObject(palm2, 885, 562);
        Diplomat diplomat = new Diplomat();
        addObject(diplomat, 600, 400);
    } // end prepare

    /**
     * 
     */
    public void act() 
    {
        countTime();
    }

    /**
     * Add some points to our current score. (May be negative.)
     * If the score falls below 0, game's up.
     */
    public void addScore(int points)
    {
        score = score + points;
        showScore();
        if (score <= 0) 
        {
            win = false;
            beginGameOverSequence();
            bgMusic.pause();
        }
    }

    /**
     * Show current score on screen.
     */
    private void showScore()
    {
        showText("Score: " + score, 80, 25);
    }

    /**
     * Count down the game time and display it. Stop the game,
     * music,
     *  when time is up.
     */
    private void countTime()
    {
        time--;
        showTime();
        if (time == 0)
        {
            win = true;
            beginGameOverSequence();
            bgMusic.pause();
        }
    }

    /**
     * Show the remaining game time on screen.
     */
    private void showTime()
    {
        showText("Time: " + time, 700, 25);
    }

    /**
     * Starts the game over sequence
     */
    public void beginGameOverSequence()
    {
        GameOver gameover = new GameOver(score, win);
        Greenfoot.setWorld( gameover);
    } // end method beginGameOverSequence
} // end Caribbean 
