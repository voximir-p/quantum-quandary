package org.voximir.quantum_quandary;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.voximir.quantum_quandary.block.ModBlocks;
import org.voximir.quantum_quandary.component.ModDataComponentTypes;
import org.voximir.quantum_quandary.item.ModFuelItems;
import org.voximir.quantum_quandary.item.ModItemGroups;
import org.voximir.quantum_quandary.item.ModItems;

public class QuantumQuandary implements ModInitializer {
    public static final String MOD_ID = "quantum_quandary";

    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        ModDataComponentTypes.registerDataComponentsTypes();

        ModItemGroups.registerItemGroups();

        ModItems.registerModItems();
        ModBlocks.registerModBlocks();

        ModFuelItems.registerModFuelItems();
    }
}
