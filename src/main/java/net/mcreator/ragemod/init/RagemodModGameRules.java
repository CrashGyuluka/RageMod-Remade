
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.ragemod.init;

import net.minecraftforge.fml.common.Mod;

import net.minecraft.world.level.GameRules;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class RagemodModGameRules {
	public static final GameRules.Key<GameRules.BooleanValue> SENDTELEPORTERFEEDBACK = GameRules.register("sendTeleporterFeedback",
			GameRules.Category.PLAYER, GameRules.BooleanValue.create(true));
}
