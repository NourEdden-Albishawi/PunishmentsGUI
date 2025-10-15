package com.ultimismc.punishmentsgui.core.menu;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.HashMap;
import java.util.Map;

public class BanReasonsMenu extends Menu {

    public BanReasonsMenu() {
        super("Ban Reasons", 27);
    }

    @Override
    public String getId() {
        return "ban_reasons_menu";
    }

    @Override
    public Map<Integer, MenuItem> getItems() {
        Map<Integer, MenuItem> items = new HashMap<>();

        // Hacking Ban
        ItemStack hackingItem = new ItemStack(Material.IRON_SWORD);
        ItemMeta hackingMeta = hackingItem.getItemMeta();
        if (hackingMeta != null) {
            hackingMeta.setDisplayName("§cHacking - 14d");
            hackingItem.setItemMeta(hackingMeta);
        }
        items.put(10, new MenuItem(hackingItem, "ban %player% 14d Hacking"));

        // X-Ray Ban
        ItemStack xrayItem = new ItemStack(Material.DIAMOND_ORE);
        ItemMeta xrayMeta = xrayItem.getItemMeta();
        if (xrayMeta != null) {
            xrayMeta.setDisplayName("§cX-Ray - 30d");
            xrayItem.setItemMeta(xrayMeta);
        }
        items.put(12, new MenuItem(xrayItem, "ban %player% 30d X-Ray"));

        // Advertising Ban
        ItemStack advertisingItem = new ItemStack(Material.PAPER);
        ItemMeta advertisingMeta = advertisingItem.getItemMeta();
        if (advertisingMeta != null) {
            advertisingMeta.setDisplayName("§cAdvertising - 7d");
            advertisingItem.setItemMeta(advertisingMeta);
        }
        items.put(14, new MenuItem(advertisingItem, "ban %player% 7d Advertising"));

        // Back button
        ItemStack backItem = new ItemStack(Material.ARROW);
        ItemMeta backMeta = backItem.getItemMeta();
        if (backMeta != null) {
            backMeta.setDisplayName("§7Back");
            backItem.setItemMeta(backMeta);
        }
        items.put(26, new MenuItem(backItem, null, "punishment_menu")); // Opens the main menu

        return items;
    }
}
