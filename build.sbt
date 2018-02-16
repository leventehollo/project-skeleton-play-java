name := """project-skeleton-play-java"""
organization := "com.enoventum"

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava)

scalaVersion := "2.12.4"

libraryDependencies += guice
libraryDependencies += "com.typesafe.play" %% "play-json" % "2.6.8"
libraryDependencies += "com.typesafe.akka" %% "akka-remote" % "2.5.8"