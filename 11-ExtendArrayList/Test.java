import java.util.*;
import java.io.*;
public class Test {
  public static void main(String[] args) {
    OrderedArrayList<Integer> trial  =  new OrderedArrayList<Integer>();
    for (int i = 0; i <= 100; i++) {
      int a = (int)(Math.random()*10 +1);
      trial.add(i, a);
    }
    System.out.println(trial);
  }
}
