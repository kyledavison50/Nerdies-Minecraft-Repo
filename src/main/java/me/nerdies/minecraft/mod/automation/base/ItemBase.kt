package me.nerdies.minecraft.mod.automation.base

import me.nerdies.minecraft.mod.Nerdiesmod
import net.minecraft.item.Item


open class ItemBase(var name: String) : Item()
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