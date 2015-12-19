package com.qapp.model.generated;

import com.qapp.model.ModelRootClass;
import java.util.Date;

public class FriendGroupMember extends ModelRootClass {
  private Long groupId;

  private Long memberUserId;

  private Boolean isAdmin;

  private Date creationTime;

  public Long getGroupId() {
    return groupId;
  }

  public void setGroupId(Long groupId) {
    this.groupId = groupId;
  }

  public Long getMemberUserId() {
    return memberUserId;
  }

  public void setMemberUserId(Long memberUserId) {
    this.memberUserId = memberUserId;
  }

  public Boolean getIsAdmin() {
    return isAdmin;
  }

  public void setIsAdmin(Boolean isAdmin) {
    this.isAdmin = isAdmin;
  }

  public Date getCreationTime() {
    return creationTime;
  }

  public void setCreationTime(Date creationTime) {
    this.creationTime = creationTime;
  }
}
