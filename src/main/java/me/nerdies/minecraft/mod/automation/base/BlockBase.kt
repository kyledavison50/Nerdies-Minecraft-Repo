package me.nerdies.minecraft.mod.automation.base

import me.nerdies.minecraft.mod.Nerdiesmod
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item
import net.minecraft.item.ItemBlock;


open class BlockBase(material: Material, var name: String) : Block(material)
{
    init
    {
        setRegistryName(name)
        translationKey = name
        super.setCreativeTab(Nerdiesmod.creativeTab)
    }

    fun registerItemModel(itemBlock: Item)
    {
        Nerdiesmod.proxy.registerItemRenderer(itemBlock, 0, name)
    }

    fun createItemBlock(): Item
    {
        return ItemBlock(this).setRegistryName(registryName)
    }
}