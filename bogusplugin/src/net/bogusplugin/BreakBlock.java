package net.bogusplugin;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.block.Block;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Monster;
import org.bukkit.entity.Zombie;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.block.BlockDropItemEvent;
import org.bukkit.event.entity.EntityDropItemEvent;


public class BreakBlock implements Listener{

	
	@EventHandler
	public void BlockBroken(BlockBreakEvent event) {
		
		Random java_bogus_rand = new Random();
		
		//camel_case and any other case like it sux. fite me boguser
		EntityType rando_entity = SetupMonsterArray.monsters.get(java_bogus_rand.nextInt(SetupMonsterArray.monsters.size()));
		
		System.out.println("dropped");
		/*Random horizontal_radius = new Random();
		Random vertical_radius = new Random();
		int x = horizontal_radius.nextInt(5)-4;
		int z = horizontal_radius.nextInt(5)-4;
		int y = vertical_radius.nextInt(5)-4;*/
		Location loc = event.getPlayer().getLocation();
		
		/*while (!loc.getBlock().getType().isAir() && 
				!loc.add(0,1,0).getBlock().getType().isAir() && 
				!loc.subtract(0,1,0).getBlock().getType().isSolid()) {
			
			x = horizontal_radius.nextInt(5)-4;
			z = horizontal_radius.nextInt(5)-4;
			y = vertical_radius.nextInt(5)-4;
			loc = event.getPlayer().getLocation().add(x,y,z);
			
		}*/
		
		event.getPlayer().getWorld().spawnEntity(loc, rando_entity);
		
	}
	
}
