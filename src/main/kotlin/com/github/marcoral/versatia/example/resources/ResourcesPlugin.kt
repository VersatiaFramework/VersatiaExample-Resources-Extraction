package com.github.marcoral.versatia.example.resources

import com.github.marcoral.versatia.Phase
import com.github.marcoral.versatia.VersatiaPlugin
import com.github.marcoral.versatia.lifecycle.AutoInvoke
import com.github.marcoral.versatia.util.config.getStringOrThrow
import com.github.marcoral.versatia.util.config.loadYamlOrThrow

/** Nothing to override: the files are extracted before this function runs. */
class ResourcesPlugin : VersatiaPlugin() {
    @AutoInvoke(Phase.PLUGIN_START_ONLY)
    fun report() {
        logger.info("messages.yml says: ${loadYamlOrThrow(dataFolder.resolve("messages.yml")).getStringOrThrow("welcome")}")
        logger.info("lang/en.yml is in the data folder: ${dataFolder.resolve("lang/en.yml").isFile}")
    }
}
