package com.qapp.model.generated;

import com.qapp.model.ModelRootClass;
import java.util.Date;

public class FriendGroup extends ModelRootClass {
  private Long id;

  private String groupName;

  private Long createdBy;

  private Date creationTime;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getGroupName() {
    return groupName;
  }

  public void setGroupName(String groupName) {
    this.groupName = groupName == null ? null : groupName.trim();
  }

  public Long getCreatedBy() {
    return createdBy;
  }

  public void setCreatedBy(Long createdBy) {
    this.createdBy = createdBy;
  }

  public Date getCreationTime() {
    return creationTime;
  }

  public void setCreationTime(Date creationTime) {
    this.creationTime = creationTime;
  }
}
