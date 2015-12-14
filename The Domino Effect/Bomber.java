import greenfoot.*;

/**
 * A bomber that will be moving across the screen. It will fire down dominos, 
 * bananas, and missiles. 
 * 
 * @author keila@email.uscb.edu 
 * @version CSCI145_Final2015
 */
public class Bomber extends Actor
{
    private GreenfootImage image1;
    private GreenfootImage image2;
    private int dominoCounter;
    private int bananaCounter;
    private int misselsCounter;
    private int dominoDistri;
    private int bananaDistri;
    private int misselsDistri;
    private int difficulty;
    private int difficultyCounter;
    private int eventualDominoCounter;
    private int eventualMisselsCounter;

    /**
     * Intialize the Bomber 
     */
    public Bomber()
    {
        image1 = new GreenfootImage("bomber1.png");
        image2 = new GreenfootImage("bomber2.png");
        setImage(image1);
        dominoCounter = 0;
        dominoDistri = 15 + Greenfoot.getRandomNumber(45);
        bananaDistri = 40 + Greenfoot.getRandomNumber(100);
        difficultyCounter = 0;
        difficulty = 0;
        eventualDominoCounter = 0;
        eventualMisselsCounter = 0;
    } // end contructor 

    /**
     * Do what a Bomber's gotta do. The bomber will fly back and
     * forth across the screen dropping different weapons
     */
    public void act() 
    {
        turnAtEdge();
        move(2);
        genDominos();
        genBanana();
        genMissiles();
        checkDifficulty();
    } // end act method

    /**
     * Check whether the bomber is at the edge of the world. If it is, turn around 
     * and switch images. If not, do nothing.
     */
    private void turnAtEdge()
    {
        if ( isAtEdge() ) 
        {
            turn(90);
            setImage();
        } // end if
    } // end turnAtEdge method

    /**
     * Alternate the Bomber's image between image1 and image2
     */
    private void setImage()
    {
        if (getImage() == image1) // this code was used in reference to the crab scenario
        {
            setImage(image2);
            setRotation(180);
        }
        else
        {
            setImage(image1);
            setRotation(360);
        } // end else/if
    } // end setImage method

    /**
     * Generate dominos at a delayed rate while dropping from 
     * the bomber's position at a random distribution. 
     * A counter is set to increase the distrubution of the Dominos as time goes by...
     */
    private void genDominos()
    {
        if (eventualDominoCounter >= 500)
        {
            if(dominoCounter == dominoDistri)
            {
                getWorld().addObject(new Domino(difficulty), (206 - Greenfoot.getRandomNumber(413)) + getX(), getY()+4); // x-coordinate set 
                // at a random number so the dropping of the dominos is not predicatable for the player, thus adding "diffultly"
                dominoCounter = 0; 
                dominoDistri = 40 + Greenfoot.getRandomNumber(300);
            } // end inner if
            dominoCounter++; 
        } // end if
        eventualDominoCounter++;
    } // end genDominos method

    /**
     * Generate bananas dropping from the bomber's position at a random distribution.
     * A counter is set to increase the distrubution of the bananas as time goes by...
     */
    private void genBanana()
    {
        if(Greenfoot.getRandomNumber(500) < 3)
        {
            getWorld().addObject(new Banana(difficulty), (206 - Greenfoot.getRandomNumber(413)) + getX(), getY()+4); // x-coordinate set at a 
            // random number so the dropping of the dominos is not predicatable for the player, thus adding "diffultly"
            bananaCounter = 0;
            bananaDistri = 250 + Greenfoot.getRandomNumber(200); 
        } // end if
        bananaCounter++; 
    } // end genBanana method

    /**
     * Generate Missiles at a delayed rate while dropping from 
     * the bomber's position at a random distribution. 
     * A counter is set to increase the distrubution of the Missiles as time goes by...
     */
    private void genMissiles()
    {
        if (eventualMisselsCounter >= 300)
        {
            if(Greenfoot.getRandomNumber(800) < 3)
            {
                getWorld().addObject(new Missiles(difficulty), (206 - Greenfoot.getRandomNumber(413)) + getX(), getY()+4); // x-coordinate set at a 
                // random number so the dropping of the dominos is not predicatable for the player, thus adding "diffultly"
                misselsCounter = 0;
                misselsDistri = 100 + Greenfoot.getRandomNumber(200);
            } // end inner if
            misselsCounter++;
        } // end if
        eventualMisselsCounter++;
    } // end genMissiles method

    /**
     * After a set number of cycles (1000) 
     * the difficulty increases. 
     */
    private void checkDifficulty()
    {
        if (difficultyCounter == 1000) // Logan Nichols allowed me to understand how to impliment this 
        {
            difficulty += 5;
            difficultyCounter = 0;
        } // end if checkDifficulty
        difficultyCounter++; 
    } // end checkDifficulty 
} // end Bomber class
