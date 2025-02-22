package me.downn_falls.deathInventory;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import me.downn_falls.deathInventory.database.PersistentDataInterface;
import me.downn_falls.deathInventory.database.mysql.MySQLDatabase;
import me.downn_falls.deathInventory.google.GsonItemStack;
import me.downn_falls.deathInventory.google.GsonUUID;
import me.downn_falls.deathInventory.cache.LocalDataManager;
import me.downn_falls.deathInventory.cache.TemporaryDataInterface;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.UUID;

public final class DeathInventory extends JavaPlugin {

    private static DeathInventory instance;
    private static TemporaryDataInterface temporaryDataInterface;
    private static PersistentDataInterface persistentDataInterface;
    private static Gson gson;

    @Override
    public void onEnable() {
        // Plugin startup logic
        instance = this;

        gson = new GsonBuilder()
                .registerTypeAdapter(ItemStack.class, new GsonItemStack())
                .registerTypeAdapter(UUID.class, new GsonUUID())
                .create();

        getConfig().options().copyDefaults();
        saveDefaultConfig();

        temporaryDataInterface = new LocalDataManager();
        persistentDataInterface = new MySQLDatabase();
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic

    }

    public static DeathInventory getInstance() { return instance; }
    public static TemporaryDataInterface getTemporaryDataInterface() { return temporaryDataInterface; }
    public static PersistentDataInterface getPersistentDataInterface() { return persistentDataInterface; }
    public static Gson getGson() { return gson; }

}
