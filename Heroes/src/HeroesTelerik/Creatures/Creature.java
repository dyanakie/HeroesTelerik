package HeroesTelerik.Creatures;

public abstract class Creature {

    private int health;
    private int damage;
    private String type;
    private Creature type2;

    public Creature(){

    }

    public abstract String getType();

   public abstract int getHealth();

   public abstract Creature getType2();


   public abstract int getDamage();
}
