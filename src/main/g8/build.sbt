name := "$name$"

organization := "$organization$"

version := "$version$"

scalaVersion := "2.12.1"

crossScalaVersions := Seq("2.11.9", "2.12.1")

resolvers ++= Seq(
  "Sonatype OSS Snapshots" at "http://oss.sonatype.org/content/repositories/snapshots/"
)

libraryDependencies ++= Seq(
)

tutSettings
tutSourceDirectory := file(s"\${sourceDirectory.value}/tut")
tutTargetDirectory := file("./docs")

scalacOptions ++= Seq(
    "-target:jvm-1.8",
    "-deprecation",
    "-encoding", "UTF-8",
    "-feature",
    "-language:existentials",
    "-language:higherKinds",
    "-language:implicitConversions",
    "-language:experimental.macros",
    "-unchecked",
    "-Ywarn-unused-import",
    "-Ywarn-nullary-unit",
    "-Xfatal-warnings",
    "-Xlint",
    "-Ywarn-dead-code",
    "-Xfuture")
