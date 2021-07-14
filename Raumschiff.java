import ch.aplu.jgamegrid.*;
import java.awt.event.KeyEvent;

public class Raumschiff extends Actor implements GGKeyListener
{
    
    public Raumschiff() {
        super("img/Raumschiff.png");
    }
    
    public void act() {
        
    }
    
    public boolean keyPressed(KeyEvent e) {
        switch (e.getKeyCode()) {
            case KeyEvent.VK_RIGHT:
                setDirection(0);
                break;
            case KeyEvent.VK_LEFT:
                setDirection(180);
                break;
        }
        return false;
    }
    
    public boolean keyReleased(KeyEvent e) {
        return false;
    }

    
    
}
