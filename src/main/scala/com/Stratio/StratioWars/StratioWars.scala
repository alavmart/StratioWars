import com.Stratio.StratioWars.Decrypt


object StratioWars {


  def main(args: Array[String]): Unit = {
    val dec = new Decrypt
    val input: List[String] = List("2952410b-0a94-446b-8bcb-448dc6e30b08", "6f9c15fa-ef51-4415-afab-36218d76c2d9", "2ab81c9b-1719-400c-a676-bdba976150eb")
    var output: List[String] = List()

    for (i <- input) output= output:+dec.decryptAlgorithm(i)
    for (i <- output) println(i)
  }
}
