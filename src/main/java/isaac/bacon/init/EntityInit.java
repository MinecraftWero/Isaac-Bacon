package isaac.bacon.init;

        import net.minecraft.entity.Entity;
        import net.minecraft.util.ResourceLocation;
        import net.minecraftforge.fml.common.registry.EntityRegistry;
public class EntityInit {

    private static int entityID = 1;
    public static void registerModEntity(ResourceLocation registryName, Class<? extends Entity> entityClass, String name, Object mod, int trackRange, int updateFreq, boolean sVU)
    {
        EntityRegistry.registerModEntity(registryName, entityClass, name, ++entityID, mod, trackRange, updateFreq, sVU);
    }
}