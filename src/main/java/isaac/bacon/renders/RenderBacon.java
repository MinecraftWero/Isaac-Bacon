package isaac.bacon.renders;


import isaac.bacon.entities.EntityBacon;
import isaac.bacon.init.ItemInit;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.RenderItem;
import net.minecraft.client.renderer.block.model.ItemCameraTransforms;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.entity.RenderSnowball;
import net.minecraft.client.renderer.texture.TextureMap;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.IRenderFactory;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class RenderBacon extends RenderSnowball<EntityBacon> {
    public static final RenderBacon.Factory FACTORY = new RenderBacon.Factory();

    public RenderBacon(RenderManager renderManager, RenderItem itemRenderer)
    {
        super(renderManager, null, itemRenderer);
    }

    public ItemStack getStackToRender(EntityBacon entityIn)
    {
        return new ItemStack(ItemInit.RAW_BACON);
    }

    public static class Factory implements IRenderFactory<EntityBacon>
    {
        @Override
        public Render<? super EntityBacon> createRenderFor(RenderManager manager)
        {
            return new RenderBacon(manager, Minecraft.getMinecraft().getRenderItem());
        }
    }
}