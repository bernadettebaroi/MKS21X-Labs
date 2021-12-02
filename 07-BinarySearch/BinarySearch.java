import java.util.Arrays;
import java.util.ArrayList;
import java.util.Random;

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
    Random rd = new Random(); // creating Random object
    int[] arr = new int[10];
    for (int i = 0; i < arr.length; i++) {
      arr[i] = rd.nextInt(); // storing random integers in an array
    }
    Arrays.sort(arr);
    System.out.println(Arrays.toString(arr));
    int a = arr[3];
    System.out.println(a);
    System.out.println(binarySearch(arr, a));
  }

  public static int binarySearch(int[]data, int target){
    int start = 0;
    int end = data.length - 1;
    while (start <= end) {
      int mid = (start + end) / 2;
      if (data[mid] == target) {
        return mid;
      } else if (data[mid] < target){
        start = mid + 1;
      } else if (data[mid] > target) {
        end = mid - 1;
      }
    }
    return -1;
  }
}
