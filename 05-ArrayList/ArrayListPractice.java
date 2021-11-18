import java.util.ArrayList;
public class ArrayListPractice {
  public static void main(String[] args) {
    ArrayList<String>ans = new ArrayList<String>();
    for (int i = 0; i < 25; i ++) {
      if (Math.random() < 0.1) {
        ans.add("");
      } else {
        ans.add("" + i);
      }
    }
    ArrayList<String>ans2 = new ArrayList<String>();
    for (int i = 0; i < 25; i ++) {
      if (Math.random() < 0.1) {
        ans2.add("");
      } else {
        ans2.add("" + i);
      }
    }
    System.out.println(ans);
    System.out.println(ans2);
    System.out.println(replaceEmpty(ans));
    System.out.println(replaceEmpty(ans2));
    System.out.println(makeReversedList(ans));
    System.out.println(makeReversedList(ans2));
    System.out.println(mixLists(ans,ans2));
  }

  //return an new ArrayList that has all of the values of the original ArrayList except
  //that all empty strings are replaced with the word "Empty".
  public static ArrayList<String> replaceEmpty( ArrayList<String> data){
    ArrayList<String>result = new ArrayList<String>();
    for (int i = 0; i < data.size(); i++) {
      if (data.get(i).equals("")) {
        result.add("Empty");
      } else {
        result.add(data.get(i));
      }
    }
    return result;
  }

  //return a new ArrayList that is in the reversed order of the parameter.
  public static ArrayList<String> makeReversedList( ArrayList<String> data){
    ArrayList<String>result = new ArrayList<String>();
    for (int i = data.size()-1;i >= 0 ;i-- ) {
      result.add(data.get(i));
    }
    return result;
  }

  //return a new ArrayList that has all values of a and b in alternating order that is:
  //a[0], b[0], a[1], b[1]...
  //when one list is longer than the other, just append the remaining values to the end.
  public static ArrayList<String> mixLists( ArrayList<String> a,  ArrayList<String> b){
    ArrayList<String>result = new ArrayList<String>();
    int limit = 0;
    if (a.size() > b.size()) {
      limit = a.size();
    } else if (b.size()>a.size()) {
      limit = b.size();
    } else {
      limit = b.size();
    }
    for (int i = 0; i < limit; i++) {
      result.add(a.get(i));
      result.add(b.get(i));
    }
    return result;
  }
}
