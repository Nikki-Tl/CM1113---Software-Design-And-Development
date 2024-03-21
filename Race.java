/*
 * @author Nikola Tluczek (N)
 * 
 */

/*
  *  NOTES/LOGS:
  *
  */


public class Race extends Stats {

    // N - raceName variable inistialised
    private String raceName;





    // N - constructor with superclass of Stats added in
    public Race(String raceName, int health,  int strength, int dexterity, int intelligence, int wisdom, int charisma) {
        super(health, strength, dexterity, intelligence, wisdom, charisma);

        this.raceName = raceName;

    }


    // N - getter and setter for race name
    public String getRaceName() {

        return raceName;
    }
    public void setRaceName(String raceName) {

        this.raceName = raceName;

    }


    // N - method to display race name along with stats
    public void displayStats() {

        System.out.println();
        super.displayStats();

    }
}
