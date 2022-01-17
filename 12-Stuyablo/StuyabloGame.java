import java.util.*;
public class StuyabloGame{
  private static final int WIDTH = 80;
  private static final int HEIGHT = 30;
  private static final int BORDER_COLOR = Text.BLACK;
  private static final int BORDER_BACKGROUND = Text.WHITE + Text.BACKGROUND;

  public static void main(String[] args) {
    run();
  }

  //Display a List of 1-4 adventurers on the rows row through row+3 (4 rows max)
  //Should include Name and HP on 2 separate lines. (more to be added later)
  public static void drawParty(ArrayList<Adventurer> party,int startRow){
    int l = 2;
    for (int i = 0; i < party.size(); i ++) {
      Text.go(startRow,l);
      System.out.print(Text.colorize("" + party.get(i),Text.MAGENTA));

      Text.go(startRow+1,l);
      String word = "" + party.get(i).getSpecialName() + ": " + party.get(i).getSpecial() + "/" + party.get(i).getSpecialMax();
      if (party.get(i).getSpecial() / party.get(i).getSpecialMax() * 100 < 25) {
        System.out.print(Text.colorize(word,Text.RED));
      } else if (party.get(i).getSpecial() / party.get(i).getSpecialMax() * 100 > 75) {
        System.out.print(Text.colorize(word,Text.GREEN));
      } else {
        System.out.print(Text.colorize(word,Text.YELLOW));
      }

      Text.go(startRow+2,l);
      word = "HP: " + party.get(i).getHP() + "/" + party.get(i).getmaxHP();
      if (party.get(i).getHP() / party.get(i).getmaxHP() * 100 < 25) {
        System.out.print(Text.colorize(word,Text.RED));
      } else if (party.get(i).getHP() / party.get(i).getmaxHP() * 100 > 75) {
        System.out.print(Text.colorize(word,Text.GREEN));
      } else {
        System.out.print(Text.colorize(word,Text.YELLOW));
      }
      l += 25;
    }
  }


  //Display a line of text starting at column 2 of the specified row.
  public static void drawText(String s,int startRow){
    for (int i = startRow; i < 31; i++) {
      Text.go(startRow, 2);
      System.out.println(Text.colorize("" + s,Text.WHITE));
    }
  }

  public static void drawScreen(){
    Text.clear();
    for (int j = 1; j < 81; j++) {
      Text.go(1,j);
      System.out.print(Text.colorize("*",BORDER_COLOR, BORDER_BACKGROUND));
    }
    for (int j = 1; j < 31; j++) {
      Text.go(j,1);
      System.out.print(Text.colorize("*",BORDER_COLOR, BORDER_BACKGROUND));
      Text.go(j,80);
      System.out.print(Text.colorize("*",BORDER_COLOR, BORDER_BACKGROUND));
    }
    for (int j = 1; j < 81; j++) {
      Text.go(30,j);
      System.out.print(Text.colorize("*",BORDER_COLOR, BORDER_BACKGROUND));
    }
  }


  public static void run(){
    //Clear and initialize
    Text.hideCursor();
    Text.clear();
    Text.go(1,1);


    //Things to attack:
    //Make an ArrayList of Adventurers and add 1 enemy to it.
    ArrayList<Adventurer>enemies = new ArrayList<>();
    Adventurer a = new Wizard("Voldamor","Magiccc",19);
    enemies.add(a);

    //Adventurers you control:
    //Make an ArrayList of Adventurers and add 3 Adventurers to it.
    ArrayList<Adventurer> party = new ArrayList<>();
    Adventurer b = new Warrior("Conan","AAARRHHH!",5);
    Adventurer c = new Wizard("Harry","AbraCaDabra!",12);
    Adventurer d = new Warrior("Homer","Swordsss!",9);
    party.add(b);
    party.add(c);
    party.add(d);

    //Main loop
    boolean partyTurn = false;
    int whichPlayer = 0;
    int turn = 0;


    String input = "";
    Scanner in = new Scanner(System.in);
    while(! (input.equalsIgnoreCase("q") || input.equalsIgnoreCase("quit"))){
      //Draw the window border
      Text.hideCursor();
      drawScreen();

      //display event based on last turn's input
      if(partyTurn){
        //Process user input:
        if(input.equals("attack") || input.equals("")){
          int change = enemies.get(0).getHP();
          party.get(whichPlayer).attack(enemies.get(0));
          change = change - enemies.get(0).getHP();
          drawText(""+ party.get(whichPlayer) + " attacked " + enemies.get(0) + " for " + change + " damage.",HEIGHT/2 -1);
        }
        else if(input.equals("special")){
          int change = enemies.get(0).getHP();
          party.get(whichPlayer).specialAttack(enemies.get(0));
          change = change - enemies.get(0).getHP();
          drawText(""+ party.get(whichPlayer) + " attacked " + enemies.get(0) + " for " + change + " damage.",HEIGHT/2 -1);
        }
        whichPlayer++;



        if(whichPlayer < party.size()){
          drawText("Enter command for "+party.get(whichPlayer)+
                   ": attack/special/quit",HEIGHT/2);
        }else{
          drawText("press enter to see monster's turn",HEIGHT/2);
          partyTurn = false;
        }
      }else{
        //this block ignores user input!
        //display enemy attack except on turn 0.
        if(turn > 0){
          int x = (int)(Math.random()*3);
          int change = party.get(x).getHP();
          enemies.get(0).attack(party.get(x));
          change = change - party.get(x).getHP();
          drawText(""+ enemies.get(0)+ " attacked " + party.get(x) + " for " + change + " damage.",HEIGHT/2 -1);

          //Enemy action choices go here!
        }

        //after enemy goes, change back to player's turn.
        partyTurn=true;
        whichPlayer = 0;
        //display which player's turn is next and prompt for action.
        drawText("Enter command for "+party.get(whichPlayer)+": attack/special/quit",HEIGHT/2);

        //end the turn.
        turn++;

      }

      //display current state of all Adventurers
      drawParty(party,2);
      drawParty(enemies,HEIGHT-5);

      //Draw the prompt
      Text.reset();
      Text.go(HEIGHT+1,1);
      Text.showCursor();
      System.out.print(">");
      //Read user input
      input = in.nextLine();
    }

    //After quit reset things:
    Text.reset();
    Text.showCursor();
    Text.go(32,1);
  }




}
