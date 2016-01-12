import sbt._

site.settings

lazy val bootlogDemo = (project in file("."))
  .enablePlugins(BootLogPlugin)
  .settings(
    name := "bootlogDemo",
    organization := "com.github.bootlog",
    version := "0.1-SNAPSHOT",
    scalaVersion := "2.10.4"
  )
  .settings(
    // customize assets
    assetResourceMapping in Compile += ("stylesheets/style.css" -> "assets/css/style.css")
  )


//TODO chain generateDir and siteSourceDirectory
//bootlogDemo.settings(
//  generateDir := siteSourceDirectory.value
//  //siteSourceDirectory := generateDir.value
//)
