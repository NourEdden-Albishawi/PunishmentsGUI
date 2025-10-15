package com.ultimismc.punishmentsgui.core;

import com.google.common.collect.Maps;
import com.ultimismc.punishmentsgui.core.menu.BanReasonsMenu;
import com.ultimismc.punishmentsgui.core.menu.PunishmentMenu;
import com.ultimismc.punishmentsgui.core.menu.Menu;
import com.ultimismc.punishmentsgui.core.menu.MuteReasonsMenu;

import java.util.Map;

public class MenuManager
{
    private final Map<String, Menu> manager= Maps.newHashMap();

    public MenuManager() {
        addMenu(new PunishmentMenu());
        addMenu(new BanReasonsMenu());
        addMenu(new MuteReasonsMenu());
    }

    public void addMenu(Menu menu){
        if(manager.containsKey(menu.getId())) return;
        manager.put(menu.getId(),menu);
    }

    public Menu getMenu(String id){
        return manager.get(id);
    }

    public Map<String,Menu> getMenus(){
        return manager;
    }

    public void removeMenu(String id){
        manager.remove(id);
    }
}
