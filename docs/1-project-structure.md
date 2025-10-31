# Project Structure

The Paper project is a multi-project Gradle build, composed of several key modules. Understanding the purpose of each module is essential for contributing to the project.

## paper-api

This module contains the Paper API, which is the interface that plugins use to interact with the Paper server. All new API additions and changes should be made in this module.

## paper-server

This is the core of the Paper server. It contains the server implementation, including the patched Minecraft server code. Most of the performance optimizations and bug fixes are located in this module.

## test-plugin

The `test-plugin` module is a simple plugin used for testing API changes and additions. When you are working on a new feature for the API, you can use this plugin to test its functionality.

## paper-generator

This module is used for generating various parts of the project during the build process. It is primarily used for internal project tasks and is not something that most contributors will need to interact with directly.
