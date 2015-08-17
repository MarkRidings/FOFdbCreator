

object testMain {

  def main(args: Array[String]): Unit = {

    val files = new java.io.File("/home/mark/FOF/APFL2013/").listFiles.filter(_.getName.endsWith(".csv"))

    ProcessFiles.CreateTables(files)


    /**
    val activeFreeAgencyFileName = "/home/mark/FOF/APFL2013/active_free_agency.csv"
    val activeQBFileName = "/home/mark/FOF/APFL2013/active_quarterbacks.csv"
    val awardsFileName = "/home/mark/FOF/APFL2013/awards.csv"
    val careerRecordsFileName = "/home/mark/FOF/APFL2013/career_records.csv"
    val currentScheduleFileName = "/home/mark/FOF/APFL2013/current_schedule.csv"
    val draftPersonalFileName = "/home/mark/FOF/APFL2013/draft_personal.csv"
    val teamInfoFileName = "/home/mark/FOF/APFL2013/team_information.csv"

    val activeFreeAgencyFile = FileReader.GetFile(activeFreeAgencyFileName)
    val activeQBFile = FileReader.GetFile(activeQBFileName)
    val awardsFile = FileReader.GetFile(awardsFileName)
    val careerRecordsFile = FileReader.GetFile(careerRecordsFileName)
    val currentScheduleFile = FileReader.GetFile(currentScheduleFileName)
    val draftPersonalFile = FileReader.GetFile(draftPersonalFileName)
    val teamInfoFile = FileReader.GetFile(teamInfoFileName)

    val db = new ConnectDb()

    var count = 0
    println("creating Active_Free_Agency table...")
    val insertStatement = new StringBuilder()
    insertStatement.append(SqlConstants.insertActiveFreeAgencySql)
    db.CreateNewTable(SqlConstants.dropActiveFreeAgencySql, SqlConstants.createActiveFreeAgencySql)
    for (line <- activeFreeAgencyFile.drop(1)) {
      if (count != 0) {
        insertStatement.append(",")
      }
      val activeFreeAgency = new ActiveFreeAgency(line)
      insertStatement.append(activeFreeAgency)
      count += 1
    }
    insertStatement.append(";")
    db.UpdateTable(insertStatement.toString())
    println("number of free agents -> " + count)

    count = 0
    insertStatement.clear()
    insertStatement.append(SqlConstants.insertActiveQuarterbackSql)
    println("creating Active_Quarterbacks table...")
    db.CreateNewTable(SqlConstants.dropActiveQuarterbacksSql, SqlConstants.createActiveQuarterbackSql)
    for (line <- activeQBFile.drop(1)) {
      if (count != 0) {
        insertStatement.append(",")
      }
      val activeQb = new ActiveQuarterbacks(line)
      insertStatement.append(activeQb.toString())
      count += 1
    }
    insertStatement.append(";")
    db.UpdateTable(insertStatement.toString())
    println("number of active qbs -> " + count)

    count = 0
    println("creating Awards table...")
    insertStatement.clear()
    insertStatement.append(SqlConstants.insertAwardsSql)
    db.CreateNewTable(SqlConstants.dropAwardsSql, SqlConstants.createAwardsSql)
    for (line <- awardsFile.drop(1)) {
      if (count != 0) {
        insertStatement.append(",")
      }
      val awards = new Awards(line)
      insertStatement.append(awards)
      count += 1
    }
    insertStatement.append(";")
    db.UpdateTable(insertStatement.toString())
    println("number of awards -> " + count)

    count = 0
    insertStatement.clear()
    insertStatement.append(SqlConstants.insertCareerRecordsSql)
    println("creating Career_Records table...")
    db.CreateNewTable(SqlConstants.dropCareerRecordsSql, SqlConstants.createCareerRecordsSql)
    for (line <- careerRecordsFile.drop(1)) {
      if (count != 0) {
        insertStatement.append(",")
      }
      val careerRecord = new CareerRecords(line)
      insertStatement.append(careerRecord)
      count += 1
    }
    insertStatement.append(";")
    db.UpdateTable(insertStatement.toString())
    println("number of career records -> " + count)

    count = 0
    insertStatement.clear()
    insertStatement.append(SqlConstants.insertCurrentSchedule)
    println("creating Current_Schedule table...")
    db.CreateNewTable(SqlConstants.dropCurrentScheduleSql, SqlConstants.createCurrentSchedule)
    for (line <- currentScheduleFile.drop(1)) {
      if (count != 0) {
        insertStatement.append(",")
      }
      val currentSchedule = new CurrentSchedule(line)
      insertStatement.append(currentSchedule)
      count += 1
    }
    insertStatement.append(";")
    db.UpdateTable(insertStatement.toString())
    println("number of games in schedule -> " + count)

    count = 0
    insertStatement.clear()
    insertStatement.append(SqlConstants.insertDraftPersonal)
    println("creating Draft_Personal table...")
    db.CreateNewTable(SqlConstants.dropDraftPersonalSql, SqlConstants.createDraftPersonalSql)
    for (line <- draftPersonalFile.drop(1)) {
      if (count != 0) {
        insertStatement.append(",")
      }
      val draftPersonal = new DraftPersonal(line)
      insertStatement.append(draftPersonal)
      count += 1
    }
    insertStatement.append(";")
    db.UpdateTable(insertStatement.toString())
    println("number of draft rookies -> " + count)

    count = 0
    insertStatement.clear()
    insertStatement.append(SqlConstants.insertTeamInformation)
    println("creating Team_Information table...")
    db.CreateNewTable(SqlConstants.dropTeamInformationSql, SqlConstants.createTeamInformationSql)
    for (line <- teamInfoFile.drop(1)) {
      if (count != 0) {
        insertStatement.append(",")
      }
      val teamInfo = new TeamInformation(line)
      insertStatement.append(teamInfo)
      count += 1
    }
    insertStatement.append(";")
    db.UpdateTable(insertStatement.toString())
    println("number of teams -> " + count)

    db.Close()
      */
  }

}
