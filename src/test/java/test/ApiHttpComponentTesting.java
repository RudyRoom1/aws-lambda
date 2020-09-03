package test;

import component.ApiHttpComponent;
import org.junit.Test;

public class ApiHttpComponentTesting {
  @Test
  public void getTest(){
    ApiHttpComponent apiHttpComponent = new ApiHttpComponent();
    apiHttpComponent.geyById("/get?id=3");
    apiHttpComponent.post_the_file("/post");
  }
}
