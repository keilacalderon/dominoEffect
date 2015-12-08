import greenfoot.*;

/**
 * Write a description of class Bananas here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bananas extends SmoothMover
{
    private static final int damage = 16;
    private int life = 30;
    public Bananas()
    {
    } // end domino 
    
    public Bananas (Vector speed, int rotation) 
    {
        super(speed); 
        setRotation(rotation);
        addToVelocity(new Vector(rotation, 15));
    }
    
    /**
     * Act - do whatever the Bananas wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(life <= 0) 
        {
            getWorld().removeObject(this);
        } 
        else 
        {
            life--;
            move();
            checkIslandHit(); 
        }
    }
    
    private void checkIslandHit()
    {
        Island island = (Island) getOneIntersectingObject(Island.class);
        if (island != null) 
        {
            getWorld().removeObject(this);
            island.hit(damage);
        }
    }
}
