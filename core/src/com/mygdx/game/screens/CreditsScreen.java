package com.mygdx.game.screens;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.scenes.scene2d.ui.Label;
import com.badlogic.gdx.scenes.scene2d.utils.ChangeListener;
import com.mygdx.game.MyGdxGame;
import com.mygdx.game.core.screens.BaseScreen;
import com.mygdx.game.entities.CustomButton;
import com.mygdx.game.helpers.CustomButtonSyles;

public class CreditsScreen extends BaseScreen {

    private CustomButton btnBack;
    private Label lblCredits;

    @Override
    protected void init() {
        requiredProcessor = true;
        btnBack = new CustomButton("Back", CustomButtonSyles.BASIC,
                new Vector2(40,50),new Vector2(200,80),new ChangeListener() {
            @Override
            public void changed(ChangeEvent event, Actor actor) {
                MyGdxGame.instance.setScreen(new MenuScreen());
            }
        });
        Label.LabelStyle styleLbl = new Label.LabelStyle();
        styleLbl.fontColor = Color.SKY;
        styleLbl.font = new BitmapFont();
        lblCredits = new Label("UPC GAA!",styleLbl);
        lblCredits.setPosition(20,100);
        addActor(lblCredits);
        addActor(btnBack);
    }

    @Override
    protected void draw(float delta) {

    }
}
