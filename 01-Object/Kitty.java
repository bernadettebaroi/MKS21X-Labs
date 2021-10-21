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
// What changes when you run this? What does this suggest about toString?
// Before the changes, printing a kitty printed out a address. After adding 
// toString accessor, it  prints out the "The amazing " +  its name. This suggests
// that toString acts as a print statement for any kitty being printed. 
