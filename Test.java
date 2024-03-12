
/*
    ----------------------------------------------------------------

    

    ----------------------------------------------------------------
*/

public class Test {
    
    public static void main(String[] args) {
            
        /* setups */
        /* Setting up Race options */    
        Race Human = new Race(20, 100, 0, 0, 1, 1, 0, 1);
        Race Elf = new Race(100, 750, 0, 0, 2, 1, 0, 0);
        Race Orc = new Race(15, 75, 2, 2, 1, -2, 0, 0);
        Race Dwarf = new Race(50, 350, 1, 0, 0, 1, 0, 1);
        Race Dragonborn = new Race(15, 80, 2, 1, 1, -2, 0, 1);
        Race Halfling = new Race(20, 250, -1, -1, 1, 2, 0, 2);
        Race Tiefling = new Race(20, 100, 0, -1, 0, 1, 1, 2);
        
        /* Type setup */
        /* N: change depending on what we do for arrays */
        Type Barbarian = new Type(2, 3, 0, -2, 0, 0, null, null, null);
        Type Bard = new Type(-1, -1, 1, 1, 0, 3, null, null, null);
        Type Cleric = new Type(-2, -2, 1, 3, 2, 1, null, null, null);
        Type Druid = new Type(0, -1, 0, 1, 3, 0, null, null, null);
        Type Fighter = new Type(1, 1, 1, 0, 0, 0, null, null, null);
        Type Paladin = new Type(3, 2, -1, -1, -1, 1, null, null, null);
        Type Ranger = new Type(-2, 1, 3, 0, 1, 0, null, null, null);
        Type Rouge = new Type(0, 0, 3, 0, -1, 1, null, null, null);
        Type Sorcerer = new Type(-1, -2, 1, 3, 2, 0, null, null, null);



        
        /* testing */
        Scanner sc = new Scanner(System.in);
        System.out.println("Name: ");
        String tempName = sc.next();


        Player jamal = new Player(tempName, 0, null, null, 0, 0, 0, 0, 0);

        System.out.println(jamal.getName());
    
    
    
    
    }



}
