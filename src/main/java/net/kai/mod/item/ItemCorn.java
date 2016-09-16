package net.kai.mod.item;

import net.kai.mod.KaiMod;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraftforge.oredict.OreDictionary;

public class ItemCorn extends ItemFood implements ItemModelProvider, ItemOreDict {

    public ItemCorn() {
        super(3, 0.6f, false);
        setUnlocalizedName("corn");
        setRegistryName("corn");
        setCreativeTab(KaiMod.KAI_TAB);
        // TODO Auto-generated constructor stub
    }

    @Override
    public void initOreDict() {
        OreDictionary.registerOre("cropCorn", this);
        
    }

    @Override
    public void registerItemModel(Item item) {
        KaiMod.proxy.registerItemRenderer(this, 0, "corn");
        
    }

}
