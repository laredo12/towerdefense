package com.towerdefense;

import org.andengine.engine.camera.Camera;
import org.andengine.engine.options.EngineOptions;
import org.andengine.engine.options.ScreenOrientation;
import org.andengine.engine.options.resolutionpolicy.RatioResolutionPolicy;
import org.andengine.entity.modifier.AlphaModifier;
import org.andengine.entity.modifier.ColorModifier;
import org.andengine.entity.modifier.ScaleModifier;
import org.andengine.entity.particle.ParticleSystem;
import org.andengine.entity.particle.emitter.CircleOutlineParticleEmitter;
import org.andengine.entity.scene.IOnSceneTouchListener;
import org.andengine.entity.scene.Scene;
import org.andengine.entity.util.FPSLogger;
import org.andengine.input.touch.TouchEvent;
import org.andengine.opengl.texture.TextureOptions;
import org.andengine.opengl.texture.atlas.bitmap.BitmapTextureAtlas;
import org.andengine.opengl.texture.atlas.bitmap.BitmapTextureAtlasTextureRegionFactory;
import org.andengine.opengl.texture.region.ITextureRegion;
import org.andengine.ui.activity.LayoutGameActivity;

import android.opengl.GLES20;
import android.service.wallpaper.WallpaperService.Engine;
import android.widget.Toast;

public class Menu extends LayoutGameActivity {
    // ===========================================================
    // Constants
    // ===========================================================

    private static final int CAMERA_WIDTH = 720;
    private static final int CAMERA_HEIGHT = 480;

    // ===========================================================
    // Fields
    // ===========================================================

    private Camera mCamera;
    private BitmapTextureAtlas mBitmapTextureAtlas;
    private ITextureRegion mParticleTextureRegion;

    // ===========================================================
    // Constructors
    // ===========================================================

    // ===========================================================
    // Getter & Setter
    // ===========================================================

    // ===========================================================
    // Methods for/from SuperClass/Interfaces
    // ===========================================================

    @Override
    protected int getLayoutID() {
            return R.layout.menu;
    }

    @Override
    protected int getRenderSurfaceViewID() {
            return R.id.xmllayoutexample_rendersurfaceview;
    }

    @Override
    public Engine onLoadEngine() {
            Toast.makeText(this, "Touch the screen to move the particlesystem.", Toast.LENGTH_LONG).show();
            this.mCamera = new Camera(0, 0, CAMERA_WIDTH, CAMERA_HEIGHT);
            return new Engine(new EngineOptions(true, ScreenOrientation.LANDSCAPE, new RatioResolutionPolicy(CAMERA_WIDTH, CAMERA_HEIGHT), this.mCamera));
    }

    @Override
    public void onLoadResources() {
            this.mBitmapTextureAtlas = new BitmapTextureAtlas(32, 32, TextureOptions.BILINEAR_PREMULTIPLYALPHA);

            this.mParticleTextureRegion = BitmapTextureAtlasTextureRegionFactory.createFromAsset(this.mBitmapTextureAtlas, this, "gfx/particle_point.png", 0, 0);

            this.mEngine.getTextureManager().loadTexture(this.mBitmapTextureAtlas);
    }

    @Override
    public Scene onLoadScene() {
            this.mEngine.registerUpdateHandler(new FPSLogger());

            final Scene scene = new Scene();

            final CircleOutlineParticleEmitter particleEmitter = new CircleOutlineParticleEmitter(CAMERA_WIDTH * 0.5f, CAMERA_HEIGHT * 0.5f + 20, 80);
            final ParticleSystem particleSystem = new ParticleSystem(particleEmitter, 60, 60, 360, this.mParticleTextureRegion);

            scene.setOnSceneTouchListener(new IOnSceneTouchListener() {
                    @Override
                    public boolean onSceneTouchEvent(final Scene pScene, final TouchEvent pSceneTouchEvent) {
                            particleEmitter.setCenter(pSceneTouchEvent.getX(), pSceneTouchEvent.getY());
                            return true;
                    }
            });

            particleSystem.addParticleInitializer(new ColorInitializer(1, 0, 0));
            particleSystem.addParticleInitializer(new AlphaInitializer(0));
            particleSystem.setBlendFunction(GLES20.GL_SRC_ALPHA, GLES20.GL_ONE);
            particleSystem.addParticleInitializer(new VelocityInitializer(-2, 2, -20, -10));
            particleSystem.addParticleInitializer(new RotationInitializer(0.0f, 360.0f));

            particleSystem.addParticleModifier(new ScaleModifier(1.0f, 2.0f, 0, 5));
            particleSystem.addParticleModifier(new ColorModifier(1, 1, 0, 0.5f, 0, 0, 0, 3));
            particleSystem.addParticleModifier(new ColorModifier(1, 1, 0.5f, 1, 0, 1, 4, 6));
            particleSystem.addParticleModifier(new AlphaModifier(0, 1, 0, 1));
            particleSystem.addParticleModifier(new AlphaModifier(1, 0, 5, 6));
            particleSystem.addParticleModifier(new ExpireModifier(6, 6));

            scene.attachChild(particleSystem);

            return scene;
    }

    @Override
    public void onLoadComplete() {

    }

    // ===========================================================
    // Methods
    // ===========================================================

    // ===========================================================
    // Inner and Anonymous Classes
    // ===========================================================
}