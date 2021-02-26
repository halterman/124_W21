import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Plotter {
    
    @SuppressWarnings("serial")
    private static class PlotPanel extends JPanel {
        private Dimension dimension;
        private int[] dataSet;

        public PlotPanel(int[] data, int width, int height) {
            dataSet = data;
            dimension = new Dimension(width, height);
            setBackground(Color.WHITE);
        }

        @Override
        public Dimension getPreferredSize() {
            return dimension;
        }
        
        private static int range(int[] data) {
            int min = data[0], max = data[0];
            for (int elem : data) {
                if (elem < min) {
                    min = elem;
                }
                if (elem > max) {
                    max = elem;
                }
            }
            return max - min;
        }
        
        @Override
        public void paintComponent(Graphics g) {
            super.paintComponent(g);
            int height = getHeight();
            // Compute the vertical size of the data
            int dataHeight = range(dataSet); 
            double widthScale = (double) getWidth()/dataSet.length;
            double heightScale = (double) height/dataHeight;
            g.setColor(Color.RED);
            for (int i = 1; i < dataSet.length; i++) {
                g.drawLine((int) ((i - 1) * widthScale), height - (int) (dataSet[i - 1] * heightScale),
                           (int) (i * widthScale), height - (int) (dataSet[i] * heightScale));
            }
        }
    }
    
    /**
     * Plots the data stored in an array in a graphical window
     * with a given size.  The plot fills the window horizontally
     * and vertically.
     * @param data the data set to plot
     * @param width the width of the graphical window, in pixels
     * @param height the height of the graphical window, in pixels
     */
    public static void plot(int[] data, int width, int height) {
        JFrame window = new JFrame("Plot");
        JPanel panel = new PlotPanel(data, width, height);
        window.add(panel);
        window.pack();
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true);
    }
}
