package Data

object SqlConstants {

  // Active Free Agency Table
  val dropActiveFreeAgencySql = """DROP TABLE IF EXISTS Active_Free_Agency""".stripMargin

  val createActiveFreeAgencySql =
    """CREATE TABLE Active_Free_Agency
      |(
      |FreeAgencyRecord INT NOT NULL,
      |PlayerId INT,
      |Team INT,
      |Value INT,
      |Years INT,
      |StageForSigning INT
      |);
    """.stripMargin

  // Team Information Table
  val dropTeamInformationSql = """DROP TABLE IF EXISTS Team_Information;""".stripMargin

  val createTeamInformationSql = """CREATE TABLE Team_Information (
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
  );""".stripMargin


}
