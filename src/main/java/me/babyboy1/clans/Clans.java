package me.babyboy1.clans;

import lombok.Getter;
import org.bukkit.plugin.java.JavaPlugin;

public class Clans extends JavaPlugin {

    @Getter public static Clans instance;

    @Override
    public void onEnable() {
        instance = this;
    }

    @Override
    public void onDisable() {
        instance = null;
    }
}
