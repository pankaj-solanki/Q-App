package com.qapp.model.generated;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FriendGroupMemberExample {
  protected String orderByClause;

  protected boolean distinct;

  protected List<Criteria> oredCriteria;

  public FriendGroupMemberExample() {
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

    public Criteria andGroupIdIsNull() {
      addCriterion("group_id is null");
      return (Criteria) this;
    }

    public Criteria andGroupIdIsNotNull() {
      addCriterion("group_id is not null");
      return (Criteria) this;
    }

    public Criteria andGroupIdEqualTo(Long value) {
      addCriterion("group_id =", value, "groupId");
      return (Criteria) this;
    }

    public Criteria andGroupIdNotEqualTo(Long value) {
      addCriterion("group_id <>", value, "groupId");
      return (Criteria) this;
    }

    public Criteria andGroupIdGreaterThan(Long value) {
      addCriterion("group_id >", value, "groupId");
      return (Criteria) this;
    }

    public Criteria andGroupIdGreaterThanOrEqualTo(Long value) {
      addCriterion("group_id >=", value, "groupId");
      return (Criteria) this;
    }

    public Criteria andGroupIdLessThan(Long value) {
      addCriterion("group_id <", value, "groupId");
      return (Criteria) this;
    }

    public Criteria andGroupIdLessThanOrEqualTo(Long value) {
      addCriterion("group_id <=", value, "groupId");
      return (Criteria) this;
    }

    public Criteria andGroupIdIn(List<Long> values) {
      addCriterion("group_id in", values, "groupId");
      return (Criteria) this;
    }

    public Criteria andGroupIdNotIn(List<Long> values) {
      addCriterion("group_id not in", values, "groupId");
      return (Criteria) this;
    }

    public Criteria andGroupIdBetween(Long value1, Long value2) {
      addCriterion("group_id between", value1, value2, "groupId");
      return (Criteria) this;
    }

    public Criteria andGroupIdNotBetween(Long value1, Long value2) {
      addCriterion("group_id not between", value1, value2, "groupId");
      return (Criteria) this;
    }

    public Criteria andMemberUserIdIsNull() {
      addCriterion("member_user_id is null");
      return (Criteria) this;
    }

    public Criteria andMemberUserIdIsNotNull() {
      addCriterion("member_user_id is not null");
      return (Criteria) this;
    }

    public Criteria andMemberUserIdEqualTo(Long value) {
      addCriterion("member_user_id =", value, "memberUserId");
      return (Criteria) this;
    }

    public Criteria andMemberUserIdNotEqualTo(Long value) {
      addCriterion("member_user_id <>", value, "memberUserId");
      return (Criteria) this;
    }

    public Criteria andMemberUserIdGreaterThan(Long value) {
      addCriterion("member_user_id >", value, "memberUserId");
      return (Criteria) this;
    }

    public Criteria andMemberUserIdGreaterThanOrEqualTo(Long value) {
      addCriterion("member_user_id >=", value, "memberUserId");
      return (Criteria) this;
    }

    public Criteria andMemberUserIdLessThan(Long value) {
      addCriterion("member_user_id <", value, "memberUserId");
      return (Criteria) this;
    }

    public Criteria andMemberUserIdLessThanOrEqualTo(Long value) {
      addCriterion("member_user_id <=", value, "memberUserId");
      return (Criteria) this;
    }

    public Criteria andMemberUserIdIn(List<Long> values) {
      addCriterion("member_user_id in", values, "memberUserId");
      return (Criteria) this;
    }

    public Criteria andMemberUserIdNotIn(List<Long> values) {
      addCriterion("member_user_id not in", values, "memberUserId");
      return (Criteria) this;
    }

    public Criteria andMemberUserIdBetween(Long value1, Long value2) {
      addCriterion("member_user_id between", value1, value2, "memberUserId");
      return (Criteria) this;
    }

    public Criteria andMemberUserIdNotBetween(Long value1, Long value2) {
      addCriterion("member_user_id not between", value1, value2, "memberUserId");
      return (Criteria) this;
    }

    public Criteria andIsAdminIsNull() {
      addCriterion("is_admin is null");
      return (Criteria) this;
    }

    public Criteria andIsAdminIsNotNull() {
      addCriterion("is_admin is not null");
      return (Criteria) this;
    }

    public Criteria andIsAdminEqualTo(Boolean value) {
      addCriterion("is_admin =", value, "isAdmin");
      return (Criteria) this;
    }

    public Criteria andIsAdminNotEqualTo(Boolean value) {
      addCriterion("is_admin <>", value, "isAdmin");
      return (Criteria) this;
    }

    public Criteria andIsAdminGreaterThan(Boolean value) {
      addCriterion("is_admin >", value, "isAdmin");
      return (Criteria) this;
    }

    public Criteria andIsAdminGreaterThanOrEqualTo(Boolean value) {
      addCriterion("is_admin >=", value, "isAdmin");
      return (Criteria) this;
    }

    public Criteria andIsAdminLessThan(Boolean value) {
      addCriterion("is_admin <", value, "isAdmin");
      return (Criteria) this;
    }

    public Criteria andIsAdminLessThanOrEqualTo(Boolean value) {
      addCriterion("is_admin <=", value, "isAdmin");
      return (Criteria) this;
    }

    public Criteria andIsAdminIn(List<Boolean> values) {
      addCriterion("is_admin in", values, "isAdmin");
      return (Criteria) this;
    }

    public Criteria andIsAdminNotIn(List<Boolean> values) {
      addCriterion("is_admin not in", values, "isAdmin");
      return (Criteria) this;
    }

    public Criteria andIsAdminBetween(Boolean value1, Boolean value2) {
      addCriterion("is_admin between", value1, value2, "isAdmin");
      return (Criteria) this;
    }

    public Criteria andIsAdminNotBetween(Boolean value1, Boolean value2) {
      addCriterion("is_admin not between", value1, value2, "isAdmin");
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
