package tests.api;

import entities.Post;
import io.restassured.RestAssured;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.apache.http.HttpStatus.SC_OK;

public class PostsTest {

    @Test
    public void getUsersPost(){
        Post post = RestAssured.given()
                .baseUri("https://jsonplaceholder.typicode.com")
                .get("posts/4")
                .then()
                .statusCode(SC_OK)
                .extract()
                .as(Post.class);

        Assertions.assertEquals(1, post.getUserId());
        Assertions.assertEquals(4, post.getId());
        Assertions.assertEquals("eum et est occaecati", post.getTitle());
        Assertions.assertEquals("ullam et saepe reiciendis voluptatem adipisci\nsit amet autem assumenda provident rerum culpa\nquis hic commodi nesciunt rem tenetur doloremque ipsam iure\nquis sunt voluptatem rerum illo velit", post.getBody());
    }
}
