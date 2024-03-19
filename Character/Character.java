public class Character {
    private String name;

    private int statHp;
    private int statStr;
    private int statDex;
    private int statInt;
    private int statWis;
    private int statCha;

    public Character(String name, int statHp, int statStr, int statDex, int statInt, int statWis, int statCha) {
        this.name = name;
        this.statHp = statHp;
        this.statStr = statStr;
        this.statDex = statDex;
        this.statInt = statInt;
        this.statWis = statWis;
        this.statCha = statCha;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getStatHp() {
        return statHp;
    }
    public void setStatHp(int statHp) {
        this.statHp = statHp;
    }

    public int getStatStr() {
        return statStr;
    }
    public void setStatStr(int statStr) {
        this.statStr = statStr;
    }


    public int getStatDex() {
        return statDex;
    }
    public void setStatDex(int statDex) {
        this.statDex = statDex;
    }


    public int getStatInt() {
        return statInt;
    }
    public void setStatInt(int statInt) {
        this.statInt = statInt;
    }


    public int getStatWis() {
        return statWis;
    }
    public void setStatWis(int statWis) {
        this.statWis = statWis;
    }


    public int getStatCha() {
        return statCha;
    }
    public void setStatCha(int statCha) {
        this.statCha = statCha;
    }

    public String toString(){
        return("Name: " + getName() + "\n" +
                "Hit Points: " + getStatHp() + "\n" +
                "Strength: " + getStatHp() + "\n" +
                "Dexterity: " + getStatHp() + "\n" +
                "Intelligence: " + getStatHp() + "\n" +
                "Wisdom: " + getStatHp() + "\n" +
                "Charisma: " + getStatHp() + "\n");
    }
}
