package net.zoizoi.forge.slashblade_addon_test.blade;

import mods.flammpfeil.slashblade.ItemSlashBladeNamed;
import mods.flammpfeil.slashblade.RecipeAwakeBlade;
import mods.flammpfeil.slashblade.SlashBlade;
import mods.flammpfeil.slashblade.item.ItemSlashBlade;
import mods.flammpfeil.slashblade.named.event.LoadEvent;
import net.minecraft.init.Enchantments;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.Loader;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class CustomBlade {
    private final String id;
    private String displayName;
    private Object[] recipe;

    public CustomBlade(String id, String displayName, Object[] recipe) {
        this.id = id;
        this.displayName = displayName;
        this.recipe = recipe;
    }

    @SubscribeEvent
    public void InitKatana(LoadEvent.InitEvent event){
        ItemStack customBlade = new ItemStack(SlashBlade.bladeNamed,1,0);
        NBTTagCompound nbtTag = new NBTTagCompound();
        customBlade.setTagCompound(nbtTag);
        customBlade.addEnchantment(Enchantments.POWER, 3);
        customBlade.addEnchantment(Enchantments.FORTUNE, 3);
        ItemSlashBladeNamed.IsDefaultBewitched.set(nbtTag, Boolean.TRUE);
        ItemSlashBladeNamed.CurrentItemName.set(nbtTag, displayName);
        ItemSlashBladeNamed.CustomMaxDamage.set(nbtTag, 45);
        ItemSlashBlade.setBaseAttackModifier(nbtTag, 4F);
        ItemSlashBladeNamed.TextureName.set(nbtTag, "named/bladetest/simpleblade/texture");
        ItemSlashBladeNamed.ModelName.set(nbtTag, "named/bladetest/simpleblade/model");
        ItemSlashBlade.TextureName.set(nbtTag, "named/bladetest/simpleblade/texture");
        ItemSlashBlade.ModelName.set(nbtTag, "named/bladetest/simpleblade/model");
//        ItemSlashBlade.TextureName.set(nbtTag, "named/darkraven/darkraven");
//        ItemSlashBlade.ModelName.set(nbtTag, "named/" + id.replace('.', '/') + "/model");
        ItemSlashBlade.SpecialAttackType.set(nbtTag, 30);
        ItemSlashBlade.StandbyRenderType.set(nbtTag, 2);

        SlashBlade.registerCustomItemStack(id, customBlade);
        ItemSlashBladeNamed.NamedBlades.add(id);
    }

//    @SubscribeEvent
//    public void InitRecipes(LoadEvent.PostInitEvent event){
//        ItemStack soul = SlashBlade.findItemStack("flammpfeil.slashblade", SlashBlade.ProudSoulStr, 1);
//
//        SlashBlade.addRecipe(id, new RecipeAwakeBlade(new ResourceLocation("flammpfeil.slashblade", id), SlashBlade.getCustomBlade(id), SlashBlade.getCustomBlade(id), recipe));
//    }
}
