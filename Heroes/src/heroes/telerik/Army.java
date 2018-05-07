package heroes.telerik;


import heroes.telerik.creatures.*;

import java.util.ArrayList;
import java.util.List;

public class Army {

    private List<Creature> slotOne;                               // The army has 3 slots which can be of different Type of creatures
    private String slotOneType;
    private List<Creature> slotTwo;
    private String slotTwoType;
    private List<Creature> slotThree;
    private String slotThreeType;

    public Army(){

        slotOne = new ArrayList<>();
        slotTwo = new ArrayList<>();
        slotThree = new ArrayList<>();

    }

    public String getSlotOneType() {
        return slotOneType;
    }      // Check and returns slotOneType String

    public String getSlotTwoType() {
        return slotTwoType;
    }

    public String getSlotThreeType() {
        return slotThreeType;
    }

    public  void addSlot1(Creature creature, int number){         // Adds selected number of creatures in slotOne and also changes slot1Type
        for(int i = 0; i < number; i++) {
            slotOne.add(creature);
        }
        slotOneType = creature.getType();
    }

    public  void addSlot2(Creature creature, int number){         // Adds selected number of creatures in slotTwo and also changes slot2Type
        for(int i = 0; i < number; i++) {
            slotTwo.add(creature);
        }
        slotTwoType = creature.getType();
    }

    public  void addSlot3(Creature creature, int number){           // Adds selected number of creatures in slotThree and also changes slot3Type
        for(int i = 0; i < number; i++) {
            slotThree.add(creature);
        }
        slotThreeType = creature.getType();
    }

    public int checkSlotType(String type){                 // Check if the type that is given matches the type of the given slot or if its empty also returns true



        if(type.equals(getSlotOneType()) || getSlotOneType().equals("")){
                return 1;
            }

        if(type.equals(getSlotTwoType()) || getSlotTwoType().equals("")){
                return 2;
            }

         if(type.equals(getSlotThreeType()) || getSlotThreeType().equals("")) {
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
        return slotOne.size();
    }

    public int getSlot2numbers() {
        return slotTwo.size();
    }

    public int getSlot3numbers() {
        return slotThree.size();
    }

    public void setSlotOne(int damage) {

        if(slotOne.get(0) instanceof Powerable){
            damage = specialPowerChange(slotOne, damage, "defence");          // Checks if the creature has special powers and changes damage
        }

        int dead = damage/ slotOne.get(0).getHealth();
        int dead_new = 0;
        String monster = slotOne.get(0).getType();

        while(!slotOne.isEmpty() && dead > 0){
            slotOne.remove(slotOne.size()-1);
            dead--;
            dead_new++;
        }

        System.out.println(dead_new + " " + monster + " dead!");
    }

    public void setSlotTwo(int damage) {

        if(slotTwo.get(0) instanceof Powerable){
            damage = specialPowerChange(slotTwo, damage, "defence");          // Checks if the creature has special powers and changes damage
        }
        int dead = damage/ slotTwo.get(0).getHealth();
        int dead_new = 0;
        String monster = slotTwo.get(0).getType();

        while(!slotTwo.isEmpty() && dead > 0){
            slotTwo.remove(slotTwo.size()-1);
            dead--;
            dead_new++;
        }

        System.out.println(dead_new + " " + monster + " dead!");
    }

    public void setSlotThree(int damage) {

        if(slotThree.get(0) instanceof Powerable){

            damage = specialPowerChange(slotThree, damage, "defence");          // Checks if the creature has special powers and changes damage
        }
        int dead = damage/ slotThree.get(0).getHealth();
        int dead_new = 0;
        String monster = slotThree.get(0).getType();

        while(!slotThree.isEmpty() && dead > 0){
            slotThree.remove(slotThree.size()-1);
            dead--;
            dead_new++;
        }

        System.out.println(dead_new + " " + monster + " dead!");
    }


    public boolean checkDefeated(){                                                           // Check if the army is defeated
        if(getSlot1numbers() <= 0 && getSlot2numbers() <=0 && getSlot3numbers() <= 0) {
            return true;
        }

        return false;
    }

    public int inflictDamage(int slotNumber){                     // Calculates the damage of the given slot of the army and returns it

        if(slotNumber == 1){

            int damage = slotOne.get(0).getDamage()*getSlot1numbers();
            System.out.print(getSlot1numbers() + " ");
            System.out.printf("%s inflicts ", getSlotOneType());

            if(slotOne.get(0) instanceof Powerable){

                damage = specialPowerChange(slotOne, damage, "attack");          // Checks if the creature has special powers and changes damage
            }

            System.out.println(damage + " damage!");

            return damage;
        }

        if(slotNumber == 2){

            int damage = slotTwo.get(0).getDamage()*getSlot2numbers();
            System.out.print(getSlot2numbers() + " ");
            System.out.printf("%s inflicts ", getSlotTwoType());

            if(slotTwo.get(0) instanceof Powerable){                                          // Checks if the creature has special powers and changes damage

                damage = specialPowerChange(slotTwo, damage, "attack");
            }

            System.out.println("damage: " + damage);

            return damage;
        }

        if(slotNumber == 3){

            int damage = slotThree.get(0).getDamage()*getSlot3numbers();
            System.out.print(getSlot3numbers() + " ");

            if(slotThree.get(0) instanceof Powerable){                                    // Checks if the creature has special powers and changes damage

                damage = specialPowerChange(slotThree, damage, "attack");
            }

            System.out.printf("%s inflicts ", getSlotThreeType());
            System.out.println("damage: " + damage);

            return damage;

        }

        return 0;
    }


    public void addCreature(int number, String name){                         // adds creature to the target slot and checks if its first changes the type as well

        switch (number){

            case 1:
                if(slotOne.size() == 0){
                    addSlot1(checkNameCreature(name), 1);
                    return;
                }
                slotOne.add(slotOne.get(0).getType2());
                return;
            case 2:
                if(slotTwo.size() == 0){
                    addSlot2(checkNameCreature(name), 1);
                    return;
                }
                slotTwo.add(slotTwo.get(0).getType2());
                return;
            case 3:
                if(slotThree.size() == 0){
                    addSlot3(checkNameCreature(name), 1);
                    return;
                }
                slotThree.add(slotThree.get(0).getType2());

        }

    }

    private Creature checkNameCreature(String name){

        switch (name){
            case "Gremlin":
                return new Gremlin();
            case "Skeleton":
                return new Skeleton();
            case "Centaur":
                return new Centaur();
            case "Vampire":
                return new Vampire();
            case "Pegasus":
                return new Pegasus();
            case "Griffon":
                return new Griffon();
            case "Dragon":
                return new Dragon();
            case "Hydra":
                return new Hydra();
            case "Nightmare":
                return new Nightmare();

        }

        return new Dragon();

    }


    private int specialPowerChange(List<Creature> slot, int damage, String stance){                            // Changes the damage according to the power

        if(((Powerable) slot.get(0)).getPower().getName().equals("Double Damage") && stance.equals("attack")){
            damage *= 2;
            System.out.println("(DOUBLE DAMAGE!)");
            return damage;
        }
        if(((Powerable) slot.get(0)).getPower().getName().equals("Half Damage") && stance.equals("defence")){
            damage /= 2;
            System.out.println("(HALF DAMAGE TAKEN)");
            return damage;
        }

        return damage;

    }


}
