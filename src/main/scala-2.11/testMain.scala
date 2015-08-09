import Data.ConnectDb
import Entities.TeamInformation

object testMain {

  def main(args: Array[String]): Unit = {

    val fileName = "/home/mark/FOF/APFL2013/team_information.csv"

    val file = FileReader.GetFile(fileName)
    val db = new ConnectDb()
    var count = 0
    db.CreateTeamInformationTable()

    for (line <- file.drop(1)) {
      db.UpdateTeamInformation(new TeamInformation(line))
      count += 1
    }

    db.Close()

    println("number of teams -> " + count)

  }

}
