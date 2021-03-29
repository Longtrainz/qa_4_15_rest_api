package test;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

public class SelenoidTests {

    @Test
    void successStatusTest() {
        given()
                .when()
                .get("https://selenoid.autotests.cloud/status")
                .then()
                .statusCode(200);
    }
}
