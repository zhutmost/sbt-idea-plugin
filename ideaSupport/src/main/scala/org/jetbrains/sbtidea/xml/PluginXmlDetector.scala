package org.jetbrains.sbtidea.xml

import java.nio.file.Path
import org.jetbrains.sbtidea.pathToPathExt
import sbt._

object PluginXmlDetector {
  def getPluginXml(targetDir: Path): Option[Path] = {
    val path = targetDir / "META-INF" / "plugin.xml"
    if (path.toFile.exists())
      Some(path)
    else None
  }
}
