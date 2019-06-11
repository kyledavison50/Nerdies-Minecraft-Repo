package me.nerdies.minecraft.mod.mymod.registration


import me.nerdies.minecraft.mod.donottouch.registration.RegisterItems
import me.nerdies.minecraft.mod.mymod.items.IngotCopper
import me.nerdies.minecraft.mod.mymod.weapons.CopperSword

// 1) Register the item here
// 2) Place your texture in resources/assets/nerdiesmod/textures/items/TextureName.png
// 3) Create a JSON for the texture(copying and pasting with slight modification is ok)
// 4) Configure the translation key in en_US.lang
object ModItems : RegisterItems()
{
    val ingotCopper = IngotCopper()
    val copperSword = CopperSword()

    init
    {
        itemList.add(ingotCopper)
        itemList.add(copperSword)
    }
}