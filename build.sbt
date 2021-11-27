name := "sbt_assignment"

version := "0.1"

scalaVersion := "2.13.7"

lazy val http = project.in(file("http")).settings(
  libraryDependencies ++= Seq(
    "com.typesafe.akka" %% "akka-http" % "10.2.7",
    "com.typesafe.akka" %% "akka-stream" % "2.6.17"
  ),
  libraryDependencies ++= Seq(
    "org.scalatest" %% "scalatest" % "3.3.0-SNAP3" % "test",
    "com.typesafe.akka" %% "akka-http-testkit" % "10.2.7" % "test",
    "com.typesafe.akka" %% "akka-stream-testkit" % "2.6.17" % "test",
    "com.typesafe.akka" %% "akka-testkit" % "2.6.17" % "test",
    "org.mockito" %% "mockito-scala" % "1.16.46" % "test"
  )
)

lazy val actor = project.in(file("actor")).settings(
  libraryDependencies ++= Seq(
    "com.typesafe.akka" %% "akka-actor" % "2.6.17",
    "com.typesafe.akka" %% "akka-persistence" % "2.6.17"
  ),
  libraryDependencies ++= Seq(
    "com.typesafe.akka" %% "akka-testkit" % "2.6.17" % "test",
    "com.typesafe.akka" %% "akka-persistence-testkit" % "2.6.17" % "test"
  )
)

lazy val root = project.in(file(".")).aggregate(http, actor)