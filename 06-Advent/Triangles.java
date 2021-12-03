import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;

public class Triangles{
  public static void main (String[] args) {
    String filename = args[0];
    int num = Integer.parseInt(args[1]);
    try {
      if (num == 1) {
        int ans = 0;
        File file = new File(filename);
        Scanner input = new Scanner(file);
        while (input.hasNextInt()) {
          int x = input.nextInt();
          int y = input.nextInt();
          int z = input.nextInt();
          if (isTriangles(x,y,z)) {
            ans += 1;
          }
        }
        System.out.println(ans);
        input.close();

      } else if (num == 2) {
        int ans1 = 0;
        File file1 = new File(filename);
        Scanner input1 = new Scanner(file1);
        ArrayList<Integer>list = new ArrayList<Integer>();
        while (input1.hasNextInt()) {
          list.add(input1.nextInt());
          list.add(input1.nextInt());
          list.add(input1.nextInt());
        }
        for (int i = 0; i < list.size()-6; i++) {
          int a = list.get(i);
          int b = list.get(i+3);
          int c = list.get(i+6);
          if (isTriangles(a,b,c)) {
            ans1 += 1;
          }
        }
        System.out.println(ans1);
        input1.close();//releases the file from your program
      }

    } catch (FileNotFoundException e) {
      System.out.println("Error: File not Found");
    }
  }

  public static boolean isTriangles(int x, int y, int z) {
    if (x != 0 || y != 0 || z != 0) {
      if (x + y > z && y + z > x && z + x > y) {
        return true;
      }
    }
    return false;
  }

}
