
/*
    ----------------------------------------------------------------

    

    ----------------------------------------------------------------
*/

public class Test {
    
    public static void main(String[] args) {
            
            
        Race Human = new Race(0, 0, 1, 1, 0, 1);
        Race Elf = new Race(0, 0, 2, 1, 0, 0);
        Race Orc = new Race(2, 2, 1, -2, 0, 0);
        Race Dwarf = new Race(1, 0, 0, 1, 0, 1);
        Race Dragonborn = new Race(2, 1, 1, -2, 0, 1);
        Race Halfling = new Race(-1, -1, 1, 2, 0, 2);
        Race Tiefling = new Race(0, -1, 0, 1, 1, 2);
    
            Scanner sc = new Scanner(System.in);
            System.out.println("Name: ");
            String tempName = sc.next();
    
    
            Player jamal = new Player(tempName, 0, null, null, 0, 0, 0, 0, 0, 0);
    
            System.out.println(jamal.getName());
    
    
    
    
    }



}
