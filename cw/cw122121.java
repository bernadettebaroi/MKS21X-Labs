public class cw122121 {
  public static int stringToInt(String s){
      //return the value of Integer.parseInt(s) but do it yourself!
      //Do not use any built in parse methods.
      return 1;
  }
  public static int valueOfDigit(char c) {
    //convert '0' to 0, '5' to 5, etc.
    int a = (int)(c);
    return a;
  }
  public static void main(String[] args) {
    int a = valueOfDigit('5');
    System.out.println(a);
  }
}
