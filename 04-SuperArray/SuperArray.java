public class SuperArray{
  private String[] data;
  private int size;

/*
The no-arg constructor makes an empty SuperArray.
Empty means elements, the array should start with a length of 10.
This means 10 is the maximum capacity.
*/
  public SuperArray() {
    data = new String[10] ;
  }

//get the size of the SuperArray. (NOT capacity)
  public int size() {
    return size;
  }

/*
add the new element s to the end of the SuperArray.
This method returns True.
*/
  public boolean add(String s) {
    data[size] = s;
    size += 1;
    return true;
  }

//return a String in the format: "[hi, ok, pf]"
  public String toString() {
    String result = "[";
    for (int i = 0; i < size; i++) {
      result += data[i];
      if (i != size-1) {
        result += ", ";
      }
    }
    return result + "]";
  }

/*
include the null values too! This can help you test your other methods!
e.g. "[hi, ok, pf, null, null, null, null, null]"
*/
  public String toStringDebug() {
    String result = "[";
    for (int i = 0; i < data.length; i++) {
      result += data[i];
      if (i != data.length-1) {
        result += ", ";
      }
    }
    return result + "]";
  }

/*
return the value at the specified index. For now, if the index is not valid,
print an error and return null. out of range for get: index is less than 0,
or index is size() or greater
*/
  public String get(int index) {
    if (index < 0 || index > size){
      System.out.println("error");
      return null;
    } else {
       return data[index];
    }
  }

/*
change the value at index i, and return the original value. For now,
if the index is not valid, print an error, return null, and do not modify the list.
out of range for set: index is less than 0, or index is size() or greater
*/
  public String set(int index, String element) {
    if (index < 0 || index > size){
      System.out.println("error");
      return null;
    } else {
      data[index] = element;
    }
    return data[index];
  }

// This constructor makes an empty SuperArray. The array should start with length of initialCapacity .
  public SuperArray(int initialCapacity) {
    SuperArray another = new SuperArray(initialCapacity);
  }

/*
This is a private method that you call when you need more space any time you want to insert.
It will increase the capacity by making a new Array that has a new size of 2*length+1,
then copy the old values, and set the data field to this new array.
This is a critical method to test thoroughly!!!
Once you test this method, your add methods must call this before you add to a list that is at capacity.
*/
  private void resize() {
    SuperArray another = new SuperArray(2*size+1);
    for (int i = 0; i < another.size(); i++){
      String a = data[i];
      another.add(a);
    }
  }

/*
return the smallest index where the value in the SuperArray matches the target string.
Return -1 when no value matches.
*/
  public int indexOf(String target) {
    for (int i = 0; i < size; i++) {
      if (data[i] == target) {
        return i;
      }
    }
    return -1;
  }

/*
return the largest index where the value in the SuperArray matches the target string.
Return -1 when no value matches.
*/
  public int lastIndexOf(String target) {
    int ans = -1;
    for (int i = 0; i < size; i++) {
      if (data[i] == target) {
        ans = i;
      }
    }
    return ans;
  }

/*
add the String to the target index. Values at that index and to the right of it must be
shifted to the  right to make room. Print an Error - if the index is out of range.
Anything index that is negative is out of range, but size() IS a valid index. Greater than size() is out of range.
*/
  public void add(int index, String value ) {
    if (index < 0 || index > size) {
      System.out.println("Error");
    } else {
      for (int i = size; i > index; i--){
          data[i] = data[i-1];
        }
      data[index] = value;
      }
  }


/*
remove the element at the specified index. Shift all elements to the right of that index to the left to fill in the gap.
Print an Error when the index is out of range (that is index < 0 or it is greater than or equal to size()) return null
when an error happens, or the value that you removed when the index was valid.
*/
  public String remove(int index) {
    if (index < 0 || index > size) {
      System.out.println("Error");
      } else {
        data[index] = data[index + 1];
        for (int i = index + 1; i < size; i++) {
          data[i] = data[i+1];
        }
      }
    return null;
    }

/*
remove the leftmost element that has the same value as the target string. Shift all elements to the right of that
index to the left to fill in the gap. Return true if the element was present and removed, false if it was not found.
*/
  public boolean remove(String target) {
    for (int i = 0; i < size; i++) {
      if (data[i] == target) {
        data[i] = data[i+1];
        for (int j = i; j < size ;j++) {
          data[j] = data[j+1];
        }
        break;
      }
    }
    return true;
  }


}
