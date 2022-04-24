
package net.mcreator.ragemod.village;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.village.VillagerTradesEvent;
import net.minecraftforge.common.BasicTrade;

import net.minecraft.item.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.merchant.villager.VillagerTrades;
import net.minecraft.entity.merchant.villager.VillagerProfession;

import net.mcreator.ragemod.item.RageiumItem;
import net.mcreator.ragemod.item.RageiumBowItem;
import net.mcreator.ragemod.item.RageiumArrowItem;
import net.mcreator.ragemod.item.RageiumArmorItem;
import net.mcreator.ragemod.item.RageiumAlloyItem;
import net.mcreator.ragemod.item.RagePotionItem;
import net.mcreator.ragemod.item.FultScrapItem;
import net.mcreator.ragemod.block.FultBricksBlock;
import net.mcreator.ragemod.block.FloorBlockBlock;

import java.util.List;

import it.unimi.dsi.fastutil.ints.Int2ObjectMap;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.FORGE)
public class VillagerTrade1Trade {
	@SubscribeEvent
	public static void registerTrades(VillagerTradesEvent event) {
		Int2ObjectMap<List<VillagerTrades.ITrade>> trades = event.getTrades();
		if (event.getType() == VillagerProfession.FLETCHER) {
			trades.get(4).add(new BasicTrade(new ItemStack(Items.EMERALD, (int) (17)), new ItemStack(Items.EMERALD, (int) (23)),
					new ItemStack(RageiumBowItem.block), 1, 5, 0.06f));
		}
		if (event.getType() == VillagerProfession.FLETCHER) {
			trades.get(2).add(new BasicTrade(new ItemStack(Items.EMERALD, (int) (3)), new ItemStack(Items.EMERALD, (int) (2)),
					new ItemStack(RageiumArrowItem.block, (int) (8)), 10, 5, 0.03f));
		}
		if (event.getType() == VillagerProfession.ARMORER) {
			trades.get(3).add(new BasicTrade(new ItemStack(Items.EMERALD, (int) (13)), new ItemStack(Items.DIAMOND, (int) (3)),
					new ItemStack(RageiumArmorItem.body), 2, 7, 0.08f));
			trades.get(4).add(new BasicTrade(new ItemStack(Items.EMERALD, (int) (16)), new ItemStack(Items.DIAMOND, (int) (5)),
					new ItemStack(RageiumArmorItem.legs), 2, 10, 0.11f));
		}
		if (event.getType() == VillagerProfession.WEAPONSMITH) {
			trades.get(1)
					.add(new BasicTrade(new ItemStack(RageiumItem.block, (int) (13)), new ItemStack(RageiumAlloyItem.block, (int) (2)), 4, 3, 0.03f));
		}
		if (event.getType() == VillagerProfession.MASON) {
			trades.get(1).add(new BasicTrade(new ItemStack(Items.EMERALD, (int) (3)), new ItemStack(FultScrapItem.block, (int) (4)), 15, 2, 0.05f));
			trades.get(4).add(new BasicTrade(new ItemStack(Items.EMERALD, (int) (2)), new ItemStack(FloorBlockBlock.block, (int) (8)), 20, 4, 0.03f));
			trades.get(3).add(new BasicTrade(new ItemStack(Items.EMERALD), new ItemStack(FultScrapItem.block, (int) (2)),
					new ItemStack(FultBricksBlock.block, (int) (8)), 20, 5, 0.04f));
		}
		if (event.getType() == VillagerProfession.CLERIC) {
			trades.get(3).add(new BasicTrade(new ItemStack(Items.EMERALD, (int) (3)), new ItemStack(RagePotionItem.block, (int) (2)), 4, 3, 0.04f));
		}
	}
}
