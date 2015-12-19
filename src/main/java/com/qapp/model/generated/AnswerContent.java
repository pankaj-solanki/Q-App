package com.qapp.model.generated;

import com.qapp.model.ModelRootClass;

public class AnswerContent extends ModelRootClass {
  private Long answerId;

  private Integer contentTypeId;

  private String content;

  public Long getAnswerId() {
    return answerId;
  }

  public void setAnswerId(Long answerId) {
    this.answerId = answerId;
  }

  public Integer getContentTypeId() {
    return contentTypeId;
  }

  public void setContentTypeId(Integer contentTypeId) {
    this.contentTypeId = contentTypeId;
  }

  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content == null ? null : content.trim();
  }
}
