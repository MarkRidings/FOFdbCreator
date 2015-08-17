package io

import java.io.File

import scala.collection.mutable.ListBuffer
import scala.io.Source._

object FileReader {

  def GetFile(fileName: String): List[Array[String]] = {

    val file = fromFile(fileName)
    var lines = new ListBuffer[Array[String]]()

    for (line <- file.getLines()) {
      val cols = line.split(",")
      lines += cols
    }

    file.close()

    lines.toList
  }

  def GetAllFiles(dir: String): Array[File] = {

    new java.io.File("/home/mark/FOF/APFL2013/").listFiles.filter(_.getName.endsWith(".csv"))

  }


}
