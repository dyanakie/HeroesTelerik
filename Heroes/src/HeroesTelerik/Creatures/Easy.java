package HeroesTelerik.Creatures;

public abstract class Easy extends Creature {

    int health;
    int damage;
    String type;

    public Easy(){

        super();
        this.health = 50;
        this.damage = 10;

    }

    public int getDamage() {
        return damage;
    }

    public int getHealth() {
        return health;
    }

    public String getType(){return type;}
}
