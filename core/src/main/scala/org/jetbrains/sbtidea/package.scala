package org.jetbrains

package object sbtidea {
  implicit class Any2Option[T <: Any](any: T) {
    def lift2Option: Option[T] = Option(any)
  }

  implicit class StringUtils(str: String) {
    def isValidFileName: Boolean =
      str.matches("\\A(?!(?:COM[0-9]|CON|LPT[0-9]|NUL|PRN|AUX|com[0-9]|con|lpt[0-9]|nul|prn|aux)|[\\s\\.])[^\\\\\\/:*\"?<>|]{1,254}\\z")
  }
}
