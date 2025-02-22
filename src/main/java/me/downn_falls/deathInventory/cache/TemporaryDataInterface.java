package me.downn_falls.deathInventory.manager;

import me.downn_falls.deathInventory.DeathData;
import org.bukkit.entity.Player;

import java.util.List;

public interface TemporaryDataInterface {

    List<DeathData> getDeathInventories(Player player);
    void saveDeathInventory(Player player, List<DeathData> inventory);

}
