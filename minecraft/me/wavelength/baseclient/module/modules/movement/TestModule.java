package me.wavelength.baseclient.module.modules.movement;

import org.lwjgl.input.Keyboard;

import me.wavelength.baseclient.event.events.PacketReceivedEvent;
import me.wavelength.baseclient.event.events.UpdateEvent;
import me.wavelength.baseclient.module.AntiCheat;
import me.wavelength.baseclient.module.Category;
import me.wavelength.baseclient.module.Color;
import me.wavelength.baseclient.module.Module;

public class TestModule extends Module {

	public TestModule() {
		super("TestModule", "This is a test module...", Keyboard.KEY_NONE, Category.MOVEMENT, AntiCheat.AAC);
	}

	@Override
	public void setup() {
		this.color = Color.MOVEMENT;
	}

	@Override
	public void onEnable() {
	}

	@Override
	public void onDisable() {
	}

	@Override
	public void onUpdate(UpdateEvent event) {
	}

	@Override
	public void onPacketReceived(PacketReceivedEvent event) {
	}

}