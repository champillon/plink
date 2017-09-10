package utilities

import org.scalatest.FlatSpec

class JsonSpec
  extends FlatSpec {

  "toText" should "return Json String" in {
    val result = JsonObject("string", 3).toText

    assert(result.contains("field1"))
  }

  "toObject" should "return Option[Object]" in {
    val result = Json.toObject[JsonObject](
      """
        |{
        | "field1": "aaa",
        | "field2": 3
        |}
      """.stripMargin)

    assert(result.isDefined)
  }

}

case class JsonObject(field1: String, field2: Int)
  extends Json