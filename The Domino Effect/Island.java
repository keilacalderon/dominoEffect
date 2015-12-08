import greenfoot.*;

/**
 * Write a description of class Island here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Island extends Actor
{
    private int size;
    private int stability; 
    public Island()
    {
        this(50);
    }
    
    /**
     * Act - do whatever the Island wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        move(5);
    }    
    
    /**
     * Create an asteroid with a given size and random direction of movement.
     */
    public Island(int size)
    {
        super(new Vector(Greenfoot.getRandomNumber(800), 2));
        setSize(size);
    }
    
    /**
     * Create an asteroid with a given size and direction of movement.
     */
    public Island(int size, Vector velocity)
    {
        super(velocity);
        setSize(size);
    }
    
    public void hit(int damage) 
    {
        stability = stability - damage;
        if (stability <= 0) 
        {
            breakUp();
        }
    }
     /**
     * Return the current stability of this asteroid. (If it goes down to 
     * zero, it breaks up.)
     */
    public int getStability() 
    {
        return stability;
    }
    
    private void breakUp() 
    {
        Greenfoot.playSound("Explosion.wav");
        
        if (size <= 16) 
        {
            getWorld().removeObject(this);
        }
        else {
            int r = getVelocity().getDirection() + Greenfoot.getRandomNumber(45);
            double l = getVelocity().getLength();
            Vector speed1 = new Vector(r + 60, l * 1.2);
            Vector speed2 = new Vector(r - 60, l * 1.2);        
            Island i1 = new Island(size/2, speed1);
            Island i2 = new Island(size/2, speed2);
            getWorld().addObject(a1, getX(), getY());
            getWorld().addObject(a2, getX(), getY());        
            
        
            getWorld().removeObject(this);
        }
    }
}
