import java.util.*;
import java.io.*;
public class Test {
  public static void main(String[] args) {
    OrderedArrayList<Character> trial  =  new OrderedArrayList<Character>();
    for (int i = 0; i <= 100; i++) {
      char a = (char)(Math.random()*26 + 65);
      trial.add(i, a);
    }
    System.out.println(trial);
    System.out.println(trial.set(0, 'z'));
    System.out.println(trial);
    trial.add(null);
  }
}
