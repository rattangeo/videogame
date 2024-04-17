package com.example.w24comp1008lhvideogamerattan;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;

public class Alien extends Sprite {
    public Alien(int posX, int posY) {
        super(new Image(Main.class.getResourceAsStream("images/alien.png")), posX, posY,
                60, 60, 3);
    }

    private void moveLeft()
    {
        posX -= speed;

        //if the alien gets to the far left side of the screen, display them on the right side
        if (posX<0)
            posX=GAMEWIDTH;
    }

    public void draw(GraphicsContext gc)
    {
        super.draw(gc);
        moveLeft();
    }
}
