package simpleGraphical;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MouseHandler extends MouseAdapter {
    private MyPanel panel;
    
    public MouseHandler(MyPanel panel) {
        this.panel = panel;
    }

    @Override
    public void mouseReleased(MouseEvent ev) {
        //System.out.println("Mouse released at (" 
        //                   + ev.getX() + ", " + ev.getY() +")");
        panel.addPoint(ev.getX(), ev.getY());
    }
}
