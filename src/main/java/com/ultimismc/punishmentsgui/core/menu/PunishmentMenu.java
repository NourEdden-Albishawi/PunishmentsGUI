package com.ultimismc.punishmentsgui.core.menu;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.HashMap;
import java.util.Map;

public class PunishmentMenu extends Menu {

    public PunishmentMenu() {
        super("Punishment Menu", 27); // 27 slots for a 3x9 inventory
    }

    @Override
    public String getId() {
        return "example_punishment_menu";
    }

    @Override
    public Map<Integer, MenuItem> getItems() {
        Map<Integer, MenuItem> items = new HashMap<>();

        // Ban Item - opens BanReasonsMenu
        ItemStack banItem = new ItemStack(Material.RED_WOOL);
        ItemMeta banMeta = banItem.getItemMeta();
        if (banMeta != null) {
            banMeta.setDisplayName("§cBan Player");
            banItem.setItemMeta(banMeta);
        }
        items.put(10, new MenuItem(banItem, null, "ban_reasons_menu"));

        // Mute Item - opens MuteReasonsMenu
        ItemStack muteItem = new ItemStack(Material.YELLOW_WOOL);
        ItemMeta muteMeta = muteItem.getItemMeta();
        if (muteMeta != null) {
            muteMeta.setDisplayName("§eMute Player");
            muteItem.setItemMeta(muteMeta);
        }
        items.put(13, new MenuItem(muteItem, null, "mute_reasons_menu"));

        return items;
    }
}
