package com.mygdx.game.entities;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.scenes.scene2d.ui.TextButton;
import com.badlogic.gdx.scenes.scene2d.utils.ChangeListener;
import com.mygdx.game.helpers.CustomButtonSyles;

public class CustomButton extends TextButton {
    public CustomButton(String text, TextButtonStyle style, Vector2 position, Vector2 sizes, ChangeListener listener) {
        super(text, style);
        /*setPosition(40,140);
        setSize(200,80);*/
        setPosition(position.x,position.y);
        setSize(sizes.x,sizes.y);
        addCaptureListener(listener);
    }

    public CustomButton(String text, CustomButtonSyles styleName, Vector2 position, Vector2 sizes, ChangeListener listener) {
        super(text, styleByName(styleName));
        /*setPosition(40,140);
        setSize(200,80);*/
        setPosition(position.x,position.y);
        setSize(sizes.x,sizes.y);
        addCaptureListener(listener);
    }

    private static TextButtonStyle styleByName(CustomButtonSyles styleName){
        TextButton.TextButtonStyle style = new TextButton.TextButtonStyle();
        style.font = new BitmapFont();
        switch (styleName) {
            case ACCENT:
                style.fontColor = Color.YELLOW;
                style.overFontColor = Color.CHARTREUSE;
                style.downFontColor = Color.GREEN;
                break;
            case DANGER:
                style.fontColor = Color.SCARLET;
                style.overFontColor = Color.RED;
                style.downFontColor = Color.MAROON;
                break;
            default:
                style.fontColor = Color.WHITE;
                style.overFontColor = Color.SKY;
                style.downFontColor = Color.CYAN;
                break;
        }
        return style;
    }
}
