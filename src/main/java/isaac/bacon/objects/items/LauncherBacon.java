package isaac.bacon.objects.items;

import isaac.bacon.Main;
import isaac.bacon.entities.EntityBacon;
import isaac.bacon.init.ItemInit;
import isaac.bacon.util.IHasModel;
import isaac.bacon.util.handlers.SoundsHandler;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.stats.StatList;
import net.minecraft.util.*;
import net.minecraft.world.World;

public class LauncherBacon extends Item implements IHasModel {


    public LauncherBacon(String name) {
        setUnlocalizedName(name);
        setRegistryName(name);
        setMaxStackSize(1);
        setCreativeTab(Main.TAB_BACON);
        ItemInit.ITEMS.add(this);
    }
    /**
     * Called when the equipped item is right clicked.
     */

    public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn)
    {
        ItemStack itemStack = playerIn.getHeldItem(handIn);

        for (int i = 0; i < playerIn.inventory.getSizeInventory(); ++i){

            ItemStack itemstack = playerIn.inventory.getStackInSlot(i);

            if(itemstack.getItem()== ItemInit.RAW_BACON){

                if(!playerIn.capabilities.isCreativeMode)

                    itemstack.shrink(1);

                if (!worldIn.isRemote)
                {
                    EntityBacon entitybacon = new EntityBacon(worldIn, playerIn);
                    entitybacon.shoot(playerIn, playerIn.rotationPitch, playerIn.rotationYaw, 0.0F, 1.5F, 1.0F);
                    worldIn.spawnEntity(entitybacon);
                    worldIn.playSound((EntityPlayer)null, playerIn.posX, playerIn.posY, playerIn.posZ, SoundsHandler.PIG_FART, SoundCategory.NEUTRAL, 1.0F, 2.0F);
                }
                break;
            }
        }

        playerIn.addStat(StatList.getObjectUseStats(this));
        return new ActionResult(EnumActionResult.SUCCESS, itemStack);
    }

    @Override
    public void registerModels()
    {
        Main.proxy.registerItemRenderer(this, 0, "inventory");

    }
}
