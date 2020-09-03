package helper;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.introspect.VisibilityChecker;

public class Mapper {


  public ObjectMapper configMapper() {
    ObjectMapper mapper = new ObjectMapper();

    mapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
    mapper.setVisibilityChecker(VisibilityChecker.Std.defaultInstance().withFieldVisibility(
        JsonAutoDetect.Visibility.ANY));
    return mapper;
  }


}
