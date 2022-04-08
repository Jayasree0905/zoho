/**
 * Print the following pattern for the given input
 */
public class Section_A_Question_4 {
	public static void main(String args[]) {
		int x = 5;
		for (int i = 0; i < x; i++) {
			for (int j = 0; j < x; j++) {
				if (j > i)
					System.out.print(x - i + " ");
				else
					System.out.print(x - j + " ");
			}
			for (int j = 4; j > 0; j--) {
				if (j - i <= 1)
					System.out.print(x - j + 1 + " ");
				else
					System.out.print(x - i + " ");
			}
			System.out.println("");
		}

		for (int i = 5; i > 1; i--) {
			for (int j = 0; j < x; j++) {
				if (i - 1 > j)
					System.out.print(x - j + " ");
				else
					System.out.print(x - i + 2 + " ");
			}
			for (int j = 4; j > 0; j--) {
				if (i - 1 > j)
					System.out.print(x - j + " ");
				else
					System.out.print(x - i + 2 + " ");
			}
			System.out.println("");
		}
	}

}
