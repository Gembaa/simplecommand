package me.dionjava.simpleproject;

import org.bukkit.plugin.java.JavaPlugin;

import me.dionjava.simpleproject.commands.SimpleCommand;
import me.dionjava.simpleproject.listeners.EventsClass;

public class Main extends JavaPlugin{
	public void onEnable() {
		getCommand("simple").setExecutor(new SimpleCommand());
		getServer().getPluginManager().registerEvents(new EventsClass(), this);
		System.out.println("SimpleProject On");
	}
	
	public void onDisable() {
		System.out.println("SimpleProject Off");
	}

}
