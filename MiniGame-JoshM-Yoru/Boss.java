class Boss extends Character{
  
  public Boss(int health){
    this.health = health;
  }

    @Override
  public void mainAttack(Character character){
    System.out.println("The bandit leader slashes with his sword and does 30 damage!");
    character.health -= 30;
  }
}