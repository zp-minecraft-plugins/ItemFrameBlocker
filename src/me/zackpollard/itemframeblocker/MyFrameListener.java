package me.zackpollard.itemframeblocker;

import org.bukkit.entity.ItemFrame;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.hanging.HangingBreakByEntityEvent;
import org.bukkit.event.hanging.HangingPlaceEvent;

public class MyFrameListener implements Listener{
	
	public MyFrameListener(){
	}

	@EventHandler(ignoreCancelled = true)
	public void onHangingBreakByEntity(HangingBreakByEntityEvent event){
		
		if(event.getRemover() instanceof Player){
			
			if(event.getEntity() instanceof ItemFrame){
				
				Player player = (Player) event.getRemover();
				
				if(!player.hasPermission("itemframe.destroy")){
					
					event.setCancelled(true);
					
				}
			}
		}
	}
	
	public void onHangingPlace(HangingPlaceEvent event){
		
		Player player = event.getPlayer();
		
		if(event.getEntity() instanceof ItemFrame){
		
			if(!player.hasPermission("itemframe.place")){
				
				event.setCancelled(true);
			}
		}
	}
}