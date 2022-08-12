class Mage extends Character {
  
  public Mage(String name, int health, int specialUses, int healthPotions) {
    this.name = name;
    this.health = health;
    this.specialUses = specialUses;
    this.healthPotions = healthPotions;
  }

  @Override
  public void mainAttack(Character character){
    System.out.println(super.name + " casts fireball and does 30 damage!");
    character.health -= 30;
  }
  
  @Override
  public void specialAttack(Character character){
    System.out.println(super.name + " casts meteor strike and does 80 damage!");
    character.health -= 80;
    super.specialUses -= 1;
    System.out.println("You now have " + super.specialUses + " Special Attacks left.");
  }
  
  @Override
  public void explosion() {
    System.out.println("\nMegumin draws power into her staff as reality distorts around it and her. She takes aim and readies herself to cast the only spell she will ever need to know.\n");
    System.out.println("EXXPLOOOOSIOOONNN!!!!!!!!!!\n");
    System.out.println("A massive explosion rocks the bandit encampment completely killing everyone and destroying everything there. She smiles and sighs with satisfaction of another magnificent explosion as she collapses to the ground drained of all of her power.\n");
    System.out.println("Out of no where she hears foot steps approach from where she originally came. Megumin managed to turn her head to look as she still lies face down. She smiles once more as she recognizes that it was Kazuma coming for her.");
    System.out.println("\"I TOLD YOU NOT TO DO THAT AGAIN!\" Kazuma yells. \"We were supposed to take them on together and leave the site as it is for the Adventure's Guild to come by and collect the extra stuff. Well too late now, let's go back and go for a drink.\"\n");
    System.out.println("The pair go back to town to meet with the others and have a drink as the sun sets. \"Another great day, another great explosion.\" Megumin thinks to herself and smiling.\n");
  }
}