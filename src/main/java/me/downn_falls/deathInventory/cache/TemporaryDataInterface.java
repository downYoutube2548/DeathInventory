package me.downn_falls.deathInventory.cache;

import me.downn_falls.deathInventory.manager.DeathData;
import org.bukkit.entity.Player;

import java.util.List;

public interface TemporaryDataInterface {

    List<DeathData> getDeathInventories(Player player);
    void saveDeathInventory(Player player, List<DeathData> inventory);

}
