package HeroesTelerik.MainHero;


import HeroesTelerik.Army;
import HeroesTelerik.Coordinate;
import HeroesTelerik.Items.Item;
import HeroesTelerik.Map;


import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class Hero {
    private static final int INITIAL_GOLD = 500;
    private static final int INITIAL_LEVEL = 1;
    private static final int BASE_ATTACK = 5;
    private static final int BASE_DEFENCE = 5;
    private static final int INITIAL_X_COORDINATE = 1;
    private static final int INITIAL_Y_COORDINATE = 1;


    private Coordinate coordinate;
    private int level;
    private String name;
    private HeroClass heroClass;
    private int attack;
    private int defence;
    private List<Item> items;
    public Army army;
    private int gold;

    public Hero(String name) {
        this.name = name;
        this.coordinate = new Coordinate(INITIAL_X_COORDINATE, INITIAL_Y_COORDINATE);
        this.heroClass = HeroClass.randomHeroClass();
        this.level = INITIAL_LEVEL;
        this.attack = BASE_ATTACK;
        this.defence = BASE_DEFENCE;
        this.items = new ArrayList<Item>();
        this.army = new Army();
        this.gold = INITIAL_GOLD;

    }

    public void setArmy(Army army) {
        this.army = army;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Coordinate getCoordinate() {
        return coordinate;
    }

    public void setCoordinate(Coordinate coordinate) {
        this.coordinate = coordinate;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getAtack() {
        return attack;
    }

    public void setAtack(int atack) {
        this.attack = atack;
    }

    public int getDefence() {
        return defence;
    }

    public void setDefence(int defence) {
        this.defence = defence;
    }

    public HeroClass getHeroClass() {
        return heroClass;
    }

    public int getGold() {
        return gold;
    }

    public void setGold(int gold) {
        this.gold = gold;
    }

    public void move(char A) {

            Map.turns++;

            if(A == 'w'){
                if(!checkCoordinate(getCoordinate().getX()-1, getCoordinate().getY())){
                    System.out.println("Invalid move!");
                    return;
                }
                coordinate.setX(coordinate.getX()-1);
            }
            if(A == 's'){
                if(!checkCoordinate(getCoordinate().getX()+1, getCoordinate().getY())){
                    System.out.println("Invalid move!");
                    return;
                }
                coordinate.setX(coordinate.getX()+1);
            }
            if(A == 'd'){
                if(!checkCoordinate(getCoordinate().getX(), getCoordinate().getY()+1)){
                    System.out.println("Invalid move!");
                    return;
                }
                coordinate.setY(coordinate.getY()+1);
            }
            if(A == 'a'){
                if(!checkCoordinate(getCoordinate().getX()-1, getCoordinate().getY()-1)){
                    System.out.println("Invalid move!");
                    return;
                }
                coordinate.setY(coordinate.getY()-1);

        }
    }

    public void getLoot(Item loot) {
        items.add(loot);
    }

    public void getStats() {
        System.out.println(toString());
    }

    public void levelUp() {
        setLevel(getLevel() + 1);
    }

    @Override
    public String toString() {
        return String.format("Hero name: %s, Level:%d, Attack Skill:%d, Defence Skill:%d,Gold amount:%d", getName(), getLevel(), getAtack(), getDefence(), getGold());
    }


    public boolean checkCoordinate(int x, int y){

        if(x >= Map.map.length || x < 0 || y >= Map.map[x].length || y < 0){
            return false;
        }

        if(Map.map[x][y] == '#' || Map.map[x][y] == '^'){
            return false;
        }

        return true;

    }



}
