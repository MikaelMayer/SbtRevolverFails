

name := "SbtRevolverFails"

scalaVersion := "2.11.7"

lazy val root = (project in file(".")).settings(
  mainClass in run := Some("example.Main")
).settings(
  Revolver.settings:_*
)

