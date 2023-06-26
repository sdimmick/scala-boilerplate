ThisBuild / version := "0.1.0-SNAPSHOT"
ThisBuild / scalaVersion := "2.13.11"

lazy val root = (project in file("."))
  .settings(
    name := "scala-boilerplate"
  )

libraryDependencies += "com.lihaoyi" %% "utest" % "0.8.1" % "test"
testFrameworks += new TestFramework("utest.runner.Framework")
