resolvers += "Typesafe repository" at "http://repo.typesafe.com/typesafe/releases/"

// The Play plugin
addSbtPlugin("com.typesafe.play" % "sbt-plugin" % "2.3.0-RC2")

addSbtPlugin("org.flywaydb" % "flyway-sbt" % "3.0")

resolvers += "Flyway" at "http://flywaydb.org/repo"
