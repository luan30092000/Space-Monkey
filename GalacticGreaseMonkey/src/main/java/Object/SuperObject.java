package Object;

import Game.GamePanel;

import java.awt.*;
import java.awt.image.BufferedImage;

//Parent class of all object class
public class SuperObject {
    public BufferedImage image;
    public String name;
    public boolean collision = false;
    public int worldX, worldY;

    public void draw(Graphics2D g2, GamePanel gp) {
        g2.drawImage(image, worldX, worldY, gp.tileSize, gp.tileSize, null);
    }
}

