package net.bogusplugin;

import java.util.ArrayList;

import org.bukkit.entity.Player;

public class PlayerEventList {

	private Player sender;
	private ArrayList<Player> players = new ArrayList<Player>();
	
	public PlayerEventList(Player sender) {
		this.sender = sender;
		players.add(sender);
	}
	
	
	
}
