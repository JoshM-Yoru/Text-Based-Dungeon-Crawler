class Villager extends Character {
  
  public Villager(String name, int health, int specialUses, int healthPotions) {
    this.name = name;
    this.health = health;
    this.specialUses = specialUses;
    this.healthPotions = healthPotions;
  }

    @Override
  public void mainAttack(Character character) {
    System.out.println(super.name + " punches the bandit!");
    character.health -= 5;
  }
    @Override
  public void specialAttack(Character character) {
    System.out.println(super.name + " punches the bandit slightly harder!");
    character.health -= 7;
    super.specialUses -= 1;
  }
}
