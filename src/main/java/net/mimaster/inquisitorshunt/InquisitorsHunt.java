package net.mimaster.inquisitorshunt;

import net.fabricmc.api.ModInitializer;

import net.mimaster.inquisitorshunt.item.ModItemGroups;
import net.mimaster.inquisitorshunt.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class InquisitorsHunt implements ModInitializer {
	public static final String MOD_ID = "inquisitorshunt";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();
		ModItems.registerModItems();
	}
}