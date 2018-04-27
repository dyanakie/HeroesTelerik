package HeroesTelerik.Items;

/**
 * Created by Joro on 27/04/2018
 */
public abstract class Potion extends Item{
    int health;
    int experience;

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }
}
