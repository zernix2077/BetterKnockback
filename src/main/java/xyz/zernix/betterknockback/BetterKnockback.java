package xyz.zernix.betterknockback;

import org.allaymc.api.entity.component.EntityPhysicsComponent;
import org.allaymc.api.eventbus.EventHandler;
import org.allaymc.api.eventbus.event.entity.EntityDamageEvent;
import org.allaymc.api.plugin.Plugin;
import org.allaymc.api.server.Server;
import org.joml.Vector3d;

public class BetterKnockback extends Plugin {
    @Override
    public void onLoad() {
        this.pluginLogger.info("BetterKnockback is loaded!");
    }

    @Override
    public void onEnable() {
        this.pluginLogger.info("BetterKnockback is enabled!");
        Server.getInstance().getEventBus().registerListener(this);
    }

    @Override
    public void onDisable() {
        this.pluginLogger.info("BetterKnockback is disabled!");
    }

    @EventHandler
    public void onDamage(EntityDamageEvent ev) {
        if (ev.getEntity() instanceof EntityPhysicsComponent physics) {
            var dmg = ev.getDamageContainer();
            var motion = physics.getMotion().mul(-0.5, new Vector3d());
            dmg.setKnockbackAdditional(dmg.getKnockbackAdditional().add(motion, new Vector3d()));
        }
    }
}

