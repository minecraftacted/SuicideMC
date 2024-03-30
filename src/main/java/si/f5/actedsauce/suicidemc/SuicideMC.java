package si.f5.actedsauce.suicidemc;

import org.bukkit.plugin.java.JavaPlugin;

public final class SuicideMC extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getCommand("suicide").setExecutor(new SuicideCommand());
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
