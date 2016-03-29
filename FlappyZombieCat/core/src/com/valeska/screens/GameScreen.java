package com.valeska.screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.valeska.gameworld.GameRenderer;
import com.valeska.gameworld.GameWorld;

public class GameScreen implements Screen {
	
    private GameWorld world;
    private GameRenderer renderer;
	
	public GameScreen(){
		Gdx.app.log("GameScreen", "Attached");
        world = new GameWorld();
        renderer = new GameRenderer(world);
	}

	@Override
	public void show() {
		Gdx.app.log("GameScreen", "show called");	
	}

	@Override
	public void render(float delta) {
        world.update(delta);
        renderer.render();
	}

	@Override
	public void resize(int width, int height) {
		Gdx.app.log("GameScreen", "resizing");
	}

	@Override
	public void pause() {
		Gdx.app.log("GameScreen", "pause called");  
	}

	@Override
	public void resume() {
        Gdx.app.log("GameScreen", "resume called");  
	}

	@Override
	public void hide() {
	       Gdx.app.log("GameScreen", "hide called");  
	}

	@Override
	public void dispose() {
		// Leave blank
	}

}
