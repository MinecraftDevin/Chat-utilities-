package com.minecraftdevin.chatutilities.block;

import com.minecraftdevin.chatutilities.creativetab.CreativeTabChatUtil;
import net.minecraft.block.material.Material;

public class BlockSlapper extends BlockChatUtility

{
    public BlockSlapper()
    {
        super();
        this.setBlockName("slapper");
        this.setBlockTextureName("slapper");
        this.setHardness(1F);
        this.setCreativeTab(CreativeTabChatUtil.ChatUtilities_TAB);
    }

}
