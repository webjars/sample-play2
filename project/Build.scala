import sbt._
import Keys._
import PlayProject._
import java.io.File

object ApplicationBuild extends Build {

  val appName         = "sample-play2"
  val appVersion      = "1.0-SNAPSHOT"

  val appDependencies = Seq(
    "org.webjars" % "webjars-play" % "2.0",
    "org.webjars" % "bootstrap" % "2.1.1"
  )

  val main = PlayProject(appName, appVersion, appDependencies, mainLang = JAVA).settings(
    resolvers += Resolver.file("LocalIvy", file(Path.userHome + File.separator + ".ivy2" + File.separator + "local"))(Resolver.ivyStylePatterns)
  )

}
