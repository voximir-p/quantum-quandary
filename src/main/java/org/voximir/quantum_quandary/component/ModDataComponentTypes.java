package org.voximir.quantum_quandary.component;

import net.minecraft.component.ComponentType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import org.voximir.quantum_quandary.QuantumQuandary;

import java.util.function.UnaryOperator;

public class ModDataComponentTypes {
    private static <T> ComponentType<T> register(String name, UnaryOperator<ComponentType.Builder<T>> builderOperator) {
        return Registry.register(Registries.DATA_COMPONENT_TYPE, Identifier.of(QuantumQuandary.MOD_ID, name),
                builderOperator.apply(ComponentType.builder()).build());
    }

    public static void registerDataComponentsTypes() {
        QuantumQuandary.LOGGER.info("Registering Mod Data Component Types for " + QuantumQuandary.MOD_ID);
    }
}
