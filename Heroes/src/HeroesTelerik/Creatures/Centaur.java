package HeroesTelerik.Creatures;

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
        return damage;
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
