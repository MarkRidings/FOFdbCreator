package Data

import java.sql.{DriverManager, ResultSet}

import Entities.EntityBase

class ConnectDb {

  val connectionUrl = "jdbc:postgresql://localhost/APFL?user=postgres&password=0134lbs"

  Class.forName("org.postgresql.Driver")
  val conn = DriverManager.getConnection(connectionUrl)

  def Close(): Unit = {
    conn.close()
  }

  def CreateNewTable(dropString: String, createString: String): Unit = {

    try {
      val statement = conn.createStatement(ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_UPDATABLE)


      statement.execute(dropString)
      statement.execute(createString)

      println("table successfully created")
    }
    catch {
      case e: Exception => println ("problem with creating table " + e.getMessage)
    }
  }

  def UpdateTable(entity: EntityBase): Unit = {

    try {
      val statement = conn.createStatement(ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_UPDATABLE)

      statement.executeUpdate(entity.CreateInsertString())
    }
    catch {
      case e: Exception => println("problem updating table " + e.getMessage + " " + entity.CreateInsertString())
    }
  }

}
