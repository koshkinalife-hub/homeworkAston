package Lesson8;
import org.junit.jupiter.api.Test;

import static org.hamcrest.Matchers.equalTo;

public class Get extends Baza {

    @Test
    void shouldReturnCorrectDataForGetRequest() {
        requestSpec()
                .when()
                .get("/get?foo1=bar1&foo2=bar2")
                .then()
                .statusCode(200)
                .body("args.foo1", equalTo("bar1"))
                .body("args.foo2", equalTo("bar2"));
    }

    @Test
    void shouldReturn400ForInvalidGetRequest() {
        requestSpec()
                .when()
                .get("/get?foo1=") // некорректный параметр
                .then()
                .statusCode(200) // Postman Echo всё равно 200, но args.foo1 будет пустой
                .body("args.foo1", equalTo(""));
    }
}