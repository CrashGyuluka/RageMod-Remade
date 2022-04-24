
package net.mcreator.ragemod.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.UseAction;
import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.block.BlockState;

import net.mcreator.ragemod.itemgroup.RagemodTabItemGroup;
import net.mcreator.ragemod.RagemodModElements;

@RagemodModElements.ModElement.Tag
public class ApophylliteItem extends RagemodModElements.ModElement {
	@ObjectHolder("ragemod:apophyllite")
	public static final Item block = null;

	public ApophylliteItem(RagemodModElements instance) {
		super(instance, 19);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(RagemodTabItemGroup.tab).maxStackSize(64).rarity(Rarity.COMMON));
			setRegistryName("apophyllite");
		}

		@Override
		public UseAction getUseAction(ItemStack itemstack) {
			return UseAction.EAT;
		}

		@Override
		public int getItemEnchantability() {
			return 0;
		}

		@Override
		public int getUseDuration(ItemStack itemstack) {
			return 0;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
			return 1F;
		}
	}
}
