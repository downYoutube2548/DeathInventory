package me.downn_falls.deathInventory.database.mysql;

import me.downn_falls.deathInventory.manager.DeathData;
import me.downn_falls.deathInventory.DeathInventory;
import me.downn_falls.deathInventory.database.PersistentDataInterface;
import org.bukkit.entity.Player;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class MySQLDatabase implements PersistentDataInterface {

    private final DatabaseManager databaseManager;

    public MySQLDatabase() {
        databaseManager = new DatabaseManager();
        databaseManager.init();
    }

    @Override
    public void loadDeathInventories(Player player) {
        try (Connection conn = databaseManager.getConnection();
             PreparedStatement stmt = conn.prepareStatement("SELECT * FROM death_inventory WHERE player_uuid = ?")) {
            stmt.setString(1, player.getUniqueId().toString());
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                DeathInventory.getTemporaryDataInterface();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void saveDeathInventory(Player player, int deathCount, List<DeathData> inventory) {

        String json = DeathInventory.getGson().toJson(inventory);

        try {
            Connection conn = databaseManager.getConnection();
            PreparedStatement stmt = conn.prepareStatement("insert into death_inventory (player_uuid, death_count, inventory) values (?, ?, ?) on duplicate key update death_count = values(death_count), inventory = values(inventory)");
            stmt.setString(1, player.getUniqueId().toString());
            stmt.setInt(2, deathCount);
            stmt.setString(3, json);

            stmt.executeUpdate();
            stmt.close();
            conn.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
