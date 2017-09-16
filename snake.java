import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class snake here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class snake extends Actor
{
    /**
     * Act - do whatever the snake wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        if(Greenfoot.isKeyDown("left"))
        {
            turn(5);
        }
         if(Greenfoot.isKeyDown("right"))
        {
            turn(-5);
        }
         if(Greenfoot.isKeyDown("up"))
        {
            move(5);
        }
         if(Greenfoot.isKeyDown("down"))
        {
            move(-5);
        }
        Actor flies;
        flies = getOneObjectAtOffset(0,0,flies.class);
        if(flies!=null)
        {
            World world;
            world = getWorld();
             world.removeObject(flies);
             Greenfoot.playSound("yum.wav");
             scoreboard scorebd=(scoreboard)(getWorld().getObjects(scoreboard.class).get(0));
             scorebd.score+=1;
             
        }
    }    
}
