import ch.aplu.jgamegrid.*;

public class MyGameGrid extends GameGrid
{
  public MyGameGrid()
  {
    super(700, 700, 1, null, "https://i.pinimg.com/736x/e2/6f/29/e26f2931d3ecfbf0f1b21dfc1043c43b.jpg", false);
    show();
  }

  public static void main(String[] args)
  {
    new MyGameGrid();
  }
}