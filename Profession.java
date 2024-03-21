/*
 * @author Nikola Tluczek (N)
 * 
 */

/*
  *  NOTES/LOGS:
  *
  */

public class Profession extends Player {

    // N - professionName variable initialised
    private String professionName;


    // N - constructor with the superclass Player Stats
    public Profession(String professionName, int health, int strength, int dexterity, int intelligence, int wisdom, int charisma) {
        super(health, strength, dexterity, intelligence, wisdom, charisma);
        
        this.professionName = professionName;

    }


    // N - getter and setter for professionName
    public String getProfessionName() {

        return professionName;
    }
    public void setProfessionName(String professionName) {

        this.professionName = professionName;

    }

    // N - method to display profession name with stats
    public void displayStats() {

        System.out.println();
        super.displayStats();

    }

}
