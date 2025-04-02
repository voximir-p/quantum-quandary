package org.voximir.quantum_quandary.item;

import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import org.voximir.quantum_quandary.QuantumQuandary;

public class ModItems {
    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(QuantumQuandary.MOD_ID, name), item);
    }

    public static void registerModItems() {
        QuantumQuandary.LOGGER.info("Registering Mod Items for " + QuantumQuandary.MOD_ID);
    }
}
