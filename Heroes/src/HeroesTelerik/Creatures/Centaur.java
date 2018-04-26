package HeroesTelerik.Creatures;

public class Centaur extends Easy {

    private int health;
    private int damage;

    public Centaur(){
        super();
    }

    @Override
    public int getDamage() {
        return damage;
    }

    @Override
    public int getHealth() {
        return health;
    }
}
