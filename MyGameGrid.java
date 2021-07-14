import ch.aplu.jgamegrid.*;
import java.awt.Color;

public class MyGameGrid extends GameGrid
{
  public MyGameGrid()
  {
    super(700, 700, 1, new Color (0,0,153), null, false);
    Raumschiff meinRaumschiff = new Raumschiff();
    addActor(meinRaumschiff, new Location(350, 500));
    show();
  }

  public static void main(String[] args)
  {
    new MyGameGrid();
  }
}