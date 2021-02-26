package net.bogusplugin;

import java.util.ArrayList;

import org.bukkit.command.CommandSender;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Monster;
import org.bukkit.entity.Player;

public class SetupMonsterArray {
	
	public static ArrayList<EntityType> monsters = new ArrayList<EntityType>();
	
	public static void populateArray() {
		monsters.clear();
		for(EntityType type : EntityType.values()) {
			
			
			if (type.getEntityClass() != null && Monster.class.isAssignableFrom(type.getEntityClass())) {
				
				int repeat;

				if(type.getEntityClass() == EntityType.WITHER.getEntityClass()) {
					
					repeat = 1;
					
				}else if(type.getEntityClass() == EntityType.EVOKER.getEntityClass() || 
						type.getEntityClass() == EntityType.GIANT.getEntityClass() ||
						type.getEntityClass() == EntityType.ELDER_GUARDIAN.getEntityClass() ||
						type.getEntityClass() == EntityType.ILLUSIONER.getEntityClass()) {
					
					repeat = 2;
				}else {
					repeat = 4;
				}
				for (int i = 0; i < repeat; i++){
					monsters.add(type);
				}
			}
			
		}
	}
	
	public static void populateArray(String[] args) {
		
		monsters.clear();
		for (String type : args) {
			monsters.add(EntityType.valueOf(type.toUpperCase()));
		}
		
	}
	
}
