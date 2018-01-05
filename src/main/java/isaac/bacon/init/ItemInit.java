package isaac.bacon.init;

import isaac.bacon.objects.armor.ArmorBase;
import isaac.bacon.objects.food.FoodBase;
import isaac.bacon.objects.food.SoupBeef;
import isaac.bacon.objects.items.LauncherBacon;
import isaac.bacon.objects.items.TestItem;
import isaac.bacon.objects.tools.*;
import isaac.bacon.util.Reference;
import net.minecraft.init.MobEffects;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.potion.PotionEffect;
import net.minecraftforge.common.util.EnumHelper;

import java.util.ArrayList;
import java.util.List;

public class ItemInit {

    public static final List<Item> ITEMS = new ArrayList<>();

    //Material
    public static final Item.ToolMaterial TOOL_BACON = EnumHelper.addToolMaterial("tool_bacon", 0, 59, 2.0F, 0.0F, 15);
    public static final ItemArmor.ArmorMaterial ARMOR_BACON = EnumHelper.addArmorMaterial("armor_bacon", Reference.MODID + ":bacon", 13, new int[]{1, 2, 3, 1}, 10, SoundEvents.ENTITY_PIG_HURT, 0.0F);

    //Launcher
    public static final Item LAUNCHER_BACON = new LauncherBacon("launcher_bacon");
    public static final Item TEST_ITEM = new TestItem("test_item");

    //Food
    public static final Item RAW_BACON = new FoodBase("raw_bacon", 1, 0.3F, true, new PotionEffect(MobEffects.POISON, 40, 1));
    public static final Item COOKED_BACON = new FoodBase("cooked_bacon", 2, 0.6F, false);
    public static Item GAY_BACON =  new FoodBase("gay_bacon", 2, 0.2F, false, new PotionEffect(MobEffects.SPEED, 100, 1)).setAlwaysEdible();
    public static Item FRIED_EGG =  new FoodBase("fried_egg", 3, 1.2F, false);
    public static Item CHEESE_SLICE = new FoodBase("cheese_slice", 2, 0.40F, false);
    public static final Item RAW_BEEF = new FoodBase("raw_beef", 2, 0.6F, false);
    public static final Item ROAST_BEEF = new FoodBase("roast_beef", 4, 1.6F, false);
    public static final Item SOUP_BEEF = new SoupBeef("soup_beef", 5, 2.0F, false);
    public static final Item SANDWICH_BACON = new FoodBase("sandwich_bacon",7, 1.7F, false);
    public static final Item DELUXE_SANDWICH = new FoodBase("deluxe_sandwich", 9, 2.0F, true);


    //Tools
    public static final Item AXE_BACON = new ToolAxe("axe_bacon", TOOL_BACON);
    public static final Item HOE_BACON = new ToolHoe("hoe_bacon", TOOL_BACON);
    public static final Item SWORD_BACON = new ToolSword("sword_bacon", TOOL_BACON);
    public static final Item PICKAXE_BACON = new ToolPickaxe("pickaxe_bacon", TOOL_BACON);
    public static final Item SPADE_BACON = new ToolSpade("spade_bacon", TOOL_BACON);

    //Armor
    public static final Item HELMET_BACON = new ArmorBase("helmet_bacon", ARMOR_BACON, 1, EntityEquipmentSlot.HEAD);
    public static final Item CHESTPLATE_BACON = new ArmorBase("chestplate_bacon", ARMOR_BACON, 1, EntityEquipmentSlot.CHEST);
    public static final Item LEGGINGS_BACON = new ArmorBase("leggings_bacon", ARMOR_BACON, 2, EntityEquipmentSlot.LEGS);
    public static final Item BOOTS_BACON = new ArmorBase("boots_bacon", ARMOR_BACON, 1, EntityEquipmentSlot.FEET);
}
