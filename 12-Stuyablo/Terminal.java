public class Terminal {
  public static void main(String[] args) {
    int[] intArray = new int[4];
    Text.hideCursor();
    for (int j = 80; j > 0; j--) {
      Text.go(30,j);
      System.out.println(Text.colorize(" ",Text.BLUE+Text.BACKGROUND));
    }
    for (int j = 30; j > 0; j--) {
      Text.go(j,1);
      System.out.println(Text.colorize(" ",Text.BLUE+Text.BACKGROUND));
    }
    for (int j = 1; j < 81; j++) {
      Text.go(1,j);
      System.out.println(Text.colorize(" ",Text.BLUE+Text.BACKGROUND));
    }
    for (int j = 1; j < 31; j++) {
      Text.go(j,80);
      System.out.println(Text.colorize(" ",Text.BLUE+Text.BACKGROUND));
    }
    Text.reset();
    Text.showCursor();
  }
}
