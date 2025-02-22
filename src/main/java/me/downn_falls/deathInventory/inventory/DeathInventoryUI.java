package me.downn_falls.deathInventory.inventory;

import me.downn_falls.deathInventory.DeathInventory;
import me.downn_falls.deathInventory.utils.Utils;
import me.downn_falls.guiapi.GUI;
import me.downn_falls.guiapi.ItemStackBuilder;
import me.downn_falls.guiapi.component.GuiButton;
import org.bukkit.Material;
import org.bukkit.configuration.ConfigurationSection;
import org.bukkit.entity.Player;

public class DeathInventoryUI extends GUI {

    private final ConfigurationSection configGUI = DeathInventory.getInstance().getConfig().getConfigurationSection("gui");

    public DeathInventoryUI(Player player) {

        super(Utils.getColoredMessage("gui-title", false), 1);

        GuiButton death1 = new GuiButton(this, "death1", configGUI.getInt("death1.slot"));
        death1.whenUpdate(() -> {

        });

    }
}
