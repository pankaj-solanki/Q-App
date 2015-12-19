package com.qapp.model.generated;

import java.util.ArrayList;
import java.util.List;

public class QuestionSharingExample {
  protected String orderByClause;

  protected boolean distinct;

  protected List<Criteria> oredCriteria;

  public QuestionSharingExample() {
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

    public Criteria andIdIsNull() {
      addCriterion("id is null");
      return (Criteria) this;
    }

    public Criteria andIdIsNotNull() {
      addCriterion("id is not null");
      return (Criteria) this;
    }

    public Criteria andIdEqualTo(Long value) {
      addCriterion("id =", value, "id");
      return (Criteria) this;
    }

    public Criteria andIdNotEqualTo(Long value) {
      addCriterion("id <>", value, "id");
      return (Criteria) this;
    }

    public Criteria andIdGreaterThan(Long value) {
      addCriterion("id >", value, "id");
      return (Criteria) this;
    }

    public Criteria andIdGreaterThanOrEqualTo(Long value) {
      addCriterion("id >=", value, "id");
      return (Criteria) this;
    }

    public Criteria andIdLessThan(Long value) {
      addCriterion("id <", value, "id");
      return (Criteria) this;
    }

    public Criteria andIdLessThanOrEqualTo(Long value) {
      addCriterion("id <=", value, "id");
      return (Criteria) this;
    }

    public Criteria andIdIn(List<Long> values) {
      addCriterion("id in", values, "id");
      return (Criteria) this;
    }

    public Criteria andIdNotIn(List<Long> values) {
      addCriterion("id not in", values, "id");
      return (Criteria) this;
    }

    public Criteria andIdBetween(Long value1, Long value2) {
      addCriterion("id between", value1, value2, "id");
      return (Criteria) this;
    }

    public Criteria andIdNotBetween(Long value1, Long value2) {
      addCriterion("id not between", value1, value2, "id");
      return (Criteria) this;
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

    public Criteria andIsExcludedIsNull() {
      addCriterion("is_excluded is null");
      return (Criteria) this;
    }

    public Criteria andIsExcludedIsNotNull() {
      addCriterion("is_excluded is not null");
      return (Criteria) this;
    }

    public Criteria andIsExcludedEqualTo(Boolean value) {
      addCriterion("is_excluded =", value, "isExcluded");
      return (Criteria) this;
    }

    public Criteria andIsExcludedNotEqualTo(Boolean value) {
      addCriterion("is_excluded <>", value, "isExcluded");
      return (Criteria) this;
    }

    public Criteria andIsExcludedGreaterThan(Boolean value) {
      addCriterion("is_excluded >", value, "isExcluded");
      return (Criteria) this;
    }

    public Criteria andIsExcludedGreaterThanOrEqualTo(Boolean value) {
      addCriterion("is_excluded >=", value, "isExcluded");
      return (Criteria) this;
    }

    public Criteria andIsExcludedLessThan(Boolean value) {
      addCriterion("is_excluded <", value, "isExcluded");
      return (Criteria) this;
    }

    public Criteria andIsExcludedLessThanOrEqualTo(Boolean value) {
      addCriterion("is_excluded <=", value, "isExcluded");
      return (Criteria) this;
    }

    public Criteria andIsExcludedIn(List<Boolean> values) {
      addCriterion("is_excluded in", values, "isExcluded");
      return (Criteria) this;
    }

    public Criteria andIsExcludedNotIn(List<Boolean> values) {
      addCriterion("is_excluded not in", values, "isExcluded");
      return (Criteria) this;
    }

    public Criteria andIsExcludedBetween(Boolean value1, Boolean value2) {
      addCriterion("is_excluded between", value1, value2, "isExcluded");
      return (Criteria) this;
    }

    public Criteria andIsExcludedNotBetween(Boolean value1, Boolean value2) {
      addCriterion("is_excluded not between", value1, value2, "isExcluded");
      return (Criteria) this;
    }

    public Criteria andSharingEntityTypeIdIsNull() {
      addCriterion("sharing_entity_type_id is null");
      return (Criteria) this;
    }

    public Criteria andSharingEntityTypeIdIsNotNull() {
      addCriterion("sharing_entity_type_id is not null");
      return (Criteria) this;
    }

    public Criteria andSharingEntityTypeIdEqualTo(Integer value) {
      addCriterion("sharing_entity_type_id =", value, "sharingEntityTypeId");
      return (Criteria) this;
    }

    public Criteria andSharingEntityTypeIdNotEqualTo(Integer value) {
      addCriterion("sharing_entity_type_id <>", value, "sharingEntityTypeId");
      return (Criteria) this;
    }

    public Criteria andSharingEntityTypeIdGreaterThan(Integer value) {
      addCriterion("sharing_entity_type_id >", value, "sharingEntityTypeId");
      return (Criteria) this;
    }

    public Criteria andSharingEntityTypeIdGreaterThanOrEqualTo(Integer value) {
      addCriterion("sharing_entity_type_id >=", value, "sharingEntityTypeId");
      return (Criteria) this;
    }

    public Criteria andSharingEntityTypeIdLessThan(Integer value) {
      addCriterion("sharing_entity_type_id <", value, "sharingEntityTypeId");
      return (Criteria) this;
    }

    public Criteria andSharingEntityTypeIdLessThanOrEqualTo(Integer value) {
      addCriterion("sharing_entity_type_id <=", value, "sharingEntityTypeId");
      return (Criteria) this;
    }

    public Criteria andSharingEntityTypeIdIn(List<Integer> values) {
      addCriterion("sharing_entity_type_id in", values, "sharingEntityTypeId");
      return (Criteria) this;
    }

    public Criteria andSharingEntityTypeIdNotIn(List<Integer> values) {
      addCriterion("sharing_entity_type_id not in", values, "sharingEntityTypeId");
      return (Criteria) this;
    }

    public Criteria andSharingEntityTypeIdBetween(Integer value1, Integer value2) {
      addCriterion("sharing_entity_type_id between", value1, value2, "sharingEntityTypeId");
      return (Criteria) this;
    }

    public Criteria andSharingEntityTypeIdNotBetween(Integer value1, Integer value2) {
      addCriterion("sharing_entity_type_id not between", value1, value2, "sharingEntityTypeId");
      return (Criteria) this;
    }

    public Criteria andSharingEntityIdIsNull() {
      addCriterion("sharing_entity_id is null");
      return (Criteria) this;
    }

    public Criteria andSharingEntityIdIsNotNull() {
      addCriterion("sharing_entity_id is not null");
      return (Criteria) this;
    }

    public Criteria andSharingEntityIdEqualTo(Long value) {
      addCriterion("sharing_entity_id =", value, "sharingEntityId");
      return (Criteria) this;
    }

    public Criteria andSharingEntityIdNotEqualTo(Long value) {
      addCriterion("sharing_entity_id <>", value, "sharingEntityId");
      return (Criteria) this;
    }

    public Criteria andSharingEntityIdGreaterThan(Long value) {
      addCriterion("sharing_entity_id >", value, "sharingEntityId");
      return (Criteria) this;
    }

    public Criteria andSharingEntityIdGreaterThanOrEqualTo(Long value) {
      addCriterion("sharing_entity_id >=", value, "sharingEntityId");
      return (Criteria) this;
    }

    public Criteria andSharingEntityIdLessThan(Long value) {
      addCriterion("sharing_entity_id <", value, "sharingEntityId");
      return (Criteria) this;
    }

    public Criteria andSharingEntityIdLessThanOrEqualTo(Long value) {
      addCriterion("sharing_entity_id <=", value, "sharingEntityId");
      return (Criteria) this;
    }

    public Criteria andSharingEntityIdIn(List<Long> values) {
      addCriterion("sharing_entity_id in", values, "sharingEntityId");
      return (Criteria) this;
    }

    public Criteria andSharingEntityIdNotIn(List<Long> values) {
      addCriterion("sharing_entity_id not in", values, "sharingEntityId");
      return (Criteria) this;
    }

    public Criteria andSharingEntityIdBetween(Long value1, Long value2) {
      addCriterion("sharing_entity_id between", value1, value2, "sharingEntityId");
      return (Criteria) this;
    }

    public Criteria andSharingEntityIdNotBetween(Long value1, Long value2) {
      addCriterion("sharing_entity_id not between", value1, value2, "sharingEntityId");
      return (Criteria) this;
    }

    public Criteria andIsPublicSharingIsNull() {
      addCriterion("is_public_sharing is null");
      return (Criteria) this;
    }

    public Criteria andIsPublicSharingIsNotNull() {
      addCriterion("is_public_sharing is not null");
      return (Criteria) this;
    }

    public Criteria andIsPublicSharingEqualTo(Boolean value) {
      addCriterion("is_public_sharing =", value, "isPublicSharing");
      return (Criteria) this;
    }

    public Criteria andIsPublicSharingNotEqualTo(Boolean value) {
      addCriterion("is_public_sharing <>", value, "isPublicSharing");
      return (Criteria) this;
    }

    public Criteria andIsPublicSharingGreaterThan(Boolean value) {
      addCriterion("is_public_sharing >", value, "isPublicSharing");
      return (Criteria) this;
    }

    public Criteria andIsPublicSharingGreaterThanOrEqualTo(Boolean value) {
      addCriterion("is_public_sharing >=", value, "isPublicSharing");
      return (Criteria) this;
    }

    public Criteria andIsPublicSharingLessThan(Boolean value) {
      addCriterion("is_public_sharing <", value, "isPublicSharing");
      return (Criteria) this;
    }

    public Criteria andIsPublicSharingLessThanOrEqualTo(Boolean value) {
      addCriterion("is_public_sharing <=", value, "isPublicSharing");
      return (Criteria) this;
    }

    public Criteria andIsPublicSharingIn(List<Boolean> values) {
      addCriterion("is_public_sharing in", values, "isPublicSharing");
      return (Criteria) this;
    }

    public Criteria andIsPublicSharingNotIn(List<Boolean> values) {
      addCriterion("is_public_sharing not in", values, "isPublicSharing");
      return (Criteria) this;
    }

    public Criteria andIsPublicSharingBetween(Boolean value1, Boolean value2) {
      addCriterion("is_public_sharing between", value1, value2, "isPublicSharing");
      return (Criteria) this;
    }

    public Criteria andIsPublicSharingNotBetween(Boolean value1, Boolean value2) {
      addCriterion("is_public_sharing not between", value1, value2, "isPublicSharing");
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
