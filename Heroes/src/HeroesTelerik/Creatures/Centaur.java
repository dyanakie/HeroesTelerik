package HeroesTelerik.Creatures;

public class Centaur extends Easy {

    private int health;
    private int damage;
    private String type;

    public Centaur(){
        super();
        this.type = "Centaur";
    }

    @Override
    public int getDamage() {
        return damage;
    }

    @Override
    public int getHealth() {
        return health;
    }

    public String getType(){
        return type;}
}
