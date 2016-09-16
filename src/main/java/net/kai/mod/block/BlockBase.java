package net.kai.mod.block;

import net.kai.mod.KaiMod;
import net.kai.mod.item.ItemModelProvider;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class BlockBase extends Block implements ItemModelProvider {
    protected String name;
    public BlockBase(Material materialIn, String name) {
        super(materialIn);
        this.name = name;
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(KaiMod.KAI_TAB);
        
    }
    
    @Override
    public void registerItemModel(Item block) {
        KaiMod.proxy.registerItemRenderer(block, 0, name);
    }
    
    @Override
    public BlockBase setCreativeTab(CreativeTabs tab) {
        super.setCreativeTab(tab);
        return this;
    }

}
