/**
 * Print the distinct words in the given string.
 */
import java.util.*;
public class Section_A_Question_7 {
    public static void main(String args[]) {
    	isDistinctWord("This is Zoho and Zoho is good");
    	isDistinctWord("we develop software we craft software");
    }
    public static void isDistinctWord(String input){
       HashMap<String,String> hashMap = new LinkedHashMap<String,String>();
       String[] inputArray = input.split(" "); // To convert string to string array
       //Iterate the string array and put the value to the hash map, hash map not allow duplicate key
       for(String word : inputArray) {
    	   hashMap.put(word,word);
       }
       //Print the value
       for(HashMap.Entry<String,String> map:hashMap.entrySet()) {
    	   System.out.print(map.getKey()+" ");
       }
         System.out.println();
    }
}