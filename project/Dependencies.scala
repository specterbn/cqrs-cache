import sbt._
import play.sbt.PlayImport._

object Dependencies {
  lazy val scalaTest = "org.scalatest" %% "scalatest" % "3.0.3"
  lazy val akkaVersion = "2.5.6"

  val playJson4s = "com.github.tototoshi" %% "play-json4s-jackson" % "0.8.0"
  val playJson4sTest = "com.github.tototoshi" %% "play-json4s-test-jackson" % "0.8.0" % "test"

  val akkaActor = "com.typesafe.akka" %% "akka-actor" % akkaVersion
  val akkaTestkit = "com.typesafe.akka" %% "akka-testkit" % akkaVersion % Test
  val akkaPersistence = "com.typesafe.akka" %% "akka-persistence" % akkaVersion
  val akkaPersistenceTesting = "com.github.dnvriend" %% "akka-persistence-inmemory" % "2.5.15.1"
  val akkaPersistenceJDBC =  "com.github.dnvriend" %% "akka-persistence-jdbc" % "3.5.0"
  val postgresql = "org.postgresql" % "postgresql" % "9.4.1208"
  val akkaRemote = "com.typesafe.akka" %% "akka-remote" % akkaVersion
  val akkaSl4j = "com.typesafe.akka" %% "akka-slf4j" % akkaVersion
  val apacheCommon = "org.apache.commons" % "commons-collections4" % "4.1"
}
