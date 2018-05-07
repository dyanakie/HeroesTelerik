package heroes.telerik.creatures;

import java.util.Random;

public class Gremlin extends Easy {

    private int health;
    private int damage;
    private String type;
    private Creature creature;

    public Gremlin(){
        this.damage = 10;
        this.health = 50;
        this.type = "Gremlin";

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


    public String getType(){
        return type;
    }

}
