/**
Check whether the given string has characters of equal difference or not
**/
public class Section_A_Question_5 {
    public static void main(String args[]) {
      equalDifference("abcdefg");
      equalDifference("adxz");
    }
    public static void equalDifference(String input){
      char[] cha = input.toCharArray(); // To convert string to character array
      int len=cha.length; // length of the character
      Boolean isEqual = false; // To set default value as fasle
      //To check characters are equal or not, if its equal set value as true else false
      for(int i =0; i<len-1;i++){
          if(cha[i+1] - cha[i] ==  1){ 
              isEqual=true;
          }else{
              isEqual = false;
          }
      }
      if(isEqual)
      System.out.println("Equal difference"); 
      else 
      System.out.println("Unequal difference");
    }
}
