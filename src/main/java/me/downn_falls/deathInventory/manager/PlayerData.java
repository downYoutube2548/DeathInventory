package me.downn_falls.deathInventory.manager;

import org.bukkit.entity.Player;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.inventory.ItemStack;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class PlayerData {

    private final Player player;
    private int deaths;
    private final List<DeathData> deathData;

    public PlayerData(Player player, int deaths, List<DeathData> deathData) {
        this.player = player;
        this.deaths = deaths;
        this.deathData = deathData;
    }

    public Player getPlayer() {
        return player;
    }

    public int getDeathCount() {
        return deaths;
    }

    public List<DeathData> getDeathData() {
        return deathData;
    }

    public void triggerDeath(PlayerDeathEvent event) {

        deaths++;
        ItemStack[] inventoryContent = event.getEntity().getInventory().getStorageContents();

    }
}
