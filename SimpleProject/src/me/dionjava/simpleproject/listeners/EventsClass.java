package me.dionjava.simpleproject.listeners;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerDropItemEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;



public class EventsClass implements Listener{
	@EventHandler
	public void onPlayerJoin(PlayerJoinEvent e) {
		Player p = e.getPlayer();
		e.setJoinMessage("Hello," + p.getName());
	}
	@EventHandler
	public void onPlayerQuit(PlayerQuitEvent e) {
		Player p = e.getPlayer();
		e.setQuitMessage("Bye Bye," + p.getName());
	}
	@EventHandler
	public void onDropItem(PlayerDropItemEvent e) {
		if (Material.ANVIL != null);
		e.setCancelled(false);
		
	}
		

}
