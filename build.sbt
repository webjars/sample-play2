name := "webjars-sample-play2"

version := "1.0-SNAPSHOT"

scalaVersion := "2.12.2"

libraryDependencies ++= Seq(
  guice,
  "org.webjars" %% "webjars-play" % "2.6.0",
  "org.webjars" % "bootstrap" % "3.3.4"
)

LessKeys.compress in Assets := true

pipelineStages := Seq(digest, gzip)

includeFilter in (Assets, LessKeys.less) := "*.less"

routesGenerator := InjectedRoutesGenerator

lazy val root = (project in file(".")).enablePlugins(PlayScala)
