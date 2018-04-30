package HeroesTelerik.Creatures;

import java.util.Random;

public class Vampire extends  Medium{

    private int health;
    private int damage;
    private String type;
    private Creature creature;

    public Vampire(){
        this.health = 100;
        this.damage = 20;
        this.type = "Vampire";
    }

    public String getType(){
        return type;
    }

    @Override
    public int getHealth() {
        return health;
    }

    @Override
    public Creature getType2() {
        return creature;
    }

    @Override
    public int getDamage() {
        Random ra = new Random();
        return ra.nextInt(this.damage-5)+this.damage+5;
    }
}
