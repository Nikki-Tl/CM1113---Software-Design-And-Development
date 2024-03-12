public class Type {

    /* Initialising Variables */
    private int typeStatHp;
    private int typeStatStr;
    private int typeStatdex;
    private int typeStatInt;
    private int typeStatWis;
    private int typeStatCha;
    
    /* N: subjetc to change (temporary?) */
    /* N: we should have the possible weapons to chose from given in a form of array and let user pick unmer in said array to chose */
    private String[] armour;
    /* N: same goes for this */
    private String[] weapon;
    /* N: Store spells + extras that user choses into an array and save it here? + rename extra?) */
    private String[] extra;


    /* Constructor */
    public Type(int typeStatHp, int typeStatStr, int typeStatdex, int typeStatInt, int typeStatWis, int typeStatCha, String[] armour, String[] weapon, String[] extra) {
        
        this.typeStatHp = typeStatHp;
        this.typeStatStr = typeStatStr;
        this.typeStatdex = typeStatdex;
        this.typeStatInt = typeStatInt;
        this.typeStatWis = typeStatWis;
        this.typeStatCha = typeStatCha;

        this.armour = armour;
        this.weapon = weapon;
        this.extra = extra;

    }



    /* Getters and Setters per Variable */
    /* hp */
    public int getTypeStatHp() {
        return typeStatHp;
    }
    public void setTypeStatHp(int typeStatHp) {
        this.typeStatHp = typeStatHp;
    }

    /* str */
    public int getTypeStatStr() {
        return typeStatStr;
    }
    public void setTypeStatStr(int typeStatStr) {
        this.typeStatStr = typeStatStr;
    }

    /* dex */
    public int getTypeStatdex() {
        return typeStatdex;
    }
    public void setTypeStatdex(int typeStatdex) {
        this.typeStatdex = typeStatdex;
    }

    /* int */
    public int getTypeStatInt() {
        return typeStatInt;
    }
    public void setTypeStatInt(int typeStatInt) {
        this.typeStatInt = typeStatInt;
    }

    /* wis */
    public int getTypeStatWis() {
        return typeStatWis;
    }
    public void setTypeStatWis(int typeStatWis) {
        this.typeStatWis = typeStatWis;
    }

    /* cha */
    public int getTypeStatCha() {
        return typeStatCha;
    }
    public void setTypeStatCha(int typeStatCha) {
        this.typeStatCha = typeStatCha;
    }

    /* N: i dont think i set these arrays right :/ */
    /* armour */
    public String[] getArmour() {
        return armour;
    }
    public void setArmour(String[] armour) {
        this.armour = armour;
    }

    /* weapon */
    public String[] getWeapon() {
        return weapon;
    }
    public void setWeapon(String[] weapon) {
        this.weapon = weapon;
    }

    /* extra */
    public String[] getExtra() {
        return extra;
    }
    public void setExtra(String[] extra) {
        this.extra = extra;
    }

    
}
