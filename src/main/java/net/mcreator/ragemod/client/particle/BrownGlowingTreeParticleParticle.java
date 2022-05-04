
package net.mcreator.ragemod.client.particle;

@OnlyIn(Dist.CLIENT)
public class BrownGlowingTreeParticleParticle extends TextureSheetParticle {
	public static BrownGlowingTreeParticleParticleProvider provider(SpriteSet spriteSet) {
		return new BrownGlowingTreeParticleParticleProvider(spriteSet);
	}

	public static class BrownGlowingTreeParticleParticleProvider implements ParticleProvider<SimpleParticleType> {
		private final SpriteSet spriteSet;

		public BrownGlowingTreeParticleParticleProvider(SpriteSet spriteSet) {
			this.spriteSet = spriteSet;
		}

		public Particle createParticle(SimpleParticleType typeIn, ClientLevel worldIn, double x, double y, double z, double xSpeed, double ySpeed,
				double zSpeed) {
			return new BrownGlowingTreeParticleParticle(worldIn, x, y, z, xSpeed, ySpeed, zSpeed, this.spriteSet);
		}
	}

	private final SpriteSet spriteSet;

	private float angularVelocity;
	private float angularAcceleration;

	protected BrownGlowingTreeParticleParticle(ClientLevel world, double x, double y, double z, double vx, double vy, double vz,
			SpriteSet spriteSet) {
		super(world, x, y, z);
		this.spriteSet = spriteSet;
		this.setSize(0.2f, 0.2f);

		this.lifetime = (int) Math.max(1, 74 + (this.random.nextInt(8) - 4));
		this.gravity = 0.1f;
		this.hasPhysics = true;
		this.xd = vx * 1;
		this.yd = vy * 1;
		this.zd = vz * 1;
		this.angularVelocity = 0f;
		this.angularAcceleration = 0.01f;
		this.pickSprite(spriteSet);
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
	}
}
