
package net.mcreator.ragemod.item;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.ragemod.init.RagemodModTabs;
import net.mcreator.ragemod.init.RagemodModItems;

public abstract class ToxicArmorItem extends ArmorItem {
	public ToxicArmorItem(EquipmentSlot slot, Item.Properties properties) {
		super(new ArmorMaterial() {
			@Override
			public int getDurabilityForSlot(EquipmentSlot slot) {
				return new int[]{13, 15, 16, 11}[slot.getIndex()] * 32;
			}

			@Override
			public int getDefenseForSlot(EquipmentSlot slot) {
				return new int[]{3, 6, 7, 4}[slot.getIndex()];
			}

			@Override
			public int getEnchantmentValue() {
				return 10;
			}

			@Override
			public SoundEvent getEquipSound() {
				return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.armor.equip_iron"));
			}

			@Override
			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(RagemodModItems.RAW_TOXIC_CRYSTAL), new ItemStack(RagemodModItems.TOXIC_CRYSTAL));
			}

			@Override
			public String getName() {
				return "toxic_armor";
			}

			@Override
			public float getToughness() {
				return 1.5f;
			}

			@Override
			public float getKnockbackResistance() {
				return 0.1f;
			}
		}, slot, properties);
	}

	public static class Helmet extends ToxicArmorItem {
		public Helmet() {
			super(EquipmentSlot.HEAD, new Item.Properties().tab(RagemodModTabs.TAB_RAGEMOD_TAB));
			setRegistryName("toxic_armor_helmet");
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "ragemod:textures/models/armor/toxicarmor__layer_1.png";
		}
	}

	public static class Chestplate extends ToxicArmorItem {
		public Chestplate() {
			super(EquipmentSlot.CHEST, new Item.Properties().tab(RagemodModTabs.TAB_RAGEMOD_TAB));
			setRegistryName("toxic_armor_chestplate");
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "ragemod:textures/models/armor/toxicarmor__layer_1.png";
		}
	}

	public static class Leggings extends ToxicArmorItem {
		public Leggings() {
			super(EquipmentSlot.LEGS, new Item.Properties().tab(RagemodModTabs.TAB_RAGEMOD_TAB));
			setRegistryName("toxic_armor_leggings");
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "ragemod:textures/models/armor/toxicarmor__layer_2.png";
		}
	}

	public static class Boots extends ToxicArmorItem {
		public Boots() {
			super(EquipmentSlot.FEET, new Item.Properties().tab(RagemodModTabs.TAB_RAGEMOD_TAB));
			setRegistryName("toxic_armor_boots");
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "ragemod:textures/models/armor/toxicarmor__layer_1.png";
		}
	}
}