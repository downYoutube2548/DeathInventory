package me.downn_falls.deathInventory.player;

import me.downn_falls.deathInventory.manager.DeathData;
import me.downn_falls.deathInventory.DeathInventory;
import me.downn_falls.deathInventory.cache.TemporaryDataInterface;
import org.bukkit.entity.Player;

import java.util.List;

public class DeathPlayer {

    private static final TemporaryDataInterface manager = DeathInventory.getTemporaryDataInterface();
    private final Player player;

    public DeathPlayer(Player player, List<DeathData> inventories) {
        this.player = player;
    }

    public List<DeathData> getDeathInventories() {
        return manager.getDeathInventories(player);
    };

    public void pushDeathInventory(DeathData inventory) {
    }

    public void claimDeathInventory(int slot) {
    }

    public DeathData getDeathInventory(int slot) {
    }
}
