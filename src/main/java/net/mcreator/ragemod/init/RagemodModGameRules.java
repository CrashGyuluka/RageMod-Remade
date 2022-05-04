
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.ragemod.init;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class RagemodModGameRules {
	public static final GameRules.Key<GameRules.BooleanValue> SENDTELEPORTERFEEDBACK = GameRules.register("sendTeleporterFeedback",
			GameRules.Category.PLAYER, GameRules.BooleanValue.create(true));
	public static final GameRules.Key<GameRules.BooleanValue> TOXICGIVESBADEFFECTS = GameRules.register("toxicGivesBadEffects",
			GameRules.Category.PLAYER, GameRules.BooleanValue.create(true));
	public static final GameRules.Key<GameRules.BooleanValue> DORAGEMODAIRBLOCKSWORK = GameRules.register("doRagemodAirBlocksWork",
			GameRules.Category.UPDATES, GameRules.BooleanValue.create(true));
}
