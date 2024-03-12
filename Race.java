
/*
*   ----------------------------------------------------------------
*
*   
*
*   ----------------------------------------------------------------
*/

public class Race {

    /* Initialising Variables */
    private int minAge;
    private int maxAge;

    private int raceStatHp;
    private int raceStatStr;
    private int raceStatDex;
    private int raceStatInt;
    private int raceStatWis;
    private int raceStatCha;

    /* Cnstructor */
    public Race(int minAge, int maxAge, int raceStatHp, int raceStatStr, int raceStatDex, int raceStatInt, int raceStatWis, int raceStatCha) {
        
        this.minAge = minAge;
        this.maxAge = maxAge;

        this.raceStatHp = raceStatHp;
        this.raceStatStr = raceStatStr;
        this.raceStatDex = raceStatDex;
        this.raceStatInt = raceStatInt;
        this.raceStatWis = raceStatWis;
        this.raceStatCha = raceStatCha;
    }

    /* Getters and Setters per Variable */
    /* min age */
    public int getMinAge() {
        return minAge;
    }
    public void setMinAge(int minAge) {
        this.minAge = minAge;
    }

    /* max age */
    public int getMaxAge() {
        return maxAge;
    }
    public void setMaxAge(int maxAge) {
        this.maxAge = maxAge;
    }

    /* hp */
    public int getRaceStatHp() {
        return raceStatHp;
    }
    public void setRaceStatHp(int raceStatHp) {
        this.raceStatHp = raceStatHp;
    }

    /* str */
    public int getRaceStatStr() {
        return raceStatStr;
    }
    public void setRaceStatStr(int raceStatStr) {
        this.raceStatStr = raceStatStr;
    }

    /* dex */
    public int getRaceStatDex() {
        return raceStatDex;
    }
    public void setRaceStatDex(int raceStatDex) {
        this.raceStatDex = raceStatDex;
    }

    /* int */
    public int getRaceStatInt() {
        return raceStatInt;
    }
    public void setRaceStatInt(int raceStatInt) {
        this.raceStatInt = raceStatInt;
    }

    /* wis */
    public int getRaceStatWis() {
        return raceStatWis;
    }
    public void setRaceStatWis(int raceStatWis) {
        this.raceStatWis = raceStatWis;
    }

    /* cha */
    public int getRaceStatCha() {
        return raceStatCha;
    }
    public void setRaceStatCha(int raceStatCha) {
        this.raceStatCha = raceStatCha;
    }


    
    
}

