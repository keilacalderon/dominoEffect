import greenfoot.*;

/**
 * A bomber that will be automatically controlled. It will fire down dominos, 
 * bananas, and missels. 
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
     * 
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
    }

    public void act() 
    {
        turnAtEdge();
        move(2);
        genDominos();
        genBanana();
        genMissels();
        checkDifficulty();
    } // end act   

    /**
     * Check whether the bomber is at the edge of the world. If it is, turn around.
     * If not, do nothing.
     */
    private void turnAtEdge()
    {
        if ( isAtEdge() ) 
        {
            turn(90);
            setImage();
        } // end if
    } // end turnAtEdge

    private void setImage()
    {
        if (getImage() == image1) 
        {
            setImage(image2);
            setRotation(180);
        }
        else
        {
            setImage(image1);
            setRotation(360);
        } // end else/if
    }

    private void genDominos()
    {
        if (eventualDominoCounter >= 500)
        {
            if(dominoCounter == dominoDistri)
            {
                getWorld().addObject(new Domino(difficulty), (206 - Greenfoot.getRandomNumber(413)) + getX(), getY()+4);
                dominoCounter = 0;
                dominoDistri = 40 + Greenfoot.getRandomNumber(700);
            } // end if
            dominoCounter++;
        }
        eventualDominoCounter++;
    }

    private void genBanana()
    {
        if(Greenfoot.getRandomNumber(500) < 3)
        {
            getWorld().addObject(new Banana(difficulty), (206 - Greenfoot.getRandomNumber(413)) + getX(), getY()+4);
            bananaCounter = 0;
            bananaDistri = 15 + Greenfoot.getRandomNumber(30);
        }
        bananaCounter++;// end if
    }

    private void genMissels()
    {
        if (eventualMisselsCounter >= 300)
        {
            if(Greenfoot.getRandomNumber(800) < 3)
            {
                getWorld().addObject(new Missels(difficulty), (206 - Greenfoot.getRandomNumber(413)) + getX(), getY()+4);
                misselsCounter = 0;
                misselsDistri = 100 + Greenfoot.getRandomNumber(500);
            } // end if
            misselsCounter++;
        }
        eventualMisselsCounter++;
    }

    private void checkDifficulty()
    {
        if (difficultyCounter == 1000)
        {
            difficulty += 5;
            difficultyCounter = 0;
        } // end if
        difficultyCounter++; 
    } // end checkDifficulty 

}
