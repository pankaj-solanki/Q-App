package com.qapp.model.generated;

import com.qapp.model.ModelRootClass;
import java.util.Date;

public class Question extends ModelRootClass {
  private Long id;

  private Long ownerId;

  private Boolean isForwardable;

  private Boolean isExpired;

  private Date creationTime;

  private Date endTime;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Long getOwnerId() {
    return ownerId;
  }

  public void setOwnerId(Long ownerId) {
    this.ownerId = ownerId;
  }

  public Boolean getIsForwardable() {
    return isForwardable;
  }

  public void setIsForwardable(Boolean isForwardable) {
    this.isForwardable = isForwardable;
  }

  public Boolean getIsExpired() {
    return isExpired;
  }

  public void setIsExpired(Boolean isExpired) {
    this.isExpired = isExpired;
  }

  public Date getCreationTime() {
    return creationTime;
  }

  public void setCreationTime(Date creationTime) {
    this.creationTime = creationTime;
  }

  public Date getEndTime() {
    return endTime;
  }

  public void setEndTime(Date endTime) {
    this.endTime = endTime;
  }
}
