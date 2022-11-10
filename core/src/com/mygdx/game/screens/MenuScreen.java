package com.mygdx.game.screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.scenes.scene2d.ui.Image;
import com.badlogic.gdx.scenes.scene2d.utils.ChangeListener;
import com.mygdx.game.MyGdxGame;
import com.mygdx.game.core.screens.BaseScreen;
import com.mygdx.game.entities.CustomButton;
import com.mygdx.game.helpers.CustomButtonSyles;
import com.mygdx.game.entities.CustomImage;
import com.mygdx.game.helpers.AssetsManager;

public class MenuScreen extends BaseScreen {

    private CustomButton btnPlay;
    private CustomButton btnCredits;
    private CustomButton btnGameOver;
    private Image imgLogo;

    @Override
    protected void init() {
        requiredProcessor = true;
        btnPlay = new CustomButton("PLAY", CustomButtonSyles.ACCENT,new Vector2(40,140),new Vector2(200,80),new ChangeListener() {
            @Override
            public void changed(ChangeEvent event, Actor actor) {
                MyGdxGame.instance.setScreen(new GameScreen());
            }
        });
        btnCredits = new CustomButton("Credits",CustomButtonSyles.BASIC,new Vector2(40,50),new Vector2(200,80),new ChangeListener() {
            @Override
            public void changed(ChangeEvent event, Actor actor) {
                MyGdxGame.instance.setScreen(new CreditsScreen());
            }
        });
        btnGameOver = new CustomButton("[Game Over]",CustomButtonSyles.DANGER,new Vector2(40,10),new Vector2(200,80),new ChangeListener() {
            @Override
            public void changed(ChangeEvent event, Actor actor) {
                MyGdxGame.instance.setScreen(new GameOverScreen());
            }
        });
        imgLogo = new CustomImage(AssetsManager.getAssetManager().get("logo.png", Texture.class),new Vector2());
        imgLogo.setPosition(Gdx.graphics.getWidth()/2-imgLogo.getWidth()/2,Gdx.graphics.getHeight()/2-imgLogo.getHeight()/2);
        addActor(imgLogo);
        addActor(btnCredits);
        addActor(btnPlay);
        addActor(btnGameOver);
    }

    @Override
    protected void draw(float delta) {

    }
}
