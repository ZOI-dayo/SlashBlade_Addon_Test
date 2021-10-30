package net.zoizoi.forge.slashblade_addon_test.blade.blades;

import net.minecraft.init.Items;
import net.zoizoi.forge.slashblade_addon_test.SlashBlade_Addon_Test;
import net.zoizoi.forge.slashblade_addon_test.blade.CustomBlade;

public class SimpleBlade extends CustomBlade {
    private static final String id = "bladetest.simpleblade";
    private static final String name = "Simple Blade";
    private static final Object[] recipe = new Object[]{"   ", " A ", "   ",
            'A', Items.ACACIA_BOAT,
    };
    public SimpleBlade() {
        super(id, name, recipe);
    }
}
