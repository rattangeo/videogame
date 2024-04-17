package com.example.w24comp1008lhvideogamerattan;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;

public class Missile extends Sprite {

    /**
     * Only the initial X,Y position of a Missile is required to instantiate a Missile
     * @param posX
     * @param posY
     */
    public Missile(int posX, int posY) {
        super(new Image(Main.class.getResourceAsStream("images/missile.png")), posX, posY,
                40, 20, 7);
    }

    private void moveRight()
    {
        posX += speed;

        //if the missile shoots off the screen, it is no longer part of the game, so it is not alive
        if (posX>GAMEWIDTH)
            setAlive(false);
    }

    public void draw(GraphicsContext gc)
    {
        super.draw(gc);
        moveRight();
    }

}
