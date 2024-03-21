/*
 * @author Nikola Tluczek (N)
 * 
 */

/*
  *  NOTES/LOGS:
  *
  *  // N - (i think ill make a seperate final "CharacterCreator" class which will have all of the things like name, 
  *         racename, professionname, and all of the stats (add weapon and stuff to it too) and that will be the final 
  *         class we use to put everything the user said into so we can use it for combat.) (we would make monsters on this too so maybe @Finn can work on that? (HMU if need))
  *
  */


public class Player {
    
    // N - initialising stat variables
    protected int health;
    protected int strength;
    protected int dexterity;
    protected int intelligence;
    protected int wisdom;
    protected int charisma;

    
    // N - default constructor
        public Player(int health, int strength, int dexterity, int intelligence, int wisdom, int charisma) {

        this.health = health;
        this.strength = strength;
        this.dexterity = dexterity;
        this.intelligence = intelligence;
        this.wisdom = wisdom;
        this.charisma = charisma;

    }


    // N - getter and setter methods for each stat
    public int getHealth() {

        return health;
    }
    public void setHealth(int health) {

        this.health = health;

    }
    
    public int getStrength() {

        return strength;
    }
    public void setStrength(int strength) {

        this.strength = strength;

    }

    public int getDexterity() {

        return dexterity;
    }
    public void setDexterity(int dexterity) {

        this.dexterity = dexterity;

    }

    public int getIntelligence() {

        return intelligence;
    }
    public void setIntelligence(int intelligence) {

        this.intelligence = intelligence;

    }

    public int getWisdom() {

        return wisdom;
    }
    public void setWisdom(int wisdom) {

        this.wisdom = wisdom;

    }

    public int getCharisma() {

        return charisma;
    }
    public void setCharisma(int charisma) {

        this.charisma = charisma;

    }


    // N - method to display player stats (toString)
    public void displayStats() {

        System.out.println("Health: " + health);
        System.out.println("Strength: " + strength);
        System.out.println("Dexterity: " + dexterity);
        System.out.println("Intelligence: " + intelligence);
        System.out.println("Wisdom: " + wisdom);
        System.out.println("Charisma: " + charisma);

    }

}
