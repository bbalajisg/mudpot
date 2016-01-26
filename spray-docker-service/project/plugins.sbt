logLevel := Level.Warn
addSbtPlugin("com.typesafe.sbt" % "sbt-native-packager" % "1.0.6")

resolvers ++= Seq ( "spray io" at "http://repo.spray.io/",
  "repo maven 2" at "http://repo.maven.apache.org/maven2"
)