package HeroesTelerik.Creatures;

public abstract class Medium extends  Creature {

    private int health;
    private int damage;
    private String type;

    public Medium(){
        this.health = 100;
        this.damage = 20;
    }

    public abstract int getDamage();

    public abstract int getHealth();

}
