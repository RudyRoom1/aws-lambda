package model.get_model;

import java.util.HashMap;
import java.util.Map;

public class Headers {

  private String accept;
  private String acceptEncoding;
  private String contentLength;
  private String contentType;
  private String host;
  private String userAgent;
  private String xAmznTraceId;
  private Map<String, Object> additionalProperties = new HashMap<String, Object>();

  public String getAccept() {
    return accept;
  }

  public void setAccept(String accept) {
    this.accept = accept;
  }

  public String getAcceptEncoding() {
    return acceptEncoding;
  }

  public void setAcceptEncoding(String acceptEncoding) {
    this.acceptEncoding = acceptEncoding;
  }

  public String getContentLength() {
    return contentLength;
  }

  public void setContentLength(String contentLength) {
    this.contentLength = contentLength;
  }

  public String getContentType() {
    return contentType;
  }

  public void setContentType(String contentType) {
    this.contentType = contentType;
  }

  public String getHost() {
    return host;
  }

  public void setHost(String host) {
    this.host = host;
  }

  public String getUserAgent() {
    return userAgent;
  }

  public void setUserAgent(String userAgent) {
    this.userAgent = userAgent;
  }

  public String getXAmznTraceId() {
    return xAmznTraceId;
  }

  public void setXAmznTraceId(String xAmznTraceId) {
    this.xAmznTraceId = xAmznTraceId;
  }

  public Map<String, Object> getAdditionalProperties() {
    return this.additionalProperties;
  }

  public void setAdditionalProperty(String name, Object value) {
    this.additionalProperties.put(name, value);
  }

}