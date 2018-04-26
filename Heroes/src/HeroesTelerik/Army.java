package HeroesTelerik;

import HeroesTelerik.Creatures.Creature;

import java.util.ArrayList;
import java.util.List;

public class Army {

    List<Creature> Slot1;
    String Slot1Type;
    List<Creature> Slot2;
    List<Creature> Slot3;

    public Army(){

        Slot1 = new ArrayList<Creature>();
        Slot1Type = "";

    }

    public String getSlot1Type() {
        return Slot1Type;
    }

    public  void addSlot1(Creature creature, int number){
        for(int i = 0; i < number;) {
            Slot1.add(creature);
        }
    }

    public boolean checkSlot1Type(String type){

        if(type.equals(getSlot1Type()) || getSlot1Type().equals("")){
            return true;
        }
        return false;
    }
}
