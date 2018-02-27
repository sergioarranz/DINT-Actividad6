package com.utad.actividad6dintsergio;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.utad.actividad6dintsergio.elements.Game;

public class GameMain extends ApplicationAdapter {
	SpriteBatch batch;
	Texture img;
	int x=0;
	int y=0;
	Game game;

	@Override
	public void create () {
		batch = new SpriteBatch();
		img = new Texture("badlogic.jpg");
		game = new Game();
	}

	@Override
	public void render () {
		Gdx.gl.glClearColor(1, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		batch.begin();
		float accelX = Gdx.input.getAccelerometerX();
		float accelY = Gdx.input.getAccelerometerY();
		Gdx.app.log("GameMain", "--> "+accelY);
		game.paint(batch,x,y);
		batch.end();
		if(accelY>0){
			x++;
			x++;
			x++;
			x++;
		}
		if(accelY<0) {
			x--;
			x--;
			x--;
			x--;
		}
		if(accelX>0){
			y--;
			y--;
			y--;
			y--;
		}
		if(accelX<0){
			y++;
			y++;
			y++;
			y++;
		}
	}

	@Override
	public void dispose () {
		batch.dispose();
		img.dispose();
	}
}
