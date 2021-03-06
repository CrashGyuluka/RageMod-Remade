
package net.mcreator.ragemod.entity;

import net.mcreator.ragemod.init.RagemodModItems;
import net.mcreator.ragemod.init.RagemodModEntities;

import java.util.Random;

@OnlyIn(value = Dist.CLIENT, _interface = ItemSupplier.class)
public class RageiumBowEntity extends AbstractArrow implements ItemSupplier {
	public RageiumBowEntity(PlayMessages.SpawnEntity packet, Level world) {
		super(RagemodModEntities.RAGEIUM_BOW.get(), world);
	}

	public RageiumBowEntity(EntityType<? extends RageiumBowEntity> type, Level world) {
		super(type, world);
	}

	public RageiumBowEntity(EntityType<? extends RageiumBowEntity> type, double x, double y, double z, Level world) {
		super(type, x, y, z, world);
	}

	public RageiumBowEntity(EntityType<? extends RageiumBowEntity> type, LivingEntity entity, Level world) {
		super(type, entity, world);
	}

	@Override
	public Packet<?> getAddEntityPacket() {
		return NetworkHooks.getEntitySpawningPacket(this);
	}

	@Override
	@OnlyIn(Dist.CLIENT)
	public ItemStack getItem() {
		return new ItemStack(RagemodModItems.RAGEIUM_ARROW.get());
	}

	@Override
	protected ItemStack getPickupItem() {
		return new ItemStack(RagemodModItems.RAGEIUM_ARROW.get());
	}

	@Override
	protected void doPostHurtEffects(LivingEntity entity) {
		super.doPostHurtEffects(entity);
		entity.setArrowCount(entity.getArrowCount() - 1);
	}

	@Override
	public void tick() {
		super.tick();
		if (this.inGround)
			this.discard();
	}

	public static RageiumBowEntity shoot(Level world, LivingEntity entity, Random random, float power, double damage, int knockback) {
		RageiumBowEntity entityarrow = new RageiumBowEntity(RagemodModEntities.RAGEIUM_BOW.get(), entity, world);
		entityarrow.shoot(entity.getViewVector(1).x, entity.getViewVector(1).y, entity.getViewVector(1).z, power * 2, 0);
		entityarrow.setSilent(true);
		entityarrow.setCritArrow(false);
		entityarrow.setBaseDamage(damage);
		entityarrow.setKnockback(knockback);
		entityarrow.setSecondsOnFire(100);
		world.addFreshEntity(entityarrow);
		world.playSound(null, entity.getX(), entity.getY(), entity.getZ(),
				ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.arrow.shoot")), SoundSource.PLAYERS, 1,
				1f / (random.nextFloat() * 0.5f + 1) + (power / 2));
		return entityarrow;
	}

	public static RageiumBowEntity shoot(LivingEntity entity, LivingEntity target) {
		RageiumBowEntity entityarrow = new RageiumBowEntity(RagemodModEntities.RAGEIUM_BOW.get(), entity, entity.level);
		double dx = target.getX() - entity.getX();
		double dy = target.getY() + target.getEyeHeight() - 1.1;
		double dz = target.getZ() - entity.getZ();
		entityarrow.shoot(dx, dy - entityarrow.getY() + Math.hypot(dx, dz) * 0.2F, dz, 1.2f * 2, 12.0F);
		entityarrow.setSilent(true);
		entityarrow.setBaseDamage(8);
		entityarrow.setKnockback(4);
		entityarrow.setCritArrow(false);
		entityarrow.setSecondsOnFire(100);
		entity.level.addFreshEntity(entityarrow);
		entity.level.playSound(null, entity.getX(), entity.getY(), entity.getZ(),
				ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.arrow.shoot")), SoundSource.PLAYERS, 1,
				1f / (new Random().nextFloat() * 0.5f + 1));
		return entityarrow;
	}
}
