name := "foo"

version := "1.0-SNAPSHOT"

//resolvers += Resolver.file("LocalIvy", file(Path.userHome + "/.ivy2/local"))(Resolver.ivyStylePatterns)

//resolvers += DefaultLocalMavenRepository

resolvers += "Local M2" at Path.userHome.asFile.toURI.toURL + ".m2/repository"

libraryDependencies ++= Seq(
  "org.webjars" %% "webjars-play" % "2.2.1",
  "org.webjars" % "webjars-locator" % "0.14",
  "org.webjars" % "bootstrap" % "3.1.1-1",
  "org.webjars" % "jquery" % "2.1.0-3",
  "org.webjars" % "angularjs" % "1.2.11",
  "org.webjars" % "angular-translate" % "2.1.0",
  "org.webjars" % "angular-tree-control" % "0.1.5-1"
)

play.Project.playScalaSettings
