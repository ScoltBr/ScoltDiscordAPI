package me.scoltbr.discordapi.api;

import javax.security.auth.login.LoginException;

import org.bukkit.Bukkit;
import org.bukkit.plugin.Plugin;

import me.scoltbr.discordapi.Main;
import net.dv8tion.jda.core.AccountType;
import net.dv8tion.jda.core.JDABuilder;
import net.dv8tion.jda.core.OnlineStatus;
import net.dv8tion.jda.core.entities.Game;

public class Ativador {

	public void ligar(String token, String status) {
		try {
			Main.getInstance().jda = new JDABuilder(AccountType.BOT).setToken(token).buildAsync();
			Main.getInstance().jda.getPresence().setStatus(OnlineStatus.ONLINE);
			Main.getInstance().jda.getPresence().setGame(Game.playing(status));
			Bukkit.getScheduler().runTaskLater((Plugin) this,
					() -> Main.getInstance().guild = Main.getInstance().jda.getGuilds().get(0), 50L);
		} catch (LoginException e) {
			e.printStackTrace();
			Main.getInstance().jda.shutdownNow();
		}
	}

	public void desligar() {
		Main.getInstance().jda.shutdownNow();
	}

}
