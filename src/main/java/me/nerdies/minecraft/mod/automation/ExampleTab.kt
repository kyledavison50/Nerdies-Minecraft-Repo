package me.nerdies.minecraft.mod.automation

import me.nerdies.minecraft.mod.ModInfo
import me.nerdies.minecraft.mod.mymod.registration.ModItems
import net.minecraft.item.ItemStack
import net.minecraft.creativetab.CreativeTabs

class ExampleTab : CreativeTabs(ModInfo.MOD_ID)
{
    init
    {
        backgroundImageName = "tutorialmod.png"
    }
    override fun createIcon(): ItemStack
    {
        return ItemStack(ModItems.ingotCopper)
    }

    override fun hasSearchBar(): Boolean
    {
        return true
    }
}