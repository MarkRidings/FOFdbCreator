package Data

object SqlConstants {

  // Active Free Agency Table
  val dropActiveFreeAgencySql =
    """
      |DROP TABLE IF EXISTS Active_Free_Agency;
      |""".stripMargin

  val createActiveFreeAgencySql =
    """
      |CREATE TABLE Active_Free_Agency
      |(
      |FreeAgencyRecord INT NOT NULL,
      |PlayerId INT,
      |Team INT,
      |Value INT,
      |Years INT,
      |StageForSigning INT
      |);
    """.stripMargin

  // Active Quarterbacks Table
  val dropActiveQuarterbacksSql =
    """
      |DROP TABLE IF EXISTS Active_Quarterbacks;
    """.stripMargin

  val createActiveQuarterbackSql =
    """
      |CREATE TABLE Active_Quarterbacks
      |(
      |PlayerId INT NOT NULL PRIMARY KEY,
      |NumberFormations INT,
      |I_Normal BOOLEAN,
      |I_TE_Pairs BOOLEAN,
      |I_WR_Slot BOOLEAN,
      |Pro_Normal BOOLEAN,
      |Pro_TE_Pars BOOLEAN,
      |Pro_WR_Slot BOOLEAN,
      |Weak_Normal BOOLEAN,
      |Weak_TE_Pairs BOOLEAN,
      |Weak_Three_WR BOOLEAN,
      |Strong_Normal BOOLEAN,
      |Strong_TE_Pairs BOOLEAN,
      |Strong_Three_WR BOOLEAN,
      |Single_Back_Normal BOOLEAN,
      |Single_Back_TE_Pair BOOLEAN,
      |Single_Back_Trips_WR BOOLEAN,
      |Single_Back_Four_WR BOOLEAN,
      |Five_WR_Spread BOOLEAN,
      |Goal_Line_Three_TE BOOLEAN
      |);
    """.stripMargin

  // Awards Table
  val dropAwardsSql =
  """
    |DROP TABLE IF EXISTS Awards;
  """.stripMargin

  val createAwardsSql =
  """
    |CREATE TABLE Awards (
    |Year INT,
    |Award VARCHAR(100),
    |PersonId = INT,
    |Team = INT
    |);
  """.stripMargin

  // Team Information Table
  val dropTeamInformationSql =
    """
      |DROP TABLE IF EXISTS Team_Information;
    """.stripMargin

  val createTeamInformationSql =
    """
      CREATE TABLE Team_Information (
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
