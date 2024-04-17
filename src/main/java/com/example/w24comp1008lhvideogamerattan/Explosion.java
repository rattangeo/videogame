package com.example.w24comp1008lhvideogamerattan;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;

public class Explosion extends Sprite{

    private final int REFRESH_RATE = 5;
    private int currentCount;

    private int explosionIndex;

    private int[] spriteStartX;

    /**
     *
     * @param posX
     * @param posY
     */
    public Explosion(int posX, int posY) {
        super(new Image(Explosion.class.getResourceAsStream("images/fullExplosion2.png")),
                   posX, posY, 200,200, 0);
        explosionIndex=0;
        spriteStartX = new int[]{0, 170, 330, 520, 710};
        currentCount = REFRESH_RATE;
    }

    public void draw(GraphicsContext gc)
    {
        //every 5th time this is called, advance through the starting x position to the next
        //frame of the explosion
        if (--currentCount < 0)
        {
            explosionIndex++;
            currentCount = REFRESH_RATE;
        }

        //check if the explosion is done exploding
        if (explosionIndex >= spriteStartX.length)
        {
            setAlive(false);
        }
        else
        {
            //sx, sy, sw, sh - these are the coordinates to use in cropping the image
            //posX, posY, imageWidth, imageHeight are the standard x,y coordinates we use to display a sprite
            gc.drawImage(this.getImage(),spriteStartX[explosionIndex],0,184,368,
                            posX,posY,imageWidth,imageHeight );
        }
    }
}
