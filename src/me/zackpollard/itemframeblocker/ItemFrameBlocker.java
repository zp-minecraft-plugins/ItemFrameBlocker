package me.zackpollard.itemframeblocker;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.bukkit.plugin.java.JavaPlugin;

public class ItemFrameBlocker extends JavaPlugin {
	
	private static final Logger log = Logger.getLogger("Minecraft");
	
	public void onEnable(){
		log.log(Level.INFO, "ItemFrameBlocker Version 1.0 Enabled");
		
		this.getServer().getPluginManager().registerEvents(new MyFrameListener(), this);
	}
	public void onDisable(){
		log.log(Level.INFO, "ItemFrameBlocker Version 1.0 Disabled");
	}
}