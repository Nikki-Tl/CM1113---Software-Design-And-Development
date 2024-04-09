public class Weapon extends Profession {
    
    private int weaponProfession;


    public int getWeaponProfession() {
        return weaponProfession;
    }

    public Weapon(String professionName, int health, int strength, int dexterity, int intelligence, int wisdom,
            int charisma, int weaponProfession) {
        super(professionName, health, strength, dexterity, intelligence, wisdom, charisma);

        
        this.weaponProfession = weaponProfession;
    }

    public static Object[][][] WeaponArray = new Object[][][]{
        //barbarian
        {
        {"Battleaxe",20,5,100},
        {"Warhammer",30,10,100},
        {"Longsword",10,0,100},
        },
        //bard
        {
        {"Guitar", 20,30,50},
        {"Violin", 30,50,50},
        {"Triangle",45,75,10},
        },
        //cleric
        {
        {"Staff of shocking",30,30,50},
        {"Cursed Hands",20,30,100},
        {"Spell book of Flames",50,75,30},
        },
        //druid
        {
        {"Staff of Growth",30,30,50},
        {"Scimitar",20,10,100},
        {"Sickle",10,0,100},
        },
        //fighter
        {
        {"Shortsword",10,0,100},
        {"Spear",20,10,200},
        {"Halberd",30,20,100},
        },
        //paladin
        {
        {"Greatsword",40,30,100},
        {"Battleaxe",20,5,100},
        {"Halberd",30,20,100},
        },
        //ranger
        {
        {"Shortbow",20,10,50},
        {"Longbow",35,30,100},
        {"Crossbow",30,20,100},
        },
        //rogue
        {
        {"Dagger",10,0,100},
        {"Scimitar",20,10,100},
        {"Throwing Knives",30,10,5},
        },
        //sorcerer
        {
        {"Staff of Freezing",30,30,50},
        {"Crystal ball",70,50,10},
        {"Spell book of Wind",50,75,30}
        }
    };

    public void printQuestionWeapon(){

        switch (getProfessionName()) {
            case "Barbarian":
                weaponProfession = 0;
                break;
            case "Bard":
                weaponProfession = 1;
                break;
            case "Cleric":
                weaponProfession = 2;
                break;
            case "Druid":
                weaponProfession = 3;
                break;
            case "Fighter":
                weaponProfession = 4;
                break;
            case "Paladin":
                weaponProfession = 5;
                break;
            case "Ranger":
                weaponProfession = 6;
                break;
            case "Rogue":
                weaponProfession = 7;
                break;
            case "Sorcerer":
                weaponProfession = 8;
                break;  
        }

        System.out.println("----------CHOOSE YOUR WEAPON----------");

        for (int i = 0; i < WeaponArray[0][0].length - 1; i++ ){
            for (int j = 0; j < WeaponArray[0].length + 1; j++){
                if (j == 1){
                    System.out.print("Damage: ");
                }
                else if (j == 2){
                    System.out.print("Mana Cost: ");
                }
                else if (j == 3){
                    System.out.print("Durability: ");
                }
   
                System.out.println(WeaponArray[weaponProfession][i][j]);
            }
        }
    }
}
