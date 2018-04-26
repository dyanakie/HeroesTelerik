package HeroesTelerik.Creatures;

public class Skeleton extends Easy {

    private int health;
    private int damage;
    private String type;

    public Skeleton(){
        this.health = 50;
        this.damage = 10;
        this.type = "Skeleton";
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
