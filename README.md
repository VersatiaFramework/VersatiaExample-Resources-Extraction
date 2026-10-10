    # VersatiaExample-Resources-Extraction

    Files shipped under `resources/` in the JAR appear in the plugin's data folder when it starts. Nothing to declare.

    Part of the [Versatia examples](https://github.com/VersatiaFramework/VersatiaExamples); documentation: [Plugin resources](https://versatiaframework.github.io/VersatiaDocs/docs/resources).

    **Start with** `src/main/resources/resources/` and [`ResourcesPlugin.kt`](src/main/kotlin/com/github/marcoral/versatia/example/resources/ResourcesPlugin.kt).

    ## What the log shows

    ```
    messages.yml says: Welcome to the server!
lang/en.yml is in the data folder: true
    ```


## Things to try

- Edit `plugins/VersatiaExample-Resources-Extraction/messages.yml` on the server and restart: your
  text is logged, the file is never overwritten.
- Delete that file and restart: the original is back.

## Building

Requires JDK 21 and VersatiaAPI in your local Maven repository (`./gradlew publishToMavenLocal`
in its checkout); running it requires a Paper 1.21.4 server with VersatiaCore installed.

```bash
./gradlew build
```

To have the JAR copied to your server after every build, copy `local.properties.example` to
`local.properties` and set `pluginsDir`. The generated descriptor is in
`build/generated/ksp/main/kotlin`; open it to see exactly what the runtime executes.
