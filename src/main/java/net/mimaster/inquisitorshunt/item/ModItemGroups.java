package net.mimaster.inquisitorshunt.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.mimaster.inquisitorshunt.InquisitorsHunt;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup INQUISITORS_GROUP = Registry.register(Registries.ITEM_GROUP, new Identifier(InquisitorsHunt.MOD_ID, "group"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.group")).icon(() -> new ItemStack(Items.CHERRY_CHEST_BOAT)).entries((displayContext, entries) -> {
                entries.add(ModItems.RZD);
                entries.add(Items.NETHERITE_BLOCK);
                entries.add(Items.AXOLOTL_BUCKET);
                entries.add(ModItems.BEER);
    }).build());

    public static void registerItemGroups(){
        InquisitorsHunt.LOGGER.info("Registering Item Groups for " + InquisitorsHunt.MOD_ID);
    }
}
