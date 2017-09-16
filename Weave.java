import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Weave here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Weave extends World
{

    /**
     * Constructor for objects of class Weave.
     * 
     */
    public Weave()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        snake snake = new snake();
        addObject(snake,86,102);
        flies flies = new flies();
        addObject(flies,229,93);
        flies flies2 = new flies();
        addObject(flies2,210,229);
        flies.setLocation(324,81);
        flies flies3 = new flies();
        addObject(flies3,394,196);
        flies flies4 = new flies();
        addObject(flies4,344,349);
        flies flies5 = new flies();
        addObject(flies5,490,239);
        flies flies6 = new flies();
        addObject(flies6,496,124);
        scoreboard scoreboard = new scoreboard();
        addObject(scoreboard,61,30);
    }
}
