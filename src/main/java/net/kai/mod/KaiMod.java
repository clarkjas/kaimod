package net.kai.mod;

import net.kai.mod.block.ModBlocks;
import net.kai.mod.client.KaiModTab;
import net.kai.mod.item.ModItems;
import net.kai.mod.proxy.CommonProxy;
import net.kai.mod.recipe.ModRecipes;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = KaiMod.modId, name = KaiMod.name, version = KaiMod.version)
public class KaiMod {
    public static final String modId = "KaiMod";
    public static final String name = "Kai's Mod";
    public static final String version = "1.0.0";
    
    @Mod.Instance(modId)
    public static KaiMod instance;
    
    @SidedProxy(serverSide = "net.kai.mod.proxy.CommonProxy", clientSide = "net.kai.mod.proxy.ClientProxy")
    public static CommonProxy proxy;
    
    public static final KaiModTab KAI_TAB = new KaiModTab();
    
    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        System.out.println(name + " is loadin!");
        
        //Blocks MUST be initialized before Items
        ModBlocks.init();
        
        ModItems.init();
    }
    
    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        ModRecipes.init(); //Initialize Recipes here because we need blocks/Items initialized before
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        
    }

}
