package com.utad.actividad6dintsergio;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.utad.actividad6dintsergio.game.Game;

public class GameMain extends ApplicationAdapter {
	SpriteBatch batch;
	Texture img;
	int x=0;
	int y=0;
	Game game;

	int I_ESTADO_MENU=1;
	int iEstadoJuego=0;

	// Elementos que vamos a utilizar para el pintado
	@Override
	public void create () {
		batch = new SpriteBatch();
		img = new Texture("badlogic.jpg");
		game = new Game();
	}

	// Bucle donde se pintan los elementos de forma constante
	@Override
	public void render () {

		// Métodos de limpiado de la pantalla
		Gdx.gl.glClearColor(1, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		// Comienza el pintado y su preparación a través de Batch
		batch.begin();
		// Leemos coordenadas Acceleration
		float accelX = Gdx.input.getAccelerometerX();
		float accelY = Gdx.input.getAccelerometerY();
		Gdx.app.log("GameMain", "--> "+accelY);
		game.paint(batch,x,y);
		batch.end();
		// Sensores según coordenada
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

	// Método por el que se sabe cuando se cierra la app y para limpiar los elementos en memoria
	@Override
	public void dispose () {
		batch.dispose();
		img.dispose();
	}
}
