package heroes.telerik.creatures;

import java.util.Random;

public class Nightmare extends Hard implements Powerable {

    private int health;
    private int damage;
    private String type;
    private Creature creature;
    private Special_Power special_power;

    public Nightmare(){
        this.health = 250;
        this.damage = 45;
        this.type = "Nightmare";
        special_power = new Special_Power("Half Damage", Specials.HALF_DAMAGE_TAKEN);
    }
    @Override
    public String getType() {
        return type;
    }

    @Override
    public int getHealth() {
        return health;
    }

    @Override
    public Creature getType2() {
        return creature;
    }

    @Override
    public int getDamage() {
        Random ra = new Random();
        return ra.nextInt(this.damage-10)+this.damage+10;
    }

    @Override
    public Special_Power getPower() {
        return special_power;
    }
}
