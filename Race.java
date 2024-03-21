/*
 * @author Nikola Tluczek (N)
 * 
 */

/*
  *  NOTES/LOGS:
  *
  */

public class Race extends Player {

    // N - raceName variable inistialised
    private String raceName;


    // N - constructor with superclass of Player stats added in
    public Race(String raceName, int strength, int dexterity, int constitution, int intelligence, int wisdom, int charisma) {
        super(strength, dexterity, constitution, intelligence, wisdom, charisma);

        this.raceName = raceName;

    }


    // N - getter and setter for race name
    public String getRaceName() {

        return raceName;
    }
    public void setRaceName(String raceName) {

        this.raceName = raceName;

    }


    // N - method to display race name along with player stats
    public void displayStats() {

        System.out.println("Race: " + raceName);

        super.displayStats();

    }
}
