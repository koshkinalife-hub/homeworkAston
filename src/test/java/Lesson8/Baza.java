package Lesson8;
import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;

public class Baza {

    protected static RequestSpecification requestSpec() {
        return RestAssured.given()
                .baseUri("https://postman-echo.com")
                .header("Content-Type", "application/json");
    }
}