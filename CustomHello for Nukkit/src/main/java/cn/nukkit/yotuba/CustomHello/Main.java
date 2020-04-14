package cn.nukkit.exampleplugin;

import cn.nukkit.plugin.PluginBase;
import cn.nukkit.event.EventHandler;
import cn.nukkit.event.Listener;
import cn.nukkit.event.player.PlayerJoinEvent;
import cn.nukkit.event.player.PlayerQuitEvent;

public class ExamplePlugin extends PluginBase {

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(this, this);
        System.out.println("Enable CustomHello");
    }

    @EventHandler
    public void playerJoinEvent(PlayerJoinEvent event) {
        name = event.getPlayer.getName();
        event.setJoinMessage("§e>> §a" + name + " §fjoined.");
    }

    @EventHandler
    public void PlayerQuitEvent(PlayerQuitEvent event) {
        name = event.getPlayer.getName();
        event.setQuitMessage("§e>> §a" + name + " §fquit.");
    }
}