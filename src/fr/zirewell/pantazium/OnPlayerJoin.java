package fr.zirewell.pantazium;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

public class OnPlayerJoin implements Listener {


    @EventHandler
    public void onJoin(PlayerJoinEvent event) {
        Player player = event.getPlayer();
        //================================================= JoinMessage ===================================================================
        if(player instanceof Player) {
            if(player.isOp()) {
                event.setJoinMessage("§8[§4 " + player.getName() + "§8] §7 a rejoint le serveur");
            }else {
                event.setJoinMessage("§8[§2+ " + player.getName() + "§8]");
            }
        }

    }

    //================================================= LeaveMessage ===================================================================
    @EventHandler
    public void OnLeave(PlayerQuitEvent event) {
        Player player = event.getPlayer();

        event.setQuitMessage("§8[§4- " + player.getName() + "§8]");

    }

}
