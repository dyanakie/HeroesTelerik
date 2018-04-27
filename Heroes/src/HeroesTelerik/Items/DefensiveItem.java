package HeroesTelerik.Items;

/**
 * Created by Joro on 27/04/2018
 */
public abstract class DefensiveItem extends Item {
    int defense;

    public int getDefense() {
        return defense;
    }
    public void setDefense(int defense) {
        this.defense = defense;
    }

}
