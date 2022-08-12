import java.util.Scanner;

class Game {
  boolean game;
  Scanner input = new Scanner(System.in);
  
  public void gameLoop(Player character) {
    while(game){

        System.out.println("How will you react to the bandit:\n" 
                      + "1) Main Attack\n"
                      + "2) Special Attack\n"
                      + "3) Take Health Potion\n"
                      + "4) Quit");

        int option = input.nextInt();
          switch(option){
            case 1: character.mainAttack();
              break;
            case 2: character.specialAttack();
              break;
            case 3: character.takePotion();
              break;
            case 4: System.out.println("Quit");
              game = false;
              break;
          }
    }
  }
}