package Lab4;
/*
 * Student Name: Christopher Kelly
 * Student ID: 134358183
 */
public class Task4 {

	public static void main(String[] args) {
		System.out.println("\t\tMultiplication Table");
		System.out.print("      ");
		for (int i = 1; i < 10; i++) {
			System.out.print("   " + i);
		}
		System.out.println("");
		System.out.println("--------------------------------");
		for (int i = 1; i < 10; i++) {
			System.out.print(i + "  |  ");
			for (int j = 1; j < 10; j++) {
				System.out.printf("%4d", j * i);
			}
			System.out.println("");
		}
	}

}
