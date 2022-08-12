class Bandit extends Character {

  public Bandit(int health){
    this.health = health;
  }

  
    @Override
  public void mainAttack(Character character){
    System.out.println("The bandit attacks with his sword and does 20 damage!");
    character.health -= 20;
  }
}
