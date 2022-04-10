/**
 * Print the largest possible for the given string.
 */
public class Section_A_Question_3 {
	public static void main(String args[]) {
		System.out.print("String 1 : ");
		findLargest("abdf");
		
		System.out.print("String 2 : ");
		findLargest("hafd");
	}
	
	
	public static void findLargest(String input) {
		char[] cha = input.toCharArray();
		int len = cha.length;
		for (int i = 0; i < len; i++) {
			for (int j = i + 1; j < len; j++) {
				if (cha[i] < cha[j]) {
					char temp = cha[j];
					cha[j] = cha[i];
					cha[i] = temp;
				}
			}
		}

		for (char large : cha) {
			System.out.print(large);
		}
		System.out.println();
	}

}