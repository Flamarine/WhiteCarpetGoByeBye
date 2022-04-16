package top.skadi.pkst.wcgbb;

import net.fabricmc.api.ModInitializer;
import net.minecraft.state.property.IntProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.util.registry.Registry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class WhiteCarpetGoByeBye implements ModInitializer {
	public static final Logger LOGGER = LoggerFactory.getLogger("White Carpet");

	@Override
	public void onInitialize() {
		Properties.field_38610 = IntProperty.of("item", 0, Registry.ITEM.size() - 1);
		LOGGER.info("I go bye bye");
	}
}
