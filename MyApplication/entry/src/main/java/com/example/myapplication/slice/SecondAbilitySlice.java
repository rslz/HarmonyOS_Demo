package com.example.myapplication.slice;

import ohos.aafwk.ability.Ability;
import ohos.aafwk.ability.AbilitySlice;
import ohos.aafwk.content.Intent;
import ohos.agp.colors.RgbColor;
import ohos.agp.components.DependentLayout;
import ohos.agp.components.Text;
import ohos.agp.components.element.ShapeElement;
import ohos.agp.utils.Color;


public class SecondAbilitySlice extends AbilitySlice{

    @Override
    public void onStart(Intent intent) {
        super.onStart(intent);

        DependentLayout myLayout = new DependentLayout(this);

        myLayout.setWidth(DependentLayout.LayoutConfig.MATCH_PARENT);
        myLayout.setHeight(DependentLayout.LayoutConfig.MATCH_PARENT);

        ShapeElement background = new ShapeElement();
        background.setRgbColor(new RgbColor(255,255,255));

        Text text = new Text(this);
        text.setText("Hi there");
        text.setWidth(DependentLayout.LayoutConfig.MATCH_PARENT);
        text.setTextSize(50, Text.TextSizeType.FP);
        text.setTextColor(Color.BLACK);

        DependentLayout.LayoutConfig textConfig = new DependentLayout.LayoutConfig(DependentLayout.LayoutConfig.MATCH_CONTENT,DependentLayout.LayoutConfig.MATCH_CONTENT);
        textConfig.addRule(DependentLayout.LayoutConfig.CENTER_IN_PARENT);
        text.setLayoutConfig(textConfig);
        myLayout.addComponent(text);
        super.setUIContent(myLayout);
    }
}