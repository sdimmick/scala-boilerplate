import utest._

object FooTests extends TestSuite {
  val tests: Tests = Tests {
    test("fooTest") {
      val result = Foo.bar()
      assert(result == "hello")
    }
  }
}
