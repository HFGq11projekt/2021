import java.util.Random;
import ch.aplu.jgamegrid.*;
import java.awt.Color;

public class MyGameGrid extends GameGrid
{
    private Random meinZufallsgenerator;
    public MyGameGrid()
    {
        super(700, 700, 1, new Color (0,0,153), null, true);
        Raumschiff meinRaumschiff = new Raumschiff();
        addActor(meinRaumschiff, new Location(350, 650));
        addKeyRepeatListener(meinRaumschiff);
        meinZufallsgenerator = new Random();
        show();
        doRun();

    }

    public static void main(String[] args)
    {
        new MyGameGrid();
    }

    public void act(){
        var asteroid = new Asteroid();
        addActor(asteroid, new Location(meinZufallsgenerator.nextInt(700),-30));
        asteroid.setDirection(90);
    }
}
