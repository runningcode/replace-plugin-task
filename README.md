# Replace Gradle Plugin Task

This sample demonstrates how to replace a third party Gradle plugin's task in order to make the build compatible with Gradle 7.0.

The plugin is defined as a composite build in the [`plugin` project](https://github.com/runningcode/replace-plugin-task/blob/master/plugin/build.gradle.kts#L18). It is included in the main build and [applied in the `lib` project](https://github.com/runningcode/replace-plugin-task/blob/master/lib/build.gradle#L3).

To run the sample, `./gradlew :lib:incompatibleTask`. To see the incompatible task fail the build in an integration test, run `./gradlew :plugin:test`