name := "scala-vienna-web"

version := "1.0-SNAPSHOT"

libraryDependencies ++= Seq(
    cache,
    "org.webjars" %% "webjars-play" % "2.2.1",
    "org.webjars" % "bootstrap" % "3.0.2",
    "org.webjars" % "holderjs" % "2.1.0",
    "rome" % "rome" % "1.0",
    "org.pegdown" % "pegdown" % "1.4.2"
)

play.Project.playScalaSettings

scalacOptions ++= Seq("-feature")

scalariformSettings

com.jamesward.play.BrowserNotifierPlugin.livereload

// sbteclipse settings
EclipseKeys.executionEnvironment := Some(EclipseExecutionEnvironment.JavaSE17)

EclipseKeys.withSource := true