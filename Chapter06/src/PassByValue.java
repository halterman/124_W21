
public class PassByValue {
	public static void tryToModify(int x) {
		System.out.println("x = " + x);
		x++;
		System.out.println("x = " + x);
	}

	public static void main(String[] args) {
		int value = 45;
		System.out.println("value = " + value);
		tryToModify(value);
		System.out.println("value = " + value);

	}

}
