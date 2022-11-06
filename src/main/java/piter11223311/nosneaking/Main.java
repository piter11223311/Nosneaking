package piter11223311.nosneaking;

import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new NoSneak(), this);
        System.out.println("Plugin NoSneak loaded successfully");
        System.out.println("Hmm, maybe get some coffee now? :D");
        System.out.println("Rawr :3");

    }

    @Override
    public void onDisable() {
        System.out.println("Plugin NoSneak disabled successfully");
        System.out.println("When will we met again? :<");
    }
}
