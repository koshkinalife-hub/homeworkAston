package Lesson8;
import org.junit.jupiter.api.Test;
import static org.hamcrest.Matchers.equalTo;
public class Delete extends Baza {
    @Test
    void shouldReturnCorrectDataForDeleteRequest() {
        requestSpec()
                .when()
                .delete("/delete?item=123")
                .then()
                .statusCode(200)
                .body("args.item", equalTo("123"));
    }
}
