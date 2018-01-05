package isaac.bacon.customtab;

import isaac.bacon.init.ItemInit;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class CustomTab extends CreativeTabs {

    public CustomTab(String label) { super("tab_bacon"); }

    public ItemStack getTabIconItem() { return new ItemStack(ItemInit.RAW_BACON);}
}
