package HeroesTelerik.Creatures;

public class Pegasus extends Creature {

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

    @Override
    public Creature getType2() {
        return creature;
    }

    public int getHealth() {
        return health;
    }

    public int getDamage() {
        return damage;
    }
}
