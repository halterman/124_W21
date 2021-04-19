package simpleGraphical;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MouseHandler extends MouseAdapter {
    @Override
    public void mouseReleased(MouseEvent ev) {
        System.out.println("Mouse released at (" 
                           + ev.getX() + ", " + ev.getY() +")");
    }
}
