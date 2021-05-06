package com.Stratio.StratioWars

import org.junit.Assert.assertEquals
import org.junit.Test

class DecryptTest {

  val dec = new Decrypt

  @Test
  def testDecGalaxy(): Unit = {
    val expected : Int = 34
    val actual : Int = dec.decGalaxy("2952410b")
    assertEquals(expected,actual)

  }
  @Test
  def testDecQuadrant(): Unit = {
    val expected : Int = 10
    val actual : Int = dec.decQuadrant("0a94")
    assertEquals(expected,actual)
  }
  @Test
  def testDecStarSystem(): Unit = {
    val expected : Int = 23
    val actual : Int = dec.decStarSystem("446b","8bcb")
    assertEquals(expected,actual)
  }
  @Test
  def tesDecPlanet(): Unit = {
    val expected : String = dec.decPlanet("448dc6e30b08")
    val actual : String = "edcb86430"
    assertEquals(expected,actual)
  }
  @Test
  def testDecryptAlgorithm(): Unit = {
    val expected : String = dec.decryptAlgorithm("2952410b-0a94-446b-8bcb-448dc6e30b08")
    val actual : String = "34-10-23-edcb86430"
    assertEquals(expected,actual)
  }

}
