package com.pharbers.testMacros

import com.pharbers.testMacros.model._
import com.pharbers.util.log.phLogTrait
import com.pharbers.pattern.request.request
import com.pharbers.jsonapi.model.RootObject
import com.pharbers.jsonapi.json.circe.CirceJsonapiSupport

object test_mongodb extends App with CirceJsonapiSupport with phLogTrait {

    import com.pharbers.macros._
    import com.pharbers.pattern.mongo.client_db_inst._
    import com.pharbers.macros.convert.jsonapi.JsonapiMacro._

    def findOne: Option[AnyRef] = {
        val jsonData = """
        {
            "data": {
                "id": "1",
                "type": "request",
                "attributes": {
                    "res": "scenario"
                },
                    "relationships": {
                    "eqcond": {
                        "data": [
                            {
                                "id": "2",
                                "type": "eqcond"
                            }
                        ]
                    }
                }
            },
            "included": [
                {
                    "id": "2",
                    "type": "eqcond",
                    "attributes": {
                        "key": "id",
                        "val": "5b765e5bbadd060001567e7c"
                    }
                }
            ]
        }""".stripMargin
        val json_data = parseJson(jsonData)
        val jsonapi = decodeJson[RootObject](json_data)

        val requests = formJsonapi[request](jsonapi)
        println(requests)

        val result = queryObject[scenario](requests)
        println(result)
        println(result.get.id)
        result
    }
    findOne

//    def queryMulti: List[AnyRef] = {
//        val jsonData =
//            """
//            |{
//            |	"data": {
//            |		"id": "1",
//            |		"type": "request",
//            |		"attributes": {
//            |			"res": "test2"
//            |		},
//            |		"relationships": {
//            |			"eq_conditions": {
//            |				"data": [{
//            |					"id": "2",
//            |					"type": "eq_cond"
//            |				}]
//            |			},
//            |         "fm_conditions": {
//            |				"data": {
//            |					"id": "3",
//            |					"type": "fm_cond"
//            |				}
//            |			}
//            |		}
//            |	},
//            |	"included": [{
//            |		"id": "2",
//            |		"type": "eq_cond",
//            |		"attributes": {
//            |			"key": "phone",
//            |			"value": "18510971868"
//            |		}
//            |	},{
//            |		"id": "3",
//            |		"type": "fm_cond",
//            |		"attributes": {
//            |			"skip": 0,
//            |			"take": 2
//            |		}
//            |	}]
//            |}
//            			""".stripMargin
//        val json_data = parseJson(jsonData)
//        val jsonapi = decodeJson[RootObject](json_data)
//
//        val requests = formJsonapi[request](jsonapi)
//        println(requests)
//
//        val result = queryMultipleObject[Person](requests)
//        println(result)
//        result
//    }
//
//    //    queryMulti
//    def insert: DBObject = {
//        val jsonData =
//            """
//            |{
//            |	"data": {
//            |		"id": "1",
//            |		"type": "Consumers",
//            |		"attributes": {
//            |			"name": "Alex",
//            |   		"age": 12,
//            |     	"phone": "18510971868"
//            |		},
//            |		"relationships": {
//            |			"orders": {
//            |				"data": [{
//            |					"id": "2",
//            |					"type": "Order"
//            |				}]
//            |			}
//            |		}
//            |	},
//            |	"included": [{
//            |		"id": "2",
//            |		"type": "Order",
//            |		"attributes": {
//            |			"title": "phone",
//            |			"abc": 6400
//            |		}
//            |	}]
//            |}
//            			""".stripMargin
//        val json_data = parseJson(jsonData)
//        val jsonapi = decodeJson[RootObject](json_data)
//
//        val consumers = formJsonapi[Consumers](jsonapi)
//        println(consumers)
//
//        val result = insertObject[Consumers](consumers)
//        println(consumers.orders)
//        consumers.orders.get.foreach { x =>
//            insertObject[Order](x)
//        }
//        println(result)
//        result
//    }
//
//    //	insert
//    def updata: Int = {
//        val jsonData =
//            """
//            |{
//            |	"data": {
//            |		"id": "1",
//            |		"type": "request",
//            |		"attributes": {
//            |			"res": "Person"
//            |		},
//            |		"relationships": {
//            |			"eq_conditions": {
//            |				"data": [{
//            |					"id": "2",
//            |					"type": "eq_cond"
//            |				}]
//            |			},
//            |   		"up_conditions": {
//            |     		"data": [{
//            |					"id": "3",
//            |					"type": "up_cond"
//            |				}]
//            |     	}
//            |		}
//            |	},
//            |	"included": [{
//            |		"id": "2",
//            |		"type": "eq_cond",
//            |		"attributes": {
//            |			"key": "name",
//            |			"value": "Alex"
//            |		}
//            |	},{
//            |		"id": "3",
//            |		"type": "up_cond",
//            |		"attributes": {
//            |			"key": "name",
//            |			"value": "Alex2"
//            |		}
//            |	}]
//            |}
//            			""".stripMargin
//        val json_data = parseJson(jsonData)
//        val jsonapi = decodeJson[RootObject](json_data)
//
//        val requests = formJsonapi[request](jsonapi)
//        println(requests)
//
//        val result = updateObject[Person](requests)
//        println(result)
//        result
//    }
//
//    //	updata
//    def delete = {
//        val jsonData =
//            """
//            |{
//            |	"data": {
//            |		"id": "1",
//            |		"type": "request",
//            |		"attributes": {
//            |			"res": "test"
//            |		},
//            |		"relationships": {
//            |			"eq_conditions": {
//            |				"data": [{
//            |					"id": "2",
//            |					"type": "eq_cond"
//            |				}]
//            |			}
//            |		}
//            |	},
//            |	"included": [{
//            |		"id": "2",
//            |		"type": "eq_cond",
//            |		"attributes": {
//            |			"key": "phone",
//            |			"value": "0000"
//            |		}
//            |	}]
//            |}
//            			""".stripMargin
//        val json_data = parseJson(jsonData)
//        val jsonapi = decodeJson[RootObject](json_data)
//
//        val requests = formJsonapi[request](jsonapi)
//        println(requests)
//
//        val result = deleteObject(requests)
//        phLog(result)
//    }
////	delete

}
