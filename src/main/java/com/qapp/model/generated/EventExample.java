package com.qapp.model.generated;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class EventExample {
  protected String orderByClause;

  protected boolean distinct;

  protected List<Criteria> oredCriteria;

  public EventExample() {
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

    public Criteria andEventEntityTypeIdIsNull() {
      addCriterion("event_entity_type_id is null");
      return (Criteria) this;
    }

    public Criteria andEventEntityTypeIdIsNotNull() {
      addCriterion("event_entity_type_id is not null");
      return (Criteria) this;
    }

    public Criteria andEventEntityTypeIdEqualTo(Integer value) {
      addCriterion("event_entity_type_id =", value, "eventEntityTypeId");
      return (Criteria) this;
    }

    public Criteria andEventEntityTypeIdNotEqualTo(Integer value) {
      addCriterion("event_entity_type_id <>", value, "eventEntityTypeId");
      return (Criteria) this;
    }

    public Criteria andEventEntityTypeIdGreaterThan(Integer value) {
      addCriterion("event_entity_type_id >", value, "eventEntityTypeId");
      return (Criteria) this;
    }

    public Criteria andEventEntityTypeIdGreaterThanOrEqualTo(Integer value) {
      addCriterion("event_entity_type_id >=", value, "eventEntityTypeId");
      return (Criteria) this;
    }

    public Criteria andEventEntityTypeIdLessThan(Integer value) {
      addCriterion("event_entity_type_id <", value, "eventEntityTypeId");
      return (Criteria) this;
    }

    public Criteria andEventEntityTypeIdLessThanOrEqualTo(Integer value) {
      addCriterion("event_entity_type_id <=", value, "eventEntityTypeId");
      return (Criteria) this;
    }

    public Criteria andEventEntityTypeIdIn(List<Integer> values) {
      addCriterion("event_entity_type_id in", values, "eventEntityTypeId");
      return (Criteria) this;
    }

    public Criteria andEventEntityTypeIdNotIn(List<Integer> values) {
      addCriterion("event_entity_type_id not in", values, "eventEntityTypeId");
      return (Criteria) this;
    }

    public Criteria andEventEntityTypeIdBetween(Integer value1, Integer value2) {
      addCriterion("event_entity_type_id between", value1, value2, "eventEntityTypeId");
      return (Criteria) this;
    }

    public Criteria andEventEntityTypeIdNotBetween(Integer value1, Integer value2) {
      addCriterion("event_entity_type_id not between", value1, value2, "eventEntityTypeId");
      return (Criteria) this;
    }

    public Criteria andEventEntityIdIsNull() {
      addCriterion("event_entity_id is null");
      return (Criteria) this;
    }

    public Criteria andEventEntityIdIsNotNull() {
      addCriterion("event_entity_id is not null");
      return (Criteria) this;
    }

    public Criteria andEventEntityIdEqualTo(Long value) {
      addCriterion("event_entity_id =", value, "eventEntityId");
      return (Criteria) this;
    }

    public Criteria andEventEntityIdNotEqualTo(Long value) {
      addCriterion("event_entity_id <>", value, "eventEntityId");
      return (Criteria) this;
    }

    public Criteria andEventEntityIdGreaterThan(Long value) {
      addCriterion("event_entity_id >", value, "eventEntityId");
      return (Criteria) this;
    }

    public Criteria andEventEntityIdGreaterThanOrEqualTo(Long value) {
      addCriterion("event_entity_id >=", value, "eventEntityId");
      return (Criteria) this;
    }

    public Criteria andEventEntityIdLessThan(Long value) {
      addCriterion("event_entity_id <", value, "eventEntityId");
      return (Criteria) this;
    }

    public Criteria andEventEntityIdLessThanOrEqualTo(Long value) {
      addCriterion("event_entity_id <=", value, "eventEntityId");
      return (Criteria) this;
    }

    public Criteria andEventEntityIdIn(List<Long> values) {
      addCriterion("event_entity_id in", values, "eventEntityId");
      return (Criteria) this;
    }

    public Criteria andEventEntityIdNotIn(List<Long> values) {
      addCriterion("event_entity_id not in", values, "eventEntityId");
      return (Criteria) this;
    }

    public Criteria andEventEntityIdBetween(Long value1, Long value2) {
      addCriterion("event_entity_id between", value1, value2, "eventEntityId");
      return (Criteria) this;
    }

    public Criteria andEventEntityIdNotBetween(Long value1, Long value2) {
      addCriterion("event_entity_id not between", value1, value2, "eventEntityId");
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
