
package net.mcreator.ragemod.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import net.mcreator.ragemod.item.RageiumAlloyItem;
import net.mcreator.ragemod.RagemodModElements;

@RagemodModElements.ModElement.Tag
public class RagemodTabItemGroup extends RagemodModElements.ModElement {
	public RagemodTabItemGroup(RagemodModElements instance) {
		super(instance, 73);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabragemod_tab") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(RageiumAlloyItem.block);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundImageName("item_search.png");
	}

	public static ItemGroup tab;
}
