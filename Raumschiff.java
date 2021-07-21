import ch.aplu.jgamegrid.*;
import java.awt.event.KeyEvent;

public class Raumschiff extends Actor implements GGKeyRepeatListener, GGMouseListener
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
    
    public boolean mouseEvent(GGMouse evt){
        if (evt.getEvent() == GGMouse.lClick) {
            
                var x = getX();
                var y = getY();
                var schuss = new Schuss();
                gameGrid.addActor(schuss, new Location(x,y - 5));
                schuss.setDirection(270);
                
        }
        return false;
    }
    

    
    
}
