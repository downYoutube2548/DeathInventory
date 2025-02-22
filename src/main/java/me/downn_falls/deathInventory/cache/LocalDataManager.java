package me.downn_falls.deathInventory.manager;

import me.downn_falls.deathInventory.DeathData;
import org.bukkit.entity.Player;

import java.util.List;

public class LocalDataManager implements TemporaryDataInterface {
    @Override
    public List<DeathData> getDeathInventories(Player player) {
        return List.of();
    }

    @Override
    public void saveDeathInventory(Player player, List<DeathData> inventory) {

    }
}
