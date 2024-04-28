package com.epicalyx.addon.hud;

import com.epicalyx.addon.Addon;
import meteordevelopment.meteorclient.systems.hud.HudElement;
import meteordevelopment.meteorclient.systems.hud.HudElementInfo;
import meteordevelopment.meteorclient.systems.hud.HudRenderer;
import meteordevelopment.meteorclient.utils.render.color.Color;

public class Hudepicalyx extends HudElement {
    public static final HudElementInfo<Hudepicalyx> INFO = new HudElementInfo<>(Addon.HUD_GROUP, "epicalyx", "Show Epicalyx logo.", Hudepicalyx::new);

    public Hudepicalyx() {
        super(INFO);
    }

    @Override
    public void render(HudRenderer renderer) {
        setSize(renderer.textWidth("epicalyx logo", true), renderer.textHeight(true));

        renderer.text("Epicalyx", x, y, Color.WHITE, true);
    }
}