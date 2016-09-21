//logLevel := Level.Debug

val root = (project in file("."))
  .settings(
    organization := "com.github.gslowikowski",
    name := "sbt-travis-test",
    version := "1.0.0-SNAPSHOT",
    //scalaVersion := "2.10.6",
    scalaVersion := "2.11.8",
    crossScalaVersions := Seq("2.10.6", "2.11.8", "2.12.0-RC1"),
    scalacOptions ++= Seq("-encoding", "utf-8"),
    libraryDependencies ++= Seq(
      "com.novocode" % "junit-interface" % "0.11" % "test",
      "org.hamcrest" % "hamcrest-core" % "1.3" % "test"
    )
  )
