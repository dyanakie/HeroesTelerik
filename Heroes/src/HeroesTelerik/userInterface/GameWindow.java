package HeroesTelerik.userInterface;

import HeroesTelerik.Coordinate;

import java.awt.*;

/**
 * Created by Joro on 07/05/2018
 */
public class GameWindow {
    private Player player;
    private Game game;

   public GameWindow(Game game){
       player = new Player(game,"Cartman", new Coordinate(100,100));
       this.game = game;
    }

    public void update(){
        player.update();
    }

    public void draw(Graphics g){
        player.draw(g);
    }

}
