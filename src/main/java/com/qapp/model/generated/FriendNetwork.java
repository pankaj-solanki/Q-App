package com.qapp.model.generated;

import com.qapp.model.ModelRootClass;
import java.util.Date;

public class FriendNetwork extends ModelRootClass {
  private Long id;

  private Long userId;

  private Long friendUserId;

  private Date creationTime;

  private Date updationTime;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Long getUserId() {
    return userId;
  }

  public void setUserId(Long userId) {
    this.userId = userId;
  }

  public Long getFriendUserId() {
    return friendUserId;
  }

  public void setFriendUserId(Long friendUserId) {
    this.friendUserId = friendUserId;
  }

  public Date getCreationTime() {
    return creationTime;
  }

  public void setCreationTime(Date creationTime) {
    this.creationTime = creationTime;
  }

  public Date getUpdationTime() {
    return updationTime;
  }

  public void setUpdationTime(Date updationTime) {
    this.updationTime = updationTime;
  }
}
