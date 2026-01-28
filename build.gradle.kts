plugins {
    id("java-library")
    id("org.allaymc.gradle.plugin") version "0.2.1"
}

group = "xyz.zernix.betterknockback"
description = "Make knockback more responsive"
version = "0.1.0"

java {
    toolchain {
        languageVersion = JavaLanguageVersion.of(21)
    }
}

allay {
    api = "0.24.0-SNAPSHOT"

    plugin {
        entrance = ".BetterKnockback"
        apiVersion = ">=0.24.0"
        authors += "Zernix"
        website = "https://https://github.com/zernix2077/BetterKnockback"
    }
}

dependencies {
    compileOnly(group = "org.projectlombok", name = "lombok", version = "1.18.34")
    annotationProcessor(group = "org.projectlombok", name = "lombok", version = "1.18.34")
}

