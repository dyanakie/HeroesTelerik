package HeroesTelerik.Creatures;

import java.util.Random;

public class Centaur extends Creature {

    private int health;
    private int damage;
    private String type;
    private Creature creature;

    public Centaur(){
        this.health = 50;
        this.damage = 10;
        this.type = "Centaur";
    }

    @Override
    public int getDamage() {
        Random ra = new Random();
        return ra.nextInt(this.damage-2)+this.damage+2;
    }

    @Override
    public int getHealth() {
        return health;
    }

    public String getType(){
        return type;}

    @Override
    public Creature getType2() {
        return creature;
    }
}
