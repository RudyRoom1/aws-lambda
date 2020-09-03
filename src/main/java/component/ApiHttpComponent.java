package component;

import static io.restassured.RestAssured.given;

import helper.Mapper;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import java.io.File;
import lombok.SneakyThrows;
import model.get_model.GetModel;
import model.post_model.PostModel;
import org.junit.Assert;

public class ApiHttpComponent {

  private static final String path = "src/main/resources/text_task.txt";
  public static RequestSpecification randoUser_requestSpec;

  static {
    randoUser_requestSpec = new RequestSpecBuilder().
        setBaseUri("https://httpbin.org").
        addHeader("Content-Type", "application/json").
        addHeader("Accept", "application/json").
        build();
  }

  Mapper mapper = new Mapper();
  private RequestSpecification request;
  private Response response;

  public void user_set_specification() {
    request = given().spec(randoUser_requestSpec);
  }

  @SneakyThrows
  public void geyById(String endPoint) {
    user_set_specification();
    response = request.get(endPoint);
    System.out.println(response.getBody().toString());
    GetModel getModel = mapper.configMapper().readValue(response.asString(), GetModel.class);
    Assert.assertEquals(response.statusCode(), 200L);
    Assert.assertNotNull(getModel.getArgs());
    System.out.println("GET OKAAAAAAAAY");
  }

  @SneakyThrows
  public void post_the_file(String endPoint) {
    user_set_specification();
    File file = new File("text_task.txt");

    response = request
        .header("Content-Type", "multipart/text")
        .multiPart(" file", file, "multipart/text")
        .when()
        .post(endPoint);
    System.out.println(response.getBody().toString());
    PostModel postModel = mapper.configMapper().readValue(response.asString(), PostModel.class);
    Assert.assertEquals(response.statusCode(), 200L);
    Assert.assertNotNull(postModel.getFiles());
    System.out.println("POST OKAAAAAAAAY");
  }
}
