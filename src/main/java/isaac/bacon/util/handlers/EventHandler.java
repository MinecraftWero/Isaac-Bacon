package isaac.bacon.util.handlers;

import isaac.bacon.init.ItemInit;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.passive.EntityCow;
import net.minecraft.entity.passive.EntityPig;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.entity.living.LivingDropsEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import java.util.Random;

@Mod.EventBusSubscriber
public class EventHandler {

    @SubscribeEvent
    public static void onEntityDrop(LivingDropsEvent event) {

        if (event.getEntityLiving() instanceof EntityPig) {

            Random rand = new Random();

            boolean extraDrop = rand.nextBoolean();

            ItemStack drop = new ItemStack(ItemInit.RAW_BACON, extraDrop ? 3 : 2);

            event.getDrops().add(new EntityItem(event.getEntity().getEntityWorld(), event.getEntity().posX, event.getEntity().posY, event.getEntity().posZ, drop));

        }

        if (event.getEntityLiving() instanceof EntityCow) {

            Random rand = new Random();

            boolean extraDrop = rand.nextBoolean();

            ItemStack drop = new ItemStack(ItemInit.RAW_BEEF, extraDrop ? 3 : 2);

            event.getDrops().add(new EntityItem(event.getEntity().getEntityWorld(), event.getEntity().posX, event.getEntity().posY, event.getEntity().posZ, drop));

        }
    }
}

