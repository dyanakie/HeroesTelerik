package heroes.telerik.creatures;

public abstract class Hard extends Creature{

    private int health;
    private int damage;
    private String type;

    public Hard(){
        this.health = 250;
        this.damage = 45;
    }

    public abstract int getDamage();

    public abstract int getHealth();
}
