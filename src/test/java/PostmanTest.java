import io.restassured.response.Response;
import junit.framework.Assert;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

public class PostmanTest {

    @Test
    public void testGetPostman() {
        Response response = Postman.getPostman(200);
        Map<String, Object> actualResponse = response.body().jsonPath().get("args");
        Map<String, Object> exceptedResponse = new HashMap<>();
        exceptedResponse.put("foo1", "bar1");
        exceptedResponse.put("foo2", "bar2");
        Assert.assertEquals(exceptedResponse, actualResponse);
        Assert.assertEquals(200, response.statusCode());

    }

    @Test
    public void testPostPostman() {
        Response response = Postman.postPostman(200);
        String actualResponse = response.body().jsonPath().get("data");
        String exceptedResponse = "This is expected to be sent back as part of response body.";
        Assert.assertEquals(exceptedResponse, actualResponse);
        Assert.assertEquals(200, response.statusCode());
    }

    @Test
    public void testPostPostmanBody() {
        Response response = Postman.postPostmanBody(200);
        Map<String, Object> actualResponse = response.body().jsonPath().get("form");
        Map<String, Object> exceptedResponse = new HashMap<>();
        exceptedResponse.put("foo1", "bar1");
        exceptedResponse.put("foo2", "bar2");
        Assert.assertEquals(exceptedResponse, actualResponse);
        Assert.assertEquals(200, response.statusCode());

    }

    @Test
    public void testPutPostman() {
        Response response = Postman.putPostman(200);
        String actualResponse = response.body().jsonPath().get("data");
        String exceptedResponse = "This is expected to be sent back as part of response body.";
        Assert.assertEquals(exceptedResponse, actualResponse);
        Assert.assertEquals(200, response.statusCode());
    }
    @Test
    public void testPatchPostman() {
        Response response = Postman.patchPostman(200);
        String actualResponse = response.body().jsonPath().get("data");
        String exceptedResponse = "This is expected to be sent back as part of response body.";
        Assert.assertEquals(exceptedResponse, actualResponse);
        Assert.assertEquals(200, response.statusCode());
    }
    @Test
    public void testDeletePostman() {
        Response response = Postman.deletePostman(200);
        String actualResponse = response.body().jsonPath().get("data");
        String exceptedResponse = "This is expected to be sent back as part of response body.";
        Assert.assertEquals(exceptedResponse, actualResponse);
        Assert.assertEquals(200, response.statusCode());
    }

}