package fr.choka.csmm.init;

import fr.choka.csmm.CSMM;
import fr.choka.csmm.utils.CustomItemTiers;
import net.minecraft.item.*;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItems
{
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, CSMM.MODID);


    public static final RegistryObject<Item> SHOTARIUM_INGOT = ITEMS.register("shotarium_ingot", () -> new Item(new Item.Properties().group(ItemGroup.MATERIALS)));

    public static final RegistryObject<Item> SHOTARIUM_SWORD = ITEMS.register("shotarium_sword", () -> new SwordItem(CustomItemTiers.SHOTARIUM, 2, -2.4f, new Item.Properties().maxStackSize(1).group(ItemGroup.COMBAT)));
    public static final RegistryObject<Item> SHOTARIUM_PICKAXE = ITEMS.register("shotarium_pickaxe", () -> new PickaxeItem(CustomItemTiers.SHOTARIUM, 0, -2.4f, new Item.Properties().maxStackSize(1).group(ItemGroup.TOOLS)));
    public static final RegistryObject<Item> SHOTARIUM_SHOVEL = ITEMS.register("shotarium_shovel", () -> new ShovelItem(CustomItemTiers.SHOTARIUM, 0, -2.4f, new Item.Properties().maxStackSize(1).group(ItemGroup.TOOLS)));
    public static final RegistryObject<Item> SHOTARIUM_AXE = ITEMS.register("shotarium_axe", () -> new AxeItem(CustomItemTiers.SHOTARIUM, 0, -2.4f, new Item.Properties().maxStackSize(1).group(ItemGroup.TOOLS)));


    public static final RegistryObject<Item> LOLINITE_INGOT = ITEMS.register("lolinite_ingot", () -> new Item(new Item.Properties().group(ItemGroup.MATERIALS)));

    public static final RegistryObject<Item> LOLINITE_SWORD = ITEMS.register("lolinite_sword", () -> new SwordItem(CustomItemTiers.SHOTARIUM, 2, -2.4f, new Item.Properties().maxStackSize(1).group(ItemGroup.COMBAT)));
    public static final RegistryObject<Item> LOLINITE_PICKAXE = ITEMS.register("lolinite_pickaxe", () -> new PickaxeItem(CustomItemTiers.SHOTARIUM, 0, -2.4f, new Item.Properties().maxStackSize(1).group(ItemGroup.TOOLS)));
    public static final RegistryObject<Item> LOLINITE_SHOVEL = ITEMS.register("lolinite_shovel", () -> new ShovelItem(CustomItemTiers.SHOTARIUM, 0, -2.4f, new Item.Properties().maxStackSize(1).group(ItemGroup.TOOLS)));
    public static final RegistryObject<Item> LOLINITE_AXE = ITEMS.register("lolinite_axe", () -> new AxeItem(CustomItemTiers.SHOTARIUM, 0, -2.4f, new Item.Properties().maxStackSize(1).group(ItemGroup.TOOLS)));


    public static final RegistryObject<Item> HUSBANDITE_INGOT = ITEMS.register("husbandite_ingot", () -> new Item(new Item.Properties().group(ItemGroup.MATERIALS)));

    public static final RegistryObject<Item> HUSBANDITE_SWORD = ITEMS.register("husbandite_sword", () -> new SwordItem(CustomItemTiers.SHOTARIUM, 4, -2.4f, new Item.Properties().maxStackSize(1).group(ItemGroup.COMBAT)));
    public static final RegistryObject<Item> HUSBANDITE_PICKAXE = ITEMS.register("husbandite_pickaxe", () -> new PickaxeItem(CustomItemTiers.SHOTARIUM, 0, -2.4f, new Item.Properties().maxStackSize(1).group(ItemGroup.TOOLS)));
    public static final RegistryObject<Item> HUSBANDITE_SHOVEL = ITEMS.register("husbandite_shovel", () -> new ShovelItem(CustomItemTiers.SHOTARIUM, 0, -2.4f, new Item.Properties().maxStackSize(1).group(ItemGroup.TOOLS)));
    public static final RegistryObject<Item> HUSBANDITE_AXE = ITEMS.register("husbandite_axe", () -> new AxeItem(CustomItemTiers.SHOTARIUM, 0, -2.4f, new Item.Properties().maxStackSize(1).group(ItemGroup.TOOLS)));


    public static final RegistryObject<Item> WAIFURIUM_INGOT = ITEMS.register("waifurium_ingot", () -> new Item(new Item.Properties().group(ItemGroup.MATERIALS)));

    public static final RegistryObject<Item> WAIFURIUM_SWORD = ITEMS.register("waifurium_sword", () -> new SwordItem(CustomItemTiers.SHOTARIUM, 4, -2.4f, new Item.Properties().maxStackSize(1).group(ItemGroup.COMBAT)));
    public static final RegistryObject<Item> WAIFURIUM_PICKAXE = ITEMS.register("waifurium_pickaxe", () -> new PickaxeItem(CustomItemTiers.SHOTARIUM, 0, -2.4f, new Item.Properties().maxStackSize(1).group(ItemGroup.TOOLS)));
    public static final RegistryObject<Item> WAIFURIUM_SHOVEL = ITEMS.register("waifurium_shovel", () -> new ShovelItem(CustomItemTiers.SHOTARIUM, 0, -2.4f, new Item.Properties().maxStackSize(1).group(ItemGroup.TOOLS)));
    public static final RegistryObject<Item> WAIFURIUM_AXE = ITEMS.register("waifurium_axe", () -> new AxeItem(CustomItemTiers.SHOTARIUM, 0, -2.4f, new Item.Properties().maxStackSize(1).group(ItemGroup.TOOLS)));


}
