package simpleGraphical2;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Dimension;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.JPanel;

@SuppressWarnings("serial")
public class MyPanel extends JPanel {
    private ArrayList<Point> points;
    
    public MyPanel() {
        setBackground(Color.BLUE);
        setPreferredSize(new Dimension(600, 400));
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseReleased(MouseEvent ev) {
                addPoint(ev.getX(), ev.getY());
            } 
        });
        points = new ArrayList<Point>();
    }
    
    public void addPoint(int x, int y) {
        points.add(new Point(x, y));
        repaint();
    }
    
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.WHITE);
        for (int i = 1; i < points.size(); i++) {
            g.drawLine(points.get(i).x, points.get(i).y,
                       points.get(i - 1).x, points.get(i - 1).y);
        }
        g.setColor(Color.YELLOW);
        for (Point p : points) {
            g.fillOval(p.x - 10, p.y - 10, 20, 20);
        }
//        double width = getWidth();
//        for (int i = 0; i < width; i++) {
//           Color color = new Color((int)(i/width*255), 0, 0);
//           g.setColor(color);
//           g.fillRect(i, 100, (int)(width/255), 100);
//           
//        }
    }
}
