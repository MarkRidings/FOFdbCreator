package Data

object SqlConstants {

  def GetCreateStatement(fileName: String): String = {

    if (fileName.startsWith("player_ratings_season")) {
      createPlayerRatingsSql(fileName)
    }
    else if (fileName.startsWith("player_season")) {
      createPlayerSeasonSql(fileName)
    }
    else {
      fileName match {
        case "active_free_agency" => createActiveFreeAgencySql
        case "active_quarterbacks" => createActiveQuarterbackSql
        case "awards" => createAwardsSql
        case "career_records" => createCareerRecordsSql
        case "current_schedule" => createCurrentSchedule
        case "draft_personal" => createDraftPersonalSql
        case "team_information" => createTeamInformationSql
        case _ => ""
      }
    }
  }

  def createPlayerSeasonSql(tableName: String): String = {

    s"""
       |CREATE TABLE $tableName
       |(
       |RecordNumber INT,
       |PlayerID INT,
       |Week INT,
       |Year INT,
       |Team INT,
       |GamesPlayed INT,
       |GamesStarted INT,
       |PassAttempts INT,
       |PassCompletions INT,
       |PassingYards INT,
       |LongPasses INT,
       |TouchdownPasses INT,
       |Intercepted INT,
       |Sacked INT,
       |SackYards INT,
       |Rushes INT,
       |RushingYards INT,
       |LongRush INT,
       |RushingTouchdowns INT,
       |Catches INT,
       |ReceivingYards INT,
       |LongReception INT,
       |ReceivingTouchdowns INT,
       |Targets INT,
       |YardsAfterCatch INT,
       |Drops INT,
       |PuntReturns INT,
       |PuntReturnYards INT,
       |PuntReturnTouchdowns INT,
       |KickReturns INT,
       |KickReturnYards INT,
       |KickReturnsTouchdowns INT,
       |Fumbles INT,
       |FumblesRecovered INT,
       |FumblesForced INT,
       |FumbleReturnTouchdowns INT,
       |KeyRunBlocks INT,
       |BlockOpportunities INT,
       |SacksAllowed INT,
       |Tackles INT,
       |Assists INT,
       |Sacksx10 INT,
       |Interceptions INT,
       |InterceptionReturnYards INT,
       |InterceptionReturnTouchdowns INT,
       |PassesDefensed INT,
       |PassesBlocked INT,
       |Hurries INT,
       |CaughtAgainst INT,
       |PassPlayes INT,
       |RunPlays INT,
       |FieldGoalsMade INT,
       |FieldGoalsAttempted INT,
       |LongFieldGoal INT,
       |PointsAfterTouchdown INT,
       |PATsAttempted INT,
       |Punts INT,
       |PuntingYards INT,
       |LongPunt INT,
       |PuntsInside20 INT,
       |PointsScored INT,
       |Opponent INT,
       |ThirdDownRuns INT,
       |ThirdDownRunFirstDowns INT,
       |ThirdDownPassAttempts INT,
       |ThirdDownPassCompletions INT,
       |ThirdDownPassFirstDowns INT,
       |ThirdDownTargets INT,
       |ThirdDownCatches INT,
       |ThirdDownCatchesFirstDowns INT,
       |FirstDownRushes INT,
       |FirstDownPassAttempts INT,
       |FirstDownCatches INT,
       |FourtyPlusFGAttempts INT,
       |FourtyPlusFGMade INT,
       |FiftyPlusFGAttempts INT,
       |FiftyPlusFGMade INT,
       |NetPuntingYardage INT,
       |SpecialTeamsTackles INT,
       |QuarterbackKnockedDown INT,
       |RedZoneRuns INT,
       |RedZoneRushingYards INT,
       |RedZonePassAttempts INT,
       |RedZoneCompletions INT,
       |RedZonePassingYards INT,
       |RedZoneTargets INT,
       |RedZoneCatches INT,
       |RedZoneReceivingYards INT,
       |TotalTouchdowns INT,
       |TwoPointConversions INT,
       |PancakeBlocks INT,
       |QuarterbackKnockdowns INT,
       |SpecialTeamsPlays INT,
       |OneHundredYardRushingGames INT,
       |OneHundredYardReceivingGames INT,
       |ThreeHundredYardPassingGames INT,
       |TenYardRuns INT,
       |TwentyYardCatches INT,
       |TwentyYardCompletions INT,
       |YardsFromScrimmage INT,
       |AllPurposeYards INT
       |)
     """.stripMargin
  }
  def createPlayerRatingsSql(tableName: String): String = {

    s"""
       |CREATE TABLE $tableName
       |(
       |RecordNumber INT,
       |Year INT,
       |PlayerID INT,
       |Scouting VARCHAR(100),
       |ScreenPasses INT,
       |ShortPasses INT,
       |MediumPasses INT,
       |LongPasses INT,
       |DeepPasses INT,
       |ThirdDown INT,
       |RunFrequency INT,
       |Future1 INT,
       |Accuracy INT,
       |Timing INT,
       |SenseRush INT,
       |ReadDefense INT,
       |TwoMinuteOffense INT,
       |Future2 INT,
       |Future3 INT,
       |Future4 INT,
       |Future5 INT,
       |Future6 INT,
       |Speed INT,
       |PowerInside INT,
       |ThirdDownRuns INT,
       |HoleRecognition INT,
       |Elusiveness INT,
       |SpeedOutside INT,
       |BlitzPickup INT,
       |AvoidDrops INT,
       |GetDownfield INT,
       |RouteRunning INT,
       |ThirdDownReceiving INT,
       |BigPlayReceiving INT,
       |Courage INT,
       |AdjustToBall INT,
       |PuntReturns INT,
       |KickReturns INT,
       |Future7 INT,
       |RunBlocking INT,
       |PassBlocking INT,
       |BlockingStrength INT,
       |PuntingPower INT,
       |HangTime INT,
       |DirectionalPunting INT,
       |KickoffDistance INT,
       |KickoffHangTime INT,
       |KickingAccuracy INT,
       |KickingPower INT,
       |RunDefense INT,
       |PassRushTechnique INT,
       |ManToManDefense INT,
       |ZoneDefense INT,
       |BumpAndRunDefense INT,
       |PassRushStrength INT,
       |PlayDiagnosis INT,
       |PunishingHitter INT,
       |Intercepting INT,
       |Endurance INT,
       |SpecialTeams INT,
       |LongSnapping INT,
       |KickHolding INT,
       |CurrentOverall INT,
       |FutureOverall INT
       |)
     """.stripMargin
  }

  val createActiveFreeAgencySql =
    """
      |CREATE TABLE active_free_agency
      |(
      |FreeAgencyRecord INT NOT NULL,
      |PlayerId INT,
      |Team INT,
      |Value INT,
      |Years INT,
      |StageForSigning INT
      |);
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

  val createAwardsSql =
  """
    |CREATE TABLE Awards (
    |Year INT,
    |Award VARCHAR(100),
    |PersonId INT,
    |Team INT
    |);
  """.stripMargin

  val createDraftPersonalSql = 
  """
    |CREATE TABLE Draft_Personal
    |(
     PlayerId INT,
     Interviewed BOOLEAN,
   LowScreenPasses INT,
   LowShortPasses INT,
   LowMediumPasses INT,
   LowLongPasses INT,
   LowDeepPasses INT,
   LowThirdDown INT,
     LowRunFrequency INT,
   LowFuture1 INT,
   LowAccuracy INT,
   LowTiming INT,
   LowSenseRush INT,
   LowReadDefense INT,
   LowTwoMinuteOffense INT,
   LowFuture2 INT,
   LowFuture3 INT,
   LowFuture4 INT,
   LowFuture5 INT,
   LowFuture6 INT,
   LowSpeed INT,
   LowPowerInside INT,
   LowThirdDownRuns INT,
   LowHoleRecognition INT,
   LowElusiveness INT,
   LowSpeedOutside INT,
   LowBlitzPickup INT,
   LowAvoidDrops INT,
   LowGetDownfield INT,
   LowRouteRunning INT,
   LowThirdDownReceiving INT,
   LowBigPlayReceiving INT,
   LowCourage INT,
   LowAdjustToBall INT,
   LowPuntReturns INT,
   LowKickReturns INT,
   LowFuture7 INT,
   LowRunBlocking INT,
   LowPassBlocking INT,
   LowBlockingStrength INT,
   LowPuntingPower INT,
   LowHangTime INT,
   LowDirectionalPunting INT,
   LowKickoffDistance INT,
   LowKickoffHangTime INT,
   LowKickingAccuracy INT,
   LowKickingPower INT,
   LowRunDefense INT,
   LowPassRushTechnique INT,
   LowManToManDefense INT,
   LowZoneDefense INT,
   LowBumpAndRunDefense INT,
   LowPassRushStrength INT,
   LowPlayDiagnosis INT,
   LowPunishingHitter INT,
   LowIntercepting INT,
   LowEndurance INT,
   LowSpecialTeams INT,
   LowLongSnapping INT,
   LowKickHolding INT,
   HighScreenPasses INT,
   HighShortPasses INT,
   HighMediumPasses INT,
   HighLongPasses INT,
   HighDeepPasses INT,
   HighThirdDown INT,
   HighRunFrequency INT,
   HighFuture1 INT,
   HighAccuracy INT,
   HighTiming INT,
   HighSenseRush INT,
   HighReadDefense INT,
   HighTwoMinuteOffense INT,
   HighFuture2 INT,
   HighFuture3 INT,
   HighFuture4 INT,
   HighFuture5 INT,
   HighFuture6 INT,
   HighSpeed INT,
   HighPowerInside INT,
   HighThirdDownRuns INT,
   HighHoleRecognition INT,
   HighElusiveness INT,
   HighSpeedOutside INT,
   HighBlitzPickup INT,
   HighAvoidDrops INT,
   HighGetDownfield INT,
   HighRouteRunning INT,
   HighThirdDownReceiving INT,
   HighBigPlayReceiving INT,
   HighCourage INT,
   HighAdjustToBall INT,
   HighPuntReturns INT,
   HighKickReturns INT,
  HighFuture7 INT,
  HighRunBlocking INT,
  HighPassBlocking INT,
  HighBlockingStrength INT,
  HighPuntingPower INT,
  HighHangTime INT,
  HighDirectionalPunting INT,
  HighKickoffDistance INT,
  HighKickoffHangTime INT,
  HighKickingAccuracy INT,
  HighKickingPower INT,
  HighRunDefense INT,
  HighPassRushTechnique INT,
  HighManToManDefense INT,
  HighZoneDefense INT,
  HighBumpAndRunDefense INT,
  HighPassRushStrength INT,
  HighPlayDiagnosis INT,
  HighPunishingHitter INT,
  HighIntercepting INT,
  HighEndurance INT,
  HighSpecialTeams INT,
  HighLongSnapping INT, 
  HighKickHolding INT);
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

  val createCurrentSchedule =
  """
    |CREATE TABLE Current_Schedule (
    |Week VARCHAR(100),
    |VisitorTeam INT,
    |HomeTeam INT
    |);
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
