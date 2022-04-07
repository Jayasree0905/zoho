public class Section_A_Question_5 {
    public static void main(String args[]) {
      equalDifference("abcdefg");
      equalDifference("adxz");
    }
    public static void equalDifference(String input){
         char[] cha = input.toCharArray();
      int len=cha.length;
      Boolean isEqual = false;
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
