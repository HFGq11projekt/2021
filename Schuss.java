import ch.aplu.jgamegrid.*;
public class Schuss extends Actor
{
    public Schuss() {
        super ("img/schuss.png");
        setDirection(270);
    }
    public void act() {
        move();
        tryToEat();
  }

  private void tryToEat()
  {
    show(0);
    Actor actor = gameGrid.getOneActorAt(getLocation(), Asteroid.class);
    if (actor != null)
    {
      actor.removeSelf();
      
    }
  }
}


