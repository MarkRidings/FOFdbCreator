package Entities

class CurrentSchedule (data: Array[String]) extends EntityBase {

  val Week: String = data(0)
  val VisitorTeam: Int = data(1).toInt
  val HomeTeam: Int = data(2).toInt

  override def CreateInsertString(): String = {

    s"""
       |INSERT INTO Current_Schedule VALUES
       |('$Week', $VisitorTeam, $HomeTeam);
     """.stripMargin
  }
}
