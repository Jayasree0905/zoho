/**
 * Check whether the given string has characters of the equal difference or not
 */
public class Section_A_Question_5 {
	public static void main(String args[]) {
		System.out.println("Output 1:");
		equalDifference("abcdefg");
		System.out.println("Output 2:");
		equalDifference("adxz");
	}
	public static void equalDifference(String input) {
		char[] cha = input.toCharArray(); // to convert string to char array
		int len = cha.length;// length of the char array
		Boolean isEqual = false;
		// to compare next element with current element.
		// if the difference is 1 then given string is "Equal" else "Unequal"
		for (int i = 0; i < len - 1; i++) {
			if (cha[i + 1] - cha[i] == 1) {
				isEqual = true;
			} else {
				isEqual = false;
			}
		}
		if (isEqual)
			System.out.println("Equal difference.");
		else
			System.out.println("Unequal difference.");
	}
}
