package Entities

class CareerRecords (data: Array[String]) extends EntityBase {

  val Category: String = data(0)
  val Team: Int = data(1).toInt
  val Place: Int = data(2).toInt
  val PlayerId: Int = data(3).toInt
  val Record: Int = data(4).toInt
  val LastYear: Int = data(5).toInt

  override def CreateInsertString(): String = {

    s"""
       |INSERT INTO Career_Records VALUES
       |('$Category', $Team, $Place, $PlayerId, $Record, $LastYear);
     """.stripMargin
  }

  override def toString: String = {
    s"""('$Category', $Team, $Place, $PlayerId, $Record, $LastYear)"""
  }
}
