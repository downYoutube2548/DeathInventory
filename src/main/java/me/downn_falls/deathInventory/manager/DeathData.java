package me.downn_falls.deathInventory;

import org.bukkit.inventory.ItemStack;

import java.util.UUID;

public class DeathData {

    private final UUID uuid;
    private final long date;
    private final int deathCount;
    private final ItemStack[] inventory;
    private final ItemStack[] armor;
    private final ItemStack offhand;

    public DeathData(UUID uuid, long date, int deathCount, ItemStack[] inventory, ItemStack[] armor, ItemStack offhand) {
        this.uuid = uuid;
        this.date = date;
        this.deathCount = deathCount;
        this.inventory = inventory;
        this.armor = armor;
        this.offhand = offhand;
    }

    public UUID getUUID() {
        return uuid;
    }

    public long getDate() {
        return date;
    }

    public int getDeathCount() {
        return deathCount;
    }

    public ItemStack[] getInventory() {
        return inventory;
    }

    public ItemStack[] getArmor() {
        return armor;
    }

    public ItemStack getOffhand() {
        return offhand;
    }

}
