
package net.mcreator.ragemod;

import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.common.brewing.IBrewingRecipe;
import net.minecraftforge.common.brewing.BrewingRecipeRegistry;

import net.minecraft.item.Items;
import net.minecraft.item.ItemStack;

import net.mcreator.ragemod.item.RageiumAlloyItem;
import net.mcreator.ragemod.item.RagePotionItem;

@RagemodModElements.ModElement.Tag
public class RagePotionCraftBrewingRecipe extends RagemodModElements.ModElement {
	public RagePotionCraftBrewingRecipe(RagemodModElements instance) {
		super(instance, 171);
	}

	@Override
	public void init(FMLCommonSetupEvent event) {
		BrewingRecipeRegistry.addRecipe(new CustomBrewingRecipe());
	}

	public static class CustomBrewingRecipe implements IBrewingRecipe {
		@Override
		public boolean isInput(ItemStack input) {
			return input.getItem() == Items.POTION;
		}

		@Override
		public boolean isIngredient(ItemStack ingredient) {
			return ingredient.getItem() == RageiumAlloyItem.block;
		}

		@Override
		public ItemStack getOutput(ItemStack input, ItemStack ingredient) {
			if (isInput(input) && isIngredient(ingredient)) {
				return new ItemStack(RagePotionItem.block);
			}
			return ItemStack.EMPTY;
		}
	}
}
