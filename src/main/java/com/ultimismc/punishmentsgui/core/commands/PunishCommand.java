package com.ultimismc.punishmentsgui.core.commands;

import com.ultimismc.punishmentsgui.PunishmentsGUI;
import com.ultimismc.punishmentsgui.core.menu.PunishmentMenu;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class PunishCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (!(sender instanceof Player)) {
            sender.sendMessage("Only players can use this command.");
            return true;
        }

        Player player = (Player) sender;

        // Open the ExamplePunishmentMenu for the player
        PunishmentMenu menu = (PunishmentMenu) PunishmentsGUI.getInstance().getMenuManager().getMenu("example_punishment_menu");
        if (menu != null) {
            player.openInventory(menu.getInventory());
        } else {
            player.sendMessage("Error: Punishment menu not found.");
        }

        return true;
    }
}
