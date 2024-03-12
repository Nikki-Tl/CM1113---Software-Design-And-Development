
/*
*   ----------------------------------------------------------------
*   @author: Nikola Tluczek
*   @author:
*   @author:
*   @author:
*
*   ----------------------------------------------------------------
*/

public class Player {
    
    /* Initialising Variables */
    /* NT: Possible change for age variable as range is set in Race? */
    private String name;
    private Race race;
    private Type type;

    private int totalStatHp;
    private int totalStatStr;
    private int totalStatDex;
    private int totalStatInt;
    private int totalStatWis;
    private int totalStatCha;


    /* Constructor */
    public Player(String name, Race race, Type type, int totalStatHp, int totalStatStr, int totalStatDex, int totalStatInt, int totalStatWis, int totalStatCha) {
        this.name = name;
        this.race = race;
        this.type = type;

        this.totalStatHp = totalStatHp;
        this.totalStatStr = totalStatStr;
        this.totalStatDex = totalStatDex;
        this.totalStatInt = totalStatInt;
        this.totalStatWis = totalStatWis;
        this.totalStatCha = totalStatCha;
    }


    /* Getters and Setters per Variable */
    /* name */
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    /* N: cannot have getters and setters for race abd type? */
    /* race */
    public Race getRace() {
        return race;
    }
    public void setRace(Race race) {
        this.race = race;
    }

    /* type */
    public Type getType() {
        return type;
    }
    public void setType(Type type) {
        this.type = type;
    }

    /* hp */
    public int getTotalStatHp() {
        return totalStatHp;
    }
    public void setTotalStatHp(int totalStatHp) {
        this.totalStatHp = totalStatHp;
    }

    /* str */
    public int getTotalStatStr() {
        return totalStatStr;
    }
    public void setTotalStatStr(int totalStatStr) {
        this.totalStatStr = totalStatStr;
    }

    /* dex */
    public int getTotalStatDex() {
        return totalStatDex;
    }
    public void setTotalStatDex(int totalStatDex) {
        this.totalStatDex = totalStatDex;
    }

    /* intel */
    public int getTotalStatInt() {
        return totalStatInt;
    }
    public void setTotalStatInt(int totalStatInt) {
        this.totalStatInt = totalStatInt;
    }

    /* wis */
    public int getTotalStatWis() {
        return totalStatWis;
    }
    public void setTotalStatWis(int totalStatWis) {
        this.totalStatWis = totalStatWis;
    }

    /* cha */
    public int getTotalStatCha() {
        return totalStatCha;
    }
    public void setTotalStatCha(int totalStatCha) {
        this.totalStatCha = totalStatCha;
    }


    public String toString() {
        
        String displayPlayer = "Name: " + name + "\n" + "Race: " + race.getRaceName() + "\n" + "Type: " + type.getTypeName() + "\n" + "Hp: " + totalStatHp + "\n" + "Str: " + totalStatStr + "\n" + "Dex: " + totalStatDex + "\n" + "Int: " + totalStatInt + "\n" + "Wis: " + totalStatWis + "\n" + "Cha: " + totalStatCha;
        return displayPlayer;

    } 
    
    

}
