public class Kitty {

  //Three fields (instance variables):
  private int age;
  private String name;

  //One constructor:
  public Kitty() {
      age = 2;
      name = "Mittens";
  }
  public Kitty(int ageStated, String nameStated) {
      age = ageStated;
      name = nameStated;
  }


  // three accessor methods
  public String getName() {
      return name;
  }
  public int getAge() {
      return age;
  }

  // four mutator methods
  public void setGear(String addName) {
      name = addName;
  }

  public void makeOlder() {
      age = 1 + age;
  }

}
