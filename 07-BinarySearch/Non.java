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
        while (input.hasNextLine()) {
          String s = input.nextLine();
          if (isNice(s)) {
            ans += 1;
          }
        }
        System.out.println(ans);
        input.close();
      } else if (num == 2) {
        File file1 = new File(filename);
        Scanner input1 = new Scanner(file1);
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

}
