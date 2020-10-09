package me.scoltbr.discordapi.api.Mensagens;

import java.awt.Color;

import me.scoltbr.discordapi.Main;
import net.dv8tion.jda.core.EmbedBuilder;

public class Mensage {
	
	public void EnviarMensagem(String titulo,String mensagem, String UserID) {
		EmbedBuilder s = new EmbedBuilder();
		s.setColor(Color.GREEN);
		s.setTitle(titulo);
		s.setDescription(mensagem);
		Main.getInstance().jda.getTextChannelById(UserID).sendMessage(s.build()).queue();
	}

}
