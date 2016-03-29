package com.valeska.flappyzombiecat;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.valeska.screens.GameScreen;

public class FZCGame extends Game {

	@Override
	public void create() {
		Gdx.app.log("FZCGame", "created");	
		setScreen(new GameScreen());
	}

}
