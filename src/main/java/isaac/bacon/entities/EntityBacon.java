package isaac.bacon.entities;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.projectile.EntityThrowable;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class EntityBacon extends EntityThrowable {

    public EntityBacon(World worldIn)
    {
        super(worldIn);
    }

    public EntityBacon(World worldIn, EntityLivingBase throwerIn)
    {
        super(worldIn, throwerIn);
    }

    @SideOnly(Side.CLIENT)
    public EntityBacon(World worldIn, double x, double y, double z)
    {
        super(worldIn, x, y, z);
    }

	    /*
	    public static void registerFixesSnowball(DataFixer fixer)
	    {
	        EntityThrowable.registerFixesThrowable(fixer, "Snowball");
	    }*/

    @SideOnly(Side.CLIENT)
    public void handleStatusUpdate(byte id)
    {
        if (id == 3)
        {
            for (int i = 0; i < 8; ++i)
            {
                this.world.spawnParticle(EnumParticleTypes.REDSTONE, this.posX, this.posY, this.posZ, rand.nextDouble(), rand.nextDouble(), rand.nextDouble());

            }
        }
    }

    /**
     * Called when this EntityThrowable hits a block or entity.
     */
    protected void onImpact(RayTraceResult result)
    {
        if (result.entityHit != null)
        {
            int i = 0;
	/*
	            if (result.entityHit instanceof EntityBlaze)
	            {
	                i = 3;
	            }*/

            result.entityHit.attackEntityFrom(DamageSource.causeThrownDamage(this, this.getThrower()), (float)i);
        }

        if (!this.world.isRemote)
        {
            this.world.setEntityState(this, (byte)3);
            this.setDead();
        }
    }
}

