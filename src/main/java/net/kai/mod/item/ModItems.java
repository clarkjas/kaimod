package net.kai.mod.item;

import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModItems {
    
    public static ItemBase gemRuby;
    public static ItemBase gemEmerald;
    public static ItemBase gemGoldenDiamond;
    public static ItemBase gemBlueDiamond;
    public static ItemBase ingotCopper;
    
    
    public static ItemCornSeed cornSeed;
    public static ItemCorn     corn;
    
    public static void init() {
     
        gemRuby          = register(new ItemBase("gemRuby"));
        gemEmerald       = register(new ItemBase("gemEmerald"));
        gemBlueDiamond   = register(new ItemBase("gemBlueDiamond"));
        gemGoldenDiamond = register(new ItemBase("gemGoldenDiamond"));
        
        ingotCopper      = register(new ItemOre("ingotCopper", "ingotCopper"));
        
        cornSeed = register(new ItemCornSeed());
        
        corn     = register(new ItemCorn());
    }
    
    private static <T extends Item> T register(T item) {
        GameRegistry.register(item);
        if (item instanceof ItemModelProvider) {
            System.out.println("Registering item " + item.getRegistryName());
            ((ItemModelProvider)item).registerItemModel(item);
        }
        
        if (item instanceof ItemOreDict) {
            ((ItemOreDict)item).initOreDict();
        }
        
        return item;
    }
}
