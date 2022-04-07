/**
 * Display the diagonal pattern for the string of odd length
 */
public class Section_A_Question_1 {
    public static void main(String args[]) {
    	System.out.println("Output 1");
    	diagonalPattern("racecarty");
    	System.out.println("Output 2");
    	diagonalPattern("football");
    }
    public static void diagonalPattern(String input) {
    	int len = input.length();
    	if(len%2 == 0) {
    		System.out.println("Not Possible");
    		return;
    	}
    	int si = len/2;
    	int inc=si;
    	String[] inputArray= input.split("");
    	for(int i=0; i<=len/2;i++) {
    		for(int j=0; j<len;j++) {
    			if(j==si || j == inc)
    				System.out.print(inputArray[j]+"  ");
    			else
    				System.out.print("  ");
    		}
    		System.out.println();
    		inc++;
    		si--;
    	}
    	si=1;
    	inc=len-2;
    	
    	for(int i=1; i<=len/2;i++) {
    		for(int j=0; j<len;j++) {
    			if(j==si || j == inc)
    				System.out.print(inputArray[j]+"  ");
    			else
    				System.out.print("  ");
    		}
    		System.out.println();
    		inc--;
    		si++;
    	}
    }
   
}