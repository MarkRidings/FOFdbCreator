package Entities

import Core.ConversionHelpers

class DraftPersonal (data: Array[String]) extends EntityBase {

  val PlayerId: Int = data(0).toInt
  val Interviewed: Boolean = ConversionHelpers.getBoolean(data(1))
  val LowScreenPasses: Int = data(2).toInt
  val LowShortPasses: Int = data(3).toInt
  val LowMediumPasses: Int = data(4).toInt
  val LowLongPasses: Int = data(5).toInt
  val LowDeepPasses: Int = data(6).toInt
  val LowThirdDown: Int = data(7).toInt
  val LowRunFrequency: Int = data(8).toInt
  val LowFuture1: Int = data(9).toInt
  val LowAccuracy: Int = data(10).toInt
  val LowTiming: Int = data(11).toInt
  val LowSenseRush: Int = data(12).toInt
  val LowReadDefense: Int = data(13).toInt
  val LowTwoMinuteOffense: Int = data(14).toInt
  val LowFuture2: Int = data(15).toInt
  val LowFuture3: Int = data(16).toInt
  val LowFuture4: Int = data(17).toInt
  val LowFuture5: Int = data(18).toInt
  val LowFuture6: Int = data(19).toInt
  val LowSpeed: Int = data(20).toInt
  val LowPowerInside: Int = data(21).toInt
  val LowThirdDownRuns: Int = data(22).toInt
  val LowHoleRecognition: Int = data(23).toInt
  val LowElusiveness: Int = data(24).toInt
  val LowSpeedOutside: Int = data(25).toInt
  val LowBlitzPickup: Int = data(26).toInt
  val LowAvoidDrops: Int = data(27).toInt
  val LowGetDownfield: Int = data(28).toInt
  val LowRouteRunning: Int = data(29).toInt
  val LowThirdDownReceiving: Int = data(30).toInt
  val LowBigPlayReceiving: Int = data(31).toInt
  val LowCourage: Int = data(32).toInt
  val LowAdjustToBall: Int = data(33).toInt
  val LowPuntReturns: Int = data(34).toInt
  val LowKickReturns: Int = data(35).toInt
  val LowFuture7: Int = data(36).toInt
  val LowRunBlocking: Int = data(37).toInt
  val LowPassBlocking: Int = data(38).toInt
  val LowBlockingStrength: Int = data(39).toInt
  val LowPuntingPower: Int = data(40).toInt
  val LowHangTime: Int = data(41).toInt
  val LowDirectionalPunting: Int = data(42).toInt
  val LowKickoffDistance: Int = data(43).toInt
  val LowKickoffHangTime: Int = data(44).toInt
  val LowKickingAccuracy: Int = data(45).toInt
  val LowKickingPower: Int = data(46).toInt
  val LowRunDefense: Int = data(47).toInt
  val LowPassRushTechnique: Int = data(48).toInt
  val LowManToManDefense: Int = data(49).toInt
  val LowZoneDefense: Int = data(50).toInt
  val LowBumpAndRunDefense: Int = data(51).toInt
  val LowPassRushStrength: Int = data(52).toInt
  val LowPlayDiagnosis: Int = data(53).toInt
  val LowPunishingHitter: Int = data(54).toInt
  val LowIntercepting: Int = data(55).toInt
  val LowEndurance: Int = data(56).toInt
  val LowSpecialTeams: Int = data(57).toInt
  val LowLongSnapping: Int = data(58).toInt
  val LowKickHolding: Int = data(59).toInt
  val HighScreenPasses: Int = data(60).toInt
  val HighShortPasses: Int = data(61).toInt
  val HighMediumPasses: Int = data(62).toInt
  val HighLongPasses: Int = data(63).toInt
  val HighDeepPasses: Int = data(64).toInt
  val HighThirdDown: Int = data(65).toInt
  val HighRunFrequency: Int = data(66).toInt
  val HighFuture1: Int = data(67).toInt
  val HighAccuracy: Int = data(68).toInt
  val HighTiming: Int = data(69).toInt
  val HighSenseRush: Int = data(70).toInt
  val HighReadDefense: Int = data(71).toInt
  val HighTwoMinuteOffense: Int = data(72).toInt
  val HighFuture2: Int = data(73).toInt
  val HighFuture3: Int = data(74).toInt
  val HighFuture4: Int = data(75).toInt
  val HighFuture5: Int = data(76).toInt
  val HighFuture6: Int = data(77).toInt
  val HighSpeed: Int = data(78).toInt
  val HighPowerInside: Int = data(79).toInt
  val HighThirdDownRuns: Int = data(80).toInt
  val HighHoleRecognition: Int = data(81).toInt
  val HighElusiveness: Int = data(82).toInt
  val HighSpeedOutside: Int = data(83).toInt
  val HighBlitzPickup: Int = data(84).toInt
  val HighAvoidDrops: Int = data(85).toInt
  val HighGetDownfield: Int = data(86).toInt
  val HighRouteRunning: Int = data(87).toInt
  val HighThirdDownReceiving: Int = data(88).toInt
  val HighBigPlayReceiving: Int = data(89).toInt
  val HighCourage: Int = data(90).toInt
  val HighAdjustToBall: Int = data(91).toInt
  val HighPuntReturns: Int = data(92).toInt
  val HighKickReturns: Int = data(93).toInt
  val HighFuture7: Int = data(94).toInt
  val HighRunBlocking: Int = data(95).toInt
  val HighPassBlocking: Int = data(96).toInt
  val HighBlockingStrength: Int = data(97).toInt
  val HighPuntingPower: Int = data(98).toInt
  val HighHangTime: Int = data(99).toInt
  val HighDirectionalPunting: Int = data(100).toInt
  val HighKickoffDistance: Int = data(101).toInt
  val HighKickoffHangTime: Int = data(102).toInt
  val HighKickingAccuracy: Int = data(103).toInt
  val HighKickingPower: Int = data(104).toInt
  val HighRunDefense: Int = data(105).toInt
  val HighPassRushTechnique: Int = data(106).toInt
  val HighManToManDefense: Int = data(107).toInt
  val HighZoneDefense: Int = data(108).toInt
  val HighBumpAndRunDefense: Int = data(109).toInt
  val HighPassRushStrength: Int = data(110).toInt
  val HighPlayDiagnosis: Int = data(111).toInt
  val HighPunishingHitter: Int = data(112).toInt
  val HighIntercepting: Int = data(113).toInt
  val HighEndurance: Int = data(114).toInt
  val HighSpecialTeams: Int = data(115).toInt
  val HighLongSnapping: Int = data(116).toInt
  val HighKickHolding: Int = data(117).toInt
  

  override def CreateInsertString(): String = {

    s"""
       |INSERT INTO Draft_Personal VALUES
       |(
       |  $PlayerId,
       |  $Interviewed,
       |  $LowScreenPasses,
       |  $LowShortPasses,
       |  $LowMediumPasses,
       |  $LowLongPasses,
       |  $LowDeepPasses,
       |  $LowThirdDown,
       |  $LowRunFrequency,
       |  $LowFuture1,
       |  $LowAccuracy,
       |  $LowTiming,
       |  $LowSenseRush,
       |  $LowReadDefense,
       |  $LowTwoMinuteOffense,
       |  $LowFuture2,
       |  $LowFuture3,
       |  $LowFuture4,
       |  $LowFuture5,
       |  $LowFuture6,
       |  $LowSpeed,
       |  $LowPowerInside,
       |  $LowThirdDownRuns,
       |  $LowHoleRecognition,
       |  $LowElusiveness,
       |  $LowSpeedOutside,
       |  $LowBlitzPickup,
       |  $LowAvoidDrops,
       |  $LowGetDownfield,
       |  $LowRouteRunning,
       |  $LowThirdDownReceiving,
       |  $LowBigPlayReceiving,
       |  $LowCourage,
       |  $LowAdjustToBall,
       |  $LowPuntReturns,
       |  $LowKickReturns,
       |  $LowFuture7,
       |  $LowRunBlocking,
       |  $LowPassBlocking,
       |  $LowBlockingStrength,
       |  $LowPuntingPower,
       |  $LowHangTime,
       |  $LowDirectionalPunting,
       |  $LowKickoffDistance,
       |  $LowKickoffHangTime,
       |  $LowKickingAccuracy,
       |  $LowKickingPower,
       |  $LowRunDefense,
       |  $LowPassRushTechnique,
       |  $LowManToManDefense,
       |  $LowZoneDefense,
       |  $LowBumpAndRunDefense,
       |  $LowPassRushStrength,
       |  $LowPlayDiagnosis,
       |  $LowPunishingHitter,
       |  $LowIntercepting,
       |  $LowEndurance,
       |  $LowSpecialTeams,
       |  $LowLongSnapping,
       |  $LowKickHolding,
       |  $HighScreenPasses,
       |  $HighShortPasses,
       |  $HighMediumPasses,
       |  $HighLongPasses,
       |  $HighDeepPasses,
       |  $HighThirdDown,
       |  $HighRunFrequency,
       |  $HighFuture1,
       |  $HighAccuracy,
       |  $HighTiming,
       |  $HighSenseRush,
       |  $HighReadDefense,
       |  $HighTwoMinuteOffense,
       |  $HighFuture2,
       |  $HighFuture3,
       |  $HighFuture4,
       |  $HighFuture5,
       |  $HighFuture6,
       |  $HighSpeed,
       |  $HighPowerInside,
       |  $HighThirdDownRuns,
       |  $HighHoleRecognition,
       |  $HighElusiveness,
       |  $HighSpeedOutside,
       |  $HighBlitzPickup,
       |  $HighAvoidDrops,
       |  $HighGetDownfield,
       |  $HighRouteRunning,
       |  $HighThirdDownReceiving,
       |  $HighBigPlayReceiving,
       |  $HighCourage,
       |  $HighAdjustToBall,
       |  $HighPuntReturns,
       |  $HighKickReturns,
       |  $HighFuture7,
       |  $HighRunBlocking,
       |  $HighPassBlocking,
       |  $HighBlockingStrength,
       |  $HighPuntingPower,
       |  $HighHangTime,
       |  $HighDirectionalPunting,
       |  $HighKickoffDistance,
       |  $HighKickoffHangTime,
       |  $HighKickingAccuracy,
       |  $HighKickingPower,
       |  $HighRunDefense,
       |  $HighPassRushTechnique,
       |  $HighManToManDefense,
       |  $HighZoneDefense,
       |  $HighBumpAndRunDefense,
       |  $HighPassRushStrength,
       |  $HighPlayDiagnosis,
       |  $HighPunishingHitter,
       |  $HighIntercepting,
       |  $HighEndurance,
       |  $HighSpecialTeams,
       |  $HighLongSnapping,
       |  $HighKickHolding
       |);
     """.stripMargin
  }
}
