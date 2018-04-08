package me.mastercuts20.alphabetlettermodv2;

import me.mastercuts20.alphabetlettermodv2.init.ModBlocks;
import me.mastercuts20.alphabetlettermodv2.proxy.CommonProxy;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = ModInfo.MOD_ID, version = ModInfo.MOD_VERSION, name = ModInfo.MOD_NAME, acceptedMinecraftVersions = ModInfo.ACCEPTED_MINECRAFT_VERSIONS)
public class almv2 {
    @Mod.Instance
    public static almv2 instance;
    @SidedProxy(clientSide = ModInfo.CLIENT_PROXY, serverSide = ModInfo.SERVER_PROXY)
    public static CommonProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent e) {
        ModBlocks.init();
        ModBlocks.registerBlocks();
        proxy.preInit(e);
    }

    public void Init(FMLInitializationEvent e) {
        proxy.Init(e);
    }

    public void postInit(FMLPostInitializationEvent e) {
        proxy.PostInit(e);
    }

    public static CreativeTabs letters = new CreativeTabs("letters") {
        @Override
        public ItemStack getTabIconItem() {
            return new ItemStack(ModBlocks.lettera);
        }
    };
}
