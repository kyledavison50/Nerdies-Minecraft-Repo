package me.nerdies.minecraft.mod.mymod.registration

import me.nerdies.minecraft.mod.donottouch.registration.RegisterBlocks
import me.nerdies.minecraft.mod.mymod.blocks.CopperOre


object ModBlocks : RegisterBlocks()
{
    private var oreCopper = CopperOre()

    init
    {
        blockList.add(oreCopper)
    }
}