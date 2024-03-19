

/*
*   ----------------------------------------------------------------
*   N: i cannot add the stats onto totalStats at all, I have tried for like 30mins straight and gave up... have fun
*   
*
*   ----------------------------------------------------------------
*/

import java.util.*;

public class Test {
    
    public static void main(String[] args) {

        /* setups */
        /* Setting up Race options */
        Race Human = new Race(20, 100, "Human", 0, 0, 1, 1, 0, 1);
        Race Elf = new Race(100, 750, "Elf", 0, 0, 2, 1, 0, 0);
        Race Orc = new Race(15, 75, "Orc", 2, 2, 1, -2, 0, 0);
        Race Dwarf = new Race(50, 350, "Dwarf", 1, 0, 0, 1, 0, 1);
        Race Dragonborn = new Race(15, 80, "Dragonborn", 2, 1, 1, -2, 0, 1);
        Race Halfling = new Race(20, 250, "Halfling", -1, -1, 1, 2, 0, 2);
        Race Tiefling = new Race(20, 100, "Tiefling", 0, -1, 0, 1, 1, 2);
        
        /* Type setup */
        /* N: change depending on what we do for arrays */
        Type Barbarian = new Type("Barbarian", 2, 3, 0, -2, 0, 0, null, null, null);
        Type Bard = new Type("Bard", -1, -1, 1, 1, 0, 3, null, null, null);
        Type Cleric = new Type("Cleric", -2, -2, 1, 3, 2, 1, null, null, null);
        Type Druid = new Type("Druid", 0, -1, 0, 1, 3, 0, null, null, null);
        Type Fighter = new Type("Fighter", 1, 1, 1, 0, 0, 0, null, null, null);
        Type Paladin = new Type("Paladin", 3, 2, -1, -1, -1, 1, null, null, null);
        Type Ranger = new Type("Ranger", -2, 1, 3, 0, 1, 0, null, null, null);
        Type Rouge = new Type("Rogue", 0, 0, 3, 0, -1, 1, null, null, null);
        Type Sorcerer = new Type("Sorcerer", -1, -2, 1, 3, 2, 0, null, null, null);

        /* Player Setup */
        Player jamal = new Player(null, null, null, 0, 0, 0, 0, 0, 0);





        /* testing */
        Scanner sc = new Scanner(System.in);
        System.out.print("Name: ");
        jamal.setName(sc.next());
        

        /* Select Race Type */
        for (int i = 0; i < 1; i++) {

            System.out.print("Race: ");
            String tempRace = sc.next();

            if (tempRace.equals("Human")) {
                jamal.setRace(Human);
            } else if (tempRace.equals("Elf")) {
                jamal.setRace(Elf);
            } else if (tempRace.equals("Orc")) {
                jamal.setRace(Orc);
            } else if (tempRace.equals("Dwarf")) {
                jamal.setRace(Dwarf);
            } else if (tempRace.equals("Dragonborn")) {
                jamal.setRace(Dragonborn);
            } else if (tempRace.equals("Halfling")) {
                jamal.setRace(Halfling);
            } else if (tempRace.equals("Tiefling")) {
                jamal.setRace(Tiefling);
            }
            else {
                i--;
            }
        }

        /* Select Race Type */
        for (int i = 0; i < 1; i++) {

            System.out.print("Type: ");
            String tempType = sc.next();

            if (tempType.equals("Barbarian")) {
                jamal.setType(Barbarian);
            } else if (tempType.equals("Bard")) {
                jamal.setType(Bard);
            } else if (tempType.equals("Cleric")) {
                jamal.setType(Cleric);
            } else if (tempType.equals("Druid")) {
                jamal.setType(Druid);
            } else if (tempType.equals("Fighter")) {
                jamal.setType(Fighter);
            } else if (tempType.equals("Paladin")) {
                jamal.setType(Paladin);
            } else if (tempType.equals("Ranger")) {
                jamal.setType(Ranger);
            } else if (tempType.equals("Rogue")) {
                jamal.setType(Rouge);
            } else if (tempType.equals("Sorcerer")) {
                jamal.setType(Sorcerer);
            } else {
                i--;
            }

        }


        System.out.println("");

        /* toString */
        System.out.println(jamal.toString());

        /* kane bit */

        Weapon riversofblood = new Weapon("Rivers of Blood", 50, 10, 100, "Forged in the Land of Blossoms, this sword imitates the flow of blood with its slashes.");

        System.out.println(riversofblood);

        /* finn bit */

        Monster banshee = new Monster("Banshee", "A banshee is the hateful spirit of a once beautiful female elf. It appears as a luminous, wispy form that vaguely recalls its mortal features. A banshee's face is wreathed in a wild tangle of hair, and its body is clad in wispy rags that flutter and stream around it. A banshee is forever bound to the place of its demise. It abhors mirrors, for it can't bear to see the horrors of its undead existence.", 58, 1, 14, 12, 11, 17);
        System.out.println(banshee);

        Monster bramzarkTheDespoiler = new Monster("Bramzark the despoiler", "Big bad boss man", 580, 13, 9, 13, 13, 13);
        System.out.println(bramzarkTheDespoiler);


    }
