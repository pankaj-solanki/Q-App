package com.qapp.model.generated;

import com.qapp.model.ModelRootClass;

public class UserStatus extends ModelRootClass {
  private Integer id;

  private String status;

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status == null ? null : status.trim();
  }
}
