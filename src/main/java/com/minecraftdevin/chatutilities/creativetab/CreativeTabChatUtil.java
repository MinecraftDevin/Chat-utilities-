package com.minecraftdevin.chatutilities.creativetab;

import com.minecraftdevin.chatutilities.init.ModItems;
import com.minecraftdevin.chatutilities.reference.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CreativeTabChatUtil
{
    public static final CreativeTabs ChatUtilities_TAB = new CreativeTabs(Reference.MOD_ID)
    {
        @Override
        public Item getTabIconItem()
        {
            return ModItems.devinTest;
        }

        @Override
        public String getTranslatedTabLabel()
        {
            return "Chat Utilities";
        }
    };
}
