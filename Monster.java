public class Monster extends Player{
    private String monsterDescription;
    private String monsterName;

    public Monster(int statHp, int statStr, int statDex, int statInt,
            int statWis, int statCha, String monsterDescription, String monsterName) {
        super(statHp, statStr, statDex, statInt, statWis, statCha);
        this.monsterDescription = monsterDescription;
        this.monsterName = monsterName;
    }

    public String toString(){
        String displayMonster = "Name: " + monsterName + "\n" + "Description: " + monsterDescription + "\n";             
            return displayMonster;
        }
}
