package HeroesTelerik.Creatures;

public class Pegasus extends Medium {

    private int health;
    private int damage;
    private String type;

    public Pegasus(){
        this.health = 100;
        this.damage = 20;
        this.type = "Pegasus";
    }

    public String getType(){
        return type;
    }

    public int getHealth() {
        return health;
    }

    public int getDamage() {
        return damage;
    }
}
