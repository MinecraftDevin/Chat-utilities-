package com.minecraftdevin.chatutilities.init;

import com.minecraftdevin.chatutilities.block.BlockChatUtility;
import com.minecraftdevin.chatutilities.block.BlockSlapper;
import com.minecraftdevin.chatutilities.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)

public class ModBlocks
{
    public static final BlockChatUtility slapper = new BlockSlapper();

    public static void init()
    {
        GameRegistry.registerBlock(slapper, "SlapBlock");
    }
}
