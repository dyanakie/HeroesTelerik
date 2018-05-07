package heroes.telerik.creatures;

public abstract class Easy extends Creature {

    private int health;
    private int damage;
    private String type;

    public Easy(){

        super();
        this.health = 50;
        this.damage = 10;

    }

    public abstract int getDamage();


    public abstract int getHealth();

    public abstract String getType();
}
