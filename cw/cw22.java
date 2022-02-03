public class cw22 {

  public static void main(String[] args) {
    makeWord(3,"");
    for (char c = 'a'; c <= 'd'; c++) {
      System.out.print(c);
    }
    System.out.println();
  }

  public static void makeWord(int a, String ans) {
    if (a > 0) {
      makeWord(a-1, ans);
      ans += Character.toString('a' + a);
    } else {
      ans += Character.toString('a' + a);
    }
  }

}
