package lamda_handler;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import component.ApiHttpComponent;
import enums.Environment;

public class WelcomeLambda implements RequestHandler<Object, Object> {


  @Override
  public Object handleRequest(Object o, Context context) {
    ApiHttpComponent apiHttpComponent = new ApiHttpComponent();

    String environment = System.getenv("ENV");
    if (environment.equals(Environment.QA.name())){
      apiHttpComponent.post_the_file("/post");
    }else if(environment.equals(Environment.DEV.name()) || environment.equals(Environment.CI.name())) {
      apiHttpComponent.geyById("/get?id=3");
    }else{
      System.out.println("No valid environment");
    }
    return null;
  }
}
