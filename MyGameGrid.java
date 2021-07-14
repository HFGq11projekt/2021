import ch.aplu.jgamegrid.*;
import java.awt.Color;

public class MyGameGrid extends GameGrid
{
  public MyGameGrid()
  {
    super(700, 700, 1, new Color (0,0,153), null, true);
    Raumschiff meinRaumschiff = new Raumschiff();
    addActor(meinRaumschiff, new Location(350, 500));
    addKeyListener(meinRaumschiff);
    show();
    doRun();
  }

  public static void main(String[] args)
  {
    new MyGameGrid();
  }
}