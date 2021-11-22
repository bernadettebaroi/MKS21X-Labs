import java.util.Arrays;
import java.util.ArrayList;
import java.util.Scanner;

public class UserInput {
  public static void main (String args[]) {
    Scanner in = new Scanner(System.in);
    String number;
    ArrayList<String>ans = new ArrayList<String>();
    for (int i = 0; i < 10; i++) {
      System.out.println("Enter a non negative number. A negative number will end the program:");
      number = in.nextLine();
      if (Double.parseDouble(number) > 0) {
        ans.add(number);
      } else if (Double.parseDouble(number) < 0){
        if (ans.size() < 1) {
          System.exit(1);
        }
        System.out.println("You entered: " + ans);
        System.out.println("Mean: " + Mean(ans));
        System.out.println("Min value: " + Min(ans));
        System.out.print("Max value: " + Max(ans) + "\n");
        System.exit(1);
      }
    }
  }
  public static double Mean(ArrayList<String> average) {
    double sum = 0;
    for (int i=0; i < average.size(); i++) {
      sum += Double.parseDouble(average.get(i));
    }
    return sum / average.size();
  }
  public static double Max(ArrayList<String> large) {
    double max = Double.parseDouble(large.get(0));
    for (int i=1; i <large.size();i++) {
      if (Double.parseDouble(large.get(i)) > max) {
        max = Double.parseDouble(large.get(i));
      }
    }
    return max;
  }
  public static double Min(ArrayList<String> small) {
    double Min = Double.parseDouble(small.get(0));
    for (int i=1; i<small.size();i++) {
      if (Double.parseDouble(small.get(i)) < Min) {
        Min = Double.parseDouble(small.get(i));
      }
    }
    return Min;
  }
}
