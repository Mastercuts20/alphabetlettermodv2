package me.mastercuts20.alphabetlettermodv2.proxy;

import me.mastercuts20.alphabetlettermodv2.init.ModBlocks;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class ClientProxy extends CommonProxy {

    @Override
    public void preInit(FMLPreInitializationEvent e) {

        ModBlocks.registerRenders();
    }
}
