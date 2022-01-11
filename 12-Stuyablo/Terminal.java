public class Terminal {
  public static void main(String[] args) {
    int[] intArray = new int[4];
    Text.hideCursor();
    for (int j = 1; j < 81; j++) {
      Text.go(1,j);
      System.out.println(colorize(" ",Text.BLUE+Text.BACKGROUND));
    }
    Text.reset();
    Text.showCursor();
  }
}
