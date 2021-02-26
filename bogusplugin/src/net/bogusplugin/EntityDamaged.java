package net.bogusplugin;

import java.util.Random;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.entity.EntityDamageEvent;

import net.minecraft.server.v1_16_R2.Material;

public class EntityDamaged implements Listener{

	@SuppressWarnings("unlikely-arg-type")
	@EventHandler
	public void entity_damaged(EntityDamageByEntityEvent event) {
		
		System.out.println(event.getDamager() instanceof Player);
		
		if (!((Player) event.getDamager()).getInventory()
				.getItemInMainHand().getType().equals(Material.AIR)) {
			
			Random onein10 = new Random();
			
			if (onein10.nextFloat() < 0.2f) {	
				event.getEntity().getWorld()
					.spawnEntity(event.getEntity().getLocation(), event.getEntityType());
			}
		}
		
	}
	
}
