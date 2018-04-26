package HeroesTelerik;

import HeroesTelerik.Creatures.Creature;
import HeroesTelerik.MainHero.Slot;

import java.util.ArrayList;
import java.util.List;

public class Army {

    List<Creature> Slot1;
    String Slot1Type;
    List<Creature> Slot2;
    String Slot2Type;
    List<Creature> Slot3;
    String Slot3Type;

    public Army(){

        Slot1 = new ArrayList<Creature>();
        Slot2 = new ArrayList<Creature>();
        Slot3 = new ArrayList<Creature>();
        Slot1Type = "";

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

    public  void addSlot1(Creature creature, int number){         // Adds selected number of creatures in Slot1 and also changes slot1Type
        for(int i = 0; i < number; i++) {
            Slot1.add(creature);
        }
        Slot1Type = creature.getType();
    }

    public  void addSlot2(Creature creature, int number){         // Adds selected number of creatures in Slot2 and also changes slot2Type
        for(int i = 0; i < number; i++) {
            Slot2.add(creature);
        }
        Slot2Type = creature.getType();
    }

    public  void addSlot3(Creature creature, int number){           // Adds selected number of creatures in Slot3 and also changes slot3Type
        for(int i = 0; i < number; i++) {
            Slot3.add(creature);
        }
        Slot3Type = creature.getType();
    }

    public boolean checkSlotType(String type, int slotNumber){                 // Check if the type that is given matches the type of the given slot or if its empty also returns true

        switch (slotNumber){

            case 1: if(type.equals(getSlot1Type()) || getSlot1Type().equals("")){
                return true;
            }
                return false;
            case 2: if(type.equals(getSlot2Type()) || getSlot2Type().equals("")){
                return true;
            }
                return false;
            case 3: if(type.equals(getSlot2Type()) || getSlot2Type().equals("")){
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

    public void showWholeArmy(){                                                                // Prints the current army for developing reasons :)
        System.out.println("You have " + getSlot1numbers() + " of " + getSlot1Type());
        System.out.println("You have " + getSlot2numbers() + " of " + getSlot2Type());
        System.out.println("You have " + getSlot3numbers() + " of " + getSlot3Type());
    }
}
