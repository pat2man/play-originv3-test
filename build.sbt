import sbt.Keys._

name := """play-originv3-test"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.11.6"

libraryDependencies ++= Seq(
  jdbc,
  cache,
  ws,
  specs2 % Test
)

resolvers += "scalaz-bintray" at "http://dl.bintray.com/scalaz/releases"

// Play provides two styles of routers, one expects its actions to be injected, the
// other, legacy style, accesses its actions statically.
routesGenerator := InjectedRoutesGenerator

libraryDependencies += "org.jolokia" % "jolokia-jvm" % "1.3.1" classifier "agent"

libraryDependencies += "com.kenshoo" %% "metrics-play" % "2.4.0_0.3.0"

bashScriptExtraDefines += """addJava "-javaagent:${lib_dir}/org.jolokia.jolokia-jvm-1.3.1-agent.jar=port=8778,host=0.0.0.0""""
