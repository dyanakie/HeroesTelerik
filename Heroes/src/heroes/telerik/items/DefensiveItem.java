package heroes.telerik.items;

/**
 * Created by Joro on 27/04/2018
 */
public abstract class DefensiveItem extends Item implements Wearable{
    int defense;
    boolean equipped;

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public void setEquipped(boolean equipped){
        this.equipped = equipped;
    }

    @Override
    public boolean isEquipped(){
        return equipped;
    }

}
