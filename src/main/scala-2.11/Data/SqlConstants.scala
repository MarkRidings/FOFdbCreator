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

  // Draft Personal Table
  val dropDraftPersonalSql = 
  """
    |DROP TABLE IF EXISTS Draft_Personal;
  """.stripMargin
  
  val createDraftPersonalSql = 
  """
    |CREATE TABLE Draft_Personal
    |(
    |          PlayerId INT,
    |       |  Interviewed BOOLEAN,
    |       |  LowScreenPasses INT,
    |       |  LowShortPasses INT,
    |       |  LowMediumPasses INT,
    |       |  LowLongPasses INT,
    |       |  LowDeepPasses INT,
    |       |  LowThirdDown INT,
    |       |  LowRunFrequency INT,
    |       |  LowFuture1 INT,
    |       |  LowAccuracy INT,
    |       |  LowTiming INT,
    |       |  LowSenseRush INT,
    |       |  LowReadDefense INT,
    |       |  LowTwoMinuteOffense INT,
    |       |  LowFuture2 INT,
    |       |  LowFuture3 INT,
    |       |  LowFuture4 INT,
    |       |  LowFuture5 INT,
    |       |  LowFuture6 INT,
    |       |  LowSpeed INT,
    |       |  LowPowerInside INT,
    |       |  LowThirdDownRuns INT,
    |       |  LowHoleRecognition INT,
    |       |  LowElusiveness INT,
    |       |  LowSpeedOutside INT,
    |       |  LowBlitzPickup INT,
    |       |  LowAvoidDrops INT,
    |       |  LowGetDownfield INT,
    |       |  LowRouteRunning INT,
    |       |  LowThirdDownReceiving INT,
    |       |  LowBigPlayReceiving INT,
    |       |  LowCourage INT,
    |       |  LowAdjustToBall INT,
    |       |  LowPuntReturns INT,
    |       |  LowKickReturns INT,
    |       |  LowFuture7 INT,
    |       |  LowRunBlocking INT,
    |       |  LowPassBlocking INT,
    |       |  LowBlockingStrength INT,
    |       |  LowPuntingPower INT,
    |       |  LowHangTime INT,
    |       |  LowDirectionalPunting INT,
    |       |  LowKickoffDistance INT,
    |       |  LowKickoffHangTime INT,
    |       |  LowKickingAccuracy INT,
    |       |  LowKickingPower INT,
    |       |  LowRunDefense INT,
    |       |  LowPassRushTechnique INT,
    |       |  LowManToManDefense INT,
    |       |  LowZoneDefense INT,
    |       |  LowBumpAndRunDefense INT,
    |       |  LowPassRushStrength INT,
    |       |  LowPlayDiagnosis INT,
    |       |  LowPunishingHitter INT,
    |       |  LowIntercepting INT,
    |       |  LowEndurance INT,
    |       |  LowSpecialTeams INT,
    |       |  LowLongSnapping INT,
    |       |  LowKickHolding INT,
    |       |  HighScreenPasses INT,
    |       |  HighShortPasses INT,
    |       |  HighMediumPasses INT,
    |       |  HighLongPasses INT,
    |       |  HighDeepPasses INT,
    |       |  HighThirdDown INT,
    |       |  HighRunFrequency INT,
    |       |  HighFuture1 INT,
    |       |  HighAccuracy INT,
    |       |  HighTiming INT,
    |       |  HighSenseRush INT,
    |       |  HighReadDefense INT,
    |       |  HighTwoMinuteOffense INT,
    |       |  HighFuture2 INT,
    |       |  HighFuture3 INT,
    |       |  HighFuture4 INT,
    |       |  HighFuture5 INT,
    |       |  HighFuture6 INT,
    |       |  HighSpeed INT,
    |       |  HighPowerInside INT,
    |       |  HighThirdDownRuns INT,
    |       |  HighHoleRecognition INT,
    |       |  HighElusiveness INT,
    |       |  HighSpeedOutside INT,
    |       |  HighBlitzPickup INT,
    |       |  HighAvoidDrops INT,
    |       |  HighGetDownfield INT,
    |       |  HighRouteRunning INT,
    |       |  HighThirdDownReceiving INT,
    |       |  HighBigPlayReceiving INT,
    |       |  HighCourage INT,
    |       |  HighAdjustToBall INT,
    |       |  HighPuntReturns INT,
    |       |  HighKickReturns INT,
    |       |  HighFuture7 INT,
    |       |  HighRunBlocking INT,
    |       |  HighPassBlocking INT,
    |       |  HighBlockingStrength INT,
    |       |  HighPuntingPower INT,
    |       |  HighHangTime INT,
    |       |  HighDirectionalPunting INT,
    |       |  HighKickoffDistance INT,
    |       |  HighKickoffHangTime INT,
    |       |  HighKickingAccuracy INT,
    |       |  HighKickingPower INT,
    |       |  HighRunDefense INT,
    |       |  HighPassRushTechnique INT,
    |       |  HighManToManDefense INT,
    |       |  HighZoneDefense INT,
    |       |  HighBumpAndRunDefense INT,
    |       |  HighPassRushStrength INT,
    |       |  HighPlayDiagnosis INT,
    |       |  HighPunishingHitter INT,
    |       |  HighIntercepting INT,
    |       |  HighEndurance INT,
    |       |  HighSpecialTeams INT,
    |       |  HighLongSnapping INT,
    |       |  HighKickHolding INT
    |);
  """.stripMargin
  
  // Career Records Table
  val dropCareerRecordsSql =
  """
    |DROP TABLE IF EXISTS Career_Records;
  """.stripMargin

  val createCareerRecordsSql =
  """
    |CREATE TABLE Career_Records (
    |Category VARCHAR(100),
    |Team INT,
    |Place INT,
    |PlayerID INT,
    |Record INT,
    |LastYear INT
    |);
  """.stripMargin

  // Current Schedule Table
  val dropCurrentScheduleSql =
  """
    |DROP TABLE IF EXISTS Current_Schedule;
  """.stripMargin

  val createCurrentSchedule =
  """
    |CREATE TABLE Current_Schedule (
    |Week VARCHAR(100),
    |VisitorTeam INT,
    |HomeTeam INT
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
