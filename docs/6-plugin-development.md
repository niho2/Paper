# Plugin Development

This guide provides information for developers who want to create plugins using the Paper API.

## Using the Paper API

To use the Paper API in your plugin, you need to add it as a dependency in your build system.

### Maven

```xml
<repository>
    <id>papermc</id>
    <url>https://repo.papermc.io/repository/maven-public/</url>
</repository>

<dependency>
    <groupId>io.papermc.paper</groupId>
    <artifactId>paper-api</artifactId>
    <version>1.21.10-R0.1-SNAPSHOT</version>
    <scope>provided</scope>
</dependency>
```

### Gradle

```kotlin
repositories {
    maven {
        url = uri("https://repo.papermc.io/repository/maven-public/")
    }
}

dependencies {
    compileOnly("io.papermc.paper:paper-api:1.21.10-R0.1-SNAPSHOT")
}
```

## Javadocs

The Paper API Javadocs are a valuable resource for plugin developers. They provide detailed information about the classes and methods available in the API.

You can find the Javadocs at [papermc.io/javadocs](https://papermc.io/javadocs/).

## Testing Your Plugin

The `test-plugin` module in the Paper repository can be used as an example of how to set up a plugin for testing API changes. You can also use the `publishToMavenLocal` Gradle task to publish the API to your local Maven repository and test it with your own plugins.
