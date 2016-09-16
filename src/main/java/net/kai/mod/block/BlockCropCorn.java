package net.kai.mod.block;

import net.kai.mod.KaiMod;
import net.kai.mod.item.ModItems;
import net.minecraft.block.BlockCrops;
import net.minecraft.item.Item;

public class BlockCropCorn extends BlockCrops {
    
    public BlockCropCorn() {
        setUnlocalizedName("cropCorn");
        setRegistryName("cropCorn");
        setCreativeTab(KaiMod.KAI_TAB);
    }
    
    @Override
    protected Item getSeed() {
        return ModItems.cornSeed;
    }
    
    @Override
    protected Item getCrop() {
        return ModItems.corn;
    }
}
