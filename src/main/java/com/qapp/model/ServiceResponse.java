/**
 * 
 */
package com.qapp.model;

import java.util.HashMap;
import java.util.Map;

import com.qapp.types.ResponseField;

/**
 * @author Pankaj Solanki
 */
public class ServiceResponse {

  private boolean isSucceeded;
  private Object result;
  private Map<ResponseField, Object> extraInfo;

  public ServiceResponse(boolean isSucceeded, Object result) {
    this.isSucceeded = isSucceeded;
    this.result = result;
    this.extraInfo = new HashMap<ResponseField, Object>(1);
  }

  public boolean isSucceeded() {
    return isSucceeded;
  }

  public void setSucceeded(boolean isSucceeded) {
    this.isSucceeded = isSucceeded;
  }

  public Object getResult() {
    return result;
  }

  public void setResult(Object result) {
    this.result = result;
  }

  public Map<ResponseField, Object> getExtraInfo() {
    return extraInfo;
  }

  public void setExtraInfo(Map<ResponseField, Object> extraInfo) {
    this.extraInfo = extraInfo;
  }

  public void addExtraInfo(ResponseField key, Object value) {
    extraInfo.put(key, value);
  }

  @Override
  public String toString() {
    return "ServiceResponse [isSucceeded=" + isSucceeded + ", result=" + result + "]";
  }

}
