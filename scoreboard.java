import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import greenfoot.Color;
/**
 * Write a description of class scoreboard here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class scoreboard extends Actor
{
    /**
     * Act - do whatever the scoreboard wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public int score=0;
    public void act() 
    {
        // Add your action code here.
        GreenfootImage image=new GreenfootImage("score" + score, 20 , Color.GREEN, Color.BLACK);
        setImage(image);
    }    
}
