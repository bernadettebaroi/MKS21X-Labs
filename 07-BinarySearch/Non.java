import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class Non {
  public static void main(String[] args) {
    String filename = args[0];
    int num = Integer.parseInt(args[1]);
    try {
      if (num == 1) {
        File file = new File(filename);
        Scanner input = new Scanner(file);
        int ans = 0;
        int inp = 0;
        while (input.hasNextLine()) {
          String s = input.nextLine();
          inp += 1;
          if (isNice(s)) {
            ans += 1;
          }
        }
        System.out.println(ans + " nice out of the " + inp + " inputs");
        input.close();
      } else if (num == 2) {
        File file1 = new File(filename);
        Scanner input1 = new Scanner(file1);
        int ans1 =0;
        int inp1 = 0;
        while (input1.hasNextLine()) {
          String s = input1.nextLine();
          inp1 += 1;
          if (isNice1(s)) {
            ans1 += 1;
          }
        }
        System.out.println(ans1 + " nice out of the " + inp1 + " inputs");
        input1.close();
      }
    } catch (FileNotFoundException e) {
      System.out.println("Error: File not Found");
    }
  }

  public static boolean isNice(String s) {
    boolean ans = false;
    String[] charArray = { "a", "e", "i", "o", "u" };
    String[] restrictions = {"ab", "cd", "pq", "xy"};
    int vowelcount = 0;
    for (int i = 0; i < 5;i++) {
      for (int j = 0; j < s.length();j++) {
        if (s.substring(j,j+1).equals(charArray[i])) {
          vowelcount += 1;
        }
      }
    }
    for (int i = 0; i < s.length() -1 ;i++ ) {
      if (!(s.substring(i,i+2).equals(restrictions[0])) && !(s.substring(i,i+2).equals(restrictions[1])) && !(s.substring(i,i+2).equals(restrictions[2])) && !(s.substring(i,i+2).equals(restrictions[3]))) {
        if (vowelcount >= 3) {
          if (s.substring(i,i+1).equals(s.substring(i+1, i+ 2))) {
            ans = true;
          }
        }
      } else {
        ans = false;
        break;
      }
    }
    return ans;
  }

  public static boolean isNice1(String s) {
    if (hasDouble(s) && hasRepeats(s)) {
      return true;
    }
    return false;
  }

  public static boolean hasDouble(String s) {
    boolean ans = false;
    for (int i = 0; i < s.length()-1; i++) {
      for (int j = s.length(); j > i+2; j--) {
        if (s.substring(i,i+2).equals(s.substring(j-2, j))) {
          ans = true;
          break;
        }
      }
    }
    return ans;
  }

  public static boolean hasRepeats(String s) {
    boolean ans = false;
    for (int i = 0; i < s.length()-2;i++) {
      if (s.substring(i,i+1).equals(s.substring(i+2,i+3))) {
        ans = true;
        break;
      }
    }
    return ans;
  }

}
