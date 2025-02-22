package me.wavelength.baseclient.utils;

import me.wavelength.baseclient.BaseClient;
import net.minecraft.client.Minecraft;
import net.minecraft.util.ChatComponentText;

public class Player {

	private static Minecraft mc = Minecraft.getMinecraft();

	public static void sendMessage(String message) {
		sendMessage(message, false);
	}

	public static void sendMessage(String message, boolean prefix) {
		mc.ingameGUI.getChatGUI()
				.printChatMessage(new ChatComponentText(Strings
						.translateColors((prefix ? "[" + BaseClient.instance.getClientName() + "]" : "") + message)),
						false);
	}

}