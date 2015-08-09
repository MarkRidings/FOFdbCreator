package Core

object ConversionHelpers {

  def getBoolean(string: String): Boolean = {

    if (string == "1" || string.toUpperCase == "TRUE")
      return true

    false
  }
}
