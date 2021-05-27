package com.osacky.replace.example

import org.gradle.api.DefaultTask
import org.gradle.api.tasks.Internal
import org.gradle.api.tasks.TaskAction

abstract class IncompatibleTask : DefaultTask() {

  @get:Internal
  val foo = "hello"

  @TaskAction
  fun foo() {
    println("hello from buildSrc")
  }
}