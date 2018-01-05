package isaac.bacon.proxy;

import isaac.bacon.init.ModRecipesInit;
import isaac.bacon.util.handlers.SoundsHandler;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class CommonProxy {

    public  void preInit(FMLPreInitializationEvent event){ }

    public void init(FMLInitializationEvent event) { }

    public void postInit(FMLPostInitializationEvent event) {
        ModRecipesInit.init();
    }

    public void registerItemRenderer(Item item, int meta, String id) { }

}
