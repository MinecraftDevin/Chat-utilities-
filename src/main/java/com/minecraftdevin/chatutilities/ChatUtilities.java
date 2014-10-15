package com.minecraftdevin.chatutilities;

import com.minecraftdevin.chatutilities.handler.ConfigurationHandler;
import com.minecraftdevin.chatutilities.init.ModBlocks;
import com.minecraftdevin.chatutilities.init.ModItems;
import com.minecraftdevin.chatutilities.proxy.IProxy;
import com.minecraftdevin.chatutilities.reference.Reference;
import com.minecraftdevin.chatutilities.utility.LogHelper;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION, guiFactory = Reference.GUI_FACTORY_CLASS)
public class ChatUtilities
{
    @Mod.Instance("ChatUtilities")
    public static ChatUtilities instance;

    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
    public static IProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        ConfigurationHandler.init(event.getSuggestedConfigurationFile());
        FMLCommonHandler.instance().bus().register(new ConfigurationHandler());
        LogHelper.info("Pre Initialization complete!");

        ModItems.init();
        LogHelper.info("Loaded Items...");

        ModBlocks.init();
        LogHelper.info("Loaded blocks...");

    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {

    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {

    }
}
