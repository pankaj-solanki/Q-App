package com.qapp.model.generated;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class QuestionContentExample {
  protected String orderByClause;

  protected boolean distinct;

  protected List<Criteria> oredCriteria;

  public QuestionContentExample() {
    oredCriteria = new ArrayList<Criteria>();
  }

  public void setOrderByClause(String orderByClause) {
    this.orderByClause = orderByClause;
  }

  public String getOrderByClause() {
    return orderByClause;
  }

  public void setDistinct(boolean distinct) {
    this.distinct = distinct;
  }

  public boolean isDistinct() {
    return distinct;
  }

  public List<Criteria> getOredCriteria() {
    return oredCriteria;
  }

  public void or(Criteria criteria) {
    oredCriteria.add(criteria);
  }

  public Criteria or() {
    Criteria criteria = createCriteriaInternal();
    oredCriteria.add(criteria);
    return criteria;
  }

  public Criteria createCriteria() {
    Criteria criteria = createCriteriaInternal();
    if (oredCriteria.size() == 0) {
      oredCriteria.add(criteria);
    }
    return criteria;
  }

  protected Criteria createCriteriaInternal() {
    Criteria criteria = new Criteria();
    return criteria;
  }

  public void clear() {
    oredCriteria.clear();
    orderByClause = null;
    distinct = false;
  }

  protected abstract static class GeneratedCriteria {
    protected List<Criterion> criteria;

    protected GeneratedCriteria() {
      super();
      criteria = new ArrayList<Criterion>();
    }

    public boolean isValid() {
      return criteria.size() > 0;
    }

    public List<Criterion> getAllCriteria() {
      return criteria;
    }

    public List<Criterion> getCriteria() {
      return criteria;
    }

    protected void addCriterion(String condition) {
      if (condition == null) {
        throw new RuntimeException("Value for condition cannot be null");
      }
      criteria.add(new Criterion(condition));
    }

    protected void addCriterion(String condition, Object value, String property) {
      if (value == null) {
        throw new RuntimeException("Value for " + property + " cannot be null");
      }
      criteria.add(new Criterion(condition, value));
    }

    protected void addCriterion(String condition, Object value1, Object value2, String property) {
      if (value1 == null || value2 == null) {
        throw new RuntimeException("Between values for " + property + " cannot be null");
      }
      criteria.add(new Criterion(condition, value1, value2));
    }

    public Criteria andQuestionIdIsNull() {
      addCriterion("question_id is null");
      return (Criteria) this;
    }

    public Criteria andQuestionIdIsNotNull() {
      addCriterion("question_id is not null");
      return (Criteria) this;
    }

    public Criteria andQuestionIdEqualTo(Long value) {
      addCriterion("question_id =", value, "questionId");
      return (Criteria) this;
    }

    public Criteria andQuestionIdNotEqualTo(Long value) {
      addCriterion("question_id <>", value, "questionId");
      return (Criteria) this;
    }

    public Criteria andQuestionIdGreaterThan(Long value) {
      addCriterion("question_id >", value, "questionId");
      return (Criteria) this;
    }

    public Criteria andQuestionIdGreaterThanOrEqualTo(Long value) {
      addCriterion("question_id >=", value, "questionId");
      return (Criteria) this;
    }

    public Criteria andQuestionIdLessThan(Long value) {
      addCriterion("question_id <", value, "questionId");
      return (Criteria) this;
    }

    public Criteria andQuestionIdLessThanOrEqualTo(Long value) {
      addCriterion("question_id <=", value, "questionId");
      return (Criteria) this;
    }

    public Criteria andQuestionIdIn(List<Long> values) {
      addCriterion("question_id in", values, "questionId");
      return (Criteria) this;
    }

    public Criteria andQuestionIdNotIn(List<Long> values) {
      addCriterion("question_id not in", values, "questionId");
      return (Criteria) this;
    }

    public Criteria andQuestionIdBetween(Long value1, Long value2) {
      addCriterion("question_id between", value1, value2, "questionId");
      return (Criteria) this;
    }

    public Criteria andQuestionIdNotBetween(Long value1, Long value2) {
      addCriterion("question_id not between", value1, value2, "questionId");
      return (Criteria) this;
    }

    public Criteria andQuestionTypeIdIsNull() {
      addCriterion("question_type_id is null");
      return (Criteria) this;
    }

    public Criteria andQuestionTypeIdIsNotNull() {
      addCriterion("question_type_id is not null");
      return (Criteria) this;
    }

    public Criteria andQuestionTypeIdEqualTo(Integer value) {
      addCriterion("question_type_id =", value, "questionTypeId");
      return (Criteria) this;
    }

    public Criteria andQuestionTypeIdNotEqualTo(Integer value) {
      addCriterion("question_type_id <>", value, "questionTypeId");
      return (Criteria) this;
    }

    public Criteria andQuestionTypeIdGreaterThan(Integer value) {
      addCriterion("question_type_id >", value, "questionTypeId");
      return (Criteria) this;
    }

    public Criteria andQuestionTypeIdGreaterThanOrEqualTo(Integer value) {
      addCriterion("question_type_id >=", value, "questionTypeId");
      return (Criteria) this;
    }

    public Criteria andQuestionTypeIdLessThan(Integer value) {
      addCriterion("question_type_id <", value, "questionTypeId");
      return (Criteria) this;
    }

    public Criteria andQuestionTypeIdLessThanOrEqualTo(Integer value) {
      addCriterion("question_type_id <=", value, "questionTypeId");
      return (Criteria) this;
    }

    public Criteria andQuestionTypeIdIn(List<Integer> values) {
      addCriterion("question_type_id in", values, "questionTypeId");
      return (Criteria) this;
    }

    public Criteria andQuestionTypeIdNotIn(List<Integer> values) {
      addCriterion("question_type_id not in", values, "questionTypeId");
      return (Criteria) this;
    }

    public Criteria andQuestionTypeIdBetween(Integer value1, Integer value2) {
      addCriterion("question_type_id between", value1, value2, "questionTypeId");
      return (Criteria) this;
    }

    public Criteria andQuestionTypeIdNotBetween(Integer value1, Integer value2) {
      addCriterion("question_type_id not between", value1, value2, "questionTypeId");
      return (Criteria) this;
    }

    public Criteria andContentTypeIdIsNull() {
      addCriterion("content_type_id is null");
      return (Criteria) this;
    }

    public Criteria andContentTypeIdIsNotNull() {
      addCriterion("content_type_id is not null");
      return (Criteria) this;
    }

    public Criteria andContentTypeIdEqualTo(Integer value) {
      addCriterion("content_type_id =", value, "contentTypeId");
      return (Criteria) this;
    }

    public Criteria andContentTypeIdNotEqualTo(Integer value) {
      addCriterion("content_type_id <>", value, "contentTypeId");
      return (Criteria) this;
    }

    public Criteria andContentTypeIdGreaterThan(Integer value) {
      addCriterion("content_type_id >", value, "contentTypeId");
      return (Criteria) this;
    }

    public Criteria andContentTypeIdGreaterThanOrEqualTo(Integer value) {
      addCriterion("content_type_id >=", value, "contentTypeId");
      return (Criteria) this;
    }

    public Criteria andContentTypeIdLessThan(Integer value) {
      addCriterion("content_type_id <", value, "contentTypeId");
      return (Criteria) this;
    }

    public Criteria andContentTypeIdLessThanOrEqualTo(Integer value) {
      addCriterion("content_type_id <=", value, "contentTypeId");
      return (Criteria) this;
    }

    public Criteria andContentTypeIdIn(List<Integer> values) {
      addCriterion("content_type_id in", values, "contentTypeId");
      return (Criteria) this;
    }

    public Criteria andContentTypeIdNotIn(List<Integer> values) {
      addCriterion("content_type_id not in", values, "contentTypeId");
      return (Criteria) this;
    }

    public Criteria andContentTypeIdBetween(Integer value1, Integer value2) {
      addCriterion("content_type_id between", value1, value2, "contentTypeId");
      return (Criteria) this;
    }

    public Criteria andContentTypeIdNotBetween(Integer value1, Integer value2) {
      addCriterion("content_type_id not between", value1, value2, "contentTypeId");
      return (Criteria) this;
    }

    public Criteria andCreationTimeIsNull() {
      addCriterion("creation_time is null");
      return (Criteria) this;
    }

    public Criteria andCreationTimeIsNotNull() {
      addCriterion("creation_time is not null");
      return (Criteria) this;
    }

    public Criteria andCreationTimeEqualTo(Date value) {
      addCriterion("creation_time =", value, "creationTime");
      return (Criteria) this;
    }

    public Criteria andCreationTimeNotEqualTo(Date value) {
      addCriterion("creation_time <>", value, "creationTime");
      return (Criteria) this;
    }

    public Criteria andCreationTimeGreaterThan(Date value) {
      addCriterion("creation_time >", value, "creationTime");
      return (Criteria) this;
    }

    public Criteria andCreationTimeGreaterThanOrEqualTo(Date value) {
      addCriterion("creation_time >=", value, "creationTime");
      return (Criteria) this;
    }

    public Criteria andCreationTimeLessThan(Date value) {
      addCriterion("creation_time <", value, "creationTime");
      return (Criteria) this;
    }

    public Criteria andCreationTimeLessThanOrEqualTo(Date value) {
      addCriterion("creation_time <=", value, "creationTime");
      return (Criteria) this;
    }

    public Criteria andCreationTimeIn(List<Date> values) {
      addCriterion("creation_time in", values, "creationTime");
      return (Criteria) this;
    }

    public Criteria andCreationTimeNotIn(List<Date> values) {
      addCriterion("creation_time not in", values, "creationTime");
      return (Criteria) this;
    }

    public Criteria andCreationTimeBetween(Date value1, Date value2) {
      addCriterion("creation_time between", value1, value2, "creationTime");
      return (Criteria) this;
    }

    public Criteria andCreationTimeNotBetween(Date value1, Date value2) {
      addCriterion("creation_time not between", value1, value2, "creationTime");
      return (Criteria) this;
    }

    public Criteria andUpdationTimeIsNull() {
      addCriterion("updation_time is null");
      return (Criteria) this;
    }

    public Criteria andUpdationTimeIsNotNull() {
      addCriterion("updation_time is not null");
      return (Criteria) this;
    }

    public Criteria andUpdationTimeEqualTo(Date value) {
      addCriterion("updation_time =", value, "updationTime");
      return (Criteria) this;
    }

    public Criteria andUpdationTimeNotEqualTo(Date value) {
      addCriterion("updation_time <>", value, "updationTime");
      return (Criteria) this;
    }

    public Criteria andUpdationTimeGreaterThan(Date value) {
      addCriterion("updation_time >", value, "updationTime");
      return (Criteria) this;
    }

    public Criteria andUpdationTimeGreaterThanOrEqualTo(Date value) {
      addCriterion("updation_time >=", value, "updationTime");
      return (Criteria) this;
    }

    public Criteria andUpdationTimeLessThan(Date value) {
      addCriterion("updation_time <", value, "updationTime");
      return (Criteria) this;
    }

    public Criteria andUpdationTimeLessThanOrEqualTo(Date value) {
      addCriterion("updation_time <=", value, "updationTime");
      return (Criteria) this;
    }

    public Criteria andUpdationTimeIn(List<Date> values) {
      addCriterion("updation_time in", values, "updationTime");
      return (Criteria) this;
    }

    public Criteria andUpdationTimeNotIn(List<Date> values) {
      addCriterion("updation_time not in", values, "updationTime");
      return (Criteria) this;
    }

    public Criteria andUpdationTimeBetween(Date value1, Date value2) {
      addCriterion("updation_time between", value1, value2, "updationTime");
      return (Criteria) this;
    }

    public Criteria andUpdationTimeNotBetween(Date value1, Date value2) {
      addCriterion("updation_time not between", value1, value2, "updationTime");
      return (Criteria) this;
    }
  }

  public static class Criteria extends GeneratedCriteria {

    protected Criteria() {
      super();
    }
  }

  public static class Criterion {
    private String condition;

    private Object value;

    private Object secondValue;

    private boolean noValue;

    private boolean singleValue;

    private boolean betweenValue;

    private boolean listValue;

    private String typeHandler;

    public String getCondition() {
      return condition;
    }

    public Object getValue() {
      return value;
    }

    public Object getSecondValue() {
      return secondValue;
    }

    public boolean isNoValue() {
      return noValue;
    }

    public boolean isSingleValue() {
      return singleValue;
    }

    public boolean isBetweenValue() {
      return betweenValue;
    }

    public boolean isListValue() {
      return listValue;
    }

    public String getTypeHandler() {
      return typeHandler;
    }

    protected Criterion(String condition) {
      super();
      this.condition = condition;
      this.typeHandler = null;
      this.noValue = true;
    }

    protected Criterion(String condition, Object value, String typeHandler) {
      super();
      this.condition = condition;
      this.value = value;
      this.typeHandler = typeHandler;
      if (value instanceof List<?>) {
        this.listValue = true;
      } else {
        this.singleValue = true;
      }
    }

    protected Criterion(String condition, Object value) {
      this(condition, value, null);
    }

    protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
      super();
      this.condition = condition;
      this.value = value;
      this.secondValue = secondValue;
      this.typeHandler = typeHandler;
      this.betweenValue = true;
    }

    protected Criterion(String condition, Object value, Object secondValue) {
      this(condition, value, secondValue, null);
    }
  }
}
