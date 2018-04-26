package HeroesTelerik.Creatures;

public class Skeleton extends Creature {

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
    public Creature getType2() {
        return creature;
    }

    @Override
    public int getHealth() {
        return health;
    }

    @Override
    public int getDamage() {
        return damage;
    }
}
