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
    super(name,30+(int)(Math.random()*10));
    setWarcry(warcry);
    setMana(mana);
    manaMax = mana;
  }

  //wizard methods

  public String attack(Damageable other){
      int damage = (int)(Math.random()*10)+1;
      other.applyDamage(damage);
      setRage(getRage() + 1);
      return(this +
          " attacked " + other + " for " +
          damage + " damage!");
  }

  public String specialAttack(Damageable other){
     if(getRage() >= 10){
          int damage = (int)(Math.random()*20)+1;
          other.applyDamage(damage);
          return(this + " unleashes his fury upon "
           + other + " for " + damage + " damage! "+warcry);
          setRage(getRage() - 10);
    }else{
        return ("Not enough rage! ");
        attack(other);
    }
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
