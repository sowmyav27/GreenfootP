import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class flies here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class flies extends Actor
{
    /**
     * Act - do whatever the flies wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        
        move(Greenfoot.getRandomNumber(10));
        turn(10-Greenfoot.getRandomNumber(20));
        
        if(getX()<=5 || getX() >= getWorld().getWidth() - 5)
        {
            turn(180);
        }
    }    
}
