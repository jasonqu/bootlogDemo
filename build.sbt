site.settings

lazy val bootlogDemo = (project in file("."))
  .settings(
    name := "bootlogDemo",
    organization := "com.github.bootlog",
    version := "0.1-SNAPSHOT",
    scalaVersion := "2.10.4"
  )
  .enablePlugins(BootLogPlugin)
  .settings(
    // customize assets, the 2nd parameter equals (baseDirectory.value / relativeFilePath)
    //assetResourceMapping += ("stylesheets/style.css" -> "assets/css/style.css"),
    // customize generateDir
    //generateDir := baseDirectory.value / "out",
    // or link generateDir with site's siteSourceDirectory
    generateDir := SiteKeys.siteSourceDirectory.value
  )

ghpages.settings

git.remoteRepo := "git@github.com:jasonqu/bootlogDemo.git"