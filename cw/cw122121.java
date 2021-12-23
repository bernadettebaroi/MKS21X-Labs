public class cw122121 {
  public static int stringToInt(String s){
      //return the value of Integer.parseInt(s) but do it yourself!
      //Do not use any built in parse methods.
      int ans = 0;
      for (int i = 0; i < s.length();i++) {
        char a = s.charAt(i);
        ans += valueOfDigit(a);
      }
      return ans;
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
    int a = valueOfDigit('0');
    System.out.println(a);
  }
}
