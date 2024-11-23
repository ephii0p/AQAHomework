import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class Postman {
    protected static final String URL = "https://postman-echo.com/";


    public static Response getPostman(Integer statusCode) {
        return RestAssured.given()
                .baseUri(URL + "get?foo1=bar1&foo2=bar2")
                .contentType(ContentType.JSON)
                .get(URL + "get?foo1=bar1&foo2=bar2")
                .then()
                .statusCode(statusCode)
                .log()
                .body()
                .extract()
                .response();
    }

    public static Response postPostman(Integer statusCode) {
        return RestAssured.given()
                .baseUri(URL + "post")
                .contentType(ContentType.JSON)
                .body("This is expected to be sent back as part of response body.")
                .post(URL + "post")
                .then()
                .statusCode(statusCode)
                .log()
                .body()
                .extract()
                .response();
    }

    public static Response postPostmanBody(Integer statusCode) {
        return RestAssured.given()
                .baseUri(URL + "post")
                .contentType("application/x-www-form-urlencoded; charset=utf-8")
                .formParam("foo1", "bar1")
                .formParam("foo2", "bar2")
                .post(URL + "post")
                .then()
                .statusCode(statusCode)
                .log()
                .body()
                .extract()
                .response();
    }
    public static Response putPostman(Integer statusCode) {
        return RestAssured.given()
                .baseUri(URL + "put")
                .contentType(ContentType.JSON)
                .body("This is expected to be sent back as part of response body.")
                .put(URL + "put")
                .then()
                .statusCode(statusCode)
                .log()
                .body()
                .extract()
                .response();
    }
    public static Response patchPostman(Integer statusCode) {
        return RestAssured.given()
                .baseUri(URL + "patch")
                .contentType(ContentType.JSON)
                .body("This is expected to be sent back as part of response body.")
                .patch(URL + "patch")
                .then()
                .statusCode(statusCode)
                .log()
                .body()
                .extract()
                .response();
    }
    public static Response deletePostman(Integer statusCode) {
        return RestAssured.given()
                .baseUri(URL + "delete")
                .contentType(ContentType.JSON)
                .body("This is expected to be sent back as part of response body.")
                .delete(URL + "delete")
                .then()
                .statusCode(statusCode)
                .log()
                .body()
                .extract()
                .response();
    }
}