package piter11223311.nosneaking;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.player.PlayerToggleSneakEvent;

public class NoSneak implements Listener {
    @EventHandler
    public boolean onPlayerSneek(PlayerToggleSneakEvent ev) {
        ev.setCancelled(true);
        return false;
    }

    @EventHandler
    public void onDamage(EntityDamageByEntityEvent ent) {
        if (ent.getDamager() instanceof Player) {
            Player player = (Player) ent.getDamager();
            Player player2 = (Player) ent.getEntity();
            player.setSneaking(false);
            player2.setSneaking(false);
        }
    }

    @EventHandler
    public void OnClick(PlayerInteractEvent ev) {
        Player player = ev.getPlayer();
        player.setSneaking(false);
    }
}



