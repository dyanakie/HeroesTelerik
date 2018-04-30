package HeroesTelerik.Creatures;

import java.util.Random;

public class Dragon extends Hard {

    private int health;
    private int damage;
    private String type;
    private Creature creature;

    public Dragon(){
        this.health = 250;
        this.damage = 45;
        this.type = "Dragon";
    }
    @Override
    public String getType() {
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
        return ra.nextInt(this.damage-10)+this.damage+10;
    }
}
