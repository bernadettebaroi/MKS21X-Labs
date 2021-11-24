import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;

public class Wrapping {
  public static void main (String[] args) {
    String filename = args[0];
    int num = Integer.parseInt(args[1]);
    try {
      if (num == 1) {
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
        in.close();
      } else if (num == 2) {
        File file1 = new File(filename);
        Scanner input = new Scanner(file1);
        int ans1 = 0;
        while (input.hasNextLine()) {
          String line = input.nextLine();
          String[] nums = line.split("x");
          int a = Integer.parseInt(nums[0]);
          int b = Integer.parseInt(nums[1]);
          int c = Integer.parseInt(nums[2]);
          ans1 += feetRibbon(a,b,c);
        }
        System.out.println(ans1);
        input.close();
      }
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
    int[] lop = new int[]{side1, side2, side3};
    int Min = lop[0];
    for (int i =1; i < 3; i++) {
      if (Min >= lop[i]) {
        Min = lop[i];
      }
    }
    ans += Min;
    return ans;
  }

  public static int feetRibbon(int l, int w, int h) {
    int side1 = l*w;
    int side2 = w*h;
    int side3 = h*l;
    int ans = (l*w*h);
    ans += 2*l + 2*w;
    return ans;
  }

}
