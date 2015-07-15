name := "webjars-sample-play2"

version := "1.0-SNAPSHOT"

scalaVersion := "2.11.6"

resolvers += Resolver.mavenLocal

libraryDependencies ++= Seq(
  "org.webjars" % "webjars-locator" % "0.27-SNAPSHOT",
  "org.webjars.npm" % "validate.js" % "0.8.0",
  "org.webjars" %% "webjars-play" % "2.4.0-1",
  "org.webjars" % "bootstrap" % "3.3.4"
)

LessKeys.compress in Assets := true

pipelineStages := Seq(digest, gzip)

includeFilter in (Assets, LessKeys.less) := "*.less"

routesGenerator := InjectedRoutesGenerator

lazy val root = (project in file(".")).enablePlugins(PlayScala)