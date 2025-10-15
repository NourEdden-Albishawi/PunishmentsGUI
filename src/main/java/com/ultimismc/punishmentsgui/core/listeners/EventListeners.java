package com.ultimismc.punishmentsgui.core.listeners;

import com.ultimismc.punishmentsgui.core.menu.Menu;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

public class EventListeners implements Listener {
    @EventHandler
    public void onInventoryClickEvent(InventoryClickEvent event) {
        if (event.getClickedInventory() == null || !(event.getClickedInventory().getHolder() instanceof Menu)) {
            return;
        }

        Menu menu = (Menu) event.getClickedInventory().getHolder();
        Player player = (Player) event.getWhoClicked();

        event.setCancelled(true);
        menu.handleClick(player, event.getRawSlot());
    }
}
