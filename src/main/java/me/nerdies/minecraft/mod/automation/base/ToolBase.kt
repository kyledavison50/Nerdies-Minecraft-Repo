package me.nerdies.minecraft.mod.automation.base

import me.nerdies.minecraft.mod.Nerdiesmod
import net.minecraft.item.ItemSword

open class ToolBase(val name: String, material: ToolMaterial = ToolMaterial.WOOD): ItemSword(material)
{
    init
    {
        setRegistryName(name)
        translationKey = name
        creativeTab = Nerdiesmod.creativeTab
    }

    fun registerItemModel()
    {
        Nerdiesmod.proxy.registerItemRenderer(this, 0, name)
    }
}