class Character implements Actions{
  public String name;
  public int health;
  public int specialUses;
  public int healthPotions;


  public void Character(String name, int health, int specialUses, int healthPotions) {
    this.name = name;
    this.health = health;
    this.specialUses = specialUses;
    this.healthPotions = healthPotions;
  }

    @Override
  public void mainAttack(Character character) {

  }
    @Override
  public void specialAttack(Character character) {

  }
    @Override
  public void takePotion() {
    if (this.healthPotions > 0){
    this.health += 40;
    this.healthPotions -= 1;
    System.out.println("You take a health potion and heal for 20hp. You now have " + this.health + " total health and " + this.healthPotions + " potions left.");
    }else {
      System.out.println("You reach for a health potion but realize you don't have any!");
  }
  } 

  public void explosion() {
  }

}
