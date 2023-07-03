package sbtzip

import sbt.{settingKey, taskKey}

import java.io.File

trait ZipKeys {

  lazy val sourceZipDir = settingKey[File]("source directory to generate zip from")
  lazy val targetZipDir = settingKey[File]("source directory to generate zip from")
  lazy val zip = taskKey[Unit]("Generate zip file including all sources in srcZipDir")
}
