package fr.choka.csmm.init;

import fr.choka.csmm.CSMM;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.function.Supplier;

public class ModBlocks {

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, CSMM.MODID);


    public static final RegistryObject<Block> SHOTARIUM_ORE = createBlock("shotarium_ore", () -> new Block(AbstractBlock.Properties.create(Material.ROCK).hardnessAndResistance(3f,15f).harvestTool(ToolType.PICKAXE).setRequiresTool()));
    public static final RegistryObject<Block> SHOTARIUM_BLOCK = createBlock("shotarium_block", () -> new Block(AbstractBlock.Properties.create(Material.IRON).hardnessAndResistance(3f,15f).harvestTool(ToolType.PICKAXE).harvestLevel(2).setRequiresTool()));


    public static final RegistryObject<Block> LOLINITE_ORE = createBlock("lolinite_ore", () -> new Block(AbstractBlock.Properties.create(Material.ROCK).hardnessAndResistance(3f,15f).harvestTool(ToolType.PICKAXE).setRequiresTool()));
    public static final RegistryObject<Block> LOLINITE_BLOCK = createBlock("lolinite_block", () -> new Block(AbstractBlock.Properties.create(Material.IRON).hardnessAndResistance(3f,15f).harvestTool(ToolType.PICKAXE).harvestLevel(2).setRequiresTool()));


    public static final RegistryObject<Block> HUSBANDITE_ORE = createBlock("husbandite_ore", () -> new Block(AbstractBlock.Properties.create(Material.ROCK).hardnessAndResistance(3f,15f).harvestTool(ToolType.PICKAXE).setRequiresTool()));
    public static final RegistryObject<Block> HUSBANDITE_BLOCK = createBlock("husbandite_block", () -> new Block(AbstractBlock.Properties.create(Material.IRON).hardnessAndResistance(3f,15f).harvestTool(ToolType.PICKAXE).harvestLevel(2).setRequiresTool()));


    public static final RegistryObject<Block> WAIFURIUM_ORE = createBlock("waifurium_ore", () -> new Block(AbstractBlock.Properties.create(Material.ROCK).hardnessAndResistance(3f,15f).harvestTool(ToolType.PICKAXE).setRequiresTool()));
    public static final RegistryObject<Block> WAIFURIUM_BLOCK = createBlock("waifurium_block", () -> new Block(AbstractBlock.Properties.create(Material.IRON).hardnessAndResistance(3f,15f).harvestTool(ToolType.PICKAXE).harvestLevel(2).setRequiresTool()));

    public static RegistryObject<Block> createBlock(String name, Supplier<? extends Block> supplier)
    {
        RegistryObject<Block> block = BLOCKS.register(name, supplier);
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
        return block;
    }
}
