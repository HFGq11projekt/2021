import ch.aplu.jgamegrid.*;
public class Schuss extends Actor implements GGActorCollisionListener
{
    private boolean initialisiert;
    
    public Schuss() {
        super ("img/schuss.png");
        setDirection(270);
        initialisiert = false;
        
    }
    
    public void initialisieren() {
        // alle Asteroiden als Kollisionspartner anmelden
        var alleAsteroiden = gameGrid.getActors(Asteroid.class);
        alleAsteroiden.forEach(asteroid -> addCollisionActor(asteroid));
        
        addActorCollisionListener(this);
    }

    public void act() {
        if (!initialisiert) {
            initialisieren();
            initialisiert = true;
        }
        move();

    }
    
    
    public int collide(Actor a1, Actor a2) {
        a1.removeSelf();
        a2.removeSelf();
        
        
        return 10;
    }
    // private void tryToEat()
    // {
    // show(0);
    // Actor actor = gameGrid.getOneActorAt(getLocation(), Asteroid.class);
    // if (actor != null)
    // {
    // actor.removeSelf();

    // }
    // }
    
    
}
