package fr.choka.csmm.utils;

import fr.choka.csmm.init.ModItems;
import net.minecraft.item.IItemTier;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.LazyValue;

public enum CustomItemTiers implements IItemTier {

    SHOTARIUM(2,  735, 7f, 2.5f,18, new LazyValue<>(() -> { return Ingredient.fromItems(ModItems.SHOTARIUM_INGOT.get());})),
    LOLINITE(2,  512, 7f, 2.5f,18, new LazyValue<>(() -> { return Ingredient.fromItems(ModItems.LOLINITE_INGOT.get());})),
    HUSBANDITE(5,  2553, 10.0F, 5.0F,15, new LazyValue<>(() -> { return Ingredient.fromItems(ModItems.HUSBANDITE_INGOT.get());})),
    WAIFURIUM(5,  2553, 10.0F, 5.0F,15, new LazyValue<>(() -> { return Ingredient.fromItems(ModItems.WAIFURIUM_INGOT.get());}));

    private final int harvestLevel;
    private final int maxUses;
    private final float efficiency;
    private final float attackDamage;
    private final int enchantability;
    private final LazyValue<Ingredient> repairMaterial;

    CustomItemTiers(int harvestLevel, int maxUses, float efficiency, float attackDamage, int enchantability, LazyValue<Ingredient> repairMaterial) {
        this.harvestLevel = harvestLevel;
        this.maxUses = maxUses;
        this.efficiency = efficiency;
        this.attackDamage = attackDamage;
        this.enchantability = enchantability;
        this.repairMaterial = repairMaterial;
    }

    @Override
    public int getMaxUses() {
        return maxUses;
    }

    @Override
    public float getEfficiency() {
        return efficiency;
    }

    @Override
    public float getAttackDamage() {
        return attackDamage;
    }

    @Override
    public int getHarvestLevel() {
        return harvestLevel;
    }

    @Override
    public int getEnchantability() {
        return enchantability;
    }

    @Override
    public Ingredient getRepairMaterial() {
        return repairMaterial.getValue();
    }
}
