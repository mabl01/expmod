package com.fatface01.fp;

import net.minecraftforge.fml.common.Mod;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(FP.MODID)
public final class FP {

    public static final String MODID = "fp";

    public static final Logger LOGGER = LogManager.getLogger(MODID);

    public FP() {
        LOGGER.debug("Hello!");
    }

}