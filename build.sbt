
name := "EpochJS-Facade"

normalizedName := "epochjs-facade"

organization := "com.keivanabdi"

version := "0.1-SNAPSHOT"

scalaVersion := "2.12.4"

enablePlugins(ScalaJSPlugin)

scalacOptions += "-P:scalajs:sjsDefinedByDefault"

homepage := Some(
  url("https://github.com/KeivanAbdi/EpochJS-Facade")
)

scmInfo := Some(
  ScmInfo(
    browseUrl = url("https://github.com/KeivanAbdi/EpochJS-Facade"),
    connection = "git@github.com:KeivanAbdi/EpochJS-Facade.git"
  )
)
developers := List(
  Developer(
    id = "KeivanAbdi",
    name = "Keivan Abdi",
    email = "keivan.a.khorsand@gmail.com",
    url = url("https://github.com/KeivanAbdi")
  )
)

licenses += ("MIT License", url("http://www.opensource.org/licenses/mit-license.php"))

publishMavenStyle := true

publishTo := Some(
  if (isSnapshot.value)
    Opts.resolver.sonatypeSnapshots
  else
    Opts.resolver.sonatypeStaging
)

