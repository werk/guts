enablePlugins(ScalaJSPlugin)

name := "guts"

scalaVersion := "2.12.4"

scalaJSUseMainModuleInitializer := true

libraryDependencies += "org.scala-js" %%% "scalajs-dom" % "0.9.2"

libraryDependencies += "dk.mzw.scalashading" %%% "scala-shading" % "0.1.0"

libraryDependencies += "dk.mzw.scalasprites" %%% "scala-sprites" % "0.1.0"
