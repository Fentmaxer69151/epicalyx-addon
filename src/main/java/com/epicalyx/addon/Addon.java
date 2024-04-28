package com.epicalyx.addon;

import com.epicalyx.addon.hud.Hudepicalyx;
import com.epicalyx.addon.modules.EpicalyxScaffold;
import com.epicalyx.addon.modules.Moduleepicalyx;
import com.epicalyx.addon.modules.Combat;
import com.mojang.logging.LogUtils;
import meteordevelopment.meteorclient.addons.MeteorAddon;
import meteordevelopment.meteorclient.systems.hud.Hud;
import meteordevelopment.meteorclient.systems.hud.HudGroup;
import meteordevelopment.meteorclient.systems.modules.Category;
import meteordevelopment.meteorclient.systems.modules.Modules;
import org.slf4j.Logger;

public class Addon extends MeteorAddon {
    public static final Logger LOG = LogUtils.getLogger();
    public static final Category CATEGORY = new Category("Epicalyx");
    public static final HudGroup HUD_GROUP = new HudGroup("Epicalyx");

    @Override
    public void onInitialize() {
        LOG.info("Initializing Epicalyx Addon");

        // Modules
        Modules.get().add(new Moduleepicalyx());
        Modules.get().add(new Combat());
        Modules.get().add(new EpicalyxScaffold());


        // Commands


        // HUD
        Hud.get().register(Hudepicalyx.INFO);
    }

    @Override
    public void onRegisterCategories() {
        Modules.registerCategory(CATEGORY);
    }

    @Override
    public String getPackage() {
        return "com.epicalyx.addon";
    }
}
