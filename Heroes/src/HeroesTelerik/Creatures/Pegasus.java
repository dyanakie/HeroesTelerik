package HeroesTelerik.Creatures;

import java.util.Random;

public class Pegasus extends Medium {

    private int health;
    private int damage;
    private String type;
    private Creature creature;

    public Pegasus(){
        this.health = 100;
        this.damage = 20;
        this.type = "Pegasus";
    }

    public String getType(){
        return type;
    }

    public int getHealth() {
        return health;
    }

    @Override
    public Creature getType2() {
        return creature;
    }

    public int getDamage() {
        Random ra = new Random();
        return ra.nextInt(this.damage-5)+this.damage+5;
    }

}
