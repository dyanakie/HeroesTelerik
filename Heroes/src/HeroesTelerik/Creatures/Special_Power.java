package HeroesTelerik.Creatures;

public class Special_Power {

    private String name;
    private Specials special;

    public Special_Power(String name, Specials special){

        setName(name);
        setSpecial(special);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setSpecial(Specials special) {
        this.special = special;
    }

    public Specials getSpecial() {
        return special;
    }
}
