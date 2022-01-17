public class Warrior extends Adventurer {
    private int rage;
    private String warcry;
    private int rageMax;

    public Warrior(){
	     this("Magnus");
        rageMax= 30;
    }

    public Warrior(String name){
	     this(name,"Valhalllaaaaa!!", 18);
       rageMax= 30;
    }

    public Warrior(String name, String warcry, int rage){
      super(name,40+(int)(Math.random()*10));
      setWarcry(warcry);
      setRage(rage);
      rageMax= rage;
    }

    //warrior methods

    public String attack(Damageable other){
    	  int damage = (int)(Math.random()*10)+1;
  	    other.applyDamage(damage);
  	    setRage(getSpecial() + 1);
  	    return (this +
            " attacked " + other + " for " +
            damage + " damage!");
    }

    public String specialAttack(Damageable other){
      String ans = "";
	     if(getSpecial() >= 10){
  	        int damage = (int)(Math.random()*20)+1;
            other.applyDamage(damage);
            ans = (this + " unleashes his fury upon "
             + other + " for " + damage + " damage! "+warcry);
            setRage(getSpecial() - 10);
	    }else{
			    ans = ("Not enough rage! ");
          attack(other);
	    }
      return ans;
    }


    //get methods
    public String getSpecialName() {
      return ("Rage");
    }
    public int getSpecial() {
      return rage;
    }
    public int getSpecialMax() {
      return rageMax;
    }
    //set methods
    public void setRage(int r){
	     this.rage = r;
    }

    public void setWarcry(String warcry){
	     this.warcry = warcry;
    }


}
