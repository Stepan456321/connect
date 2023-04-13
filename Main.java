import net.md_5.bungee.api.ChatColor;
import net.md_5.bungee.api.connection.ProxiedPlayer;
import net.md_5.bungee.api.plugin.Listener;
import net.md_5.bungee.api.plugin.Plugin;
import net.md_5.bungee.api.event.ServerConnectEvent;
import net.md_5.bungee.event.EventHandler;

public class WorldTeleportPlugin extends Plugin implements Listener {

    @Override
    public void onEnable() {
        getProxy().getPluginManager().registerListener(this, this);
    }

    @EventHandler
    public void onServerConnect(ServerConnectEvent event) {
        ProxiedPlayer player = event.getPlayer();
        String serverName = event.getTarget().getName();

        if (serverName.equalsIgnoreCase("lobby")) {
            player.sendMessage(ChatColor.GREEN + "Вы вошли в лобби!");
        } else if (serverName.equalsIgnoreCase("auth")) {
            player.sendMessage(ChatColor.RED + "Вы вошли на сервер авторизации!");
        } else if (serverName.equalsIgnoreCase("bedwars")) {
            player.sendMessage(ChatColor.AQUA + "Вы вошли на сервер бедварса!!");
        }
    }
}
