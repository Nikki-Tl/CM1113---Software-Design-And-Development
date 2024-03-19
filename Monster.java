public class Monster {
    private String name;
    private String monsterDescription;

    

    private int monsterStatHp;
    private int monsterStatStr;
    private int monsterStatDex;
    private int monsterStatInt;
    private int monsterStatWis;
    private int monsterStatCha;

    public Monster(String name, String monsterDescription, int monsterStatHp, int monsterStatStr, int monsterStatDex, int monsterStatInt,
            int monsterStatWis, int monsterStatCha) {
        this.name = name;
        this.monsterDescription = monsterDescription;
        this.monsterStatHp = monsterStatHp;
        this.monsterStatStr = monsterStatStr;
        this.monsterStatDex = monsterStatDex;
        this.monsterStatInt = monsterStatInt;
        this.monsterStatWis = monsterStatWis;
        this.monsterStatCha = monsterStatCha;
    }
    /* name */
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    /* description of the monster */
    public String getMonsterDescription() {
        return monsterDescription;
    }
    public void setMonsterDescription(String monsterDescription) {
        this.monsterDescription = monsterDescription;
    }

    /* hit points */
    public int getMonsterStatHp() {
        return monsterStatHp;
    }
    public void setMonsterStatHp(int monsterStatHp) {
        this.monsterStatHp = monsterStatHp;
    }

    /* strength */
    public int getMonsterStatStr() {
        return monsterStatStr;
    }
    public void setMonsterStatStr(int monsterStatStr) {
        this.monsterStatStr = monsterStatStr;
    }

    /* dexterity */
    public int getMonsterStatDex() {
        return monsterStatDex;
    }
    public void setMonsterStatDex(int monsterStatDex) {
        this.monsterStatDex = monsterStatDex;
    }

    /* intelligence */
    public int getMonsterStatInt() {
        return monsterStatInt;
    }
    public void setMonsterStatInt(int monsterStatInt) {
        this.monsterStatInt = monsterStatInt;
    }

    /* wisdom */
    public int getMonsterStatWis() {
        return monsterStatWis;
    }
    public void setMonsterStatWis(int monsterStatWis) {
        this.monsterStatWis = monsterStatWis;
    }

    /* charisma */
    public int getMonsterStatCha() {
        return monsterStatCha;
    }
    public void setMonsterStatCha(int monsterStatCha) {
        this.monsterStatCha = monsterStatCha;
    }

    public String toString(){
        String displayMonster = "Name: " + name + "\n" +
                                "Description: " + monsterDescription + "\n" + "\n" +
                                "Hit Points: " + monsterStatHp + "\n" +
                                "Strength: " + monsterStatStr + "\n" +
                                "Dexterity: " + monsterStatDex + "\n" +
                                "Intelligence: " + monsterStatInt + "\n" +
                                "Wisdom: " + monsterStatWis + "\n" +
                                "Charisma: " + monsterStatCha + "\n";                 
            return displayMonster;
        }
}
