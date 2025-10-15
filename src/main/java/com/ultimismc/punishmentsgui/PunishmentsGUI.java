package com.ultimismc.punishmentsgui;

import com.ultimismc.punishmentsgui.core.MenuManager;
import com.ultimismc.punishmentsgui.core.commands.PunishCommand;
import com.ultimismc.punishmentsgui.core.listeners.EventListeners;
import org.bukkit.plugin.java.JavaPlugin;

public class PunishmentsGUI extends JavaPlugin {
    private MenuManager menuManager;
    private static PunishmentsGUI instace;

    public PunishmentsGUI() {
        instace = this;
    }

    @Override
    public void onEnable() {
        this.menuManager = new MenuManager();
        getCommand("punish").setExecutor(new PunishCommand());

        getServer().getPluginManager().registerEvents(new EventListeners(), this);
    }


    public MenuManager getMenuManager() {
        return this.menuManager;
    }

    public static PunishmentsGUI getInstance() {
        return instace;
    }
}
