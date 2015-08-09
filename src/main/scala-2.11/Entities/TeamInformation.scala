package Entities

class TeamInformation (data: Array[String]) {

  val Team: Int = data(0).toInt
  val Wins: Int = data(1).toInt
  val Losses: Int = data(2).toInt
  val Ties: Int = data(3).toInt
  val PlayoffAppearances: Int = data(4).toInt
  val BowlAppearances: Int = data(5).toInt
  val BowlWins: Int = data(6).toInt
  val PlayoffWins: Int = data(7).toInt
  val PlayoffLosses: Int = data(8).toInt
  val TurfType: String = data(9)
  val YearStadiumOpened: Int = data(10).toInt
  val StadiumCapacity: Int = data(11).toInt
  val LuxuryBoxes: Int = data(12).toInt
  val ClubSeats: Int = data(13).toInt
  val HomeCity: String = data(14)
  val UpperDeckTickets: Int = data(15).toInt
  val EndZoneTickets: Int = data(16).toInt
  val MezzanineTickets: Int = data(17).toInt
  val SidelineTickets: Int = data(18).toInt
  val ClubSeatTickets: Int = data(19).toInt
  val LuxuryBoxTickets: Int = data(20).toInt
  val LostSalaryCapThisSeason: Int = data(21).toInt
  val LostSalaryCapNextSeason: Int = data(22).toInt

  def CreateInsertString():String = {
    s"""($Team, $Wins, $Losses, $Ties, $PlayoffAppearances, $BowlAppearances, $BowlWins,
       |$PlayoffWins, $PlayoffLosses, '$TurfType', $YearStadiumOpened, $StadiumCapacity,
       |$LuxuryBoxes, $ClubSeats, '$HomeCity', $UpperDeckTickets, $EndZoneTickets, $MezzanineTickets,
       | $SidelineTickets, $ClubSeatTickets, $LuxuryBoxTickets, $LostSalaryCapThisSeason, $LostSalaryCapNextSeason);
     """.stripMargin
  }
}
