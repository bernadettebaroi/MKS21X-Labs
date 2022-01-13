import java.util.*;
import java.io.*;
public class Game {
  public static final int BORDERS = Text.BLUE+Text.BACKGROUND;
  public static void main(String[] args) {
    border();
    number();
    Text.go(31,1);
    System.out.println(Text.colorize(">", Text.WHITE));
    Text.showCursor();

    String file = args[1];
    Scanner input = new Scanner(file);

  }

  public static void number() {
    int[] intArray = new int[4];
    for (int i = 0; i < 4; i++) {
      intArray[i] = (int)(Math.random()*99)+1 ;
    }
    int k = 2;
    for (int i = 0; i < 4; i ++) {
      Text.go(2,k);
      if (intArray[i] < 25) {
        System.out.print(Text.colorize("" + intArray[i],Text.RED));
      } else if (intArray[i] > 75) {
        System.out.print(Text.colorize("" + intArray[i],Text.GREEN));
      } else {
        System.out.print(Text.colorize("" + intArray[i],Text.WHITE));
      }
      k += 25;
    }
  }

  public static void border() {
    Text.reset();
    for (int j = 1; j < 81; j++) {
      Text.go(1,j);
      System.out.print(Text.colorize(" ",BORDERS));
    }
    for (int j = 1; j < 31; j++) {
      Text.go(j,1);
      System.out.print(Text.colorize(" ",BORDERS));
      Text.go(j,80);
      System.out.print(Text.colorize(" ",BORDERS));
    }
    for (int j = 1; j < 81; j++) {
      Text.go(30,j);
      System.out.print(Text.colorize(" ",BORDERS));
    }
    Text.go(1,1);
    System.out.print(Text.colorize("*",BORDERS));
    Text.go(1,80);
    System.out.print(Text.colorize("*",BORDERS));
    Text.go(30,1);
    System.out.print(Text.colorize("*",BORDERS));
    Text.go(30,80);
    System.out.print(Text.colorize("*",BORDERS));
  }
}
