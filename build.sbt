import NativePackagerKeys._

name := """play-originv3-test"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.11.6"

libraryDependencies ++= Seq(
  jdbc,
  anorm,
  cache,
  ws
)

maintainer in Docker := "John Smith <john.smith@example.com>"

dockerExposedPorts in Docker := Seq(9000)

dockerBaseImage := "java"