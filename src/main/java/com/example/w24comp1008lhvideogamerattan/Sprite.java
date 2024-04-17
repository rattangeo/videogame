package com.example.w24comp1008lhvideogamerattan;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;

public class Sprite {

    protected static final int GAMEHEIGHT=800;
    protected static final int GAMEWIDTH=1000;
    private Image image;
    protected int posX, posY, imageWidth, imageHeight, speed;
    private boolean alive;

    public Sprite(Image image, int posX, int posY, int imageWidth, int imageHeight, int speed) {
        setImage(image);
        setPosX(posX);
        setPosY(posY);
        setImageWidth(imageWidth);
        setImageHeight(imageHeight);
        setSpeed(speed);
        alive = true;
    }

    public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
    }

    public int getPosX() {
        return posX;
    }

    public void setPosX(int posX) {
        this.posX = posX;
    }

    public int getPosY() {
        return posY;
    }

    public void setPosY(int posY) {
        this.posY = posY;
    }

    public int getImageWidth() {
        return imageWidth;
    }

    public void setImageWidth(int imageWidth) {
        this.imageWidth = imageWidth;
    }

    public int getImageHeight() {
        return imageHeight;
    }

    public void setImageHeight(int imageHeight) {
        this.imageHeight = imageHeight;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isAlive() {
        return alive;
    }

    public void setAlive(boolean alive) {
        this.alive = alive;
    }

    public void draw(GraphicsContext gc)
    {
        gc.drawImage(image,posX,posY,imageWidth,imageHeight);
    }

    public boolean collidesWith(Sprite sprite)
    {
        return ((posX + imageWidth/2 > sprite.posX) && (posX < sprite.posX+sprite.imageWidth/2) &&
                (posY +imageHeight/2 > sprite.posY) && (posY < sprite.posY+sprite.imageHeight/2));
    }

}
