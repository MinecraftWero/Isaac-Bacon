package isaac.bacon.init;

import isaac.bacon.objects.blocks.BlockBase;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

import java.util.ArrayList;
import java.util.List;

public class BlockInit {

    public static final List<Block> BLOCKS = new ArrayList<Block>();

    public static final Block BLOCK_RAW_BACON = new BlockBase("block_raw_bacon", Material.CAKE);
    public static final Block BLOCK_COOKED_BACON = new BlockBase("block_cooked_bacon", Material.CAKE);
}
