package HeroesTelerik.Items;
import java.util.Random;

public abstract class Item {
    private final int LENGTH = 20;
    private String itemName;
    private int price;
    private long itemId;
    private double weight;

    public Item(){
        setItemId();
    }

    public String getItemName() {
        return itemName;
    }
    public void setItemName(String itemName) {
        if(itemName.length()<=LENGTH) {
            this.itemName = itemName;
        }
        else{
            System.out.println("ItemName is too long");
        }
    }
    public long getItemId() {
        return itemId;
    }
    private void setItemId() {
        this.itemId = generateId();
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public double getWeight() {
        return weight;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }

    public final long generateId()
    {
        Random rnd = new Random(System.currentTimeMillis());
        return  rnd.nextLong();
    }

    //public abstract void addBonus(Hero hero);

}
