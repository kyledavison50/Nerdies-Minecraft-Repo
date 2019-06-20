package me.nerdies.minecraft.mod.mymod.weapons

import me.nerdies.minecraft.mod.donottouch.base.SwordBase
import net.minecraft.entity.EntityLiving
import net.minecraft.entity.EntityLivingBase
import net.minecraft.entity.passive.EntityCow
import net.minecraft.item.ItemStack
import net.minecraft.potion.PotionEffect

class MysticSword: SwordBase("mystic_sword", ToolMaterial.WOOD)
{
    override fun hitEntity(stack: ItemStack, target: EntityLivingBase, attacker: EntityLivingBase): Boolean
    {
        if(target is EntityLiving)
        {
            //target.knockBack(target,15f,.5,.5)
        }
        //target.heal(25.0f)
        attacker.heal(25.0f)
        return super.hitEntity(stack, target, attacker)
    }
}