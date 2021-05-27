package com.osacky.replace.example

import org.gradle.api.Project
import org.gradle.api.Plugin

/**
 * A simple 'hello world' plugin.
 */
class ReplacePluginTaskPlugin: Plugin<Project> {
    override fun apply(project: Project) {
        // Register a task
        project.tasks.register("incompatibleTask", IncompatibleTask::class.java) { }
    }
}
