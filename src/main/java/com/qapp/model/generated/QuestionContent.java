package com.qapp.model.generated;

import com.qapp.model.ModelRootClass;
import java.util.Date;

public class QuestionContent extends ModelRootClass {
  private Long questionId;

  private Integer questionTypeId;

  private Integer contentTypeId;

  private Date creationTime;

  private Date updationTime;

  private String content;

  public Long getQuestionId() {
    return questionId;
  }

  public void setQuestionId(Long questionId) {
    this.questionId = questionId;
  }

  public Integer getQuestionTypeId() {
    return questionTypeId;
  }

  public void setQuestionTypeId(Integer questionTypeId) {
    this.questionTypeId = questionTypeId;
  }

  public Integer getContentTypeId() {
    return contentTypeId;
  }

  public void setContentTypeId(Integer contentTypeId) {
    this.contentTypeId = contentTypeId;
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

  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content == null ? null : content.trim();
  }
}
