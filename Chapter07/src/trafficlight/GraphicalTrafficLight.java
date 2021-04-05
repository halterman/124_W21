package trafficlight;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

@SuppressWarnings("serial")
class TrafficLightPanel extends JPanel {
	private TrafficLight light;
	private Dimension dimension;
	
	public TrafficLightPanel(int width, int height) {
		light = new TrafficLight();
		dimension = new Dimension(width, height);
		addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent ev) {
				light.change();
				repaint();
			}
		});
	}
	
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		// Draw frame
		g.setColor(Color.GRAY);
		g.fillRect(20, 20, 200, 480);
		if (light.get() == LightColor.RED) {
			g.setColor(Color.RED);
		} else {
			g.setColor(Color.BLACK);
		}
		g.fillOval(60, 60, 120, 120);
		if (light.get() == LightColor.YELLOW) {
			g.setColor(Color.YELLOW);
		} else {
			g.setColor(Color.BLACK);
		}
		g.fillOval(60, 200, 120, 120);
		if (light.get() == LightColor.GREEN) {
			g.setColor(Color.GREEN);
		} else {
			g.setColor(Color.BLACK);
		}
		g.fillOval(60, 340, 120, 120);
	}
	
	@Override
	public Dimension getPreferredSize() {
	    return dimension;
	}
}

public class GraphicalTrafficLight {
	public static void main(String[] args) {
		SwingUtilities.invokeLater(() -> {
			JFrame window = new JFrame("Traffic Light");
			window.add(new TrafficLightPanel(240, 540));
			//window.setSize(200, 560);
			window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			window.pack();
			window.setVisible(true);
		});
	}
}
