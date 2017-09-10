import Dependencies._

lazy val root = (project in file(".")).
  settings(
    inThisBuild(List(
      organization := "th.pt"
      , scalaVersion := "2.12.1"
      , version := "0.1.0-SNAPSHOT"
    ))
    , name := "plink"
    , libraryDependencies ++= Seq(scalaTest % Test
      , "com.fasterxml.jackson.module" %% "jackson-module-scala" % "2.8.6"
      , "joda-time" % "joda-time" % "2.9.9"
    )
  )
