package etlChron

import org.scalatest._
import Matchers._

class HelloSpec extends FlatSpec with Matchers {
  "The Main object" should startWith "Hello" in {
    Main.greeting startWith "Hello"
  }
}
