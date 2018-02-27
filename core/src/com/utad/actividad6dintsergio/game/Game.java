package com.utad.actividad6dintsergio.game;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;

/**
 * Created by sergio on 27/2/18.
 */

public class Game {
    Ball ball;

    public Game(){
        ball = new Ball();
    }

    public void paint(SpriteBatch batch, float x, float y){
        ball.paint(batch,x,y);
    }
}
