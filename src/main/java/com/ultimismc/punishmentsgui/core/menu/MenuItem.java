package com.ultimismc.punishmentsgui.core.menu;

import org.bukkit.inventory.ItemStack;

public class MenuItem {
    private final ItemStack itemStack;
    private final String command;
    private final String menuToOpenId;

    public MenuItem(ItemStack itemStack, String command) {
        this(itemStack, command, null);
    }

    public MenuItem(ItemStack itemStack, String command, String menuToOpenId) {
        this.itemStack = itemStack;
        this.command = command;
        this.menuToOpenId = menuToOpenId;
    }

    public ItemStack getItemStack() {
        return itemStack;
    }

    public String getCommand() {
        return command;
    }

    public String getMenuToOpenId() {
        return menuToOpenId;
    }
}