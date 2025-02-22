package me.downn_falls.deathInventory.manager;

import org.bukkit.inventory.ItemStack;

public class DeathData {

    private final long date;
    private final int deathCount;
    private final ItemStack[] inventory;
    private final ItemStack[] armor;
    private final ItemStack offhand;

    public DeathData(long date, int deathCount, ItemStack[] inventory, ItemStack[] armor, ItemStack offhand) {
        this.date = date;
        this.deathCount = deathCount;
        this.inventory = inventory;
        this.armor = armor;
        this.offhand = offhand;
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
