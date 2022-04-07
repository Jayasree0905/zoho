/**
 * Print the following pattern for the given
 */
public class Section_A_Question_2 {
    public static void main(String args[]) {
    	 System.out.println("Output 1");
    	printPattern(3);
    	 System.out.println("Output 2");
    	printPattern(5);
    }
    public static void printPattern(int input){
     for(int i=0;i<input;i++) {
    	 for(int j=0;j<input;j++) {
        	 if(i>j)
        		 System.out.print("  ");
        	 else
        		 System.out.print(i+" ");
         }
    	 System.out.println("");
     }
    }
}