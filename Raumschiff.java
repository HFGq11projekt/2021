import ch.aplu.jgamegrid.*;
import java.awt.event.KeyEvent;

public class Raumschiff extends Actor implements GGKeyListener
{
    
    public Raumschiff() {
        super("img/Raumschiff.png");
    }
    
    public void act() {
        move();
        if (isNearBorder())
        turn (180);
    }
    
    public boolean keyPressed(KeyEvent evt) {
        switch (evt.getKeyCode()) {
            case KeyEvent.VK_D:
                setDirection(0);
                
                break;
            case KeyEvent.VK_A:
                setDirection(180);
                
                break;
        }
        return true;
    }
    
    public boolean keyReleased(KeyEvent e) {
        return true;
    }

    
    
}
