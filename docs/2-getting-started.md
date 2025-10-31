# Getting Started

This guide will walk you through the process of building the Paper project from source.

## Prerequisites

Before you begin, make sure you have the following software installed:

*   **Git:** You'll need Git to clone the repository.
*   **JDK 21:** The project requires JDK 21 for compilation.

## Building the Project

1.  **Clone the repository:**
    ```bash
    git clone https://github.com/PaperMC/Paper.git
    cd Paper
    ```

2.  **Apply patches:**
    The first step in the build process is to apply the patches to the Minecraft server code.
    ```bash
    ./gradlew applyPatches
    ```

3.  **Create the server jar:**
    Now, you can create the server jar.
    ```bash
    ./gradlew createMojmapBundlerJar
    ```

4.  **Find the jar:**
    The compiled server jar can be found in the `paper-server/build/libs` directory.
