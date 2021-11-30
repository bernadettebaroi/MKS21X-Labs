import java.util.Arrays;
import java.util.ArrayList;

public class BinarySearch {
  public static void main(String[] args) {
    int result;
    result = binarySearch(new int[]{0,0,0,0,0,0,0},0);
    System.out.println(result);//should be 3
    result = binarySearch(new int[]{0,0,0,0,0,0,0},1);
    System.out.println(result);//should be -1

    result = binarySearch(new int[]{0,1,2,3,4,5,6},0);
    System.out.println(result);//should be 0
    //...
    result = binarySearch(new int[]{0,1,2,3,4,5,6},6);
    System.out.println(result);//should be 6
    //Tip: You can use a loop to find if it works on 0,1,2,3,4,5,and 6 in this array!
  }

  public static int binarySearch(int[]data, int target){
    int mid = data.length / 2;
    int start = 0;
    int end = data.length;
    while (mid > start && mid < end) {
      if (data[mid] == target) {
        return mid;
      } else if (data[mid] > target) {
        end = mid;
        mid = mid / 2;
      } else if (data[mid] < target){
        start = mid;
        mid = (end - start) / 2;
      }
    }
    return -1;
  }
}
