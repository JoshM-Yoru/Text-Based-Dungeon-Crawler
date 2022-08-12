import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;

class Main {
  public static void main(String[] args) {
    //All main variables
    Scanner input = new Scanner(System.in);
    Random rand = new Random();
    int randomEnemies = rand.nextInt(4); //Generates a random number of enemies to fight as 3
    randomEnemies += 2; //Sets the fewest amount of bandits to fight at 2
    int tempEnemies = randomEnemies; //used as a temp variable to decrement and populate the arraylist
    Character selectedCharacter = new Character();
    boolean game = false;
    ArrayList<Character> enemies = new ArrayList<Character>();//arraylist of enemies

    //while loop used to generate random health values for bandits and then add to bandits to the arraylist
    while (tempEnemies > 0) {
      int randomHealth = rand.nextInt(41);
      randomHealth += 40;
      Character bandit = new Bandit(randomHealth);
      enemies.add(bandit);
      tempEnemies --;
    }
    //adds the boss to the arraylist
    Character boss = new Boss(150);
    enemies.add(boss);



    System.out.println("What is your character's name?");
    String characterName = input.nextLine(); //gets character name

    if (characterName.equals("Megumin")){ // secret
      Character megumin = new Mage(characterName, 5000, 1, 0);
      selectedCharacter = megumin;

      System.out.println("How will you react to the bandits:\n" 
                      + "1) Attack\n"
                      + "2) Quit");

        int option = input.nextInt();
          switch(option){
            case 1: selectedCharacter.explosion();
              game = false;
              break;
            case 2: System.out.println("Quit");
              game = false;
              System.out.println("You decide to head home and live to see another day.");
              break;
          }
    } else{
      //choose what class to play as
    System.out.println("Choose your fighter to take on the bandits:\n" 
                      + "1) Warrior\n"
                      + "2) Mage");

    String character = input.nextLine();

    switch(character) {
      case "1": Character warrior = new Warrior(characterName, 220, 6, 4);
       selectedCharacter = warrior;
        System.out.println("You have chosen the warrior.\nYou will have 220hp, 6 special attack uses and 4 health potions.\n");
        game = true;
        break;
      case "2": Character mage = new Mage(characterName, 140, 4, 5);
        selectedCharacter =  mage;
        System.out.println("You have chosen the mage.\nYou will have 140hp, 4 special attack uses and 5 health potions.\n");
        game = true;
        break;
      default: Character villager = new Villager(characterName, 80, 5000, 1);
        selectedCharacter = villager;
        System.out.println("You have chosen the villager.\nYou will have 20hp, 5000 special attack uses and 1 health potion.\n");
        game = true;
        break;
    }
    
    

    System.out.println("Get ready to attack the enemy bandits and take out there leader. There will be " + randomEnemies + " bandits as well as their leader. Be careful!\n");

      //game loop
    while(game){
      
      try{
        Character currentEnemy = enemies.get(0); // gets the first enemy in the array 
           
        System.out.println("How will you react to the bandit:\n" 
                      + "1) Main Attack\n"
                      + "2) Special Attack\n"
                      + "3) Take Health Potion(Heal for 40hp)\n"
                      + "* Press Any Other Key To Quit");

        //acombat mechanics
        String option = input.nextLine(); 
          switch(option){
            case "1": selectedCharacter.mainAttack(currentEnemy);
              break;
            case "2": selectedCharacter.specialAttack(currentEnemy);
              break;
            case "3": selectedCharacter.takePotion();
              break;
            default: System.out.println("Quit");
              game = false;
              System.out.println("You decide to head home and live to see another day.");
              break;
          }

      if (currentEnemy.health > 0 && game == true) { //checks if enemy still has health
        System.out.println("The bandit has " + currentEnemy.health + " health left.\n");
        currentEnemy.mainAttack(selectedCharacter);
        if (selectedCharacter.health <= 0){//checks if you still have hp and if not it ends the game
        game = false;
        System.out.println("You have received too much damage and have perished at the hands of the bandits!");
      }
      }
      else if (currentEnemy.health <= 0 && game == true) { //checks if enemy is dead and removes dead enemy
        enemies.remove(0);
        if (enemies.get(0) instanceof Boss){ //declares boss battle when boss class is the last one left
          System.out.println("Wait this is the Bandit Leader. He is a lot stronger than the others so take him out quick!");
        } else {
          System.out.println("The bandit has been killed but here comes another one!");
        }
      }

      System.out.println("You have " + selectedCharacter.health + " health left.\n");

        } catch(Exception ex){ //catches IndexOutofBounds Exception to end the game.
        System.out.println("You have done it! The bandit leader has been slain and you have cleared the bandit hideout! Time to go home and celebrate!");
        game = false;
      }
    }
    }
    input.close();
  }
}