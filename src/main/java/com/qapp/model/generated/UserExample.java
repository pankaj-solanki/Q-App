package com.qapp.model.generated;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserExample {
  protected String orderByClause;

  protected boolean distinct;

  protected List<Criteria> oredCriteria;

  public UserExample() {
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

    public Criteria andContactIsNull() {
      addCriterion("contact is null");
      return (Criteria) this;
    }

    public Criteria andContactIsNotNull() {
      addCriterion("contact is not null");
      return (Criteria) this;
    }

    public Criteria andContactEqualTo(Long value) {
      addCriterion("contact =", value, "contact");
      return (Criteria) this;
    }

    public Criteria andContactNotEqualTo(Long value) {
      addCriterion("contact <>", value, "contact");
      return (Criteria) this;
    }

    public Criteria andContactGreaterThan(Long value) {
      addCriterion("contact >", value, "contact");
      return (Criteria) this;
    }

    public Criteria andContactGreaterThanOrEqualTo(Long value) {
      addCriterion("contact >=", value, "contact");
      return (Criteria) this;
    }

    public Criteria andContactLessThan(Long value) {
      addCriterion("contact <", value, "contact");
      return (Criteria) this;
    }

    public Criteria andContactLessThanOrEqualTo(Long value) {
      addCriterion("contact <=", value, "contact");
      return (Criteria) this;
    }

    public Criteria andContactIn(List<Long> values) {
      addCriterion("contact in", values, "contact");
      return (Criteria) this;
    }

    public Criteria andContactNotIn(List<Long> values) {
      addCriterion("contact not in", values, "contact");
      return (Criteria) this;
    }

    public Criteria andContactBetween(Long value1, Long value2) {
      addCriterion("contact between", value1, value2, "contact");
      return (Criteria) this;
    }

    public Criteria andContactNotBetween(Long value1, Long value2) {
      addCriterion("contact not between", value1, value2, "contact");
      return (Criteria) this;
    }

    public Criteria andInstanceIdIsNull() {
      addCriterion("instance_id is null");
      return (Criteria) this;
    }

    public Criteria andInstanceIdIsNotNull() {
      addCriterion("instance_id is not null");
      return (Criteria) this;
    }

    public Criteria andInstanceIdEqualTo(String value) {
      addCriterion("instance_id =", value, "instanceId");
      return (Criteria) this;
    }

    public Criteria andInstanceIdNotEqualTo(String value) {
      addCriterion("instance_id <>", value, "instanceId");
      return (Criteria) this;
    }

    public Criteria andInstanceIdGreaterThan(String value) {
      addCriterion("instance_id >", value, "instanceId");
      return (Criteria) this;
    }

    public Criteria andInstanceIdGreaterThanOrEqualTo(String value) {
      addCriterion("instance_id >=", value, "instanceId");
      return (Criteria) this;
    }

    public Criteria andInstanceIdLessThan(String value) {
      addCriterion("instance_id <", value, "instanceId");
      return (Criteria) this;
    }

    public Criteria andInstanceIdLessThanOrEqualTo(String value) {
      addCriterion("instance_id <=", value, "instanceId");
      return (Criteria) this;
    }

    public Criteria andInstanceIdLike(String value) {
      addCriterion("instance_id like", value, "instanceId");
      return (Criteria) this;
    }

    public Criteria andInstanceIdNotLike(String value) {
      addCriterion("instance_id not like", value, "instanceId");
      return (Criteria) this;
    }

    public Criteria andInstanceIdIn(List<String> values) {
      addCriterion("instance_id in", values, "instanceId");
      return (Criteria) this;
    }

    public Criteria andInstanceIdNotIn(List<String> values) {
      addCriterion("instance_id not in", values, "instanceId");
      return (Criteria) this;
    }

    public Criteria andInstanceIdBetween(String value1, String value2) {
      addCriterion("instance_id between", value1, value2, "instanceId");
      return (Criteria) this;
    }

    public Criteria andInstanceIdNotBetween(String value1, String value2) {
      addCriterion("instance_id not between", value1, value2, "instanceId");
      return (Criteria) this;
    }

    public Criteria andDeviceImeiIsNull() {
      addCriterion("device_imei is null");
      return (Criteria) this;
    }

    public Criteria andDeviceImeiIsNotNull() {
      addCriterion("device_imei is not null");
      return (Criteria) this;
    }

    public Criteria andDeviceImeiEqualTo(Long value) {
      addCriterion("device_imei =", value, "deviceImei");
      return (Criteria) this;
    }

    public Criteria andDeviceImeiNotEqualTo(Long value) {
      addCriterion("device_imei <>", value, "deviceImei");
      return (Criteria) this;
    }

    public Criteria andDeviceImeiGreaterThan(Long value) {
      addCriterion("device_imei >", value, "deviceImei");
      return (Criteria) this;
    }

    public Criteria andDeviceImeiGreaterThanOrEqualTo(Long value) {
      addCriterion("device_imei >=", value, "deviceImei");
      return (Criteria) this;
    }

    public Criteria andDeviceImeiLessThan(Long value) {
      addCriterion("device_imei <", value, "deviceImei");
      return (Criteria) this;
    }

    public Criteria andDeviceImeiLessThanOrEqualTo(Long value) {
      addCriterion("device_imei <=", value, "deviceImei");
      return (Criteria) this;
    }

    public Criteria andDeviceImeiIn(List<Long> values) {
      addCriterion("device_imei in", values, "deviceImei");
      return (Criteria) this;
    }

    public Criteria andDeviceImeiNotIn(List<Long> values) {
      addCriterion("device_imei not in", values, "deviceImei");
      return (Criteria) this;
    }

    public Criteria andDeviceImeiBetween(Long value1, Long value2) {
      addCriterion("device_imei between", value1, value2, "deviceImei");
      return (Criteria) this;
    }

    public Criteria andDeviceImeiNotBetween(Long value1, Long value2) {
      addCriterion("device_imei not between", value1, value2, "deviceImei");
      return (Criteria) this;
    }

    public Criteria andFirstNameIsNull() {
      addCriterion("first_name is null");
      return (Criteria) this;
    }

    public Criteria andFirstNameIsNotNull() {
      addCriterion("first_name is not null");
      return (Criteria) this;
    }

    public Criteria andFirstNameEqualTo(String value) {
      addCriterion("first_name =", value, "firstName");
      return (Criteria) this;
    }

    public Criteria andFirstNameNotEqualTo(String value) {
      addCriterion("first_name <>", value, "firstName");
      return (Criteria) this;
    }

    public Criteria andFirstNameGreaterThan(String value) {
      addCriterion("first_name >", value, "firstName");
      return (Criteria) this;
    }

    public Criteria andFirstNameGreaterThanOrEqualTo(String value) {
      addCriterion("first_name >=", value, "firstName");
      return (Criteria) this;
    }

    public Criteria andFirstNameLessThan(String value) {
      addCriterion("first_name <", value, "firstName");
      return (Criteria) this;
    }

    public Criteria andFirstNameLessThanOrEqualTo(String value) {
      addCriterion("first_name <=", value, "firstName");
      return (Criteria) this;
    }

    public Criteria andFirstNameLike(String value) {
      addCriterion("first_name like", value, "firstName");
      return (Criteria) this;
    }

    public Criteria andFirstNameNotLike(String value) {
      addCriterion("first_name not like", value, "firstName");
      return (Criteria) this;
    }

    public Criteria andFirstNameIn(List<String> values) {
      addCriterion("first_name in", values, "firstName");
      return (Criteria) this;
    }

    public Criteria andFirstNameNotIn(List<String> values) {
      addCriterion("first_name not in", values, "firstName");
      return (Criteria) this;
    }

    public Criteria andFirstNameBetween(String value1, String value2) {
      addCriterion("first_name between", value1, value2, "firstName");
      return (Criteria) this;
    }

    public Criteria andFirstNameNotBetween(String value1, String value2) {
      addCriterion("first_name not between", value1, value2, "firstName");
      return (Criteria) this;
    }

    public Criteria andLastNameIsNull() {
      addCriterion("last_name is null");
      return (Criteria) this;
    }

    public Criteria andLastNameIsNotNull() {
      addCriterion("last_name is not null");
      return (Criteria) this;
    }

    public Criteria andLastNameEqualTo(String value) {
      addCriterion("last_name =", value, "lastName");
      return (Criteria) this;
    }

    public Criteria andLastNameNotEqualTo(String value) {
      addCriterion("last_name <>", value, "lastName");
      return (Criteria) this;
    }

    public Criteria andLastNameGreaterThan(String value) {
      addCriterion("last_name >", value, "lastName");
      return (Criteria) this;
    }

    public Criteria andLastNameGreaterThanOrEqualTo(String value) {
      addCriterion("last_name >=", value, "lastName");
      return (Criteria) this;
    }

    public Criteria andLastNameLessThan(String value) {
      addCriterion("last_name <", value, "lastName");
      return (Criteria) this;
    }

    public Criteria andLastNameLessThanOrEqualTo(String value) {
      addCriterion("last_name <=", value, "lastName");
      return (Criteria) this;
    }

    public Criteria andLastNameLike(String value) {
      addCriterion("last_name like", value, "lastName");
      return (Criteria) this;
    }

    public Criteria andLastNameNotLike(String value) {
      addCriterion("last_name not like", value, "lastName");
      return (Criteria) this;
    }

    public Criteria andLastNameIn(List<String> values) {
      addCriterion("last_name in", values, "lastName");
      return (Criteria) this;
    }

    public Criteria andLastNameNotIn(List<String> values) {
      addCriterion("last_name not in", values, "lastName");
      return (Criteria) this;
    }

    public Criteria andLastNameBetween(String value1, String value2) {
      addCriterion("last_name between", value1, value2, "lastName");
      return (Criteria) this;
    }

    public Criteria andLastNameNotBetween(String value1, String value2) {
      addCriterion("last_name not between", value1, value2, "lastName");
      return (Criteria) this;
    }

    public Criteria andUserStatusIdIsNull() {
      addCriterion("user_status_id is null");
      return (Criteria) this;
    }

    public Criteria andUserStatusIdIsNotNull() {
      addCriterion("user_status_id is not null");
      return (Criteria) this;
    }

    public Criteria andUserStatusIdEqualTo(Integer value) {
      addCriterion("user_status_id =", value, "userStatusId");
      return (Criteria) this;
    }

    public Criteria andUserStatusIdNotEqualTo(Integer value) {
      addCriterion("user_status_id <>", value, "userStatusId");
      return (Criteria) this;
    }

    public Criteria andUserStatusIdGreaterThan(Integer value) {
      addCriterion("user_status_id >", value, "userStatusId");
      return (Criteria) this;
    }

    public Criteria andUserStatusIdGreaterThanOrEqualTo(Integer value) {
      addCriterion("user_status_id >=", value, "userStatusId");
      return (Criteria) this;
    }

    public Criteria andUserStatusIdLessThan(Integer value) {
      addCriterion("user_status_id <", value, "userStatusId");
      return (Criteria) this;
    }

    public Criteria andUserStatusIdLessThanOrEqualTo(Integer value) {
      addCriterion("user_status_id <=", value, "userStatusId");
      return (Criteria) this;
    }

    public Criteria andUserStatusIdIn(List<Integer> values) {
      addCriterion("user_status_id in", values, "userStatusId");
      return (Criteria) this;
    }

    public Criteria andUserStatusIdNotIn(List<Integer> values) {
      addCriterion("user_status_id not in", values, "userStatusId");
      return (Criteria) this;
    }

    public Criteria andUserStatusIdBetween(Integer value1, Integer value2) {
      addCriterion("user_status_id between", value1, value2, "userStatusId");
      return (Criteria) this;
    }

    public Criteria andUserStatusIdNotBetween(Integer value1, Integer value2) {
      addCriterion("user_status_id not between", value1, value2, "userStatusId");
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
