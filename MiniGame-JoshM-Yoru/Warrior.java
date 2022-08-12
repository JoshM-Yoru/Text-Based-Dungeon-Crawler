class Warrior extends Character {
  
  public Warrior(String name, int health, int specialUses, int healthPotions) {
    this.name = name;
    this.health = health;
    this.specialUses = specialUses;
    this.healthPotions = healthPotions;
  }

  @Override
  public void mainAttack(Character character){
    System.out.println(super.name + " slashes with the sword and does 20 damage!");
    character.health -= 20;
  }

  @Override
  public void specialAttack(Character character){
    System.out.println(super.name + " draws power into the sword and unleashes it for 45 damage!");
    character.health -= 45;
    super.specialUses -= 1;
    System.out.println("You now have " + super.specialUses + " Special Attacks left.");
  }
}
