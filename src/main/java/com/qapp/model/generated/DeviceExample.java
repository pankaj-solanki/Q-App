package com.qapp.model.generated;

import java.util.ArrayList;
import java.util.List;

public class DeviceExample {
  protected String orderByClause;

  protected boolean distinct;

  protected List<Criteria> oredCriteria;

  public DeviceExample() {
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

    public Criteria andImeiIsNull() {
      addCriterion("imei is null");
      return (Criteria) this;
    }

    public Criteria andImeiIsNotNull() {
      addCriterion("imei is not null");
      return (Criteria) this;
    }

    public Criteria andImeiEqualTo(Long value) {
      addCriterion("imei =", value, "imei");
      return (Criteria) this;
    }

    public Criteria andImeiNotEqualTo(Long value) {
      addCriterion("imei <>", value, "imei");
      return (Criteria) this;
    }

    public Criteria andImeiGreaterThan(Long value) {
      addCriterion("imei >", value, "imei");
      return (Criteria) this;
    }

    public Criteria andImeiGreaterThanOrEqualTo(Long value) {
      addCriterion("imei >=", value, "imei");
      return (Criteria) this;
    }

    public Criteria andImeiLessThan(Long value) {
      addCriterion("imei <", value, "imei");
      return (Criteria) this;
    }

    public Criteria andImeiLessThanOrEqualTo(Long value) {
      addCriterion("imei <=", value, "imei");
      return (Criteria) this;
    }

    public Criteria andImeiIn(List<Long> values) {
      addCriterion("imei in", values, "imei");
      return (Criteria) this;
    }

    public Criteria andImeiNotIn(List<Long> values) {
      addCriterion("imei not in", values, "imei");
      return (Criteria) this;
    }

    public Criteria andImeiBetween(Long value1, Long value2) {
      addCriterion("imei between", value1, value2, "imei");
      return (Criteria) this;
    }

    public Criteria andImeiNotBetween(Long value1, Long value2) {
      addCriterion("imei not between", value1, value2, "imei");
      return (Criteria) this;
    }

    public Criteria andSerialIsNull() {
      addCriterion("serial is null");
      return (Criteria) this;
    }

    public Criteria andSerialIsNotNull() {
      addCriterion("serial is not null");
      return (Criteria) this;
    }

    public Criteria andSerialEqualTo(String value) {
      addCriterion("serial =", value, "serial");
      return (Criteria) this;
    }

    public Criteria andSerialNotEqualTo(String value) {
      addCriterion("serial <>", value, "serial");
      return (Criteria) this;
    }

    public Criteria andSerialGreaterThan(String value) {
      addCriterion("serial >", value, "serial");
      return (Criteria) this;
    }

    public Criteria andSerialGreaterThanOrEqualTo(String value) {
      addCriterion("serial >=", value, "serial");
      return (Criteria) this;
    }

    public Criteria andSerialLessThan(String value) {
      addCriterion("serial <", value, "serial");
      return (Criteria) this;
    }

    public Criteria andSerialLessThanOrEqualTo(String value) {
      addCriterion("serial <=", value, "serial");
      return (Criteria) this;
    }

    public Criteria andSerialLike(String value) {
      addCriterion("serial like", value, "serial");
      return (Criteria) this;
    }

    public Criteria andSerialNotLike(String value) {
      addCriterion("serial not like", value, "serial");
      return (Criteria) this;
    }

    public Criteria andSerialIn(List<String> values) {
      addCriterion("serial in", values, "serial");
      return (Criteria) this;
    }

    public Criteria andSerialNotIn(List<String> values) {
      addCriterion("serial not in", values, "serial");
      return (Criteria) this;
    }

    public Criteria andSerialBetween(String value1, String value2) {
      addCriterion("serial between", value1, value2, "serial");
      return (Criteria) this;
    }

    public Criteria andSerialNotBetween(String value1, String value2) {
      addCriterion("serial not between", value1, value2, "serial");
      return (Criteria) this;
    }

    public Criteria andMacIsNull() {
      addCriterion("mac is null");
      return (Criteria) this;
    }

    public Criteria andMacIsNotNull() {
      addCriterion("mac is not null");
      return (Criteria) this;
    }

    public Criteria andMacEqualTo(String value) {
      addCriterion("mac =", value, "mac");
      return (Criteria) this;
    }

    public Criteria andMacNotEqualTo(String value) {
      addCriterion("mac <>", value, "mac");
      return (Criteria) this;
    }

    public Criteria andMacGreaterThan(String value) {
      addCriterion("mac >", value, "mac");
      return (Criteria) this;
    }

    public Criteria andMacGreaterThanOrEqualTo(String value) {
      addCriterion("mac >=", value, "mac");
      return (Criteria) this;
    }

    public Criteria andMacLessThan(String value) {
      addCriterion("mac <", value, "mac");
      return (Criteria) this;
    }

    public Criteria andMacLessThanOrEqualTo(String value) {
      addCriterion("mac <=", value, "mac");
      return (Criteria) this;
    }

    public Criteria andMacLike(String value) {
      addCriterion("mac like", value, "mac");
      return (Criteria) this;
    }

    public Criteria andMacNotLike(String value) {
      addCriterion("mac not like", value, "mac");
      return (Criteria) this;
    }

    public Criteria andMacIn(List<String> values) {
      addCriterion("mac in", values, "mac");
      return (Criteria) this;
    }

    public Criteria andMacNotIn(List<String> values) {
      addCriterion("mac not in", values, "mac");
      return (Criteria) this;
    }

    public Criteria andMacBetween(String value1, String value2) {
      addCriterion("mac between", value1, value2, "mac");
      return (Criteria) this;
    }

    public Criteria andMacNotBetween(String value1, String value2) {
      addCriterion("mac not between", value1, value2, "mac");
      return (Criteria) this;
    }

    public Criteria andDeviceTypeIdIsNull() {
      addCriterion("device_type_id is null");
      return (Criteria) this;
    }

    public Criteria andDeviceTypeIdIsNotNull() {
      addCriterion("device_type_id is not null");
      return (Criteria) this;
    }

    public Criteria andDeviceTypeIdEqualTo(String value) {
      addCriterion("device_type_id =", value, "deviceTypeId");
      return (Criteria) this;
    }

    public Criteria andDeviceTypeIdNotEqualTo(String value) {
      addCriterion("device_type_id <>", value, "deviceTypeId");
      return (Criteria) this;
    }

    public Criteria andDeviceTypeIdGreaterThan(String value) {
      addCriterion("device_type_id >", value, "deviceTypeId");
      return (Criteria) this;
    }

    public Criteria andDeviceTypeIdGreaterThanOrEqualTo(String value) {
      addCriterion("device_type_id >=", value, "deviceTypeId");
      return (Criteria) this;
    }

    public Criteria andDeviceTypeIdLessThan(String value) {
      addCriterion("device_type_id <", value, "deviceTypeId");
      return (Criteria) this;
    }

    public Criteria andDeviceTypeIdLessThanOrEqualTo(String value) {
      addCriterion("device_type_id <=", value, "deviceTypeId");
      return (Criteria) this;
    }

    public Criteria andDeviceTypeIdLike(String value) {
      addCriterion("device_type_id like", value, "deviceTypeId");
      return (Criteria) this;
    }

    public Criteria andDeviceTypeIdNotLike(String value) {
      addCriterion("device_type_id not like", value, "deviceTypeId");
      return (Criteria) this;
    }

    public Criteria andDeviceTypeIdIn(List<String> values) {
      addCriterion("device_type_id in", values, "deviceTypeId");
      return (Criteria) this;
    }

    public Criteria andDeviceTypeIdNotIn(List<String> values) {
      addCriterion("device_type_id not in", values, "deviceTypeId");
      return (Criteria) this;
    }

    public Criteria andDeviceTypeIdBetween(String value1, String value2) {
      addCriterion("device_type_id between", value1, value2, "deviceTypeId");
      return (Criteria) this;
    }

    public Criteria andDeviceTypeIdNotBetween(String value1, String value2) {
      addCriterion("device_type_id not between", value1, value2, "deviceTypeId");
      return (Criteria) this;
    }

    public Criteria andOsIdIsNull() {
      addCriterion("os_id is null");
      return (Criteria) this;
    }

    public Criteria andOsIdIsNotNull() {
      addCriterion("os_id is not null");
      return (Criteria) this;
    }

    public Criteria andOsIdEqualTo(String value) {
      addCriterion("os_id =", value, "osId");
      return (Criteria) this;
    }

    public Criteria andOsIdNotEqualTo(String value) {
      addCriterion("os_id <>", value, "osId");
      return (Criteria) this;
    }

    public Criteria andOsIdGreaterThan(String value) {
      addCriterion("os_id >", value, "osId");
      return (Criteria) this;
    }

    public Criteria andOsIdGreaterThanOrEqualTo(String value) {
      addCriterion("os_id >=", value, "osId");
      return (Criteria) this;
    }

    public Criteria andOsIdLessThan(String value) {
      addCriterion("os_id <", value, "osId");
      return (Criteria) this;
    }

    public Criteria andOsIdLessThanOrEqualTo(String value) {
      addCriterion("os_id <=", value, "osId");
      return (Criteria) this;
    }

    public Criteria andOsIdLike(String value) {
      addCriterion("os_id like", value, "osId");
      return (Criteria) this;
    }

    public Criteria andOsIdNotLike(String value) {
      addCriterion("os_id not like", value, "osId");
      return (Criteria) this;
    }

    public Criteria andOsIdIn(List<String> values) {
      addCriterion("os_id in", values, "osId");
      return (Criteria) this;
    }

    public Criteria andOsIdNotIn(List<String> values) {
      addCriterion("os_id not in", values, "osId");
      return (Criteria) this;
    }

    public Criteria andOsIdBetween(String value1, String value2) {
      addCriterion("os_id between", value1, value2, "osId");
      return (Criteria) this;
    }

    public Criteria andOsIdNotBetween(String value1, String value2) {
      addCriterion("os_id not between", value1, value2, "osId");
      return (Criteria) this;
    }

    public Criteria andMajorVersionIsNull() {
      addCriterion("major_version is null");
      return (Criteria) this;
    }

    public Criteria andMajorVersionIsNotNull() {
      addCriterion("major_version is not null");
      return (Criteria) this;
    }

    public Criteria andMajorVersionEqualTo(String value) {
      addCriterion("major_version =", value, "majorVersion");
      return (Criteria) this;
    }

    public Criteria andMajorVersionNotEqualTo(String value) {
      addCriterion("major_version <>", value, "majorVersion");
      return (Criteria) this;
    }

    public Criteria andMajorVersionGreaterThan(String value) {
      addCriterion("major_version >", value, "majorVersion");
      return (Criteria) this;
    }

    public Criteria andMajorVersionGreaterThanOrEqualTo(String value) {
      addCriterion("major_version >=", value, "majorVersion");
      return (Criteria) this;
    }

    public Criteria andMajorVersionLessThan(String value) {
      addCriterion("major_version <", value, "majorVersion");
      return (Criteria) this;
    }

    public Criteria andMajorVersionLessThanOrEqualTo(String value) {
      addCriterion("major_version <=", value, "majorVersion");
      return (Criteria) this;
    }

    public Criteria andMajorVersionLike(String value) {
      addCriterion("major_version like", value, "majorVersion");
      return (Criteria) this;
    }

    public Criteria andMajorVersionNotLike(String value) {
      addCriterion("major_version not like", value, "majorVersion");
      return (Criteria) this;
    }

    public Criteria andMajorVersionIn(List<String> values) {
      addCriterion("major_version in", values, "majorVersion");
      return (Criteria) this;
    }

    public Criteria andMajorVersionNotIn(List<String> values) {
      addCriterion("major_version not in", values, "majorVersion");
      return (Criteria) this;
    }

    public Criteria andMajorVersionBetween(String value1, String value2) {
      addCriterion("major_version between", value1, value2, "majorVersion");
      return (Criteria) this;
    }

    public Criteria andMajorVersionNotBetween(String value1, String value2) {
      addCriterion("major_version not between", value1, value2, "majorVersion");
      return (Criteria) this;
    }

    public Criteria andMinorVersionIsNull() {
      addCriterion("minor_version is null");
      return (Criteria) this;
    }

    public Criteria andMinorVersionIsNotNull() {
      addCriterion("minor_version is not null");
      return (Criteria) this;
    }

    public Criteria andMinorVersionEqualTo(String value) {
      addCriterion("minor_version =", value, "minorVersion");
      return (Criteria) this;
    }

    public Criteria andMinorVersionNotEqualTo(String value) {
      addCriterion("minor_version <>", value, "minorVersion");
      return (Criteria) this;
    }

    public Criteria andMinorVersionGreaterThan(String value) {
      addCriterion("minor_version >", value, "minorVersion");
      return (Criteria) this;
    }

    public Criteria andMinorVersionGreaterThanOrEqualTo(String value) {
      addCriterion("minor_version >=", value, "minorVersion");
      return (Criteria) this;
    }

    public Criteria andMinorVersionLessThan(String value) {
      addCriterion("minor_version <", value, "minorVersion");
      return (Criteria) this;
    }

    public Criteria andMinorVersionLessThanOrEqualTo(String value) {
      addCriterion("minor_version <=", value, "minorVersion");
      return (Criteria) this;
    }

    public Criteria andMinorVersionLike(String value) {
      addCriterion("minor_version like", value, "minorVersion");
      return (Criteria) this;
    }

    public Criteria andMinorVersionNotLike(String value) {
      addCriterion("minor_version not like", value, "minorVersion");
      return (Criteria) this;
    }

    public Criteria andMinorVersionIn(List<String> values) {
      addCriterion("minor_version in", values, "minorVersion");
      return (Criteria) this;
    }

    public Criteria andMinorVersionNotIn(List<String> values) {
      addCriterion("minor_version not in", values, "minorVersion");
      return (Criteria) this;
    }

    public Criteria andMinorVersionBetween(String value1, String value2) {
      addCriterion("minor_version between", value1, value2, "minorVersion");
      return (Criteria) this;
    }

    public Criteria andMinorVersionNotBetween(String value1, String value2) {
      addCriterion("minor_version not between", value1, value2, "minorVersion");
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
