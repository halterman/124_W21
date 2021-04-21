package simpleGraphical2;

import javax.swing.JFrame;

public class GraphicalProgram2 {

    public static void main(String[] args) {
        JFrame frame = new JFrame("My Simple Graphical Program");
        frame.add(new MyPanel());
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

}
