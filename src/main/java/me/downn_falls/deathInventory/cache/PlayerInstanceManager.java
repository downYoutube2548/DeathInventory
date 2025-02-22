package me.downn_falls.deathInventory.cache;

import me.downn_falls.deathInventory.player.DeathPlayer;
import org.bukkit.entity.Player;

import java.util.HashMap;

public class PlayerInstanceManager {

    private final HashMap<Player, DeathPlayer> playerInstances = new HashMap<>();
    public DeathPlayer getPlayerInstance(Player player) { return this.playerInstances.get(player); }
}
