package com.ultimismc.punishmentsgui.core.menu;

import com.ultimismc.punishmentsgui.PunishmentsGUI;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.InventoryHolder;

import java.util.Map;

public abstract class Menu implements InventoryHolder {
    private final Inventory inventory;

    public abstract Map<Integer, MenuItem> getItems();

    public abstract String getId();

    public Menu(String title, int size) {
        this.inventory = Bukkit.createInventory(this, size, title);
        populateInventory();
    }

    private void populateInventory() {
        for (Map.Entry<Integer, MenuItem> entry : getItems().entrySet()) {
            inventory.setItem(entry.getKey(), entry.getValue().getItemStack());
        }
    }

    @Override
    public Inventory getInventory() {
        return inventory;
    }

    public int getSize() {
        return inventory.getSize();
    }

    public void handleClick(Player player, int slot) {
        MenuItem clickedItem = getItems().get(slot);
        if (clickedItem != null) {
            if (clickedItem.getMenuToOpenId() != null && !clickedItem.getMenuToOpenId().isEmpty()) {
                Menu subMenu = PunishmentsGUI.getInstance().getMenuManager().getMenu(clickedItem.getMenuToOpenId());
                if (subMenu != null) {
                    player.openInventory(subMenu.getInventory());
                } else {
                    player.sendMessage("Error: Sub-menu not found.");
                }
            } else if (clickedItem.getCommand() != null && !clickedItem.getCommand().isEmpty()) {
                player.performCommand(clickedItem.getCommand());
            }
        }
    }
}