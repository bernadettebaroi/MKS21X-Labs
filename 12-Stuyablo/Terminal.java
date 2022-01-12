public class Terminal {
  public static void main(String[] args) {
    Text.reset();
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
    int[] intArray = new int[4];
    for (int i = 0; i < 4; i++) {
      intArray[i] = (int)(Math.random()*99)+1 ;
    }

  int k = 2;
  for (int i = 0; i < 4; i ++) {
    Text.hideCursor();
    Text.go(2,k);
    if (intArray[i] < 25) {
      System.out.println(Text.colorize("" + intArray[i],Text.RED));
    } else if (intArray[i] > 75) {
      System.out.println(Text.colorize("" + intArray[i],Text.GREEN));
    } else {
      System.out.println(Text.colorize("" + intArray[i],Text.WHITE));
    }
    Text.reset();
    Text.showCursor();
    k += 25;
  }
}
}
