public class cw122121 {
  public static int stringToInt(String s){
      //return the value of Integer.parseInt(s) but do it yourself!
      //Do not use any built in parse methods.
      int ans = 0;
      int mul = 0;
      if (s.substring(0,1).equals("-")) {
        mul = -1;
      } else {
        mul = 1;
      }
      for (int i = 0; i < s.length();i++) {
        char a = s.charAt(i);
        ans = ans*10+valueOfDigit(a);
      }
      return mul * ans;
  }
  public static int valueOfDigit(char c) {
    //convert '0' to 0, '5' to 5, etc.
    int a = (int)(c);
    int ans= 0;
    if (a >= 48 && a <= 57) {
      ans = (a-48);
    }
    return ans;
  }
  public static void main(String[] args) {
    int a = stringToInt("-145893");
    System.out.println(a);
    a = stringToInt("0");
    System.out.println(a);
    a = stringToInt("145893");
    System.out.println(a);
    a = stringToInt("1");
    System.out.println(a);
    a = stringToInt("10");
    System.out.println(a);
    a = stringToInt("-100");
    System.out.println(a);
  }
}
