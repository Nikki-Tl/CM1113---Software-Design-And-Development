public class Monster extends Player{
    private String monsterDescription;
    private String monsterName;
    private Boolean isDead;

    public Monster(int health, int strength, int dexterity, int intelligence, int wisdom, int charisma, String monsterDescription, String monsterName, Boolean isDead) {
        super(health, strength, dexterity, intelligence, wisdom, charisma);
        this.monsterDescription = monsterDescription;
        this.monsterName = monsterName;
        this.isDead = isDead;
    }

    public String getMonsterDescription() {
        return monsterDescription;
    }

    public void setMonsterDescription(String monsterDescription) {
        this.monsterDescription = monsterDescription;
    }

    public String getMonsterName() {
        return monsterName;
    }

    public void setMonsterName(String monsterName) {
        this.monsterName = monsterName;
    }

    public Boolean getIsDead() {
        return isDead;
    }

    public void setIsDead(Boolean isDead) {
        this.isDead = isDead;
    }

    public String toString(){
        String displayMonster = "Name: " + monsterName + "\n" + 
                                "Description: " + monsterDescription + "\n" +
                                "Health Points: " + health + "\n" +
                                "Strength: " + strength + "\n" + 
                                "Dexterity: " + dexterity + "\n" +
                                "Intelligence: " + intelligence + "\n" +
                                "Wisdom: " + wisdom + "\n" +
                                "Charisma: " + charisma + "\n";             
            return displayMonster;
        }
}
