package etlChron

trait Greeting{ 
  lazy val greeting : String = "Hello"
}

object Main extends App with Greeting{
  Console.println(greeting + " World: " + "[" + (args mkString ", ") + "]\n")
}