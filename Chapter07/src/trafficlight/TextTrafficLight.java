package trafficlight;

public class TextTrafficLight {
	
	private static void show(TrafficLight lt) {
		if (lt.get() == LightColor.RED) {
			System.out.println("+---+");
			System.out.println("|(R)|");
			System.out.println("|( )|");
			System.out.println("|( )|");
			System.out.println("+---+");
		} else if (lt.get() == LightColor.GREEN) {
			System.out.println("+---+");
			System.out.println("|( )|");
			System.out.println("|( )|");
			System.out.println("|(G)|");
			System.out.println("+---+");
		} else if (lt.get() == LightColor.YELLOW) {
			System.out.println("+---+");
			System.out.println("|( )|");
			System.out.println("|(Y)|");
			System.out.println("|( )|");
			System.out.println("+---+");
		}
	}


	public static void main(String[] args) {
		TrafficLight light = new TrafficLight();
		var scan = new java.util.Scanner(System.in);
		String input;
		do {
			show(light);
			light.change();
			input = scan.nextLine();
			
		} while (input.equals(""));
		scan.close();
	}

}
