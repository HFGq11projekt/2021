import ch.aplu.jgamegrid.*;
import java.awt.event.KeyEvent;

public class Raumschiff extends Actor implements GGKeyRepeatListener
{
    
    public Raumschiff() {
        super("img/Raumschiff.png");
    }
    
    public void act() {
        
        if (isNearBorder())
        turn (180);
    }
    
    public void keyRepeated(int keyCode) {
        switch (keyCode) {
            case KeyEvent.VK_D:
                setDirection(0);
                move(1);
                break;
            case KeyEvent.VK_A:
                setDirection(180);
                move(1);
                break;
        }
        
    }
    
    

    
    
}
