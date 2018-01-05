package isaac.bacon.objects.food;

import isaac.bacon.Main;
import isaac.bacon.init.ItemInit;
import isaac.bacon.util.IHasModel;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import javax.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;

public class FoodBase extends ItemFood implements IHasModel {

    private PotionEffect[] effects;

    public FoodBase(String name, int amount, float saturation, boolean isWolfFood, PotionEffect... potionEffects ) {
        super(amount, saturation, isWolfFood);
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(Main.TAB_BACON);
        this.effects = potionEffects;
        ItemInit.ITEMS.add(this);
    }

        @Override
    protected void onFoodEaten(ItemStack stack, World worldIn, EntityPlayer player) {
        for (PotionEffect effect : effects) {
            player.addPotionEffect(new PotionEffect(effect));
        }
    }

    @Override
    public FoodBase setAlwaysEdible() {
        super.setAlwaysEdible();
        return this;
    }

    @Override
    public void registerModels()
    {
        Main.proxy.registerItemRenderer(this, 0, "inventory");
    }
}

