package dev.ees4.powersmp;

import net.fabricmc.api.DedicatedServerModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PowerSMP implements DedicatedServerModInitializer {

    public final Logger LOGGER = LoggerFactory.getLogger("PowerSMP");
    @Override
    public void onInitializeServer() {
        LOGGER.info("PowerSMP Initialized!");
    }
}
