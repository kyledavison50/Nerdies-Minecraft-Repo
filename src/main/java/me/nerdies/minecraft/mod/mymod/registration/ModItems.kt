package me.nerdies.minecraft.mod.mymod.registration


import me.nerdies.minecraft.mod.automation.registration.RegisterItems
import me.nerdies.minecraft.mod.mymod.items.IngotCopper

// 1) Register the item here
// 2) Place your texture in resources/assets/nerdiesmod/textures/items
// 3) Create a JSON for the texture(copying and pasting with slight modification is ok)
// 4) Configure the translation key in en_US.lang
object ModItems : RegisterItems()
{
    val ingotCopper = IngotCopper()

    init
    {
        itemList.add(ingotCopper)
    }
}