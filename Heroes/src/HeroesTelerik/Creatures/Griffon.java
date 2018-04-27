package HeroesTelerik.Creatures;

import java.util.Random;

public class Griffon extends Creature {

    private int health;
    private int damage;
    private String type;
    private Creature creature;

    public Griffon(){
        this.health = 100;
        this.damage = 20;
        this.type = "Griffon";

    }

    @Override
    public int getHealth() {
        return health;
    }

    @Override
    public int getDamage() {
        Random ra = new Random();
        return ra.nextInt(this.damage-5)+this.damage+5;
    }


    public String getType(){
        return type;
    }

    @Override
    public Creature getType2() {
        return creature;
    }
}
