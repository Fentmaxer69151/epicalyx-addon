package com.epicalyx.addon.modules;

import meteordevelopment.meteorclient.events.entity.player.ClipAtLedgeEvent;
import meteordevelopment.meteorclient.systems.modules.Categories;
import meteordevelopment.meteorclient.systems.modules.Module;
import meteordevelopment.orbit.EventHandler;
import net.minecraft.entity.player.PlayerEntity;

public class EpicalyxScaffold extends Module {
    public EpicalyxScaffold() {
        super(Categories.Movement, "epicalyx-scaffold", "Like scaffold but it sucks.");
    }

    @EventHandler
    private void onClipAtLedge(ClipAtLedgeEvent event) {
        if (!mc.player.isSneaking()) {
            event.setClip(true);
            float pitch = 82f;
            ((PlayerEntity)mc.player).setPitch(pitch);
        }
    }
}