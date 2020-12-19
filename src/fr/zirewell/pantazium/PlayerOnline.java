package fr.zirewell.pantazium;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

public class PlayerOnline implements Listener {

    @EventHandler
    private void OnPlayerSendMessage(AsyncPlayerChatEvent event) {
        Player player = event.getPlayer();

        if(player instanceof Player) {
            if(player.isOp()) {
                event.setCancelled(true);
                player.sendMessage("§8[§4Admin§8] " + player.getName() + " » §7" + event.getMessage());
            }else {
                event.setCancelled(true);
                player.sendMessage("§8[§2Joueur§8] " + player.getName() + " » §7" + event.getMessage());
            }
        }


    }
}
