package component;

import static io.restassured.RestAssured.given;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import java.io.File;

public class ApiHttpBin {
  private static final String path = "D:/Learn&Grow/mentoring_program/aws/Lambda/src/main/resources/ text_task.txt";

  private RequestSpecification request;
  private Response response;

  public static RequestSpecification randoUser_requestSpec;

  public static void beforeScenarioGet() {
    System.out.println("before");

    randoUser_requestSpec = new RequestSpecBuilder().
        setBaseUri("https://httpbin.org").
        addHeader("Content-Type", "application/json").
        addHeader("Accept", "application/json").
        build();

  }

  public static void beforeScenarioPost() {
    System.out.println("before");

    randoUser_requestSpec = new RequestSpecBuilder().
        setBaseUri("https://httpbin.org")
        .addHeader("Content-Type", "multipart/html")
        .addHeader("Accept", "application/json")
        .build();

  }

  public void user_set_specification() {
  }

  public void endpoint_was_set_endpoint(String endPoint) {
    beforeScenarioGet();
    request = given().spec(randoUser_requestSpec);

    response = request.get(endPoint);
    response.getBody().print();
  }

  public void post_the_file(String endPoint) {
    beforeScenarioPost();
    request = given().spec(randoUser_requestSpec);

    response = request
        .header("Content-Type","multipart/text")
        .multiPart("file", new File(path), "multipart/text")
        .when()
        .post(endPoint);
  }



}
