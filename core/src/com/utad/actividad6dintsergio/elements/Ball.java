package com.utad.actividad6dintsergio.elements;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

/**
 * Created by sergio on 27/2/18.
 */

public class Ball {
    Texture image;

    public Ball(){
        image= new Texture("ball.png");
    }

    public void paint(SpriteBatch batch, float x, float y){
        batch.draw(image,x,y);
    }
}
