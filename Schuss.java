import ch.aplu.jgamegrid.*;
public class Schuss extends Actor
{
    public Schuss() {
        super ("img/schuss.png");
        setDirection(270);
    }
    public void act() {
        move();
    }
}
