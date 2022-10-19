package net.kevin.mccourse.item;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.kevin.mccourse.MCCourseMod;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup COURSE = FabricItemGroupBuilder.build(new Identifier(MCCourseMod.MOD_ID, "course"),
            () -> new ItemStack(ModItems.ORICHALCUM_INGOT));
    // Add other ItemGroup
    /*public static final ItemGroup COURSE2 = FabricItemGroupBuilder.build(new Identifier(MCCourseMod.MOD_ID, "course2"),
            () -> new ItemStack(ModItems.ORICHALCUM_NUGGET));*/
}
