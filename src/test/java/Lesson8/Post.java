package Lesson8;

import org.junit.jupiter.api.Test;

import static org.hamcrest.Matchers.equalTo;

public class Post extends Baza {

    @Test
    void shouldReturnCorrectDataForPostRequest() {
        requestSpec()
                .body("{\"name\":\"Aston\", \"course\":\"AQA\"}")
                .when()
                .post("/post")
                .then()
                .statusCode(200)
                .body("data.name", equalTo("Aston"))
                .body("data.course", equalTo("AQA"));
    }

    @Test
    void shouldReturnCorrectDataForAnotherPostRequest() {
        requestSpec()
                .body("{\"city\":\"Minsk\", \"year\":2025}")
                .when()
                .post("/post")
                .then()
                .statusCode(200)
                .body("data.city", equalTo("Minsk"))
                .body("data.year", equalTo(2025));
    }
}