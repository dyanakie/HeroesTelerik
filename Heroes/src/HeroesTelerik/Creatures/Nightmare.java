package HeroesTelerik.Creatures;

import java.util.Random;

public class Nightmare extends Creature {

    private int health;
    private int damage;
    private String type;

    public Nightmare(){
        this.health = 250;
        this.damage = 45;
        this.type = "Nightmare";
    }
    @Override
    public String getType() {
        return type;
    }

    @Override
    public Creature getType2() {
        return null;
    }

    @Override
    public int getHealth() {
        return health;
    }

    @Override
    public int getDamage() {
        Random ra = new Random();
        return ra.nextInt(this.damage-10)+this.damage+10;
    }
}
