package HeroesTelerik.Items;

import java.awt.*;
import java.util.Random;

public abstract class Item {
    private final int nameLength = 20;
    private String itemName;
    private int price;
    private int itemId;
    private double weight;

    public Item(){
        setItemId();
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        if(itemName.length()<=nameLength) {
            this.itemName = itemName;
        }
        else{
            System.out.println("Item Name is too long");
        }
    }

    public int getItemId() {
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

    //Uses mouse position to generate random item id
    public final int generateId()
    {
        double x = MouseInfo.getPointerInfo().getLocation().getX();
        Random rnd = new Random((int)x);
        return  rnd.nextInt(10000000)+20000000;
    }
}
