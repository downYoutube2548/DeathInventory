package me.downn_falls.deathInventory.manager;

import org.bukkit.inventory.Inventory;

import java.util.List;

public interface DeathPlayer {
    List<Inventory> getDeathInventories();
    void pushDeathInventory(Inventory inventory);
    void claimDeathInventory(int slot);
    Inventory getDeathInventory(int slot);
}
