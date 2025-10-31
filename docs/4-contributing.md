# Contributing to Paper

This guide provides a summary of the key points for contributing to the Paper project. For more detailed information, please refer to the full `CONTRIBUTING.md` file.

## Getting Started

1.  **Fork the repository:**
    Create a personal fork of the Paper repository to your own GitHub account.

2.  **Prerequisites:**
    Make sure you have `git` and JDK 21 installed.

## The Patching Workflow

The core of contributing to Paper involves working with patches. Here is a simplified workflow for making changes to the Minecraft server code:

1.  **Apply patches:**
    Before making any changes, you need to apply the existing patches to the Minecraft source code.
    ```bash
    ./gradlew applyPatches
    ```

2.  **Make your changes:**
    Navigate to the `paper-server/src/minecraft` directory and make your desired code changes.

3.  **Fix up the patches:**
    After making your changes, you need to update the patch files.
    ```bash
    ./gradlew fixupSourcePatches
    ```

4.  **Rebuild the patches:**
    Finally, rebuild the patches to incorporate your changes.
    ```bash
    ./gradlew rebuildPatches
    ```

## Submitting a Pull Request

Once you have committed your changes and pushed them to your fork, you can open a pull request against the main Paper repository. Be sure to follow the formatting guidelines and PR policy outlined in the `CONTRIBUTING.md` file.
