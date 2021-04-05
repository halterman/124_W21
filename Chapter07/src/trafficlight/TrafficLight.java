package trafficlight;

public class TrafficLight {
	
	private LightColor color;
	
	public TrafficLight() {
		color = LightColor.RED;
	}
	
	public void change() {
		if (color == LightColor.RED) {
			color = LightColor.GREEN;
		} else if (color == LightColor.GREEN) {
			color = LightColor.YELLOW;
		} else if (color == LightColor.YELLOW) {
			color = LightColor.RED;
		}
	}
	
	public LightColor get() {
		return color;
	}
	
}
