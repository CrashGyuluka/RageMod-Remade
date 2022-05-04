
package net.mcreator.ragemod.client.particle;

@OnlyIn(Dist.CLIENT)
public class RageParticleParticle extends TextureSheetParticle {
	public static RageParticleParticleProvider provider(SpriteSet spriteSet) {
		return new RageParticleParticleProvider(spriteSet);
	}

	public static class RageParticleParticleProvider implements ParticleProvider<SimpleParticleType> {
		private final SpriteSet spriteSet;

		public RageParticleParticleProvider(SpriteSet spriteSet) {
			this.spriteSet = spriteSet;
		}

		public Particle createParticle(SimpleParticleType typeIn, ClientLevel worldIn, double x, double y, double z, double xSpeed, double ySpeed,
				double zSpeed) {
			return new RageParticleParticle(worldIn, x, y, z, xSpeed, ySpeed, zSpeed, this.spriteSet);
		}
	}

	private final SpriteSet spriteSet;

	private float angularVelocity;
	private float angularAcceleration;

	protected RageParticleParticle(ClientLevel world, double x, double y, double z, double vx, double vy, double vz, SpriteSet spriteSet) {
		super(world, x, y, z);
		this.spriteSet = spriteSet;
		this.setSize(0.2f, 0.2f);

		this.lifetime = (int) Math.max(1, 10 + (this.random.nextInt(12) - 6));
		this.gravity = 0.2f;
		this.hasPhysics = true;
		this.xd = vx * 0.9;
		this.yd = vy * 0.9;
		this.zd = vz * 0.9;
		this.angularVelocity = -0.2f;
		this.angularAcceleration = 0.01f;
		this.setSpriteFromAge(spriteSet);
	}

	@Override
	public ParticleRenderType getRenderType() {
		return ParticleRenderType.PARTICLE_SHEET_OPAQUE;
	}

	@Override
	public void tick() {
		super.tick();
		this.oRoll = this.roll;
		this.roll += this.angularVelocity;
		this.angularVelocity += this.angularAcceleration;
		if (!this.removed) {
			this.setSprite(this.spriteSet.get((this.age / 1) % 27 + 1, 27));
		}
	}
}
