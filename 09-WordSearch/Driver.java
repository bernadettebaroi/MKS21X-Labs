public class Driver {
  public static void main(String[] args) {
    WordSearch test = new WordSearch(4,4);
    System.out.println(test);
    test.addWord(0, 3, "abcd", -1, 1);
    System.out.println(test);
    /*test.addWord(3, 3, "bcd", 1, -1);
    System.out.println(test);
    test.addWordHorizontal("efgh", 0, 0);
    System.out.println(test);
    test.addWordDiagonal("ijkl", 0, 0);
    System.out.println(test);*/
  }
}
