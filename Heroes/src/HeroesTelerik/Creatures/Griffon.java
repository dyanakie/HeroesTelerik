package HeroesTelerik.Creatures;

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
        return damage;
    }


    public String getType(){
        return type;
    }

    @Override
    public Creature getType2() {
        return creature;
    }
}
