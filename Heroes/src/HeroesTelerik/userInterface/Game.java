package HeroesTelerik.userInterface;

import java.awt.*;
/**
 * Created by Joro on 06/05/2018
 */
public class Game implements Runnable{
    private Display display;
    private Thread thread;
    private Graphics g;
    private ImageLoader imageLoader;
    private InputManager inputManager;
    private int width, height;
    private GameWindow window;
    private int x=20;

    public Game(){
        width = 1200;
        height = 800;
        imageLoader = new ImageLoader();
        inputManager = new InputManager();
    }

    //initial game state
    public void init(){
        display = new Display();
        display.getFrame().addKeyListener(inputManager);
        window = new GameWindow(this);
        LoadResources.load();

    }

    public void update(){
        inputManager.update();
        window.update();

    }
    public void draw(){
        g = display.getPanel().getGraphics();
        //clear screen
        g.clearRect(0,0,width,height);
        window.draw(g);

        g.dispose();
    }

    public void run() {
        init();
        while (true)
        {
            update();
            draw();
            try{
                Thread.sleep(150); //movement speed
            }catch(Exception e){}   //remove later!!!
        }
    }

    public void start(){
        thread = new Thread(this);
        thread.start();
    }
    public void stop(){
        //stop thread
    }

    public InputManager getInputManager() {
        return inputManager;
    }
}
