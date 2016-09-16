package net.kai.mod.item;

import net.kai.mod.KaiMod;
import net.kai.mod.block.ModBlocks;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSeeds;

public class ItemCornSeed extends ItemSeeds implements ItemModelProvider {
    public ItemCornSeed() {
        super(ModBlocks.cropCorn, Blocks.FARMLAND);
        setUnlocalizedName("cornSeed");
        setRegistryName("cornCrop");
        setCreativeTab(KaiMod.KAI_TAB);
    }

    @Override
    public void registerItemModel(Item item) {
        KaiMod.proxy.registerItemRenderer(this, 0, "cornSeed");
        
    }
}
