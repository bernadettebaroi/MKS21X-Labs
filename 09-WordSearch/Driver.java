public class Driver {
  public static void main(String[] args) {
    WordSearch test = new WordSearch(4,4);
    System.out.println(test);
    test.addWordVertical("abcd", 0, 0);
    System.out.println(test);
    test.addWordHorizontal("efgh", 0, 0);
    System.out.println(test);
    test.addWordDiagonal("ijkl", 0, 0);
    System.out.println(test);
  }
}
