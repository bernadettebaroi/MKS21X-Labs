public class Terminal {
  public static void main(String[] args) {
    for (int j = 80; j > 0; j--) {
      Text.hideCursor();
      Text.go(30,j);
      System.out.println(Text.colorize(" ",Text.BLUE+Text.BACKGROUND));
      Text.showCursor();
    }
    for (int j = 30; j > 0; j--) {
      Text.hideCursor();
      Text.go(j,1);
      System.out.println(Text.colorize(" ",Text.BLUE+Text.BACKGROUND));
      Text.showCursor();
    }
    for (int j = 1; j < 81; j++) {
      Text.hideCursor();
      Text.go(1,j);
      System.out.println(Text.colorize(" ",Text.BLUE+Text.BACKGROUND));
      Text.showCursor();
    }
    for (int j = 1; j < 31; j++) {
      Text.hideCursor();
      Text.go(j,80);
      System.out.println(Text.colorize(" ",Text.BLUE+Text.BACKGROUND));
      Text.showCursor();
    }
    Text.reset();
  }
}
