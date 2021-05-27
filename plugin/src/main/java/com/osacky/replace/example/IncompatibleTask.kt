package com.osacky.replace.example

import org.gradle.api.DefaultTask
import org.gradle.api.tasks.TaskAction

abstract class IncompatibleTask : DefaultTask() {

  val foo = "hello"

  @TaskAction
  fun foo() {
    println("$foo is running")
  }
}