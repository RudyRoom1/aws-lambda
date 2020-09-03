package model.post_model;

import java.util.HashMap;
import java.util.Map;
import model.get_model.Args;
import model.get_model.Headers;

public class PostModel {

  private Args args;
  private String data;
  private Files files;
  private Form form;
  private Headers headers;
  private Object json;
  private String origin;
  private String url;
  private Map<String, Object> additionalProperties = new HashMap<String, Object>();

  public Args getArgs() {
    return args;
  }

  public void setArgs(Args args) {
    this.args = args;
  }

  public String getData() {
    return data;
  }

  public void setData(String data) {
    this.data = data;
  }

  public Files getFiles() {
    return files;
  }

  public void setFiles(Files files) {
    this.files = files;
  }

  public Form getForm() {
    return form;
  }

  public void setForm(Form form) {
    this.form = form;
  }

  public Headers getHeaders() {
    return headers;
  }

  public void setHeaders(Headers headers) {
    this.headers = headers;
  }

  public Object getJson() {
    return json;
  }

  public void setJson(Object json) {
    this.json = json;
  }

  public String getOrigin() {
    return origin;
  }

  public void setOrigin(String origin) {
    this.origin = origin;
  }

  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public Map<String, Object> getAdditionalProperties() {
    return this.additionalProperties;
  }

  public void setAdditionalProperty(String name, Object value) {
    this.additionalProperties.put(name, value);
  }

}