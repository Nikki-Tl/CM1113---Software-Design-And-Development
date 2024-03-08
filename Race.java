public class Race {
    private int minAge;
    private int maxAge;
    private int hp;
    private int str;
    private int dex;
    private int intel;
    private int wis;
    private int cha;

    
    public Race(int minAge, int maxAge, int hp, int str, int dex, int intel, int wis, int cha) {
        this.minAge = minAge;
        this.maxAge = maxAge;
        this.hp = hp;
        this.str = str;
        this.dex = dex;
        this.intel = intel;
        this.wis = wis;
        this.cha = cha;
    }

    public int getminAge(){
        return minAge;
    }
    public void setminAge(int minAge){
        this.minAge = minAge;
    }
    public int getmaxAge(){
        return maxAge;
    }
    public void setmaxAge(int maxAge){
        this.maxAge = maxAge;
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

