public class GameTest{
  public static void main(String[] args) {
    Adventurer a = new Warrior("Conan","Aaaaaaaar!",20);
    Adventurer b = new Warrior("Homer","Donuts?",0);
    System.out.println(a+" ("+a.getHP()+"HP)");
    System.out.println(b+" ("+b.getHP()+"HP)");
    a.attack(b);
    b.attack(a);
    System.out.println(a+" ("+a.getHP()+"HP)");
    System.out.println(b+" ("+b.getHP()+"HP)");
    a.specialAttack(b);
    b.specialAttack(a);
    System.out.println(a+" ("+a.getHP()+"HP)");
    System.out.println(b+" ("+b.getHP()+"HP)");

    System.out.println("\n");

    Adventurer c = new Wizard("Conan","Magiccc",20);
    Adventurer d = new Warrior("Homer","Swordsss",11);
    System.out.println(c+" ("+c.getHP()+"HP)");
    System.out.println(b+" ("+b.getHP()+"HP)");
    c.attack(d);
    d.attack(c);
    System.out.println(c+" ("+c.getHP()+"HP)");
    System.out.println(d+" ("+d.getHP()+"HP)");
    c.specialAttack(d);
    d.specialAttack(c);
    System.out.println(c+" ("+c.getHP()+"HP)");
    System.out.println(d+" ("+d.getHP()+"HP)");
    }

}
