package me.nerdies.minecraft.mod.donottouch.registration

import net.minecraft.item.Item
import net.minecraftforge.registries.IForgeRegistry
import me.nerdies.minecraft.mod.donottouch.base.ItemBase
import me.nerdies.minecraft.mod.donottouch.base.SwordBase
import me.nerdies.minecraft.mod.donottouch.base.ToolBase

open class RegisterItems
{
    val itemList = arrayListOf<Item>()

    fun register(registry: IForgeRegistry<Item>)
    {
        for(item in itemList)
        {
            registry.register(item)
        }
    }

    fun registerModels()
    {
        for(item in itemList)
        {
            if(item is ItemBase)
            {
                item.registerItemModel()
            }
            else if (item is ToolBase)
            {
                item.registerItemModel()
            }
            else if (item is SwordBase)
            {
                item.registerItemModel()
            }
        }
    }
}