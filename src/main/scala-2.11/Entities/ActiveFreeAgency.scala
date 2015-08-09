package Entities

class ActiveFreeAgency(data: Array[String]) extends EntityBase {

  val FreeAgencyRecord: Int = data(0).toInt
  val PlayerId: Int = data(1).toInt
  val Team: Int = data(2).toInt
  val Value: Int = data(3).toInt
  val Years: Int = data(4).toInt
  val StageForSigning: Int = data(5).toInt

  def CreateInsertString(): String = {
    s"""
       |INSERT INTO Active_Free_Agency VALUES
       |($FreeAgencyRecord, $PlayerId, $Team, $Value, $Years, $StageForSigning);""".stripMargin
  }
}
