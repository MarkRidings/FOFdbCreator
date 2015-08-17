package Entities

class Awards (data: Array[String]) extends EntityBase {

  val Year: Int = data(0).toInt
  val Award: String = data(1).map(c => if (c == '\'') ' ' else c)
  val PersonId: Int = data(2).toInt
  val Team: Int = data(3).toInt

  override def CreateInsertString(): String = {

    s"""
       |INSERT INTO Awards VALUES
       |($Year, '$Award', $PersonId, $Team)
     """.stripMargin
  }

  override def toString: String = {
   s"""($Year, '$Award', $PersonId, $Team)""".stripMargin
  }
}
