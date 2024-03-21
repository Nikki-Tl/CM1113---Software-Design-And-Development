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


        

        // N - creating each race description
        HashMap <String, String> raceHashMap = new HashMap<String, String>();
        raceHashMap.put("Human", "\nDescription: Human \n");
        raceHashMap.put("Elf", "\nDescription: Elf \n");
        raceHashMap.put("Orc", "\nDescription: Orc \n");
        raceHashMap.put("Dwarf", "\nDescription: Dwarf \n");
        raceHashMap.put("Dragonborn", "\nDescription: Dragonborn \n");
        raceHashMap.put("Halfling", "\nDescription: Halfling \n");
        raceHashMap.put("Tiefling", "\nDescription: Tiefling \n");

        // N - creating each profession description
        HashMap <String, String> professionHashMap = new HashMap<String, String>();
        professionHashMap.put("Barbarian", "\nDescription: Barbarian \n");
        professionHashMap.put("Bard", "\nDescription: Bard \n");
        professionHashMap.put("Cleric", "\nDescription: Cleric \n");
        professionHashMap.put("Druid", "\nDescription: Druid \n");
        professionHashMap.put("Fighter", "\nDescription: Fighter \n");
        professionHashMap.put("Paladin", "\nDescription: Paladin \n");
        professionHashMap.put("Ranger", "\nDescription: Ranger \n");
        professionHashMap.put("Rogue", "\nDescription: Rogue \n");
        professionHashMap.put("Sorcerer", "\nDescription: Sorcerer \n");




        // N - user ui and input
        System.out.println();
        System.out.println(" ---------- CHARACTER CREATION ----------");
        System.out.println();
        System.out.println(" ---------- RACE ----------");
        System.out.println("Please Select your race, here are your options:");  
        System.out.println();
        System.out.println(raceHashMap);
        System.out.println();

        // N - creating a Race instance
        Race racePlayer = new Race(null, health, strength, dexterity, intelligence, wisdom, charisma);

        // N - set stats depending on user input
        for (int i = 0; i < 1; i++) {

            System.out.print("Input: ");
            racePlayer.setRaceName(scanner.next());
            System.out.println();

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

        System.out.println("Player stats:");
        racePlayer.displayStats();
        System.out.println(raceHashMap.get(racePlayer.getRaceName()));
        System.out.println();



        System.out.println();
        System.out.println(" ---------- PROFESSION ----------");
        System.out.println("Please Select your profession, here are your options:");
        System.out.println();
        System.out.println(professionHashMap);
        System.out.println();


        // N - Creating a Profession instance
        Profession professionPlayer = new Profession(null, health, strength, dexterity, intelligence, wisdom, charisma);

        for (int i = 0; i < 1; i++) {

            System.out.print("Input: ");
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

            } else {
                i--;
            }


        }

        System.out.println();
        System.out.println("Player stats:");
        professionPlayer.displayStats();
        System.out.println();

        CharacterCreator player1 = new CharacterCreator(null, racePlayer.getRaceName(), professionPlayer.getProfessionName(), health, strength, dexterity, intelligence, wisdom, charisma);
        System.out.println(player1);

        /* finn bit */
        Monster testDummy = new Monster(10, 0, 0, 1, 0, 0, "A dummy. Who you callin' dummy, dummy?", "Test Dummy", false);

        Monster banshee = new Monster(58, 13, 9, 14, 12, 11, "A banshee is the hateful spirit of a once beautiful female elf. It appears as a luminous, wispy form that vaguely recalls its mortal features. A banshee's face is wreathed in a wild tangle of hair, and its body is clad in wispy rags that flutter and stream around it. A banshee is forever bound to the place of its demise. It abhors mirrors, for it can't bear to see the horrors of its undead existence.", "Banshee", false);

        Monster bramzarkTheDespoiler = new Monster(580, 13, 9, 13, 13, 13, "big bad boss man", "Bramzark the despoiler", false);

        Moves punch = new Moves(null, null, 0);

        for (int i = 0; i < 1; i++) {
            System.out.print(" You have encountered a Test Dummy! Which attack would you like to use? ");
            punch.setName(scanner.next());
            if (punch.getName().equals("Punch")) {
                testDummy.setHealth(testDummy.getHealth() - 5);
                System.out.println("Hit! " + testDummy.getMonsterName() + " 's health is now down to " + testDummy.getHealth());
                    if (testDummy.getHealth() == 0) {
                    testDummy.setIsDead(testDummy.getIsDead() == true);
                    System.out.println(testDummy.getMonsterName() + " is dead.");
                    i++;
                    }
                professionPlayer.setHealth(professionPlayer.getHealth() - 5);
                System.out.println("You have been hit by " + testDummy.getMonsterName() + "! Your health is now down to " + professionPlayer.getHealth());
                i--;
            }
           

        }
    }
 }
