package TestAPI;

import io.restassured.http.ContentType;
import org.junit.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.equalTo;

public class ManifestAPI {
    @Test
    public void getAllPosts() {
        given()
                .baseUri("https://jsonplaceholder.typicode.com")
                .when()
                .log().all()
                .get("/posts")
                .then()
                .log().all()
                .statusCode(200);
    }
    @Test
    public void testGetPostById() {
        int postId = 1;

        given()
                .baseUri("https://jsonplaceholder.typicode.com")
                .when()
                .log().all()
                .get("/posts/{postId}", postId)
                .then()
                .log().all()
                .statusCode(200)
                .body("id", equalTo(postId));
    }
    @Test
    public void CreateNewPost() {
        String requestBody = "{\n" +
                "    \"title\": \"foo\",\n" +
                "    \"body\": \"bar\",\n" +
                "    \"userId\": 1\n" +
                "}";

        given()
                .baseUri("https://jsonplaceholder.typicode.com")
                .contentType("application/json")
                .body(requestBody)
                .when()
                .log().all()
                .post("/posts")
                .then()
                .log().all()
                .statusCode(201);
    }
    @Test
    public void updatePost() {
        JSONObject requestParams = new JSONObject();
        requestParams.put("title", "foo");
        requestParams.put("body", "bar");

        String endpoint = "https://jsonplaceholder.typicode.com/posts/1";

        given()
                .baseUri(endpoint)
                .contentType(ContentType.JSON)
                .body(requestParams.toString())
                .when()
                .log().all()
                .put()
                .then()
                .log().all()
                .statusCode(200)
                .body("title", equalTo("foo"))
                .body("body", equalTo("bar"));
    }
    @Test
    public void deletePost() {
        String endpoint = "https://jsonplaceholder.typicode.com/posts/1";
        given()
                .baseUri(endpoint)
                .when()
                .log().all()
                .delete()
                .then()
                .log().all()
                .statusCode(200);

        given()
                .baseUri(endpoint)
                .when()
                .log().all()
                .get()
                .then()
                .log().all()
                .statusCode(404);
    }
}


