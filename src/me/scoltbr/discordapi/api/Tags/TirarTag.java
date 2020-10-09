package me.scoltbr.discordapi.api.Tags;

import me.scoltbr.discordapi.Main;
import net.dv8tion.jda.core.entities.Member;
import net.dv8tion.jda.core.entities.Role;

public class TirarTag {

	public static void tirarTag(String UserID, String tag) {
		Member membro = Main.getInstance().guild.getMemberById(UserID);
		Role role = (Role) Main.getInstance().guild.getRolesByName(tag, true).get(0);
		Main.getInstance().guild.getController().removeRolesFromMember(membro, role).queue();
	}
	
}
