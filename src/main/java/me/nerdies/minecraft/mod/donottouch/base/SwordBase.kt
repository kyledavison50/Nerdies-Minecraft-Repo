package me.nerdies.minecraft.mod.donottouch.base

import me.nerdies.minecraft.mod.donottouch.Nerdiesmod
import net.minecraft.item.Item
import net.minecraft.item.ItemSword

open class SwordBase(val name: String, val material: ToolMaterial = ToolMaterial.WOOD): ItemSword(material)
{
    init
    {
        setRegistryName(name)
        translationKey = name
    }

    fun registerItemModel(item: Item)
    {
        Nerdiesmod.proxy.registerItemRenderer(this, 0, name)
    }
}