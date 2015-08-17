package Entities

import Core.ConversionHelpers

class ActiveQuarterbacks(data: Array[String]) extends EntityBase {

  val PlayerId: Int = data(0).toInt
  val NumberFormations: Int = data(1).toInt
  val I_Normal: Boolean = ConversionHelpers.getBoolean(data(2))
  val I_TE_Pairs: Boolean = ConversionHelpers.getBoolean(data(3))
  val I_WR_Slot: Boolean = ConversionHelpers.getBoolean(data(4))
  val Pro_Normal: Boolean = ConversionHelpers.getBoolean(data(5))
  val Pro_TE_Pairs: Boolean = ConversionHelpers.getBoolean(data(6))
  val Pro_WR_Slot: Boolean = ConversionHelpers.getBoolean(data(7))
  val Weak_Normal: Boolean = ConversionHelpers.getBoolean(data(8))
  val Weak_TE_Pairs: Boolean = ConversionHelpers.getBoolean(data(9))
  val Weak_Three_WR: Boolean = ConversionHelpers.getBoolean(data(10))
  val Strong_Normal: Boolean = ConversionHelpers.getBoolean(data(11))
  var Strong_TE_Pairs: Boolean = ConversionHelpers.getBoolean(data(12))
  var Strong_Three_WR: Boolean = ConversionHelpers.getBoolean(data(13))
  var SingleBack_Normal: Boolean = ConversionHelpers.getBoolean(data(14))
  var SingleBack_TE_Pair: Boolean = ConversionHelpers.getBoolean(data(15))
  var SingleBack_Trips_WR: Boolean = ConversionHelpers.getBoolean(data(16))
  var SingleBack_Four_WR: Boolean = ConversionHelpers.getBoolean(data(17))
  var Five_WR_Spread: Boolean = ConversionHelpers.getBoolean(data(18))
  var Goalline_Three_TE: Boolean = ConversionHelpers.getBoolean(data(19))

  override def toString: String = {
    s"""
       |(
       |$PlayerId, $NumberFormations, $I_Normal, $I_TE_Pairs, $I_WR_Slot,
       |$Pro_Normal, $Pro_TE_Pairs, $Pro_WR_Slot, $Weak_Normal, $Weak_TE_Pairs, $Weak_Three_WR,
       |$Strong_Normal, $Strong_TE_Pairs, $Strong_Three_WR, $SingleBack_Normal, $SingleBack_TE_Pair,
       |$SingleBack_Trips_WR, $SingleBack_Four_WR, $Five_WR_Spread, $Goalline_Three_TE
       |)
     """.stripMargin
  }

  override def CreateInsertString(): String = ???
}
