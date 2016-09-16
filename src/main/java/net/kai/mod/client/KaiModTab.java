package net.kai.mod.client;

import net.kai.mod.KaiMod;
import net.kai.mod.item.ModItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class KaiModTab extends CreativeTabs {

    public KaiModTab() {
        super(KaiMod.modId);
        setBackgroundImageName("tutorialmod.png");
    }
    
    @Override
    public Item getTabIconItem() {
        return ModItems.gemGoldenDiamond;
    }
    
    @Override
    public boolean hasSearchBar() {
        return true;
    }
}
