package com.Stratio.StratioWars

import java.lang.Integer.parseInt

class Decrypt {


  val HEX = 16
  val RegEX = "^[a-f,0-9]{8}-[a-f,0-9]{4}-[a-f,0-9]{4}-[a-f,0-9]{4}-[a-f,0-9]{12}$".r


  def decGalaxy (gal: String): Int = {
    val valGalaxy = gal.split("")
    val hexValGalaxy = valGalaxy.map(x => parseInt(x,HEX))
    hexValGalaxy.sum
  }

  def decQuadrant (quad: String): Int = {
    val valQuadrant = quad.split("")
    val hexValQuadrant = valQuadrant.map(x => parseInt(x,HEX))
    hexValQuadrant.max
  }

  def decStarSystem (ss1: String, ss2: String): Int = {
    val valSs1 = ss1.split("")
    val valSs2 = ss2.split("")
    val hexValSs1 = valSs1.map(x => parseInt(x,HEX))
    val hexValSs2 = valSs2.map(x => parseInt(x,HEX))
    hexValSs1.max + hexValSs2.max
  }

  def decPlanet (pl: String): String = pl.distinct.sortWith(_ > _)


  def decryptAlgorithm (cords: String) : String = {

    val uuids = cords.split("-")
    val galaxy = decGalaxy(uuids(0))
    val quadrant = decQuadrant(uuids(1))
    val starSystem = decStarSystem(uuids(2),uuids(3))
    val planet = decPlanet(uuids(4))
    s"$galaxy-$quadrant-$starSystem-$planet"
  }

}
