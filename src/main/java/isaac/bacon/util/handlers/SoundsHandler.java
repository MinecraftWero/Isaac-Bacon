package isaac.bacon.util.handlers;

import isaac.bacon.util.Reference;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

@Mod.EventBusSubscriber
public class SoundsHandler {

    public static final SoundEvent PIG_FART = registerSound("item.launcher.shoot");

    @SubscribeEvent
    public static void registerSounds(RegistryEvent.Register<SoundEvent> event){
        event.getRegistry().registerAll(PIG_FART);
    }
    private static SoundEvent registerSound(String name){
        ResourceLocation location = new ResourceLocation(Reference.MODID, name);
        SoundEvent event = new SoundEvent(location);
        event.setRegistryName(name);
        return event;
    }
}
