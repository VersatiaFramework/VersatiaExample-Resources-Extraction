package dev.versatia.example.resources

import dev.versatia.Phase
import dev.versatia.VersatiaPlugin
import dev.versatia.lifecycle.AutoInvoke
import dev.versatia.util.config.getStringOrThrow
import dev.versatia.util.config.loadYamlOrThrow

/** Nothing to override: the files are extracted before this function runs. */
class ResourcesPlugin : VersatiaPlugin() {
    @AutoInvoke(Phase.PLUGIN_START_ONLY)
    fun report() {
        logger.info("messages.yml says: ${loadYamlOrThrow(dataFolder.resolve("messages.yml")).getStringOrThrow("welcome")}")
        logger.info("lang/en.yml is in the data folder: ${dataFolder.resolve("lang/en.yml").isFile}")
    }
}
