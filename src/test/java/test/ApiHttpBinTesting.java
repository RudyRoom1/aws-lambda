package test;

import component.ApiHttpBin;
import org.junit.Test;

public class ApiHttpBinTesting {
  @Test
  public void getTest(){
    ApiHttpBin apiHttpBin = new ApiHttpBin();
//    apiHttpBin.endpoint_was_set_endpoint("/get?id=3");
    apiHttpBin.post_the_file("/post");

  }

}
