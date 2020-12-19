package fr.zirewell.pantazium;

import org.bukkit.plugin.java.JavaPlugin;


public class Main extends JavaPlugin{


    public void onEnable() {

        System.out.println("[Pantazium] §aLe plugin vient de démarrer");

        getServer().getPluginManager().registerEvents(new OnPlayerJoin(), this);
        getServer().getPluginManager().registerEvents(new PlayerOnline(), this);
    }
    public void onDisable() {
        System.out.println("[Pantazium] §4Le plugin est bien arrété");
    }

}
