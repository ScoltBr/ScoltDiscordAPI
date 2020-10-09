package me.scoltbr.discordapi.api.Mensagens;

import java.awt.Color;

import me.scoltbr.discordapi.Main;
import net.dv8tion.jda.core.EmbedBuilder;
import net.dv8tion.jda.core.entities.User;

public class Direct {
	
	public void EnviarDirect(String titulo,String mensagem, String UserID, String UrlThumb, String Footer) {
		EmbedBuilder s = new EmbedBuilder();
		s.setColor(Color.yellow);
		s.setThumbnail(UrlThumb);
		s.setTitle(titulo);
		s.setDescription((CharSequence) (mensagem));
		s.setFooter(Footer, Main.getInstance().guild.getIconUrl());
		User user = Main.getInstance().guild.getMemberById(UserID).getUser();
		user.openPrivateChannel().complete().sendMessage(s.build()).queue();
	}
}
