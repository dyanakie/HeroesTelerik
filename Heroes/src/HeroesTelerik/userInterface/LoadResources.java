package HeroesTelerik.userInterface;

import java.awt.image.BufferedImage;
import java.util.ArrayList;

/**
 * Created by Joro on 06/05/2018
 * Initialises all images
 */
public class LoadResources {
   private static ArrayList<BufferedImage> images = new ArrayList<>();

    public static void load(){
        //load spritesheet
        images.add(new ImageLoader().loadImage("/player.png"));
        images.add(new ImageLoader().loadImage("/background.png"));
    }

    public static BufferedImage getImage(int n){
        return images.get(n);
    }

}
