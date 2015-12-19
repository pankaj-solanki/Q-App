package com.qapp.model.generated;

import com.qapp.model.ModelRootClass;
import java.util.Date;

public class User extends ModelRootClass {
  private Long id;

  private Long contact;

  private String instanceId;

  private Long deviceImei;

  private String firstName;

  private String lastName;

  private Integer userStatusId;

  private Date creationTime;

  private Date updationTime;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Long getContact() {
    return contact;
  }

  public void setContact(Long contact) {
    this.contact = contact;
  }

  public String getInstanceId() {
    return instanceId;
  }

  public void setInstanceId(String instanceId) {
    this.instanceId = instanceId == null ? null : instanceId.trim();
  }

  public Long getDeviceImei() {
    return deviceImei;
  }

  public void setDeviceImei(Long deviceImei) {
    this.deviceImei = deviceImei;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName == null ? null : firstName.trim();
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName == null ? null : lastName.trim();
  }

  public Integer getUserStatusId() {
    return userStatusId;
  }

  public void setUserStatusId(Integer userStatusId) {
    this.userStatusId = userStatusId;
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
