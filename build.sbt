ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.13.10"

lazy val root = (project in file("."))
  .settings(
    name := "actions-demo",
    idePackagePrefix := Some("com.tkroman.kpi")
  )

libraryDependencies += "org.scalameta" %% "munit" % "0.7.29" % Test
