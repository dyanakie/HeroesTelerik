package HeroesTelerik.Items;

/**
 * Created by Joro on 27/04/2018
 */
public abstract class OffensiveItem extends Item implements Wearable{
    int attack;
    boolean equipped;

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    @Override
    public boolean isEquipped(){
        return equipped;
    }
}
