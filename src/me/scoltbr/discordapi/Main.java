package me.scoltbr.discordapi;

import org.bukkit.plugin.java.JavaPlugin;

import me.scoltbr.discordapi.api.Ativador;
import net.dv8tion.jda.core.JDA;
import net.dv8tion.jda.core.entities.Guild;

public class Main extends JavaPlugin {
	
	public JDA jda;
	public Guild guild;
	Ativador atv = new Ativador();
	
	
	@Override
	public void onEnable() {
		
	}
	
	public static Main getInstance() {
		return (Main) getPlugin(Main.class);
	}

}
