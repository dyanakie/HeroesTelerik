package HeroesTelerik;

import HeroesTelerik.Creatures.Creature;
import HeroesTelerik.MainHero.Slot;

import java.util.ArrayList;
import java.util.List;

public class Army {

    List<Creature> Slot1;                               // The army has 3 slots which can be of different Type of Creatures
    String Slot1Type;
    Creature creature1;
    List<Creature> Slot2;
    String Slot2Type;
    Creature creature2;
    List<Creature> Slot3;
    String Slot3Type;
    Creature creature3;
    boolean defeated;

    public Army(){

        Slot1 = new ArrayList<Creature>();
        Slot2 = new ArrayList<Creature>();
        Slot3 = new ArrayList<Creature>();
        Slot1Type = "";
        this.defeated = false;

    }

    public String getSlot1Type() {
        return Slot1Type;
    }      // Check and returns Slot1Type String

    public String getSlot2Type() {
        return Slot2Type;
    }

    public String getSlot3Type() {
        return Slot3Type;
    }

    public Creature getCreature1() {
        return creature1;
    }

    public Creature getCreature2() {
        return creature2;
    }

    public Creature getCreature3() {
        return creature3;
    }

    public  void addSlot1(Creature creature, int number){         // Adds selected number of creatures in Slot1 and also changes slot1Type
        for(int i = 0; i < number; i++) {
            Slot1.add(creature);
        }
        Slot1Type = creature.getType();
      //  creature1 = creature.getType2();
    }

    public  void addSlot2(Creature creature, int number){         // Adds selected number of creatures in Slot2 and also changes slot2Type
        for(int i = 0; i < number; i++) {
            Slot2.add(creature);
        }
        Slot2Type = creature.getType();
      //  creature2 = creature.getType2();
    }

    public  void addSlot3(Creature creature, int number){           // Adds selected number of creatures in Slot3 and also changes slot3Type
        for(int i = 0; i < number; i++) {
            Slot3.add(creature);
        }
        Slot3Type = creature.getType();
     //   creature3 = creature.getType2();
    }

    public int checkSlotType(String type){                 // Check if the type that is given matches the type of the given slot or if its empty also returns true



        if(type.equals(getSlot1Type()) || getSlot1Type().equals("")){
                return 1;
            }

        if(type.equals(getSlot2Type()) || getSlot2Type().equals("")){
                return 2;
            }

         if(type.equals(getSlot3Type()) || getSlot3Type().equals("")) {
             return 3;
         }


         return 0;


    }

    public boolean checkSlotEmpty(int slotNumber){

        switch (slotNumber){

            case 1: if(getSlot1numbers() <= 0){
                return true;
            }
                return false;
            case 2: if(getSlot2numbers() <= 0){
                return true;
            }
                return false;
            case 3: if(getSlot3numbers() <= 0){
                return true;
            }
                return false;
            default:
                return false;

        }


    }

    public int getSlot1numbers() {
        return Slot1.size();
    }

    public int getSlot2numbers() {
        return Slot2.size();
    }

    public int getSlot3numbers() {
        return Slot3.size();
    }

    public void setSlot1(int damage) {

        int dead = damage/Slot1.get(0).getHealth();
        int dead_new = 0;
        String monster = Slot1.get(0).getType();

        while(!Slot1.isEmpty() && dead > 0){
            Slot1.remove(Slot1.size()-1);
            dead--;
            dead_new++;
        }

        System.out.println(dead_new + " " + monster + " dead!");
    }

    public void setSlot2(int damage) {

        int dead = damage/Slot2.get(0).getHealth();
        int dead_new = 0;
        String monster = Slot2.get(0).getType();

        while(!Slot2.isEmpty() && dead > 0){
            Slot2.remove(Slot2.size()-1);
            dead--;
            dead_new++;
        }

        System.out.println(dead_new + " " + monster + " dead!");
    }

    public void setSlot3(int damage) {

        int dead = damage/Slot3.get(0).getHealth();
        int dead_new = 0;
        String monster = Slot3.get(0).getType();

        while(!Slot3.isEmpty() && dead > 0){
            Slot3.remove(Slot3.size()-1);
            dead--;
            dead_new++;
        }

        System.out.println(dead_new + " " + monster + " dead!");
    }

    public void showWholeArmy(){                                                                // Prints the current army for developing reasons :)
        System.out.println("You have " + getSlot1numbers() + " of " + getSlot1Type());
        System.out.println("You have " + getSlot2numbers() + " of " + getSlot2Type());
        System.out.println("You have " + getSlot3numbers() + " of " + getSlot3Type());
    }

    public boolean checkDefeated(){                                                           // Check if the army is defeated
        if(getSlot1numbers() <= 0 && getSlot2numbers() <=0 && getSlot3numbers() <= 0) {
            return true;
        }

        return false;
    }

    public int inflictDamage(int slotNumber){                     // Calculates the damage of the given slot of the army and returns it

        if(slotNumber == 1){

            int damage = Slot1.get(0).getDamage()*getSlot1numbers();
            System.out.print(getSlot1numbers() + " ");
            System.out.printf("%s inflicts ", getSlot1Type());
            System.out.println(damage + " damage!");

            return damage;
        }

        if(slotNumber == 2){

            int damage = Slot2.get(0).getDamage()*getSlot2numbers();
            System.out.print(getSlot2numbers() + " ");
            System.out.printf("%s inflicts ", getSlot2Type());
            System.out.println("damage: " + damage);

            return damage;
        }

        if(slotNumber == 3){

            int damage = Slot3.get(0).getDamage()*getSlot3numbers();
            System.out.print(getSlot3numbers() + " ");
            System.out.printf("%s inflicts ", getSlot3Type());
            System.out.println("damage: " + damage);

            return damage;

        }

        return 0;
    }

    public void addCreature(int number){

        switch (number){

            case 1:
                Slot1.add(Slot1.get(0).getType2());
                return;
            case 2:
                Slot2.add(Slot2.get(0).getType2());
            case 3:
                Slot3.add(Slot3.get(0).getType2());

        }

    }


}
