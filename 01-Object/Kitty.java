public class Kitty {

  //Two fields (instance variables):
  private int age;
  private String name;

  //Two constructor:
  public Kitty(String nameStated, int ageStated) {
      name = nameStated;
      age = ageStated;
  }
  public Kitty() {
      age = 2;
      name = "Mittens";
  }

  // Three accessor methods
  public String getName() {
      return name;
  }
  public int getAge() {
      return age;
  }
  public String toString() {
      return "The amazing " + name;
  }

  // Two mutator methods
  public void changeName(String addName) {
      name = addName;
  }

  public void makeOlder() {
      age = 1 + age;
  }

}
