package etlChron

import org.scalatest._

class HelloSpec extends FlatSpec with Matchers {
  "The Main object" should "startWith \"Hello\"" in {
    Main.greeting should startWith("Hello")
  }
}
