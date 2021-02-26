package net.bogusplugin;

import org.bukkit.plugin.java.JavaPlugin;

public class BogusPlugin extends JavaPlugin {

	// Fired when plugin is first enabled
    @Override
    public void onEnable() {
    	
    	SetupMonsterArray.populateArray();
    	this.getServer().getPluginManager().registerEvents(new BreakBlock(), this);
    	this.getServer().getPluginManager().registerEvents(new EntityDamaged(), this);
    	this.getCommand("bogus").setExecutor(new BogusCommand());
    	this.getCommand("nobogus").setExecutor(new noBogusCommand());
    	this.getCommand("startbogusevent").setExecutor(new StartBogusEvent());
    	
    }
    // Fired when plugin is disabled
    @Override
    public void onDisable() {

    }
    
    
	
}
