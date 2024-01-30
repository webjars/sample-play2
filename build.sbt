enablePlugins(PlayScala)

name := "webjars-sample-play2"

scalaVersion := "2.13.0"

libraryDependencies ++= Seq(
  guice,
  "org.webjars" %% "webjars-play" % "2.7.3",
  "org.webjars" % "bootstrap" % "3.3.7-1"
)

(Assets / LessKeys.compress) := true

pipelineStages := Seq(digest, gzip)

(Assets / LessKeys.less / includeFilter) := "*.less"

routesGenerator := InjectedRoutesGenerator

