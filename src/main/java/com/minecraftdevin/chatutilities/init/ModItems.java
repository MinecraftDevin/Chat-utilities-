package com.minecraftdevin.chatutilities.init;

import com.minecraftdevin.chatutilities.Item.devinTestItem;
import com.minecraftdevin.chatutilities.Item.ItemTest;
import com.minecraftdevin.chatutilities.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModItems
{
    public static final ItemTest devinTest = new devinTestItem();

    public static void init()
    {
        GameRegistry.registerItem(devinTest, "TestItem");
    }
}
