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
	
    @SuppressWarnings("unused")
    @SubscribeEvent
    public void onBreakEvent(BlockEvent.BreakEvent event) {

        if (event.block instanceof BlockModernAlchemy && ConfigHandler.machineExplodes && !event.getPlayer().capabilities.isCreativeMode) {
            if (event.getPlayer().getCurrentEquippedItem() != null) {
                if (WrenchHelper.isWrench(event.getPlayer().getCurrentEquippedItem().getItem())) {
                    return;
                }
            }
        } else if(event.block == BlockHandler.blockOreActinium && !event.getPlayer().capabilities.isCreativeMode) {
            AchievementRegistry.triggerAchievement(ModAchievements.ModName, ModAchievements.mineActinium, event.getPlayer());
            return;
        }
        else return;
        event.world.createExplosion(event.getPlayer(), event.x, event.y, event.z, 2.0F, true);
	    
    }    
  
}
