package Lesson8;
import org.junit.jupiter.api.Test;

import static org.hamcrest.Matchers.equalTo;
public class Put extends Baza {
    @Test
    void shouldReturnCorrectDataForPutRequest() {
        requestSpec()
                .body("{\"id\":101, \"status\":\"updated\"}")
                .when()
                .put("/put")
                .then()
                .statusCode(200)
                .body("data.id", equalTo(101))
                .body("data.status", equalTo("updated"));
    }
}
