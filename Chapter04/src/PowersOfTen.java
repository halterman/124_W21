
public class PowersOfTen {

	public static void main(String[] args) {
		for (int i = 1; i <= 1_000_000_000; i *= 10) {
			System.out.printf("%10d%n", i);
		}
	}
}
