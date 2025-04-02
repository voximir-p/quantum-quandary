package org.voximir.quantum_quandary.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import org.voximir.quantum_quandary.QuantumQuandary;

public class ModItemGroups {
    public static ItemGroup registerItemGroup(String name, Text displayName, ItemStack itemIcon, ItemGroup.EntryCollector entries) {
        return Registry.register(
                Registries.ITEM_GROUP,
                Identifier.of(QuantumQuandary.MOD_ID, name),
                FabricItemGroup.builder()
                        .displayName(displayName)
                        .icon(() -> itemIcon)
                        .entries(entries)
                        .build());
    }

    public static void registerItemGroups() {
        QuantumQuandary.LOGGER.info("Registering Item Groups for " + QuantumQuandary.MOD_ID);
    }
}
