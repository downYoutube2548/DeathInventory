package me.downn_falls.deathInventory.database;

import me.downn_falls.deathInventory.manager.DeathData;
import org.bukkit.entity.Player;

import java.util.List;

public interface PersistentDataInterface {
    void loadDeathInventories(Player player);
    void saveDeathInventory(Player player, int deathCount, List<DeathData> inventory);
}
