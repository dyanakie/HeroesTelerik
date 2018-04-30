package HeroesTelerik.Creatures;

import java.util.Random;

public class Skeleton extends Easy {

    private int health;
    private int damage;
    private String type;
    private Creature creature;

    public Skeleton(){
        this.health = 50;
        this.damage = 10;
        this.type = "Skeleton";
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
        return ra.nextInt(this.damage-2)+this.damage+2;
    }
}
