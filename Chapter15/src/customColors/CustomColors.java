package customColors;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class CustomColors {
    @SuppressWarnings("serial")
    private static class ColorPanel extends JPanel {
        public ColorPanel() {
            setPreferredSize(new Dimension(400, 400));
        }
        
        @Override
        public void paintComponent(Graphics g) {
           super.paintComponent(g);
           double width = getWidth(), height = getHeight();
           // Show all the shades of pure red
           for (int red = 0; red < 256; red++) {
               for (int green = 0; green < 256; green++) {
                   g.setColor(new Color(red, green, 0));
                   g.fillRect((int)Math.round(red*width/255), 
                              (int)Math.round(green*height/255), 
                              (int)Math.round(width/255), 
                              (int)Math.round(height/255)); 
               }
           }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("My Simple Graphical Program");
            frame.add(new ColorPanel());
            frame.pack();
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
        });
    }

}
