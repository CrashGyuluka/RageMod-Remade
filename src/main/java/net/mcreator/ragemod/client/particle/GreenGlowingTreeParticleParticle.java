
package net.mcreator.ragemod.client.particle;

@OnlyIn(Dist.CLIENT)
public class GreenGlowingTreeParticleParticle extends TextureSheetParticle {
	public static GreenGlowingTreeParticleParticleProvider provider(SpriteSet spriteSet) {
		return new GreenGlowingTreeParticleParticleProvider(spriteSet);
	}

	public static class GreenGlowingTreeParticleParticleProvider implements ParticleProvider<SimpleParticleType> {
		private final SpriteSet spriteSet;

		public GreenGlowingTreeParticleParticleProvider(SpriteSet spriteSet) {
			this.spriteSet = spriteSet;
		}

		public Particle createParticle(SimpleParticleType typeIn, ClientLevel worldIn, double x, double y, double z, double xSpeed, double ySpeed,
				double zSpeed) {
			return new GreenGlowingTreeParticleParticle(worldIn, x, y, z, xSpeed, ySpeed, zSpeed, this.spriteSet);
		}
	}

	private final SpriteSet spriteSet;

	private float angularVelocity;
	private float angularAcceleration;

	protected GreenGlowingTreeParticleParticle(ClientLevel world, double x, double y, double z, double vx, double vy, double vz,
			SpriteSet spriteSet) {
		super(world, x, y, z);
		this.spriteSet = spriteSet;
		this.setSize(0.2f, 0.2f);

		this.lifetime = (int) Math.max(1, 7 + (this.random.nextInt(8) - 4));
		this.gravity = 0.3f;
		this.hasPhysics = true;
		this.xd = vx * 1;
		this.yd = vy * 1;
		this.zd = vz * 1;
		this.angularVelocity = -0.2f;
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
