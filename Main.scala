import com.cra.figaro.language._
import com.cra.figaro.algorithm.sampling._
import com.cra.figaro.algorithm.factored._

object Main extends App {
  val element = Select(
    0.75 -> "Goodbye cruel world!",
    0.25 -> "Hello world!")

  val samples = VariableElimination(element)
  samples.start()
  val pHello = samples.probability(element, "Hello world!")
  val pGoodbye = samples.probability(element, "Goodbye cruel world!")
  println(s"Probability of saying hello   = $pHello")
  println(s"Probability of saying goodbye = $pGoodbye")
}
