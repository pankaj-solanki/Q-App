package com.qapp.model.generated;

import com.qapp.model.ModelRootClass;
import java.util.Date;

public class Answer extends ModelRootClass {
  private Long id;

  private Long questionId;

  private Long ownerId;

  private Date creationTime;

  private Date updationTime;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Long getQuestionId() {
    return questionId;
  }

  public void setQuestionId(Long questionId) {
    this.questionId = questionId;
  }

  public Long getOwnerId() {
    return ownerId;
  }

  public void setOwnerId(Long ownerId) {
    this.ownerId = ownerId;
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
