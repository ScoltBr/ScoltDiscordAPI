package me.scoltbr.discordapi.api.Tags;

import org.bukkit.entity.Player;

import me.scoltbr.discordapi.Main;
import net.dv8tion.jda.core.entities.Member;
import net.dv8tion.jda.core.entities.Role;

public class DarTag {

	public static void darTag(Player player, String UserID, String tag, String permissao) {
		if (player.hasPermission(permissao)) {
			Member membro = Main.getInstance().guild.getMemberById(UserID);
			Role role = (Role) Main.getInstance().guild.getRolesByName(tag, true).get(0);
			Main.getInstance().guild.getController().addSingleRoleToMember(membro, role).queue();
		}
	}

}
