package simpleGraphical;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JPanel;

@SuppressWarnings("serial")
public class MyPanel extends JPanel {
    public MyPanel() {
        setBackground(Color.BLUE);
        setPreferredSize(new Dimension(600, 400));
        addMouseListener(new MouseHandler());
    }
}
