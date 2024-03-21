/*
 * @author Nikola Tluczek (N)
 * 
 */

/*
  *  NOTES/LOGS:
  *
  *  // N - Add weapons, armour and extras onto this class
  *  // N - use this class to create other entities for combat purposes
  *
  */

public class CharacterCreator extends Stats {

    // N - initialising variables
    private String name;
    private String raceName;
    private String professionName;


    // N - constructor with the superclass Stats
    public CharacterCreator(String name, String raceName, String professionName, int health, int strength, int dexterity, int intelligence, int wisdom, int charisma) {
        super(health, strength, dexterity, intelligence, wisdom, charisma);
        
        this.name = name;
        this.raceName = raceName;
        this.professionName = professionName;
    }

    // N - getter and setters 
    public String getName() {

        return name;
    }
    public void setName(String name) {

        this.name = name;

    }

    public String getRaceName() {

        return raceName;
    }
    public void setRaceName(String raceName) {

        this.raceName = raceName;

    }

    public String getProfessionName() {

        return professionName;
    }
    public void setProfessionName(String professionName) {

        this.professionName = professionName;

    }

    // N - method to display name, race and profession alongside stats
    public void displayStats() {
        System.out.println("Name: " + getName());
        System.out.println("Race: " + getRaceName());
        System.out.println("Profession: " + getProfessionName());
        super.displayStats();
    
    }


    
}
