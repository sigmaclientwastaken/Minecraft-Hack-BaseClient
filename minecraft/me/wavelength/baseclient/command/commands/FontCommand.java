package me.wavelength.baseclient.command.commands;

import me.wavelength.baseclient.BaseClient;
import me.wavelength.baseclient.command.Command;
import me.wavelength.baseclient.utils.Integers;

public class FontCommand extends Command {

	public FontCommand() {
		super("font", "font <size>", "Set the font's size");
	}

	@Override
	public String executeCommand(String line, String[] args) {
		if (args.length == 0 || !(Integers.isInteger(args[1])))
			return getSyntax("&c");

		int size = Integers.getInteger(args[1]);
		if (size < 13 || size > 45)
			return "&cPlease, type a number within 13 and 45.";

		switch (args[0].toLowerCase()) {
		case ("small"):
			BaseClient.instance.getFontRenderer().setFontSizeSmall(size);
			return String.format("&aThe small font size has been set to &e%1$d&a.", size);
		case ("normal"):
			BaseClient.instance.getFontRenderer().setFontSizeNormal(size);
			return String.format("&aThe normal font size has been set to &e%1$d&a.", size);
		case ("large"):
			BaseClient.instance.getFontRenderer().setFontSizeLarge(size);
			return String.format("&aThe large font size has been set to &e%1$d&a.", size);
		case ("largest"):
			BaseClient.instance.getFontRenderer().setFontSizeLargest(size);
			return String.format("&aThe largest font size has been set to &e%1$d&a.", size);
		case ("logo"):
			BaseClient.instance.getFontRenderer().setFontSizeLogo(size);
			return String.format("&aThe logo's font size has been set to &e%1$d&a.", size);
		default:
			return getSyntax("&c");
		}
	}

}