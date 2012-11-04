import sbt._
import Keys._
import PlayProject._

object ApplicationBuild extends Build {

  val appName         = "sample-play2"
  val appVersion      = "1.0-SNAPSHOT"

  val appDependencies = Seq(
    "org.webjars" % "webjars-play" % "0.1",
    "org.webjars" % "bootstrap" % "2.1.1"
  )

  val main = PlayProject(appName, appVersion, appDependencies, mainLang = JAVA).settings(
  )

}
