package lamda_handler;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

public class WelcomeLambda implements RequestHandler<Object, Object> {


  @Override
  public Object handleRequest(Object o, Context context) {
    System.out.println("Welcome Lambda");
    return null;
  }
}
