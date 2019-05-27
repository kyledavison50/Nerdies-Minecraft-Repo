package me.nerdies.minecraft.mod.automation.registration

import net.minecraft.block.Block
import net.minecraft.item.Item
import net.minecraftforge.registries.IForgeRegistry
import me.nerdies.minecraft.mod.automation.base.BlockBase

open class RegisterBlocks
{
    val blockList = ArrayList<Block>()
    fun register(registry: IForgeRegistry<Block>)
    {
        for(block in blockList)
        {
            registry.register(block)
        }
    }

    fun registerItemBlocks(registry: IForgeRegistry<Item>)
    {
        for(block in blockList)
        {
            if (block is BlockBase)
            {
                registry.register(block.createItemBlock())
            }
        }
    }

    fun registerModels()
    {
        for(block in blockList)
        {
            if (block is BlockBase)
            {
                block.registerItemModel(Item.getItemFromBlock(block))
            }
        }
    }
}