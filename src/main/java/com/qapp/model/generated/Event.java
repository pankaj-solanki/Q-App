package com.qapp.model.generated;

import com.qapp.model.ModelRootClass;
import java.util.Date;

public class Event extends ModelRootClass {
  private Long id;

  private Integer eventEntityTypeId;

  private Long eventEntityId;

  private Integer sharingEntityTypeId;

  private Long sharingEntityId;

  private Date creationTime;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Integer getEventEntityTypeId() {
    return eventEntityTypeId;
  }

  public void setEventEntityTypeId(Integer eventEntityTypeId) {
    this.eventEntityTypeId = eventEntityTypeId;
  }

  public Long getEventEntityId() {
    return eventEntityId;
  }

  public void setEventEntityId(Long eventEntityId) {
    this.eventEntityId = eventEntityId;
  }

  public Integer getSharingEntityTypeId() {
    return sharingEntityTypeId;
  }

  public void setSharingEntityTypeId(Integer sharingEntityTypeId) {
    this.sharingEntityTypeId = sharingEntityTypeId;
  }

  public Long getSharingEntityId() {
    return sharingEntityId;
  }

  public void setSharingEntityId(Long sharingEntityId) {
    this.sharingEntityId = sharingEntityId;
  }

  public Date getCreationTime() {
    return creationTime;
  }

  public void setCreationTime(Date creationTime) {
    this.creationTime = creationTime;
  }
}
