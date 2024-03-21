/* 
 * @author Nikola Tluczek (N)
 *         - running Player, Race and Professions questions for users
 * 
 * @author
 * 
 * 
 * 
 * 
 */

/*
 *  NOTES/LOGS;
 * 
 *  // N - (for the race and profession section i think imma create all the classes as a hashmap and add the description of all of them so the user can see their stats if theyd like to then chose from em)
 *  // N - (i think we should have the player answer with numbers (1 - barbarian, 2 - bard) cuz otherwise its kinda annoying (also it will make for easier combat selection))
 * 
 */

import java.util.*;

public class Test {
    
    public static void main(String[] args) {

        // N - creating scanner (use this for whole of test? it does complain its never closed but idk how to deal with that)
        Scanner scanner = new Scanner(System.in);

        // Creating stat variables
        int health = 0;
        int strength = 0;
        int dexterity = 0;
        int intelligence = 0;
        int wisdom = 0;
        int charisma = 0;



        // N - Creating a Race instance
        Race racePlayer = new Race(null, health, strength, dexterity, intelligence, wisdom, charisma);

        for (int i = 0; i < 1; i++) {

            System.out.print("Enter Race: ");
            racePlayer.setRaceName(scanner.next());

            if (racePlayer.getRaceName().equals("Human")) {
                racePlayer.setDexterity(dexterity += 1);
                racePlayer.setIntelligence(intelligence += 1);
                racePlayer.setCharisma(charisma += 1);
            }
            else if (racePlayer.getRaceName().equals("Elf")) {
                racePlayer.setDexterity(dexterity += 1);
                racePlayer.setIntelligence(intelligence += 2);
            }
            else if (racePlayer.getRaceName().equals("Orc")) {
                racePlayer.setHealth(health += 2);
                racePlayer.setStrength(strength += 2);
                racePlayer.setDexterity(dexterity += 1);
                racePlayer.setIntelligence(intelligence -= 2);
            } 
            else if (racePlayer.getRaceName().equals("Dwarf")) {
                racePlayer.setHealth(health += 1);
                racePlayer.setIntelligence(intelligence += 1);
                racePlayer.setCharisma(charisma += 1);
            }
            else if (racePlayer.getRaceName().equals("Dragonborn")) {
                racePlayer.setHealth(health += 2);
                racePlayer.setStrength(strength += 1);
                racePlayer.setDexterity(dexterity += 1);
                racePlayer.setIntelligence(intelligence -= 2);
                racePlayer.setCharisma(charisma += 1);
            }
            else if (racePlayer.getRaceName().equals("Halfling")) {
                racePlayer.setHealth(health -= 1);
                racePlayer.setStrength(strength -= 1);
                racePlayer.setDexterity(dexterity += 1);
                racePlayer.setIntelligence(intelligence += 2);
                racePlayer.setCharisma(charisma += 2);
            }
            else if (racePlayer.getRaceName().equals("Tiefling")) {
                racePlayer.setStrength(strength -= 1);
                racePlayer.setIntelligence(intelligence += 1);
                racePlayer.setWisdom(wisdom += 1);
                racePlayer.setCharisma(charisma += 2);
            } else {
                i--;
            }
        
        }

        System.out.println("Race Player stats:");
        racePlayer.displayStats();
        System.out.println();


        // N - Creating a Profession instance
        Profession professionPlayer = new Profession(null, health, strength, dexterity, intelligence, wisdom, charisma);

        for (int i = 0; i < 1; i++) {

            System.out.print("Enter Profession: ");
            professionPlayer.setProfessionName(scanner.next());

            if (professionPlayer.getProfessionName(). equals("Barbarian")) {
                professionPlayer.setHealth(health += 2);
                professionPlayer.setStrength(strength += 3);
                professionPlayer.setIntelligence(intelligence -= 2);

            }
            else if (professionPlayer.getProfessionName().equals("Bard")) {
                professionPlayer.setHealth(health -= 1);
                professionPlayer.setStrength(strength -= 1);
                professionPlayer.setDexterity(dexterity += 1);
                professionPlayer.setIntelligence(intelligence += 1);
                professionPlayer.setCharisma(charisma += 3);

            }
            else if (professionPlayer.getProfessionName().equals("Cleric")) {
                professionPlayer.setHealth(health -= 2);
                professionPlayer.setStrength(strength -= 2);
                professionPlayer.setDexterity(dexterity += 1);
                professionPlayer.setIntelligence(intelligence += 2);
                professionPlayer.setWisdom(wisdom += 2);
                professionPlayer.setCharisma(charisma += 1);

            }
            else if (professionPlayer.getProfessionName().equals("Druid")) {
                professionPlayer.setStrength(strength -= 1);
                professionPlayer.setIntelligence(intelligence += 1);
                professionPlayer.setWisdom(wisdom += 3);

            }
            else if (professionPlayer.getProfessionName().equals("Fighter")) {
                professionPlayer.setHealth(health += 1);
                professionPlayer.setStrength(strength += 1);
                professionPlayer.setDexterity(dexterity += 1);

            }
            else if (professionPlayer.getProfessionName().equals("Paladin")) {
                professionPlayer.setHealth(health += 3);
                professionPlayer.setStrength(strength += 2);
                professionPlayer.setDexterity(dexterity -= 1);
                professionPlayer.setIntelligence(intelligence -= 1);
                professionPlayer.setWisdom(wisdom -= 1);
                professionPlayer.setCharisma(charisma += 1);
            
            }
            else if (professionPlayer.getProfessionName().equals("Ranger")) {
                professionPlayer.setHealth(health -= 2);
                professionPlayer.setStrength(strength += 1);
                professionPlayer.setDexterity(dexterity += 3);
                professionPlayer.setWisdom(wisdom += 1);

            }
            else if (professionPlayer.getProfessionName().equals("Rogue")) {
                professionPlayer.setDexterity(dexterity += 3);
                professionPlayer.setWisdom(wisdom -= 1);
                professionPlayer.setCharisma(charisma += 1);

            }
            else if (professionPlayer.getProfessionName().equals("Sorcerer")) {
                professionPlayer.setHealth(health -= 1);
                professionPlayer.setStrength(strength -= 2);
                professionPlayer.setDexterity(dexterity += 1);
                professionPlayer.setIntelligence(intelligence += 3);
                professionPlayer.setWisdom(wisdom += 2);

            }


        }

        System.out.println("Profession Player stats:");
        professionPlayer.displayStats();
        System.out.println();

        
        // N - Creating a Player instance
        Player player1 = new Player(health, strength, dexterity, intelligence, wisdom, charisma);
        System.out.println("Player stats:");
        player1.displayStats();
        System.out.println();

        /* kane bit */

        Weapon riversofblood = new Weapon("Rivers of Blood", 50, 10, 100, "Forged in the Land of Blossoms, this sword imitates the flow of blood with its slashes.");

        System.out.println(riversofblood);

        /* finn bit */

        Monster banshee = new Monster(58, 13, 9, 14, 12, 11, "A banshee is the hateful spirit of a once beautiful female elf. It appears as a luminous, wispy form that vaguely recalls its mortal features. A banshee's face is wreathed in a wild tangle of hair, and its body is clad in wispy rags that flutter and stream around it. A banshee is forever bound to the place of its demise. It abhors mirrors, for it can't bear to see the horrors of its undead existence.", "Banshee");
        System.out.println(banshee);

        Monster bramzarkTheDespoiler = new Monster(580, 13, 9, 13, 13, 13, "big bad boss man", "Bramzark the despoiler");
        System.out.println(bramzarkTheDespoiler);


    }



}
