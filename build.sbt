name := """flyway_play_test"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.11.1"

libraryDependencies ++= Seq(
  jdbc
)

flywaySettings

flywayUrl := "jdbc:h2:file:target/devbar"

flywayUser := "SA"

flywayLocations := Seq("filesystem:conf/db/migrations/main")

flywayUrl in Test := "jdbc:h2:file:target/testbar"

flywayLocations in Test := Seq("filesystem:conf/db/migrations/main", "filesystem:conf/db/migrations/test")
