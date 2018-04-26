package HeroesTelerik.Creatures;

public class Vampire extends  Medium{

    private int health;
    private int damage;
    private String type;

    public Vampire(){
        this.health = 100;
        this.damage = 20;
        this.type = "Vampire";
    }

    public String getType(){
        return type;
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
