# Running a Development Server

There are several Gradle tasks available to run a development server for testing purposes. These tasks allow you to test your changes without having to build a full server jar.

## `runServer`

The `runServer` task spins up a test server from the Mojang mapped server jar. This is a good way to test changes that have been compiled into the server.

```bash
./gradlew runServer
```

## `runDevServer`

The `runDevServer` task starts a test server without assembling a jar. This is useful for quickly testing changes without having to go through the entire build process.

```bash
./gradlew runDevServer
```

## `runPaperclip`

The `runPaperclip` task starts a test server from the Mojang mapped Paperclip jar. This is useful for testing the server in an environment that is closer to a production environment.

```bash
./gradlew runPaperclip
```
