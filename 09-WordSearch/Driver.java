public class Driver {
  public static void main(String[] args) {
    WordSearch test = new WordSearch(10,10);
    //System.out.println(test);
    test.addWordHorizontal("yes", 2, 2);
    test.addWordVertical("aday", 1, 2);
    /*
    test.addWord(3, 2, "yes", 0 , 1);
    test.addWord(5, 4, "loves", 0 , -1);
    test.addWord(5, 4, "lake" , 1, 0);
    test.addWord(9, 6, "Gosh", 1 , 1);
    test.addWord(4, 2, "never", 1 , -1);
    test.addWord(7, 3, "sure", -1 , 0);
    test.addWord(4, 3, "thanks", -1 , 1);
    test.addWord(10, 4, "Pop", -1 , -1);
    */
    System.out.println(test);
  }
}
