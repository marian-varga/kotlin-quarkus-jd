package com.love2integrate

import io.quarkus.test.junit.QuarkusTest
import io.restassured.RestAssured
import org.hamcrest.CoreMatchers
import org.junit.jupiter.api.Test

@QuarkusTest
internal open class QueryResourceTest {
    @Test
    fun testHelloEndpoint() {
        RestAssured.given()
            .`when`().get("/hello")
            .then()
            .statusCode(200)
            .body(CoreMatchers.`is`<String?>("Found 2 records"))
    }
}