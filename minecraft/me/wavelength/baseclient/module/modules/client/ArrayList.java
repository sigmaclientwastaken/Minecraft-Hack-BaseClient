package me.wavelength.baseclient.module.modules.client;

import org.lwjgl.input.Keyboard;

import me.wavelength.baseclient.module.Category;
import me.wavelength.baseclient.module.Module;

public class ArrayList extends Module {

	public ArrayList() {
		super("Array List", "Shows the list of toggled modules.", Keyboard.KEY_NONE, Category.CLIENT, true, true);
	}

	@Override
	public void setup() {
		this.color = me.wavelength.baseclient.module.Color.CLIENT;
		moduleSettings.addDefault("rainbow", true);
		moduleSettings.addDefault("offset", 2);
		moduleSettings.addDefault("speed", 20);
		moduleSettings.addDefault("opacity", 100);
		moduleSettings.addDefault("gradient", false);
		moduleSettings.addDefault("match module color", false);
		moduleSettings.addDefault("tab size", 5);
	}
}
