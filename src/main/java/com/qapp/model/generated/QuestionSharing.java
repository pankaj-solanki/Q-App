package com.qapp.model.generated;

import com.qapp.model.ModelRootClass;

public class QuestionSharing extends ModelRootClass {
  private Long id;

  private Long questionId;

  private Boolean isExcluded;

  private Integer sharingEntityTypeId;

  private Long sharingEntityId;

  private Boolean isPublicSharing;

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

  public Boolean getIsExcluded() {
    return isExcluded;
  }

  public void setIsExcluded(Boolean isExcluded) {
    this.isExcluded = isExcluded;
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

  public Boolean getIsPublicSharing() {
    return isPublicSharing;
  }

  public void setIsPublicSharing(Boolean isPublicSharing) {
    this.isPublicSharing = isPublicSharing;
  }
}
