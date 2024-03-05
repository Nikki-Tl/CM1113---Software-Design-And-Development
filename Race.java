public class Race {
    private int hp;
    private int str;
    private int dex;
    private int intel;
    private int wis;
    private int cha;

    
    public Race(int hp, int str, int dex, int intel, int wis, int cha) {
        this.hp = hp;
        this.str = str;
        this.dex = dex;
        this.intel = intel;
        this.wis = wis;
        this.cha = cha;
    }
    
    public int getHp() {
        return hp;
    }
    public void setHp(int hp) {
        this.hp = hp;
    }
    public int getStr() {
        return str;
    }
    public void setStr(int str) {
        this.str = str;
    }
    public int getDex() {
        return dex;
    }
    public void setDex(int dex) {
        this.dex = dex;
    }
    public int getIntel() {
        return intel;
    }
    public void setIntel(int intel) {
        this.intel = intel;
    }
    public int getWis() {
        return wis;
    }
    public void setWis(int wis) {
        this.wis = wis;
    }
    public int getCha() {
        return cha;
    }
    public void setCha(int cha) {
        this.cha = cha;
    }
}

