
/*
*    MCreator note: This file will be REGENERATED on each build.
*/
package net.mcreator.ragemod.init;

import net.minecraft.world.entity.npc.VillagerTrades;

import java.util.List;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.FORGE)
public class RagemodModTrades {
	@SubscribeEvent
	public static void registerTrades(VillagerTradesEvent event) {
		Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();
		if (event.getType() == VillagerProfession.FLETCHER) {
			trades.get(4).add(new BasicItemListing(new ItemStack(Items.EMERALD, 15),

					new ItemStack(RagemodModItems.RAGEIUM_BOW.get()), 1, 5, 0.06f));
		}
		if (event.getType() == VillagerProfession.FLETCHER) {
			trades.get(2).add(new BasicItemListing(new ItemStack(Items.EMERALD, 3),

					new ItemStack(RagemodModItems.RAGEIUM_ARROW.get(), 8), 10, 5, 0.03f));
		}
		if (event.getType() == VillagerProfession.ARMORER) {
			trades.get(3).add(new BasicItemListing(new ItemStack(Items.EMERALD, 13),

					new ItemStack(RagemodModItems.RAGEIUM_ARMOR_CHESTPLATE.get()), 2, 7, 0.08f));
			trades.get(4).add(new BasicItemListing(new ItemStack(Items.EMERALD, 15), new ItemStack(Items.DIAMOND, 2),
					new ItemStack(RagemodModItems.RAGEIUM_ARMOR_LEGGINGS.get()), 2, 10, 0.11f));
		}
		if (event.getType() == VillagerProfession.WEAPONSMITH) {
			trades.get(1).add(new BasicItemListing(new ItemStack(RagemodModItems.RAGEIUM.get(), 13),

					new ItemStack(RagemodModItems.RAGEIUM_ALLOY.get(), 2), 4, 3, 0.03f));
		}
		if (event.getType() == VillagerProfession.MASON) {
			trades.get(1).add(new BasicItemListing(new ItemStack(Items.EMERALD, 3),

					new ItemStack(RagemodModItems.FULT_SCRAP.get(), 4), 15, 2, 0.05f));
			trades.get(4).add(new BasicItemListing(new ItemStack(Items.EMERALD, 2),

					new ItemStack(RagemodModBlocks.FLOOR_BLOCK.get(), 8), 20, 4, 0.03f));
			trades.get(3).add(new BasicItemListing(new ItemStack(Items.EMERALD), new ItemStack(RagemodModItems.FULT_SCRAP.get(), 2),
					new ItemStack(RagemodModBlocks.FULT_BRICKS.get(), 8), 20, 5, 0.04f));
		}
		if (event.getType() == VillagerProfession.CLERIC) {
			trades.get(3).add(new BasicItemListing(new ItemStack(Items.EMERALD, 3),

					new ItemStack(RagemodModItems.RAGE_POTION.get(), 2), 4, 3, 0.04f));
		}
	}
}
