package me.dionjava.simpleproject.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class SimpleCommand implements CommandExecutor{

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if (sender instanceof Player) {
			Player p = (Player) sender;
			if (cmd.getName().equalsIgnoreCase("simple")) {
				p.sendMessage("Hello, this is your simple command!");				
			}
		} else {
			sender.sendMessage(ChatColor.AQUA + "the console cannot use this command");
			return true;
		}
		return false;
	}
}
