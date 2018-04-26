package HeroesTelerik.Creatures;

public abstract class Medium extends  Creature {

    private int health;
    private int damage;

    public Medium(){
        this.health = 100;
        this.damage = 20;
    }
}
