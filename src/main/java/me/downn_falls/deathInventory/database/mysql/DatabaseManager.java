package me.downn_falls.deathInventory.database;

import me.downn_falls.deathInventory.DeathInventory;
import org.bukkit.plugin.Plugin;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseManager {

    private final Plugin plugin;
    private final String HOST = DeathInventory.getInstance().getConfig().getString("mysql.host");
    private final String USER = DeathInventory.getInstance().getConfig().getString("mysql.user");
    private final String PASSWORD = DeathInventory.getInstance().getConfig().getString("mysql.password");
    private final String PORT = DeathInventory.getInstance().getConfig().getString("mysql.port");
    private final String DATABASE = DeathInventory.getInstance().getConfig().getString("mysql.database");
    private Connection connection;

    public DatabaseManager(Plugin plugin) {
        this.plugin = plugin;
    }

    public Plugin getPlugin() {
        return plugin;
    }

    public void connect() {
        try {
            this.connection = DriverManager.getConnection("jdbc:mysql://" + this.HOST + ":" + this.PORT + "/" + this.DATABASE + "?autoReconnect=true&useSSL=" +
                    DeathInventory.getInstance().getConfig().getString("mysql.useSSL"), this.USER, this.PASSWORD);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }



}
