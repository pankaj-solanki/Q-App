package com.qapp.model.generated;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class QuestionExample {
  protected String orderByClause;

  protected boolean distinct;

  protected List<Criteria> oredCriteria;

  public QuestionExample() {
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

    public Criteria andOwnerIdIsNull() {
      addCriterion("owner_id is null");
      return (Criteria) this;
    }

    public Criteria andOwnerIdIsNotNull() {
      addCriterion("owner_id is not null");
      return (Criteria) this;
    }

    public Criteria andOwnerIdEqualTo(Long value) {
      addCriterion("owner_id =", value, "ownerId");
      return (Criteria) this;
    }

    public Criteria andOwnerIdNotEqualTo(Long value) {
      addCriterion("owner_id <>", value, "ownerId");
      return (Criteria) this;
    }

    public Criteria andOwnerIdGreaterThan(Long value) {
      addCriterion("owner_id >", value, "ownerId");
      return (Criteria) this;
    }

    public Criteria andOwnerIdGreaterThanOrEqualTo(Long value) {
      addCriterion("owner_id >=", value, "ownerId");
      return (Criteria) this;
    }

    public Criteria andOwnerIdLessThan(Long value) {
      addCriterion("owner_id <", value, "ownerId");
      return (Criteria) this;
    }

    public Criteria andOwnerIdLessThanOrEqualTo(Long value) {
      addCriterion("owner_id <=", value, "ownerId");
      return (Criteria) this;
    }

    public Criteria andOwnerIdIn(List<Long> values) {
      addCriterion("owner_id in", values, "ownerId");
      return (Criteria) this;
    }

    public Criteria andOwnerIdNotIn(List<Long> values) {
      addCriterion("owner_id not in", values, "ownerId");
      return (Criteria) this;
    }

    public Criteria andOwnerIdBetween(Long value1, Long value2) {
      addCriterion("owner_id between", value1, value2, "ownerId");
      return (Criteria) this;
    }

    public Criteria andOwnerIdNotBetween(Long value1, Long value2) {
      addCriterion("owner_id not between", value1, value2, "ownerId");
      return (Criteria) this;
    }

    public Criteria andIsForwardableIsNull() {
      addCriterion("is_forwardable is null");
      return (Criteria) this;
    }

    public Criteria andIsForwardableIsNotNull() {
      addCriterion("is_forwardable is not null");
      return (Criteria) this;
    }

    public Criteria andIsForwardableEqualTo(Boolean value) {
      addCriterion("is_forwardable =", value, "isForwardable");
      return (Criteria) this;
    }

    public Criteria andIsForwardableNotEqualTo(Boolean value) {
      addCriterion("is_forwardable <>", value, "isForwardable");
      return (Criteria) this;
    }

    public Criteria andIsForwardableGreaterThan(Boolean value) {
      addCriterion("is_forwardable >", value, "isForwardable");
      return (Criteria) this;
    }

    public Criteria andIsForwardableGreaterThanOrEqualTo(Boolean value) {
      addCriterion("is_forwardable >=", value, "isForwardable");
      return (Criteria) this;
    }

    public Criteria andIsForwardableLessThan(Boolean value) {
      addCriterion("is_forwardable <", value, "isForwardable");
      return (Criteria) this;
    }

    public Criteria andIsForwardableLessThanOrEqualTo(Boolean value) {
      addCriterion("is_forwardable <=", value, "isForwardable");
      return (Criteria) this;
    }

    public Criteria andIsForwardableIn(List<Boolean> values) {
      addCriterion("is_forwardable in", values, "isForwardable");
      return (Criteria) this;
    }

    public Criteria andIsForwardableNotIn(List<Boolean> values) {
      addCriterion("is_forwardable not in", values, "isForwardable");
      return (Criteria) this;
    }

    public Criteria andIsForwardableBetween(Boolean value1, Boolean value2) {
      addCriterion("is_forwardable between", value1, value2, "isForwardable");
      return (Criteria) this;
    }

    public Criteria andIsForwardableNotBetween(Boolean value1, Boolean value2) {
      addCriterion("is_forwardable not between", value1, value2, "isForwardable");
      return (Criteria) this;
    }

    public Criteria andIsExpiredIsNull() {
      addCriterion("is_expired is null");
      return (Criteria) this;
    }

    public Criteria andIsExpiredIsNotNull() {
      addCriterion("is_expired is not null");
      return (Criteria) this;
    }

    public Criteria andIsExpiredEqualTo(Boolean value) {
      addCriterion("is_expired =", value, "isExpired");
      return (Criteria) this;
    }

    public Criteria andIsExpiredNotEqualTo(Boolean value) {
      addCriterion("is_expired <>", value, "isExpired");
      return (Criteria) this;
    }

    public Criteria andIsExpiredGreaterThan(Boolean value) {
      addCriterion("is_expired >", value, "isExpired");
      return (Criteria) this;
    }

    public Criteria andIsExpiredGreaterThanOrEqualTo(Boolean value) {
      addCriterion("is_expired >=", value, "isExpired");
      return (Criteria) this;
    }

    public Criteria andIsExpiredLessThan(Boolean value) {
      addCriterion("is_expired <", value, "isExpired");
      return (Criteria) this;
    }

    public Criteria andIsExpiredLessThanOrEqualTo(Boolean value) {
      addCriterion("is_expired <=", value, "isExpired");
      return (Criteria) this;
    }

    public Criteria andIsExpiredIn(List<Boolean> values) {
      addCriterion("is_expired in", values, "isExpired");
      return (Criteria) this;
    }

    public Criteria andIsExpiredNotIn(List<Boolean> values) {
      addCriterion("is_expired not in", values, "isExpired");
      return (Criteria) this;
    }

    public Criteria andIsExpiredBetween(Boolean value1, Boolean value2) {
      addCriterion("is_expired between", value1, value2, "isExpired");
      return (Criteria) this;
    }

    public Criteria andIsExpiredNotBetween(Boolean value1, Boolean value2) {
      addCriterion("is_expired not between", value1, value2, "isExpired");
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

    public Criteria andEndTimeIsNull() {
      addCriterion("end_time is null");
      return (Criteria) this;
    }

    public Criteria andEndTimeIsNotNull() {
      addCriterion("end_time is not null");
      return (Criteria) this;
    }

    public Criteria andEndTimeEqualTo(Date value) {
      addCriterion("end_time =", value, "endTime");
      return (Criteria) this;
    }

    public Criteria andEndTimeNotEqualTo(Date value) {
      addCriterion("end_time <>", value, "endTime");
      return (Criteria) this;
    }

    public Criteria andEndTimeGreaterThan(Date value) {
      addCriterion("end_time >", value, "endTime");
      return (Criteria) this;
    }

    public Criteria andEndTimeGreaterThanOrEqualTo(Date value) {
      addCriterion("end_time >=", value, "endTime");
      return (Criteria) this;
    }

    public Criteria andEndTimeLessThan(Date value) {
      addCriterion("end_time <", value, "endTime");
      return (Criteria) this;
    }

    public Criteria andEndTimeLessThanOrEqualTo(Date value) {
      addCriterion("end_time <=", value, "endTime");
      return (Criteria) this;
    }

    public Criteria andEndTimeIn(List<Date> values) {
      addCriterion("end_time in", values, "endTime");
      return (Criteria) this;
    }

    public Criteria andEndTimeNotIn(List<Date> values) {
      addCriterion("end_time not in", values, "endTime");
      return (Criteria) this;
    }

    public Criteria andEndTimeBetween(Date value1, Date value2) {
      addCriterion("end_time between", value1, value2, "endTime");
      return (Criteria) this;
    }

    public Criteria andEndTimeNotBetween(Date value1, Date value2) {
      addCriterion("end_time not between", value1, value2, "endTime");
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
