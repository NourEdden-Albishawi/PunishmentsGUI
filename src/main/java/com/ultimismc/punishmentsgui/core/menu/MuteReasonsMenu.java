package com.ultimismc.punishmentsgui.core.menu;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.HashMap;
import java.util.Map;

public class MuteReasonsMenu extends Menu {

    public MuteReasonsMenu() {
        super("Mute Reasons", 27);
    }

    @Override
    public String getId() {
        return "mute_reasons_menu";
    }

    @Override
    public Map<Integer, MenuItem> getItems() {
        Map<Integer, MenuItem> items = new HashMap<>();

        ItemStack swearingItem = new ItemStack(Material.LIGHT_GRAY_WOOL);
        ItemMeta swearingMeta = swearingItem.getItemMeta();
        if (swearingMeta != null) {
            swearingMeta.setDisplayName("§eSwearing - 5h");
            swearingItem.setItemMeta(swearingMeta);
        }
        items.put(10, new MenuItem(swearingItem, "mute %player% 5h Swearing"));

        ItemStack spammingItem = new ItemStack(Material.WHITE_WOOL);
        ItemMeta spammingMeta = spammingItem.getItemMeta();
        if (spammingMeta != null) {
            spammingMeta.setDisplayName("§eSpamming - 2h");
            spammingItem.setItemMeta(spammingMeta);
        }
        items.put(12, new MenuItem(spammingItem, "mute %player% 2h Spamming"));

        ItemStack advertisingItem = new ItemStack(Material.BOOK);
        ItemMeta advertisingMeta = advertisingItem.getItemMeta();
        if (advertisingMeta != null) {
            advertisingMeta.setDisplayName("§eAdvertising - 2d");
            advertisingItem.setItemMeta(advertisingMeta);
        }
        items.put(14, new MenuItem(advertisingItem, "mute %player% 2d Advertising"));

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
