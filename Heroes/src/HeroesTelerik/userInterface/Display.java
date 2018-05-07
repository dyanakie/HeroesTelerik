package HeroesTelerik.userInterface;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Joro on 06/05/2018
 * Contains Frame and JPanel
 */
public class Display {
    JFrame frame;
    JPanel panel;
    int width = 1200;
    int height = 800;

    public Display(){
        frame = new JFrame();
        panel= new JPanel();
        frame.setSize(width,height);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocation(400,100);
        frame.setVisible(true);

        panel.setPreferredSize(new Dimension(width,height));
        panel.setMaximumSize(new Dimension(width,height));
        //panel.setFocusable(false);
        frame.add(panel);
        frame.pack();
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public JPanel getPanel() {
        return panel;
    }

    public JFrame getFrame() {
        return frame;
    }
}