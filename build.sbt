name := "foo"

version := "1.0-SNAPSHOT"

//resolvers += Resolver.file("LocalIvy", file(Path.userHome + "/.ivy2/local"))(Resolver.ivyStylePatterns)

//resolvers += DefaultLocalMavenRepository

resolvers += "Local M2" at Path.userHome.asFile.toURI.toURL + ".m2/repository"

libraryDependencies ++= Seq(
  "org.webjars" %% "webjars-play" % "2.2.1",
  "org.webjars" % "webjars-locator" % "0.14-SNAPSHOT",
  "org.webjars" % "bootstrap" % "3.1.1-1-SNAPSHOT",
  "org.webjars" % "jquery" % "2.1.0-3-SNAPSHOT",
  "org.webjars" % "angularjs" % "1.2.11",
  "org.webjars" % "angular-translate" % "2.1.0"
)     

play.Project.playScalaSettings
