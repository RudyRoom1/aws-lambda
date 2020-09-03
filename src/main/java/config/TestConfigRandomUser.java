package config;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;
import org.junit.Before;

public class TestConfigRandomUser {
    public static RequestSpecification randoUser_requestSpec;


    public static void beforeScenario() {
        System.out.println("before");

        randoUser_requestSpec = new RequestSpecBuilder().
                setBaseUri(" https://httpbin.org").
                addHeader("Content-Type", "application/json").
                addHeader("Accept", "application/json").
                build();

    }


}
