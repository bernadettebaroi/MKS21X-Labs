public class cw22 {

  public static void main(String[] args) {
    makeWord(3,"");
  }
  public static void makeWord(int size, String ans) {
    if (size > 0) {
      for (char c = 'a'; c <= 'd'; c++) {
        makeWord(size-1,ans+c);
      }
    } else {
      System.out.println(ans);
    }
  }

}
