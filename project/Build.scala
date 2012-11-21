import sbt._
import Keys._
import PlayProject._

object ApplicationBuild extends Build {

  val appName         = "sample-play2"
  val appVersion      = "1.0-SNAPSHOT"

  val appDependencies = Seq(
    javaCore,
    "org.webjars" % "webjars-play" % "2.1-RC1",
    "org.webjars" % "bootstrap" % "2.1.1"
  )

  val main = play.Project(appName, appVersion, appDependencies).settings(
    resolvers ++= Seq(
      Resolver.mavenLocal,
      Resolver.file("LocalIvy", file("/home/jamesw/.ivy2/local"))(Resolver.ivyStylePatterns)
    )
  )

}
