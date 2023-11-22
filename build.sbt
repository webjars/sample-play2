enablePlugins(PlayScala)

name := "webjars-sample-play2"

scalaVersion := "2.13.0"

libraryDependencies ++= Seq(
  guice,
  "org.webjars" %% "webjars-play" % "2.8.18",
  "org.webjars" % "bootstrap" % "3.3.4"
)

(Assets / LessKeys.compress) := true

pipelineStages := Seq(digest, gzip)

(Assets / LessKeys.less / includeFilter) := "*.less"

routesGenerator := InjectedRoutesGenerator

