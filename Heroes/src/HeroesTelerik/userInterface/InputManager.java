package HeroesTelerik.userInterface;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 * Created by Joro on 07/05/2018
 */
public class InputManager implements KeyListener {
    private int keyCode;
    boolean keys[];
    protected boolean up,down,left,right;
    public InputManager(){
        keys = new boolean[256];
    }

    public void update(){
        down = keys[KeyEvent.VK_DOWN];
        up = keys[KeyEvent.VK_UP];
        left = keys[KeyEvent.VK_LEFT];
        right = keys[KeyEvent.VK_RIGHT];
    }

    @Override
    public void keyPressed(KeyEvent event) {
        keyCode = event.getKeyCode();
        keys[keyCode] = true;

    }
    @Override
    public void keyReleased(KeyEvent event) {
        keyCode = event.getKeyCode();
        keys[keyCode] = false;
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

}
