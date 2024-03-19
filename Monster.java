public class Monster extends Character{
    private String monsterDescription;

    public Monster(String name, int statHp, int statStr, int statDex, int statInt,int statWis, int statCha, String monsterDescription) {
        super(name, statHp, statStr, statDex, statInt, statWis, statCha);
        this.monsterDescription = monsterDescription;
    }

    public String toString(){
        String displayMonster = "Description: " + monsterDescription + "\n";             
            return displayMonster;
        }
}
