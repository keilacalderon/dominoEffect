import greenfoot.*;

/**
 * Write a description of class caribbean here.
 * 
 * @author Keila Calderon 
 * @version CSCI145_Final2015
 */
public class Caribbean extends World
{
    private int score;
    private int time; 
    /**
     * Constructor for objects of class Central_America.
     * 
     */
    public Caribbean()
    {    
        super(1200, 800, 1); 
        prepare();
        score = 0; 
        time = 2000; 
        showScore();
        showTime();
    } // end constructor 

    /**
     * Prepare the world for the start of the program. That is: create the initial
     * objects and add them to the world.
     */
    private void prepare()
    {
        Bomber bomber = new Bomber();
        addObject(bomber, 80, 90);
        Island island = new Island();
        addObject(island, 290, 780);
        Island island2 = new Island();
        addObject(island2, 908, 785);
        Diplomat diplomat = new Diplomat();
        addObject(diplomat, 400, 200);
    } // end prepare

    /**
     * Add some points to our current score. (May be negative.)
     * If the score falls below 0, game's up.
     */
    public void addScore(int points)
    {
        score = score + points;
        showScore();
        if (score < -100) 
        {
            Greenfoot.stop();
        }
    }

    /**
     * Show our current score on screen.
     */
    private void showScore()
    {
        showText("Score: " + score, 80, 25);
    }

    /**
     * Count down the game time and display it. Stop the game 
     * with a winning message when time is up.
     */
    private void countTime()
    {
        time--;
        showTime();
        if (time == 0)
        {
            showEndMessage();
            Greenfoot.stop();
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
     * Show the end-of-game message on screen.
     */
    private void showEndMessage()
    {
        showText("Time is up - you win!", 390, 150);
        showText("Your final score: " + score + " points", 390, 170);
    }
} // end class
