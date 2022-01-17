import java.util.Random;
public abstract class Adventurer implements Damageable{
    private String name;
    private int HP;
    private int maxHP;

    //Abstract methods are meant to be implemented in child classes.
    //return a String that contains the description of the results of the attack
    public abstract String attack(Damageable other);
    //return a String that contains the description of the results of the specialAttack
    public abstract String specialAttack(Damageable other);
    public abstract String getSpecialName();
    public abstract int getSpecial();
    public abstract int getSpecialMax();

    public Adventurer(){
  	   this("Lester");
       maxHP = 10;
    }

    public Adventurer(String name){
  	   this(name, 10);
       maxHP = 10;
    }

    public Adventurer(String name, int hp){
       this.name = name;
       this.HP = hp;
       maxHP = hp;
    }

    //toString method
    public String toString(){
    	return this.getName();
    }

    //Get Methods
    public String getName(){
    	return name;
    }

    public int getHP(){
	     return HP;
    }

    public void applyDamage(int amount){
      this.HP -= amount;
    }

    //Set Methods
    public void setHP(int health){
	     this.HP = health;
    }

    public void setName(String s){
	     this.name = s;
    }

    public int getmaxHP(){
      return maxHP;
    }

    public void setmaxHP(int newMax){
      maxHP = newMax;
    }

}
