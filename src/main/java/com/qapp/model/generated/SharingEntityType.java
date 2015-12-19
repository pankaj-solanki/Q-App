package com.qapp.model.generated;

import com.qapp.model.ModelRootClass;

public class SharingEntityType extends ModelRootClass {
  private Integer id;

  private String type;

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type == null ? null : type.trim();
  }
}
