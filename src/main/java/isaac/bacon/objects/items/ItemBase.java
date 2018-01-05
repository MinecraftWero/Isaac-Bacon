package isaac.bacon.objects.items;

import isaac.bacon.Main;
import isaac.bacon.customtab.CustomTab;
import isaac.bacon.init.ItemInit;
import isaac.bacon.util.IHasModel;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBase extends Item implements IHasModel{

    public ItemBase(String name){
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(Main.TAB_BACON);
        ItemInit.ITEMS.add(this);
    }

    @Override
    public void registerModels()
    {
        Main.proxy.registerItemRenderer(this, 0, "inventory");
    }
}
