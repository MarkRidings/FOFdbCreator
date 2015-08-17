package Data

import java.io.File
import java.sql.{DriverManager, ResultSet}

import io.FileReader

class ConnectDb {

  val connectionUrl = "jdbc:postgresql://localhost/APFL?user=postgres&password=0134lbs"

  Class.forName("org.postgresql.Driver")
  val conn = DriverManager.getConnection(connectionUrl)

  def Close(): Unit = {
    conn.close()
  }

  def CreateNewTable(fileName: String): Boolean = {

    try {
      val statement = conn.createStatement(ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_UPDATABLE)


      statement.execute(s"DROP TABLE IF EXISTS $fileName")

      val createStatement = SqlConstants.GetCreateStatement(fileName)
      if (createStatement != "") {
        statement.execute(createStatement)
        println("----------------")
        println(s"table $fileName successfully created")
      }
      else {
        println(s"table $fileName is not supported")
        return false
      }

      true
    }
    catch {
      case e: Exception => {
        println ("problem with creating table " + e.getMessage)
        false
      }
    }
  }

  def UpdateTable(csvFile: File): Unit = {

    try {
      val statement = conn.createStatement(ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_UPDATABLE)

      val file = FileReader.GetFile(csvFile.toString)

      val tableName = csvFile.toString.split('/').last.dropRight(4)

      val insertStatement = new StringBuilder()
      insertStatement.append(s"INSERT INTO $tableName VALUES")

      var count = 0
      for (line <- file.drop(1)) {
        if (count != 0)
          insertStatement.append(",")

        insertStatement.append(CreateValueLine(line))
        count += 1
      }

      insertStatement.append(";")
      statement.executeUpdate(insertStatement.toString())
      println(count + " entries entered into table -> " + tableName)

    }
    catch {
      case e: Exception => {
        println("problem updating table " + e.getMessage)
        throw new Exception
      }
    }
  }

  def CreateValueLine(line: Array[String]): String = {
    var first = true
    val insertStatement = new StringBuilder
    insertStatement.append("(")
    for (item <- line) {
      if (!first)
        insertStatement.append(",")

      first = false
      insertStatement.append(s"'${item.map(c => if (c == '\'') ' ' else c)}'")
    }
    insertStatement.append(")")

    insertStatement.toString()
  }

}
