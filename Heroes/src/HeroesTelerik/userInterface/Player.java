package HeroesTelerik.userInterface;

import HeroesTelerik.Coordinate;
import HeroesTelerik.MainHero.Hero;
import java.awt.*;

/**
 * Created by Joro on 07/05/2018
 */
public class Player extends Hero{
    protected int x;
    protected int y;
    private int speed = 10;
    private Game game;

    public Player(Game game,String string, Coordinate position){
        this.setName(string);
        x = position.getX();
        y = position.getY();
        this.game = game;
    }

    public void update(){
        if(game.getInputManager().down){
            y+=speed;
        }
        if(game.getInputManager().up){
            y-=speed;
        }
        if(game.getInputManager().left){
            x-=speed;
        }
        if(game.getInputManager().right){
            x+=speed;
        }
    }

    public void draw(Graphics g){
        g.drawImage(LoadResources.getImage(0),x,y,null);
    }

}
