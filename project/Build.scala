import sbt._
import Keys._
import play.Project
import java.io.File

object ApplicationBuild extends Build {

  val appName         = "sample-play2"
  val appVersion      = "1.0-SNAPSHOT"

  val appDependencies = Seq(
    "org.webjars" % "webjars-play" % "2.1.0-1-SNAPSHOT",
    "org.webjars" % "bootstrap" % "2.3.1"
  )

  val main = Project(appName, appVersion, appDependencies).settings(
    resolvers += Resolver.file("LocalIvy", file(Path.userHome + File.separator + ".ivy2" + File.separator + "local"))(Resolver.ivyStylePatterns)
  )

}
