package com.valeska.flappyzombiecat.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.valeska.flappyzombiecat.FZCGame;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
        config.title = "Flappy Zombie Cat";
        config.width = 272;
        config.height = 408;
		new LwjglApplication(new FZCGame(), config);
	}
}
