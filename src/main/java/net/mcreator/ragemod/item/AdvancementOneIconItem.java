
package net.mcreator.ragemod.item;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

public class AdvancementOneIconItem extends Item {
	public AdvancementOneIconItem() {
		super(new Item.Properties().tab(null).stacksTo(1).rarity(Rarity.EPIC));
		setRegistryName("advancement_one_icon");
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}

	@Override
	public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
		return 0F;
	}
}
