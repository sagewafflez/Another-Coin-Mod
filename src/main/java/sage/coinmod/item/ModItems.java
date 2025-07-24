package sage.coinmod.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import sage.coinmod.CoinMod;

public class ModItems {                               /*Item name can't have spaces and other special characters */
    public static final Item COPPER_COIN = registerItemMethod("copper_coin", new Item(new Item.Settings().rarity(Rarity.COMMON).maxCount(16)));
    public static final Item SILVER_COIN = registerItemMethod("silver_coin", new Item(new Item.Settings().rarity(Rarity.UNCOMMON).maxCount(16)));
    public static final Item GOLD_COIN = registerItemMethod("gold_coin", new Item(new Item.Settings().rarity(Rarity.RARE).maxCount(16)));
    public static final Item DIAMOND_COIN = registerItemMethod("diamond_coin", new Item(new Item.Settings().rarity(Rarity.EPIC).maxCount(16)));



    // Helper item registry method
    public static Item registerItemMethod (String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(CoinMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        CoinMod.LOGGER.info("Registering Mod Items for " + CoinMod.MOD_ID);

        // Adding to creative mode inventory
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(fabricItemGroupEntries -> {
            fabricItemGroupEntries.add(COPPER_COIN);
            fabricItemGroupEntries.add(SILVER_COIN);
            fabricItemGroupEntries.add(GOLD_COIN);
            fabricItemGroupEntries.add(DIAMOND_COIN);
        });
    }

}
