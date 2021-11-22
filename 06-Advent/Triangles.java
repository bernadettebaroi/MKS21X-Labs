import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Triangles{
  public static void main (String args[]) {
    int ans = 0;
    try {
      File file = new File("data");
      Scanner input = new Scanner(file);
      while (input.hasNextLine()) {
        int x = input.nextInt();
        int y = input.nextInt();
        int z = input.nextInt();
        if (isTriangles(x,y,z)) {
          ans += 1;
        }
      }
      System.out.println(ans);
      input.close();//releases the file from your program

    } catch (FileNotFoundException ex) {
      System.out.println("Error: File not Found");
    }
  }
  public static boolean isTriangles(int x, int y, int z) {
    if (x + y > z || y + z > x || z + x > y) {
      return true;
    }
    return false;
  }

}
