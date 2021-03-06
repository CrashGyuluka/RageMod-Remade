
package net.mcreator.ragemod.item;

import net.minecraft.sounds.SoundEvent;

import net.mcreator.ragemod.init.RagemodModTabs;
import net.mcreator.ragemod.init.RagemodModItems;

public abstract class RageiumArmorItem extends ArmorItem {
	public RageiumArmorItem(EquipmentSlot slot, Item.Properties properties) {
		super(new ArmorMaterial() {
			@Override
			public int getDurabilityForSlot(EquipmentSlot slot) {
				return new int[]{13, 15, 16, 11}[slot.getIndex()] * 35;
			}

			@Override
			public int getDefenseForSlot(EquipmentSlot slot) {
				return new int[]{3, 6, 7, 4}[slot.getIndex()];
			}

			@Override
			public int getEnchantmentValue() {
				return 15;
			}

			@Override
			public SoundEvent getEquipSound() {
				return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.armor.equip_netherite"));
			}

			@Override
			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(RagemodModItems.RAGEIUM.get()), new ItemStack(RagemodModItems.RAGEIUM_ALLOY.get()));
			}

			@Override
			public String getName() {
				return "rageium_armor";
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

	public static class Helmet extends RageiumArmorItem {
		public Helmet() {
			super(EquipmentSlot.HEAD, new Item.Properties().tab(RagemodModTabs.TAB_RAGEMOD_TAB));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "ragemod:textures/models/armor/rageiumarmorn__layer_1.png";
		}
	}

	public static class Chestplate extends RageiumArmorItem {
		public Chestplate() {
			super(EquipmentSlot.CHEST, new Item.Properties().tab(RagemodModTabs.TAB_RAGEMOD_TAB));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "ragemod:textures/models/armor/rageiumarmorn__layer_1.png";
		}
	}

	public static class Leggings extends RageiumArmorItem {
		public Leggings() {
			super(EquipmentSlot.LEGS, new Item.Properties().tab(RagemodModTabs.TAB_RAGEMOD_TAB));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "ragemod:textures/models/armor/rageiumarmorn__layer_2.png";
		}
	}

	public static class Boots extends RageiumArmorItem {
		public Boots() {
			super(EquipmentSlot.FEET, new Item.Properties().tab(RagemodModTabs.TAB_RAGEMOD_TAB));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "ragemod:textures/models/armor/rageiumarmorn__layer_1.png";
		}
	}
}
