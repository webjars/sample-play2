name := "foo"

version := "1.0-SNAPSHOT"

resolvers += Resolver.file("LocalIvy", file(Path.userHome + "/.ivy2/local"))(Resolver.ivyStylePatterns)

//resolvers += DefaultLocalMavenRepository

resolvers += "Local M2" at Path.userHome.asFile.toURI.toURL + ".m2/repository"

libraryDependencies ++= Seq(
  "org.webjars" %% "webjars-play" % "2.3.0-RC1",
  "org.webjars" % "bootstrap" % "3.1.1-1",
  "org.webjars" % "jquery" % "1.11.1"
)

lazy val root = (project in file(".")).enablePlugins(PlayScala)