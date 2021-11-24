import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;

public class Wrapping {
  public static void main (String[] args) {
    String filename = args[0];
    try {
      File file = new File(filename);
      Scanner in = new Scanner(file);
      int ans = 0;
      while (in.hasNextLine()) {
        String line = in.nextLine();
        String[] nums = line.split("x");
        int a = Integer.parseInt(nums[0]);
        int b = Integer.parseInt(nums[1]);
        int c = Integer.parseInt(nums[2]);
        ans += feetNeeded(a,b,c);
      }
      System.out.println(ans);
    } catch (FileNotFoundException e) {
      System.out.println("Error: File not Found");
    }
  }
  public static int feetNeeded(int l, int w, int h) {
    int side1 = l * w;
    int side2 = l * h;
    int side3 = h * w;
    int ans = 0;
    ans = 2*side1 + 2*side2 + 2*side3;

    if (side1 < side2 && side1 < side3) {
      ans += side1;
    } else if (side2 < side1 && side1 < side3) {
      ans += side2;
    } else if (side3 < side2 && side3 < side1) {
      ans += side3;
    } else if (side1 == side2 && side1 < side3) {
      ans += side1;
    } else if (side2 == side3 && side2 < side1) {
      ans += side2;
    } else if (side3 == side1 && side3 < side2) {
      ans += side3;
    } else if (side1 == side2 && side1 > side3) {
      ans += side3;
    } else if (side2 == side3 && side2 > side1) {
      ans += side1;
    } else if (side3 == side1 && side3 > side2) {
      ans += side2;
    }
    return ans;
  }

}
