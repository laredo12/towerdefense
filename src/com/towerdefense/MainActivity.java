package com.towerdefense;

import org.andengine.engine.camera.Camera;
import org.andengine.engine.options.EngineOptions;
import org.andengine.engine.options.ScreenOrientation;
import org.andengine.engine.options.resolutionpolicy.RatioResolutionPolicy;
import org.andengine.entity.scene.Scene;
import org.andengine.entity.scene.background.Background;
import org.andengine.ui.activity.BaseGameActivity;
import org.andengine.util.color.Color;

public class MainActivity extends BaseGameActivity {
	final static int HEIGHT = 480;
	final static int WIDTH = 800;
	Camera camera = new Camera(0, 0, HEIGHT, WIDTH);

	@Override
	public EngineOptions onCreateEngineOptions() {
		// TODO Auto-generated method stub

		EngineOptions options = new EngineOptions(true,
				ScreenOrientation.LANDSCAPE_FIXED, new RatioResolutionPolicy(
						WIDTH, HEIGHT), camera);
		return options;
	}

	@Override
	public void onCreateResources(OnCreateResourcesCallback arg0)
			throws Exception {
		// TODO Auto-generated method stub
		arg0.onCreateResourcesFinished();
	}

	@Override
	public void onCreateScene(OnCreateSceneCallback arg0) throws Exception {
		// TODO Auto-generated method stub
		Scene scene = new Scene();
		scene.setBackground(new Background(0, 255, 0));
		arg0.onCreateSceneFinished(scene);
	}

	@Override
	public void onPopulateScene(Scene arg0, OnPopulateSceneCallback arg1)
			throws Exception {
		// TODO Auto-generated method stub

	}
}
