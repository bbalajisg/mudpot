import com.typesafe.sbt.packager.archetypes.ServerLoader

name := "spray-dockerservice"

version := "1.0"

scalaVersion := "2.11.7"

scalacOptions := Seq("-unchecked", "-deprecation", "-encoding", "utf8")


lazy val dockerservice = (project in file("."))
  .enablePlugins(JavaServerAppPackaging, RpmPlugin, RpmDeployPlugin)


libraryDependencies ++= {
  val akkaV     = "2.3.7"
  val sprayV    = "1.3.3"
  val specs2V   = "3.6"

  Seq(

    "io.spray"            %%  "spray-httpx"   % sprayV,
    "io.spray"            %%  "spray-can"     % sprayV,
    "io.spray"            %%  "spray-routing" % sprayV,
    "io.spray"            %%  "spray-json"    % "1.3.1",

    "com.typesafe.akka"   %%  "akka-actor"    % akkaV,
    "com.typesafe.akka"   %% "akka-remote"    % akkaV,
    "com.typesafe.akka"   %%  "akka-testkit"  % akkaV     % "test",
    "com.typesafe.akka"   %%  "akka-slf4j"    % akkaV,

    "io.spray"            %%  "spray-testkit" % sprayV     % "test",
    "org.specs2"          %%  "specs2-core"   % specs2V    % "test",
    "org.specs2"          %% "specs2-mock" % specs2V       % "test",
    "org.specs2"          %% "specs2-junit" % specs2V      % "test",
    "org.specs2"          %% "specs2-matcher-extra" % specs2V % "test",

    "ch.qos.logback"      % "logback-classic"  % "1.1.3"

  )
}




mainClass in Compile := Some("com.balab.DockerServiceMain")

packageName in Rpm := "dockerservice"
version in Rpm := version.value
maintainer in Rpm := "BalaB Support <support@balab.com>"
packageSummary in Rpm := "This package installs Spray Docker Service"
packageDescription in Rpm :=
  """This package includes components:
    |Spray Docker Service and its related commons""".stripMargin
serverLoading in Rpm := ServerLoader.SystemV

rpmVendor := "mudpot"
rpmRelease := "1"
rpmLicense := Some("Proprietary License")
rpmUrl := Some("http://www.mudpot.com")
//linuxPackageMappings in Rpm := linuxPackageMappings.value
// required to export commons and dependencies
exportJars := true
defaultLinuxInstallLocation := "/opt"
daemonUser in Linux := normalizedName.value
daemonGroup in Linux := (daemonUser in Linux).value

dockerBaseImage := "frolvlad/alpine-oraclejdk8"