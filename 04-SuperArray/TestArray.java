public class TestArray{
  public static void main(String args[]){
  SuperArray alist = new SuperArray();
  alist.add("Mario");
  //displaying elements
  System.out.println(alist);
  System.out.println(alist.toStringDebug());

  alist.add("Samus");
  //displaying elements
  System.out.println(alist);
  System.out.println(alist.toStringDebug());

  alist.add("Ash");
  alist.add("Link");
  alist.add("Kirby");
  alist.add("Kirby");
  //displaying elements
  System.out.println(alist);
  System.out.println(alist.toStringDebug());
  System.out.println(alist.lastIndexOf("Kirby"));
  System.out.println(alist.indexOf("Link"));
  System.out.println(alist.indexOf("Mario"));
  //a loop that prints the individual elements of the SuperArray using get.
  for (int i = 0; i < alist.size(); i++) {
    System.out.println(alist.get(i));
  }
  System.out.println(alist.toStringDebug());
  // a loop that sets each value equal to the next value, and replaces the last value with "NOPE!".
  for (int i = 0; i < alist.size();i++){
    if (i != alist.size()-1) {
      String s = alist.get(i+1);
      alist.set(i, s);
    }
    if (i == alist.size()-1) {
      alist.set(i, "NOPE");
    }
  }
  System.out.println(alist.toStringDebug());
  // a loop that changes all of the elements to different values.
  String s = "a";
  for (int i = 0; i < alist.size();i++) {
    s += "b";
    alist.set(i, s);
  }
  System.out.println(alist);
  System.out.println(alist.toStringDebug());
  System.out.println(alist.indexOf("ab"));
  }
}
