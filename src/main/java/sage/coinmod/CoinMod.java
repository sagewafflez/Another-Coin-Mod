package sage.coinmod;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import sage.coinmod.item.ModItems;

public class CoinMod implements ModInitializer {
	public static final String MOD_ID = "coinmod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModItems.registerModItems();
		LOGGER.info("Good Evening, gentlemen.");
	}
}