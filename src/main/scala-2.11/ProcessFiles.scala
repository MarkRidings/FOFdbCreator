import java.io.File

import Data.ConnectDb

object ProcessFiles {

  def CreateTables(fileList: Array[File]): Unit = {

    fileList.foreach {GetCorrectTable}
  }

  def GetCorrectTable (file: File): Unit = {
    val db = new ConnectDb()

    if (db.CreateNewTable(file.toString.split("/").last.dropRight(4))) {
      db.UpdateTable(file)
      println("----------------")
    }
  }
}
