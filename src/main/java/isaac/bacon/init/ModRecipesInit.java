package isaac.bacon.init;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.FurnaceRecipes;

public class ModRecipesInit {

    public static void init() {

        FurnaceRecipes.instance().addSmeltingRecipeForBlock(BlockInit.BLOCK_RAW_BACON, new ItemStack(BlockInit.BLOCK_COOKED_BACON), 0.70F);
        FurnaceRecipes.instance().addSmelting(ItemInit.RAW_BEEF, new ItemStack(ItemInit.ROAST_BEEF), 0.50F);
        FurnaceRecipes.instance().addSmelting(ItemInit.RAW_BACON, new ItemStack(ItemInit.COOKED_BACON), 0.35F);
        FurnaceRecipes.instance().addSmelting(Items.EGG, new ItemStack(ItemInit.FRIED_EGG), 0.40F);
        FurnaceRecipes.instance().addSmelting(Items.MILK_BUCKET, new ItemStack(ItemInit.CHEESE_SLICE, 6), 0.50F);
    }

}
