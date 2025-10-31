# Gradle Tasks

The Paper project uses Gradle for its build automation. Here are some of the most important Gradle tasks you will use as a contributor.

## Build Tasks

These tasks are related to building the project.

*   `assemble`: Assembles the outputs of this project.
*   `build`: Assembles and tests this project.
*   `clean`: Deletes the build directory.
*   `createMojmapBundlerJar`: Builds a runnable bundler jar. This is the one you will most likely use to get a server jar.
*   `jar`: Assembles a jar archive containing the main classes.

## Minecraft Patching Tasks

These tasks are used for working with the patch system.

*   `applyPatches`: Applies all Paper Minecraft patches. This is the first command you should run after cloning the repository.
*   `rebuildPatches`: Rebuilds all Paper patches to Minecraft. You should run this after making changes to the patched source code.
*   `fixupSourcePatches`: Puts the currently tracked source changes into the paper Minecraft sources file patches commit.

## Running Tasks

These tasks are used to run a development server.

*   `runServer`: Spins up a test server from the Mojang mapped server jar.
*   `runDevServer`: Spins up a test server without assembling a jar. This is a quick way to test changes.
*   `runPaperclip`: Spins up a test server from the Mojang mapped Paperclip jar.

## Verification Tasks

These tasks are used for testing and verification.

*   `check`: Runs all checks.
*   `test`: Runs the test suite.

## Publishing Tasks

These tasks are for publishing the project artifacts.

*   `publishToMavenLocal`: Publishes all Maven publications produced by this project to the local Maven cache. This is useful for testing API changes with external plugins.

## Help Tasks

*   `tasks`: Displays the tasks runnable from the root project.
*   `help --task <task>`: Displays more detail about a specific task.
