package me.mastercuts20.alphabetlettermodv2.init;

import me.mastercuts20.alphabetlettermodv2.ModInfo;
import me.mastercuts20.alphabetlettermodv2.almv2;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModBlocks {
    public static Block lettera;
    public static Block lettere;
    public static Block lettert;
    public static Block lettern;
    public static Block letterk;
    public static Block letterm;
    public static Block trademark;




    public static void init() {
        lettera = new Block(Material.CLAY).setUnlocalizedName("lettera").setCreativeTab(almv2.letters);
        lettere = new Block(Material.CLAY).setUnlocalizedName("lettere").setCreativeTab(almv2.letters);
        lettert = new Block(Material.CLAY).setUnlocalizedName("lettert").setCreativeTab(almv2.letters);
        lettern = new Block(Material.CLAY).setUnlocalizedName("lettern").setCreativeTab(almv2.letters);
        letterk = new Block(Material.CLAY).setUnlocalizedName("letterk").setCreativeTab(almv2.letters);
        letterm = new Block(Material.CLAY).setUnlocalizedName("letterm").setCreativeTab(almv2.letters);
        trademark = new Block(Material.CLAY).setUnlocalizedName("trademark").setCreativeTab(almv2.letters);
    }




    public static void registerBlocks() {
        registerBlock(lettera);
        registerBlock(lettere);
        registerBlock(lettert);
        registerBlock(lettern);
        registerBlock(letterk);
        registerBlock(letterm);
        registerBlock(trademark);
    }


    public static void registerBlock(Block b){
        GameRegistry.register(b, new ResourceLocation(ModInfo.MOD_ID, b.getUnlocalizedName().substring(5)));
        GameRegistry.register(new ItemBlock(b), new ResourceLocation(ModInfo.MOD_ID, b.getUnlocalizedName().substring(5)));
    }



    public static void registerRenders() {
        registerRender(lettera);
        registerRender(lettern);
        registerRender(lettert);
        registerRender(lettere);
        registerRender(letterm);
        registerRender(letterk);
        registerRender(trademark);
    }

    public static void registerRender(Block b){
        Item item = Item.getItemFromBlock(b);
        ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(ModInfo.MOD_ID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
    }


}
