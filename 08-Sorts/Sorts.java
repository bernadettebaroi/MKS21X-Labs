import java.util.Arrays;
public class Sorts{
  public static void main(String[] args) {
    int[] test = {5, 1, 0, -5, 12, 16};
    bubbleSort(test);
    System.out.println(Arrays.toString(test));
  }
  /**Bubble sort of an int array.
  *Upon completion, the elements of the array will be in increasing order.
  *@param data  the elements to be sorted.
  */
  public static void bubbleSort(int[] data){
    int length = data.length;
    for (int j = 0; j < length -1;j++) {
      for (int i = 0; i < j; i++) {
        if (data[i] > data[i+1]) {
          int a = data[i];
          int b = data[i+1];
          data[i] = b;
          data[i+1] = a;
        }
      }
      length -= 1;
    }
  }
}
