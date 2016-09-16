package net.kai.mod.item;

import net.kai.mod.KaiMod;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBase extends Item implements ItemModelProvider {
    protected String name;
    
    public ItemBase(String name) {
        super();
        this.name = name;
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(KaiMod.KAI_TAB);
    }
    
    @Override
    public void registerItemModel(Item item) {
        KaiMod.proxy.registerItemRenderer(this, 0, name);

    }
    
    @Override
    public ItemBase setCreativeTab(CreativeTabs tab) {
        super.setCreativeTab(tab);
        return this;
    }
}
