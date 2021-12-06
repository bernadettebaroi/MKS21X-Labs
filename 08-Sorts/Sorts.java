import java.util.Arrays;

public class Sorts{
  public static void main(String[] args) {
    /*
    int[] test = {5, 1, 0, -5, 12, 16};
    bubbleSort(test);
    System.out.println(Arrays.toString(test));
    int[] test1 = {0,0,0,0,0,0};
    bubbleSort(test1);
    System.out.println(Arrays.toString(test1));
    int[] test2 = {-1,3,2,1,0,-2};
    bubbleSort(test2);
    System.out.println(Arrays.toString(test2));
    int[] randoTester = new int[100];
    int[] randoTester2 = new int[100];
    for (int i = 0; i < 100;i++){
      int a = (int)(Math.random()*50 +1);
      randoTester[i] = a;
      randoTester2[i] = a;
    }
    Arrays.sort(randoTester2);
    bubbleSort(randoTester);
    */
    int[] test = {5, 1, 0, -5, 12, 16};
    selectionSort(test);
    System.out.println(Arrays.toString(test));
  }


  public static void bubbleSort(int[] data){
    int length = data.length;
    for (int i = 0; i < length; i++) {
      for (int j = i + 1; j < length; j++) {
        if (data[i]>=data[j]) {
          int a = data[i];
          data[i] = data[j];
          data[j] = a;
        }
      }
    }
  }

  public static boolean equality(int[] data, int[] data1) {
    if (data.length != data1.length) {
      return false;
    }
    boolean ans = false;
    for (int i = 0;i < data.length;i++) {
      if (data[i] == data1[i]) {
        ans = true;
      } else {
        ans = false;
        break;
      }
    }
    return ans;
  }

  public static void selectionSort(int [] ary) {
      
  }

  public static int getMin (int[] ary) {
    int minValue = ary[0];
    for(int i=1;i<ary.length;i++){
      if(ary[i] < minValue){
        minValue = ary[i];
      }
    }
    return minValue;
  }

}
