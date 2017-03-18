package net.machinemuse.powersuits.item;

import forestry.api.core.IArmorNaturalist;
import net.machinemuse.api.ModuleManager;
import net.machinemuse.powersuits.powermodule.armor.ApiaristArmorModule;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.Optional;

/**
 * Ported to Java by lehjr on 10/26/16.
 */

@Optional.Interface(iface = "forestry.api.core.IArmorNaturalist", modid = "Forestry", striprefs = true)
public class ItemPowerArmorHelmet extends ItemPowerArmor implements IArmorNaturalist {
    public final EntityEquipmentSlot armorType;
    public ItemPowerArmorHelmet() {
        super(0, EntityEquipmentSlot.HEAD);
        this.setUnlocalizedName("powerArmorHelmet");
        this.armorType = this.getEquipmentSlot();
    }

    @Optional.Method(modid = "Forestry")
    public boolean canSeePollination(final EntityPlayer player, final ItemStack helm, final boolean doSee) {
        return ModuleManager.itemHasActiveModule(helm, ApiaristArmorModule.MODULE_APIARIST_ARMOR);
    }
}