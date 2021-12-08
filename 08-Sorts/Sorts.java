import java.util.Arrays;

public class Sorts{
  public static void main(String[] args) {
    /*
    int[] test = {5, 1, 0, -5, 12, 16};
    insertionSort(test);
    System.out.println(Arrays.toString(test));

    int[] test1 = {0,0,0,0,0,0};
    insertionSort(test1);
    System.out.println(Arrays.toString(test1));

    int[] test2 = {-1,3,2,1,0,-2};
    insertionSort(test2);
    System.out.println(Arrays.toString(test2));

    int[] test3 = {-4, 2, 0, -5, 222, -16};
    insertionSort(test3);
    System.out.println(Arrays.toString(test3));

    int[] test4 = {-2,-1,0,1,2,3};
    insertionSort(test4);
    System.out.println(Arrays.toString(test4));

    int[] test5 = {3,2,1,0,-1,-2};
    insertionSort(test5);
    System.out.println(Arrays.toString(test5));

    int[] randoTester = new int[40000];
    int[] randoTester2 = new int[40000];
    for (int i = 0; i < 1000;i++){
      int a = (int)(Math.random()*100 +1);
      randoTester[i] = a;
      randoTester2[i] = a;
    }
    Arrays.sort(randoTester);
    bubbleSort(randoTester2);
    if (Arrays.equals(randoTester, randoTester2)) {
      System.out.println("bubbleSort works");
    }

    int[] randoTester3 = new int[40000];
    int[] randoTester4 = new int[40000];
    for (int i = 0; i < 1000;i++){
      int a = (int)(Math.random()*100 +1);
      randoTester3[i] = a;
      randoTester4[i] = a;
    }
    Arrays.sort(randoTester3);
    selectionSort(randoTester4);
    if (Arrays.equals(randoTester3, randoTester4)) {
      System.out.println("selectionSort works");
    }

    int[] randoTester5 = new int[40000];
    int[] randoTester6 = new int[40000];
    for (int i = 0; i < 1000;i++){
      int a = (int)(Math.random()*100 +1);
      randoTester5[i] = a;
      randoTester6[i] = a;
    }
    Arrays.sort(randoTester5);
    insertionSort(randoTester6);
    if (Arrays.equals(randoTester5, randoTester6)) {
      System.out.println("insertionSort works");
    }
*/
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

  public static void selectionSort(int [] ary) {
    for (int i = 0; i < ary.length -1;i++) {
      int a = i;
      for (int j = i + 1; j < ary.length;j++) {
        if (ary[j] < ary[a]) {
          a = j;
        }
      }
      int swap = ary[a];
      ary[a] = ary[i];
      ary[i] = swap;
    }
  }

  public static void insertionSort(int[]data){
    for (int i = 1; i < data.length; i++) {
      int target = data[i];
      int b = i - 1;
      while (b >= 0 && data[b] > target) {
        data[b+1] = data[b];
        b -= 1;
      }
      data[b+1] = target;
    }
  }

}
