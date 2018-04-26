package HeroesTelerik.Creatures;

public class Griffon extends Medium {

    private int health;
    private int damage;
    private String type;

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
}
