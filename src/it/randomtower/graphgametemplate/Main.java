package it.randomtower.graphgametemplate;

import it.marteEngine.ME;
import it.marteEngine.ResourceManager;

import java.io.IOException;

import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Input;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.StateBasedGame;
import org.newdawn.slick.util.Log;

public class Main extends StateBasedGame {

	private static boolean ressourcesInited;

	public Main(String title) {
		super(title);
	}

	@Override
	public void initStatesList(GameContainer container) throws SlickException {
		initResources();
		// add worlds
		addState(new GameWorld(1, container));
	}

	public static void initResources() throws SlickException {
		if (ressourcesInited)
			return;
		try {
			ResourceManager.loadResources("data/resources.xml");
		} catch (IOException e) {
			Log.error("failed to load ressource file 'data/resources.xml': " + e.getMessage());
			throw new SlickException("Resource loading failed!");
		}

		ressourcesInited = true;
	}

	public static void main(String[] argv) {
		try {
			ME.keyToggleDebug = Input.KEY_0;
			AppGameContainer container = new AppGameContainer(new Main("Graph Game Template"));
			container.setDisplayMode(640, 640, false);
			container.setVSync(true);
			container.start();
		} catch (SlickException e) {
			e.printStackTrace();
		}
	}

}
