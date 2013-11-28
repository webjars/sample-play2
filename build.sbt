name := "foo"

version := "1.0-SNAPSHOT"

//resolvers += Resolver.file("LocalIvy", file(Path.userHome + "/.ivy2/local"))(Resolver.ivyStylePatterns)

//resolvers += DefaultMavenRepository

libraryDependencies ++= Seq(
  "org.webjars" %% "webjars-play" % "2.2.1",
  "org.webjars" % "bootstrap" % "3.0.2",
  "org.webjars" % "durandal" % "2.0.1",
  "org.webjars" % "knockout" % "2.2.1", // this should be a transative dep of durandal but it isn't yet
  "org.webjars" % "jquery" % "2.0.3-1" // ditto
)     

play.Project.playScalaSettings
