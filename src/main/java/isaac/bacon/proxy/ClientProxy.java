package isaac.bacon.proxy;

import isaac.bacon.Main;
import isaac.bacon.entities.EntityBacon;
import isaac.bacon.entities.EntityTest;
import isaac.bacon.init.EntityInit;
import isaac.bacon.renders.RenderBacon;
import isaac.bacon.util.Reference;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.EntityEntryBuilder;

import static isaac.bacon.Main.proxy;

public class ClientProxy extends CommonProxy {

    @Override
    public void preInit(FMLPreInitializationEvent event) {
        super.preInit(event);
        ResourceLocation render_bacon = new ResourceLocation(Reference.MODID);
        EntityInit.registerModEntity(render_bacon, EntityBacon.class, "render_bacon", Main.INSTANCE, 64, 10, true);
        RenderingRegistry.registerEntityRenderingHandler(EntityBacon.class, RenderBacon.FACTORY);

    }
    @Override
    public void init(FMLInitializationEvent event) {
        super.init(event);
    }

    @Override
    public void postInit(FMLPostInitializationEvent event) {
        super.postInit(event);
    }

    @Override
    public void registerItemRenderer(Item item, int meta, String id)
    {
        super.registerItemRenderer(item, meta, id);
        ModelLoader.setCustomModelResourceLocation(item, meta, new ModelResourceLocation(item.getRegistryName(), id));
    }

}
