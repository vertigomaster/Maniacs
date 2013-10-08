package io.github.vertigomaster.Maniacs;

import org.bukkit.plugin.java.JavaPlugin;

public final class Maniac  extends JavaPlugin
{
	@Override
	public void onEnable()
	{
		getLogger().info("onEnable has been invoked! :D");
	}
	
	@Override
	public void onDisable()
	{
		getLogger().info("onDisable has been invoked! :D");
	}
}
