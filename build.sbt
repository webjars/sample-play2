enablePlugins(PlayScala)

name := "webjars-sample-play2"

scalaVersion := "2.13.0"

libraryDependencies ++= Seq(
  guice,
  "org.webjars" %% "webjars-play" % "2.7.3",
  "org.webjars" % "bootstrap" % "3.3.7-1"
)

LessKeys.compress in Assets := true

pipelineStages := Seq(digest, gzip)

includeFilter in (Assets, LessKeys.less) := "*.less"

routesGenerator := InjectedRoutesGenerator

