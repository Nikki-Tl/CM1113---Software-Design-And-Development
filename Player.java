
/*
    ----------------------------------------------------------------

    

    ----------------------------------------------------------------
*/

public class Player {
    
    /* Initialising Variables */
    private String name;
    private int age;
    private String race;
    private String type;

    private int hp;
    private int str;
    private int dex;
    private int intel;
    private int wis;
    private int cha;


    /* Constructor */
    public Player(String name, int age, String race, String type, int hp, int str, int dex, int intel, int wis, int cha) {
        this.name = name;
        this.age = age;
        this.race = race;
        this.type = type;
        this.hp = hp;
        this.str = str;
        this.dex = dex;
        this.intel = intel;
        this.wis = wis;
        this.cha = cha;
    }
 
    /* Getters and Setters per Variable */
    /* name */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /* age */
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    /* race */
    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    /* type */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    /* hp */
    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    /* str */
    public int getStr() {
        return str;
    }

    public void setStr(int str) {
        this.str = str;
    }

    /* dex */
    public int getDex() {
        return dex;
    }

    public void setDex(int dex) {
        this.dex = dex;
    }

    /* intel */
    public int getIntel() {
        return intel;
    }

    public void setIntel(int intel) {
        this.intel = intel;
    }

    /* wis */
    public int getWis() {
        return wis;
    }

    public void setWis(int wis) {
        this.wis = wis;
    }

    /* cha */
    public int getCha() {
        return cha;
    }

    public void setCha(int cha) {
        this.cha = cha;
    }






}
