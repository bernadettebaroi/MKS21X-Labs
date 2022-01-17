public class Wizard extends Adventurer {
  private int mana;
  private String warcry;
  private int manaMax;

  public Wizard(){
     this("Albus");
     manaMax = 40;
  }

  public Wizard(String name){
     this(name,"abracadabra", 30);
     manaMax = 40;
  }

  public Wizard(String name, String warcry, int mana){
    super(name,100+(int)(Math.random()*10));
    setWarcry(warcry);
    setMana(mana);
    manaMax = mana;
  }

  //wizard methods

  public String attack(Damageable other){
      int damage = (int)(Math.random()*10)+1;
      other.applyDamage(damage);
      setMana(getSpecial() + 1);
      return(this +
          " attacked " + other + " for " +
          damage + " damage!");
  }

  public String specialAttack(Damageable other){
    String ans = "";
     if(getSpecial() >= 20){
          int damage = (int)(Math.random()*20)+1;
          other.applyDamage(damage);
          ans = (this + " unleashes his fury upon "
           + other + " for " + damage + " damage! "+warcry);
          setMana(getSpecial() - 10);
    }else{
        ans = "Not enough rage! ";
        attack(other);
    }
    return ans;
  }

  //get methods
  public String getSpecialName() {
    return ("Mana");
  }
  public int getSpecial() {
    return mana;
  }
  public int getSpecialMax() {
    return manaMax;
  }
  //set methods
  public void setMana(int r){
     this.mana = r;
  }

  public void setWarcry(String warcry){
     this.warcry = warcry;
  }
}
