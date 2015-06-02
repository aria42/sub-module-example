lazy val common = project in file("deps/common/core")

lazy val root = (project in file(".")).settings(
    name := "hello",
    version := "1.0",
    scalaVersion := "2.11.4"
  )
  .dependsOn(common)
