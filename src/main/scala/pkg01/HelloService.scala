package pkg01

class HelloService
{
  def hello =
  {
    "Hello1"
  }

}

object HelloService extends HelloService
{
  class Inner
  {
    def innerHello =
    {
// $COVERAGE-OFF$
      "InnerHello1"
// $COVERAGE-ON$
    }

  }

}
