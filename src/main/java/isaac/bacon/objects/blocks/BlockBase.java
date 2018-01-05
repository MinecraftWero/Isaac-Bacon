package isaac.bacon.objects.blocks;

import isaac.bacon.Main;
import isaac.bacon.init.BlockInit;
import isaac.bacon.init.ItemInit;
import isaac.bacon.util.IHasModel;
import isaac.bacon.util.Reference;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

public class BlockBase extends Block implements IHasModel {

public BlockBase(String name, Material material){

    super(material);
    setUnlocalizedName(name);
    setRegistryName(name);
    setCreativeTab(Main.TAB_BACON);
    setHardness(1.0F);
    setResistance(10F);
    BlockInit.BLOCKS.add(this);
    ItemInit.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
}

    @Override
    public void registerModels()
    {
        Main.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
    }
}

