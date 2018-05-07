package HeroesTelerik.userInterface;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.IOException;

/**
 * Created by Joro on 06/05/2018
 * Loads an image
 */
public class ImageLoader {

    BufferedImage image;
    public BufferedImage loadImage(String path){
        try {
            image= ImageIO.read(getClass().getResource(path));
        }catch(IOException exp){System.out.println("No Image");}
        return image;
    }
}