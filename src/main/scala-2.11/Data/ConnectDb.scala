package Data

import java.sql.{ResultSet, DriverManager}

import Entities.TeamInformation

class ConnectDb {

  val connectionUrl = "jdbc:postgresql://localhost/APFL?user=postgres&password=0134lbs"

  val dropTableSql = """DROP TABLE IF EXISTS Team_Information;"""
  val createTableSql = """CREATE TABLE Team_Information (
      Team INT NOT NULL PRIMARY KEY,
      Wins INT,
      Losses INT,
      Ties INT,
      PlayoffAppearances INT,
      BowlAppearances INT,
      BowlWins INT,
      PlayoffWins INT,
      PlayoffLosses INT,
      TurfType VARCHAR (100),
      YearStadiumOpened INT,
      StadiumCapacity INT,
      LuxuryBoxes INT,
      ClubSeats INT,
      HomeCity VARCHAR (100),
      UpperDeckTickets INT,
      EndZoneTickets INT,
      MezzanineTickets INT,
      SidelineTickets INT,
      ClubSeatTickets INT,
      LuxuryBoxTickets INT,
      LostSalaryCapThisSeason INT,
      LostSalaryCapNextSeason INT
  );"""

  val insertSql = "INSERT INTO Team_Information VALUES"

  Class.forName("org.postgresql.Driver")
  val conn = DriverManager.getConnection(connectionUrl)

  def Close(): Unit = {
    conn.close()
  }

  def CreateTeamInformationTable(): Unit = {

    try {
      val statement = conn.createStatement(ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_UPDATABLE)

      statement.execute(dropTableSql)
      statement.execute(createTableSql)

      println("table successfully created")
    }
    catch {
      case e: Exception => println ("problem creating table team_information " + e.getMessage)
    }
  }

  def UpdateTeamInformation(teamInformation: TeamInformation): Unit = {

    try {
      val statement = conn.createStatement(ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_UPDATABLE)

      statement.executeUpdate(insertSql + " " + teamInformation.CreateInsertString())
    }
    catch {
      case e: Exception => println("problem updating team_information " + e.getMessage)
    }
  }
}
