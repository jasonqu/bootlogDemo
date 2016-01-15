lazy val bootlogDemo = (project in file("."))
  .enablePlugins(BootLogPlugin)
  .settings(
    // customize assets, the 2nd parameter equals (baseDirectory.value / relativeFilePath)
    // copied from http://themes.jekyllbootstrap.com/preview/the-program/
    //assetResourceMapping += ("stylesheets/style.css" -> "assets/css/style.css"),
    // customize generateDir
    //generateDir := baseDirectory.value / "out",
    // or link generateDir with site's siteSourceDirectory
    generateDir := SiteKeys.siteSourceDirectory.value
  )

site.settings

// KEEP This, or else fonts file will not be copied by sbt-ghpages
includeFilter in SiteKeys.makeSite := "*.html" | "*.css" | "*.png" | "*.jpg" | "*.gif" | "*.js" | "*.swf" | "*.ttf" | "*.woff" | "*.woff2"

ghpages.settings

git.remoteRepo := "https://github.com/jasonqu/bootlogDemo.git"
