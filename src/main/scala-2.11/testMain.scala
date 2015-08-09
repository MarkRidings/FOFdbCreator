import Data.{SqlConstants, ConnectDb}
import Entities.{ActiveFreeAgency, TeamInformation}

object testMain {

  def main(args: Array[String]): Unit = {

    val teamInfoFileName = "/home/mark/FOF/APFL2013/team_information.csv"
    val activeFreeAgencyFileName = "/home/mark/FOF/APFL2013/active_free_agency.csv"

    val teamInfoFile = FileReader.GetFile(teamInfoFileName)
    val activeFreeAgencyFile = FileReader.GetFile(activeFreeAgencyFileName)

    val db = new ConnectDb()
    var count = 0

    db.CreateNewTable(SqlConstants.dropTeamInformationSql, SqlConstants.createTeamInformationSql)
    for (line <- teamInfoFile.drop(1)) {
      db.UpdateTable(new TeamInformation(line))
      count += 1
    }
    println("number of teams -> " + count)

    count = 0
    db.CreateNewTable(SqlConstants.dropActiveFreeAgencySql, SqlConstants.createActiveFreeAgencySql)
    for (line <- activeFreeAgencyFile.drop(1)) {
      db.UpdateTable(new ActiveFreeAgency(line))
      count += 1
    }
    println("number of free agents -> " + count)

    db.Close()

  }

}
